package vn.cruddata.SpringCrudData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages={"vn.cruddata.*"})
@ComponentScan({"vn.cruddata.*"})
@EntityScan("vn.cruddata.entities")
@EnableJpaRepositories("vn.cruddata.daos")
/**
 * Enable entity
 * Enable dao
 * Scan component
 */
public class SpringCrudDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudDataApplication.class, args);
	}
}
