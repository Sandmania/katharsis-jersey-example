package fi.sandman.katharsis.api;

import fi.sandman.katharsis.api.jersey.PlainOldJerseyEndpoint;
import io.katharsis.rs.KatharsisFeature;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jounilatvatalo on 02/01/2017.
 */
//@ApplicationPath("/")
public class TestApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> set = new HashSet<>();
        set.add(KatharsisFeature.class);
        set.add(PlainOldJerseyEndpoint.class);
        return set;
    }
}
