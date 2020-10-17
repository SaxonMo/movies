package com.saxon.movies.model.service;

import com.saxon.movies.model.dbEntity.Movies;
import com.saxon.movies.model.dbEntity.actor;
import com.saxon.movies.model.network.QueryActor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ActorServiceImpl implements ActorService {
    QueryActor queryActor;

    @Autowired
    public void setQueryActor (QueryActor queryActor) {
        this.queryActor = queryActor;
    }

    @Override
    public List<actor> QueryAllActor () {
        return queryActor.QueryAllActor ();
    }

    @Override
    public List<actor> QueryActors (Map<String, Object> map) {
        return queryActor.QueryActors (map);
    }

    @Override
    public int insertActor (Map<String, Object> map) {
        return queryActor.insertActor (map);
    }

    @Override
    public int deleteActorByID (int actorID) {
        return queryActor.deleteActorByID (actorID);
    }

    @Override
    public int updateActor (Map<String, Object> map) {
        return queryActor.updateActor (map);
    }
}
