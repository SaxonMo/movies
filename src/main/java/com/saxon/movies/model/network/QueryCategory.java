package com.saxon.movies.model.network;

import com.saxon.movies.model.dbEntity.Category;
import com.saxon.movies.model.dbEntity.Movies;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
@Repository
@Mapper
public interface QueryCategory {
    //查询所有的电影种类
    List<Category> QueryAllCategories();
    //通过特定的属性查询电影种类
    List<Category> QueryCategoryByMap(Map<String,Object> map);
    //添加一部电影种类
    int insertCategory(Map<String,Object> map);
    //删除一部电影种类
    int deleteCategoryByID(int categoryID);
    //修改一个电影的数据种类
    int updateCategory(Map<String,Object> map);
}
