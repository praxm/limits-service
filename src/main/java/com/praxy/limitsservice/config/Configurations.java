package com.praxy.limitsservice.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "limit-service")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Configurations {
    private int minimum;
    private int maximum;
}
