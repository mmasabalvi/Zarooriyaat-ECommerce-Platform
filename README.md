# Zarooriyaat-ECommerce-Platform

## Overview
Zarooriyaat is a Full-Stack ECommerce Platform designed to provide a smart charging solution for new sellers once a specific sales threshold is met. Built with Spring Boot and Java for the backend, HTML, CSS, and Bootstrap for the frontend, and Thymeleaf for dynamic web page rendering and routing. The platform is designed around robust design patterns from GRASP and GoF to ensure a scalable, maintainable, and efficient architecture.

## Technologies Used
- **Backend:** Java, Spring Boot
- **Frontend:** HTML, CSS, Bootstrap
- **Template Engine:** Thymeleaf
- **Database:** MySQL
- **Version Control:** Git

## Design Patterns
### GRASP Patterns
- **Controller:** Handles the incoming HTTP requests and delegates business processing to underlying services, ensuring separation of concerns and cleaner code management.
- **Creator:** Used to encapsulate the logic of creating complex objects, reducing dependencies and adhering to the Single Responsibility Principle.
- **High Cohesion:** Ensures that classes are focused and designed around a set of related functions, which enhances modularity and reduces the complexity of updates or modifications.
- **Information Expert:** Each class is designed to encapsulate the information it needs to perform its operations, minimizing dependencies and enhancing data integrity.

### GoF Patterns
- **Strategy:** This pattern is utilized to define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it, which is particularly used in handling payment processing scenarios.
- **Repository:** Acts as a bridge between the domain and data mapping layers using a collection-like interface for accessing domain objects. This pattern is used to manage database operations seamlessly, offering a more decoupled and testable architecture.

## Features
The platform supports a variety of user actions as part of its core functionality:
- User Registration and Authentication
- Product Listings Management
- Advanced Product Search
- Cart Management and Checkout Processes
- Order Tracking and History
- Product Reviews and Returns
- Dynamic Seller Fee Application upon reaching sales thresholds


## Setup and Installation
1. **Clone the repository:**
   ```bash
   git clone https://github.com/mmasabalvi/Zarooriyaat-ECommerce-Platform.git
   
2. **Naviagate to the Project Directory:**
   cd Zarooriyaat-ECommerce-Platform

3. **Install dependencies:**
   ```bash
   ./mvnw install

5. **Configure MySQL database**

6. **Run the application:**
   ```bash
   ./mvnw spring-boot:run
 
8. **Open your web browser and visit http://localhost:8080**


   



