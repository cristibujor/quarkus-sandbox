package org.sandbox.quarkus;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;
import org.jboss.logging.Logger;

@QuarkusMain
public class Main {

  private static final Logger LOGGER = Logger.getLogger("Main");

  public static void main(String... args) {
    LOGGER.info("#####: Main / Running main method from @QuarkusMain...");
    Quarkus.run(args);
  }

}
