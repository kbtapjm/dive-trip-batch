package io.divetrip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = { "io.divetrip.batch", "io.divetrip.library" })
@EnableJpaRepositories(basePackages = { "io.divetrip.library.domain.repository" })
@EntityScan(basePackages = { "io.divetrip.library.domain.entity" })
public class DiveTripBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiveTripBatchApplication.class, args);
	}

}
