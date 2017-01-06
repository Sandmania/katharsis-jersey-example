package fi.sandman.katharsis.api.jsonapi.repositories;

import fi.sandman.katharsis.api.jsonapi.model.Project;
import io.katharsis.queryspec.QuerySpec;
import io.katharsis.repository.ResourceRepositoryV2;
import io.katharsis.resource.list.ResourceList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.security.RolesAllowed;
import javax.inject.Singleton;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.SecurityContext;

/**
 * Created by jounilatvatalo on 30/12/2016.
 */
public class ProjectRepository implements ResourceRepositoryV2<Project, String> {

    protected final Logger log = LogManager.getLogger(this.getClass());

    @Override
    public Class<Project> getResourceClass() {
        return Project.class;
    }

    @Override
    public Project findOne(String s, QuerySpec querySpec) {
        return new Project();
    }

    @Override
    public ResourceList<Project> findAll(QuerySpec querySpec) {
        return null;
    }

    @Override
    public ResourceList<Project> findAll(Iterable<String> iterable, QuerySpec querySpec) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public <S extends Project> S create(S s) {
        return null;
    }

    @Override
    public <S extends Project> S save(S s) {
        return null;
    }
}
