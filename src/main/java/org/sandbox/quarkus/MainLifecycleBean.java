package org.sandbox.quarkus;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import org.jboss.logging.Logger;

@ApplicationScoped
public class MainLifecycleBean {

  private static final Logger LOGGER = Logger.getLogger(MainLifecycleBean.class.getSimpleName());

  void onStart(@Observes StartupEvent ev) {
    LOGGER.info("#####: MainLifecycleBean / The application is starting...");
  }

  void onStop(@Observes ShutdownEvent ev) {
    LOGGER.info("#####: MainLifecycleBean/ The application is stopping...");
  }

}