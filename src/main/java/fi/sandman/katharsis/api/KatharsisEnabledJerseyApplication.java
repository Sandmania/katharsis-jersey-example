package fi.sandman.katharsis.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.katharsis.locator.SampleJsonServiceLocator;
import io.katharsis.queryParams.DefaultQueryParamsParser;
import io.katharsis.queryParams.QueryParamsBuilder;
import io.katharsis.rs.KatharsisFeature;
import io.katharsis.rs.KatharsisProperties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;

import javax.ws.rs.ApplicationPath;

/**
 * Created by jounilatvatalo on 30/12/2016.
 */
@ApplicationPath("/")
public class KatharsisEnabledJerseyApplication extends ResourceConfig {

    protected final Logger log = LogManager.getLogger(this.getClass());

    public KatharsisEnabledJerseyApplication() {
        try {
            packages("fi.sandman.katharsis.api"); // For jersey
            register(RolesAllowedDynamicFeature.class);

            property(KatharsisProperties.RESOURCE_SEARCH_PACKAGE, "fi.sandman.katharsis.api.jsonapi");
            property(KatharsisProperties.RESOURCE_DEFAULT_DOMAIN, "");
            property(KatharsisProperties.WEB_PATH_PREFIX, "/api");

            register(new KatharsisFeature(new ObjectMapper(), new QueryParamsBuilder(new DefaultQueryParamsParser()), new SampleJsonServiceLocator()));
        } catch (Exception e) {
            log.error("Initializing application failed", e);
        }
    }
}
