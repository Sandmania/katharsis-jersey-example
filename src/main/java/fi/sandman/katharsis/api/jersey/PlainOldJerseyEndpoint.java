package fi.sandman.katharsis.api.jersey;

import fi.sandman.katharsis.api.jersey.beans.Injectable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.SecurityContext;

/**
 * Created by jounilatvatalo on 31/12/2016.
 */
@Path("/poje")
public class PlainOldJerseyEndpoint {

    protected final Logger log = LogManager.getLogger(this.getClass());

    @Context
    SecurityContext securityContext;

    @Inject
    Injectable pojo;

    @GET
    @Path("fizbuz")
//    @RolesAllowed("user")
    public String fizbuz() {
       // log.debug("SecurityContext {} ", securityContext);
        log.debug("sc {} ", securityContext);
        log.debug(pojo.getId());
        return "fizbus";
    }
}
