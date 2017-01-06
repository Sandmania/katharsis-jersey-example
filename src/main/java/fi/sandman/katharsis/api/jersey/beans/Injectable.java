package fi.sandman.katharsis.api.jersey.beans;

import javax.inject.Named;
import java.util.UUID;

/**
 * Created by jounilatvatalo on 31/12/2016.
 */
@Named
public class Injectable {

    private String id = UUID.randomUUID().toString();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
