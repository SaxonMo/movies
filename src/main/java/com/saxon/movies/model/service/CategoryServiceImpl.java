package com.saxon.movies.model.service;

import com.saxon.movies.model.dbEntity.Category;
import com.saxon.movies.model.network.QueryCategory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.rowset.CachedRowSet;
import java.util.List;
import java.util.Map;

public class CategoryServiceImpl implements CategoryService {
    QueryCategory queryCategory;

    @Autowired
    public void setQueryCategory (QueryCategory queryCategory) {
        this.queryCategory = queryCategory;
    }

    @Override
    public List<Category> QueryAllCategories () {
        return queryCategory.QueryAllCategories ();
    }

    @Override
    public List<Category> QueryCategoryByMap (Map<String, Object> map) {
        return queryCategory.QueryCategoryByMap (map);
    }

    @Override
    public int insertCategory (Map<String, Object> map) {
        return queryCategory.insertCategory (map);
    }

    @Override
    public int deleteCategoryByID (int categoryID) {
        return queryCategory.deleteCategoryByID (categoryID);
    }

    @Override
    public int updateCategory (Map<String, Object> map) {
        return queryCategory.updateCategory (map);
    }
}
