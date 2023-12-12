package ie.atu.week11b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Week11bApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week11bApplication.class, args);
    }

}
