package pl.kukla.krzys.in28minutes.microservice.limitsservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.kukla.krzys.in28minutes.microservice.limitsservice.config.LimitConfigurationProperties;
import pl.kukla.krzys.in28minutes.microservice.limitsservice.domain.LimitConfiguration;

/**
 * @author Krzysztof Kukla
 */
@Service
@RequiredArgsConstructor
public class LimitServiceImpl implements LimitService {

    private final LimitConfigurationProperties limitConfigurationProperties;

    @Override
    public LimitConfiguration getLimitConfiguration() {
        return new LimitConfiguration(limitConfigurationProperties.getMinimum(), limitConfigurationProperties.getMaximum());
    }

}
