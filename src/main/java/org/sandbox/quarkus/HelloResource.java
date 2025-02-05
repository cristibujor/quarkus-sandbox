package org.sandbox.quarkus;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {

  public static final String HELLO_RESPONSE = "Hello from Quarkus REST 'HelloResource':  \\__(o-o)__/  ";

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String hello() {
    return HELLO_RESPONSE;
  }
}
