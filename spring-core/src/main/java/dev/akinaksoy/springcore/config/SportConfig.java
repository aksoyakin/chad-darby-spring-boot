package dev.akinaksoy.springcore.config;

import dev.akinaksoy.springcore.common.Coach;
import dev.akinaksoy.springcore.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }

}
