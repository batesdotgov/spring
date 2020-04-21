package com.batesdotgov.springng.config;

import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlyawayMigrationConfiguration {
    @Bean
    public FlywayMigrationStrategy flywayMigrationStrategy() {
        return flyway -> { };
    }
}