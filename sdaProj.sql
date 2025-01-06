use SDAproj;
CREATE TABLE signup (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,        -- Auto-incrementing primary key for unique IDs
    full_name VARCHAR(255) NOT NULL,             -- Full name of the user (required)
    email VARCHAR(255) NOT NULL UNIQUE,          -- Email of the user (required and unique)
    phone_number VARCHAR(50),                    -- Phone number of the user (optional)
    password VARCHAR(255) NOT NULL               -- Password of the user (required)
);

CREATE TABLE seller_signup (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    full_name VARCHAR(100) NOT NULL,
    email VARCHAR(150) NOT NULL UNIQUE,
    phone_number VARCHAR(15) NOT NULL,
    cnic VARCHAR(15) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);
CREATE TABLE products (
    id INT AUTO_INCREMENT PRIMARY KEY,          -- Unique identifier for each product
    name VARCHAR(255) NOT NULL,                 -- Name of the product
    brand VARCHAR(255),                         -- Brand name of the product
    image_url VARCHAR(500),                     -- URL of the product image
    stock_status VARCHAR(50),                   -- Stock status (e.g., "In Stock", "Out of Stock")
    selling_price DECIMAL(10, 2) NOT NULL,      -- Selling price of the product
    original_price DECIMAL(10, 2),              -- Original price of the product
    category VARCHAR(255),                      -- Category of the product
    description TEXT,                           -- Description of the product
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- Record creation timestamp
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP -- Record update timestamp
);

CREATE TABLE SellerProducts (
    seller_id BIGINT NOT NULL,
    product_id BIGINT NOT NULL,
    PRIMARY KEY (seller_id, product_id),
    FOREIGN KEY (seller_id) REFERENCES seller_signup(id)
        ON DELETE CASCADE,
    FOREIGN KEY (product_id) REFERENCES products(id)
        ON DELETE CASCADE
);

CREATE TABLE Orders (
    order_id INT AUTO_INCREMENT PRIMARY KEY,
    product_id BigINT NOT NULL, -- Foreign key to identify product
    quantity INT NOT NULL,
    total_price DOUBLE NOT NULL,
    order_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (product_id) REFERENCES products(id)
        ON DELETE CASCADE,
    status VARCHAR(20) DEFAULT 'Placed'
);

select* from Orders;

use SDAproj;
ALTER TABLE signup DROP COLUMN username;
ALTER TABLE Products ADD COLUMN rating FLOAT DEFAULT 0.0;


select * from signup;
select * from seller_signup;
select * from products;
