package rzd.rrd.rails.pilot;

import org.junit.Rule;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.testcontainers.containers.OracleContainer;
import rzd.rrd.rails.pilot.repository.DistancePassportRepository;

@SpringBootTest(classes = PilotApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, properties = {
//        "spring.datasource.url=jdbc:tc:postgresql:11-alpine:///databasename",
//        "spring.datasource.url=jdbc:tc:oracle:thin:@localhost:1521/XE",

//        "spring.datasource.url=jdbc:oracle:thin:@localhost:1234:XE",
})
@ContextConfiguration(
        initializers = OracleInitializer.class
)
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@AutoConfigureMockMvc
//@Transactional
//@AutoConfigureTestDatabase
public class IntegrationTests {

    @Autowired
    public DistancePassportRepository repository;

//    @Rule
//    public OracleContainer oracle = new OracleContainer("rzd/oracle:11.2.0.2-xe").withSharedMemorySize(1024L * 1024L * 1024L);

    @Test
//    @Disabled
    public void findBySiteIdTest(){
//        repository
    }
}
