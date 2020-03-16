package pl.kukla.krzys.in28minutes.microservice.limitsservice.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author Krzysztof Kukla
 */
@Configuration
@ConfigurationProperties(prefix = "limits-service")
@Getter
@Setter
public class LimitConfigurationProperties {

    private int minimum;
    private int maximum;

}
