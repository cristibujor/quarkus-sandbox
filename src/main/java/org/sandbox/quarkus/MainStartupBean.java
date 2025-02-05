package org.sandbox.quarkus;

import io.quarkus.runtime.Startup;
import jakarta.enterprise.context.ApplicationScoped;
import org.jboss.logging.Logger;

@Startup
@ApplicationScoped
public class MainStartupBean {

  private static final Logger LOGGER = Logger.getLogger(MainStartupBean.class.getSimpleName());

  private final String name;

  public MainStartupBean() {
    this.name = MainStartupBean.class.getSimpleName();
    LOGGER.info("#####: MainStartupBean / Constructor...");
  }

  @Startup
  public void initialize() {
    LOGGER.info("#####: MainStartupBean / initialize() ... " + name);
  }
}
