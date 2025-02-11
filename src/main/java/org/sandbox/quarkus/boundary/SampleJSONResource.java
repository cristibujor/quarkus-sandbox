package org.sandbox.quarkus.boundary;

import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.jboss.logging.Logger;

@Path("/sample-json")
@RequestScoped
public class SampleJSONResource {

  private static final Logger LOGGER = Logger.getLogger(SampleJSONResource.class.getName());

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public String getProperties() {
    return "{name:'SampleJSONResource no worries'}";
  }

}
