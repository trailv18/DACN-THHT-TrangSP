package com.lvtrai.dacn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;


@SpringBootApplication
@EntityScan(basePackageClasses = {
		DacnTrangspApplication.class,
		Jsr310JpaConverters.class
})
public class DacnTrangspApplication {

	public static void main(String[] args) {
		SpringApplication.run(DacnTrangspApplication.class, args);
	}

}
