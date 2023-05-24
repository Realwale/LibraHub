package net.walecode.librahub.service;

import net.walecode.librahub.entity.Author;
import net.walecode.librahub.entity.Category;

import java.util.List;

public interface CategoryService {

    List<Category> findAllCategories();

    Category findCategoryById(Long id);

    void createCategory(Category category);

    void deleteCategory(Long id);

    void updateCategory(Category category);
}
