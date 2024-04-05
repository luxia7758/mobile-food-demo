package pers.example.demo.mobile.food.infrastructure.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


/**
 * for demo version,we use EmbeddedDatabase
 */
@Configuration
@EnableJpaRepositories(basePackages = "pers.example.demo.mobile.food")
@EntityScan(basePackages = "pers.example.demo.mobile.food")
public class JpaConfig {

}
