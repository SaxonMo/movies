package com.saxon.movies.model.network;


import com.saxon.movies.model.dbEntity.actor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface QueryActor {
    //查询所有的演员
    List<actor> QueryAllActor();
    //通过特定的属性查询演员
    List<actor> QueryActors(Map<String,Object> map);
    //添加一部演员
    int insertActor(Map<String,Object> map);
    //删除一部演员
    int deleteActorByID(int moviesID);
    //修改一个电影的演员
    int updateActor(Map<String,Object> map);
}
