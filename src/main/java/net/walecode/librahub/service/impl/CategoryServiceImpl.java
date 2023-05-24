package net.walecode.librahub.service.impl;

import net.walecode.librahub.entity.Category;
import net.walecode.librahub.repository.CategoryRepository;
import net.walecode.librahub.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;
    @Override
    public List<Category> findAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findCategoryById(Long id) {
        return categoryRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Category not found"));
    }

    @Override
    public void createCategory(Category category) {
        categoryRepository.save(category);

    }

    @Override
    public void deleteCategory(Long id) {
        Category category = categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Category not found"));
        categoryRepository.deleteById(category.getId());
    }

    @Override
    public void updateCategory(Category category) {
        categoryRepository.save(category);

    }
}
