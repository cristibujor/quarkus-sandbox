package org.sandbox.quarkus;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;
import org.jboss.logging.Logger;

@QuarkusMain
public class MainQuarkusApplication {

  private static final Logger LOGGER = Logger.getLogger(MainQuarkusApplication.class.getSimpleName());

  public static void main(String... args) {
    LOGGER.info("#####: Main / Running main method from @QuarkusMain...");
    Quarkus.run(args);
  }

}
