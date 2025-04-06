package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.datasource.DatasourceService;
import org.springframework.stereotype.Controller;

@Controller
public class FauxController {

    private final DatasourceService datasourceService;

    public FauxController(DatasourceService datasourceService) {
        this.datasourceService = datasourceService;
    }

    public String getDataSource() {
        return datasourceService.getDatasource();
    }
}
