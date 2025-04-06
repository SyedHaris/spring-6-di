package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.datasource.DatasourceService;
import org.springframework.stereotype.Controller;

@Controller
public class DatasourceController {

    private final DatasourceService datasourceService;

    public DatasourceController(DatasourceService datasourceService) {
        this.datasourceService = datasourceService;
    }

    public String getDataSource() {
        return datasourceService.getDatasource();
    }
}
