package rzd.rrd.rails.pilot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.util.TestPropertyValues;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.testcontainers.containers.BindMode;
import org.testcontainers.containers.OracleContainer;

public class OracleInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    static Logger log = LoggerFactory.getLogger(OracleInitializer.class);

    static final OracleContainer oracleContainer = new OracleContainer("rzd/oracle:11.2.0.2-xe")
            .withSharedMemorySize(1024L * 1024L * 1024L)
            .withUsername("SYSTEM")
            .withPassword("Password123")
            .withClasspathResourceMapping("init_db.sql"
                    , "/u01/app/oracle/scripts/startup/init_db.sql"
                    , BindMode.READ_ONLY)
            ;

    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        oracleContainer.start();
        oracleContainer.followOutput(s -> log.debug(s.getUtf8String()));

        final String jdbcUrl = "jdbc:oracle:thin:@//" + oracleContainer.getContainerIpAddress() + ":" + oracleContainer.getOraclePort() + "/XE";
        final String user = "TEST_USER";
        final String password = "TEST_PASSWORD123";

        TestPropertyValues.of(
                "spring.datasource.driver-class-name=oracle.jdbc.OracleDriver",
                "spring.datasource.username=" + user,
                "spring.datasource.password=" + password,
                "spring.datasource.url=" + jdbcUrl
        ).applyTo(configurableApplicationContext.getEnvironment(), TestPropertyValues.Type.MAP, "test");
    }
}
