package daggerok;

import javax.annotation.security.PermitAll;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/hello")
public class PublicResource {

    @GET
    @Path("")
    @PermitAll
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject permitted() {
        return Json.createObjectBuilder()
                   .add("hello", "world")
                   .build();
    }
}
