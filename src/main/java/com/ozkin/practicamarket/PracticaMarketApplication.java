package com.ozkin.practicamarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.platzi.market.persistence.mapper.ProductMapper"})
public class PracticaMarketApplication {



	public static void main(String[] args) {
		SpringApplication.run(PracticaMarketApplication.class, args);
	}

}
