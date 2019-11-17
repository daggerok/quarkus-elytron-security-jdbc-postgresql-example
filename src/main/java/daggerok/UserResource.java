package daggerok;

import javax.annotation.security.RolesAllowed;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class UserResource {

    @GET
    @Path("/hello/me")
    @RolesAllowed("user")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject me() {
        return Json.createObjectBuilder()
                   .add("hello", "User")
                   .build();
    }

    @GET
    @Path("/hello/max")
    @RolesAllowed("user")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject max() {
        return Json.createObjectBuilder()
                   .add("hello", "Max")
                   .build();
    }
}
