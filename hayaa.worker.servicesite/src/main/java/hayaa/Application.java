package hayaa;

import hayaa.serviceplatform.client.AppRoot;
import hayaa.worker.service.core.DataConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})
public class Application extends DataConfig{
    public static void main(String[] args) throws Exception {
        AppRoot.StartApp();
        DataConfig dataConfig=new DataConfig();
        SpringApplication app=new SpringApplication(Application.class);
        app.setDefaultProperties(dataConfig.getConfig());
        app.run(args);
    }

}
