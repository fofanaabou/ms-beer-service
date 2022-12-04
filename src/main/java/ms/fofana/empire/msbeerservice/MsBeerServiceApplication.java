package ms.fofana.empire.msbeerservice;

import ms.fofana.empire.msbeerservice.web.model.BeerDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class MsBeerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsBeerServiceApplication.class, args);
        BeerDto dto = BeerDto.builder().id(UUID.randomUUID()).build();
        System.out.println(dto.getId());
    }

}
