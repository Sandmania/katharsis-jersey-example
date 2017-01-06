package fi.sandman.katharsis.api.jsonapi.model;

import io.katharsis.resource.annotations.JsonApiId;
import io.katharsis.resource.annotations.JsonApiResource;

/**
 * Created by jounilatvatalo on 30/12/2016.
 */
@JsonApiResource(type = "projects")
public class Project {

    @JsonApiId
    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
