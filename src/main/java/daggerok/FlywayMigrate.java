package daggerok;

import io.quarkus.runtime.StartupEvent;
import io.quarkus.runtime.configuration.ProfileManager;
import lombok.extern.slf4j.Slf4j;
import org.flywaydb.core.Flyway;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import java.util.Optional;

@Slf4j
@ApplicationScoped
// @javax.inject.Singleton
public class FlywayMigrate {

    @Inject
    Flyway flyway;

    void onStart(@Observes StartupEvent event) {
        log.info("{}", event);
        log.info("Active profile: {}", ProfileManager.getActiveProfile());
        log.info("Applying flyway migrations...");
        Optional.ofNullable(flyway)
                .ifPresent(Flyway::migrate);
    }
}
