package com.example.SDAproj.repository;

import com.example.SDAproj.productAddobj.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface ProductAddRepository extends JpaRepository<product, Long> {
    List<product> findByCategoryIgnoreCase(String category); // Custom query to filter by category
    List<product> findAllByNameIgnoreCase(String name);

    @SuppressWarnings("null")
    Optional<product> findById(Long id);
}
