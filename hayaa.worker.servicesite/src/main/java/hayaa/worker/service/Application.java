package hayaa.worker.service;

import hayaa.serviceplatform.client.AppRoot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class,args);
        AppRoot.StartApp();
    }
}
