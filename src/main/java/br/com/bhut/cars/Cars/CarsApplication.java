package br.com.bhut.cars.Cars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CarsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarsApplication.class, args);
	}

}
