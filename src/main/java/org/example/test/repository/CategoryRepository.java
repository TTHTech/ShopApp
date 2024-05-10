package org.example.test.repository;

import java.util.List;

import org.example.test.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findCategoryByName(String name);

    Category findCategoryById(Long id);

    List<Category> findCategoriesByName(String name);
}
