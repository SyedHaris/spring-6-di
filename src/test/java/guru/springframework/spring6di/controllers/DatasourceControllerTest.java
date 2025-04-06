package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("uat")
@SpringBootTest
class DatasourceControllerTest {

    @Autowired
    private DatasourceController datasourceController;

    @Test
    void getDataSource() {
        System.out.println(datasourceController.getDataSource());
    }
}