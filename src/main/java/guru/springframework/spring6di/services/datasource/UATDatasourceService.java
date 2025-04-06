package guru.springframework.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("uat")
public class UATDatasourceService implements DatasourceService {
    @Override
    public String getDatasource() {
        return "UAT";
    }
}
