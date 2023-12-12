package ie.atu.week11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Week11Application {

    public static void main(String[] args) {
        SpringApplication.run(Week11Application.class, args);
    }

}
