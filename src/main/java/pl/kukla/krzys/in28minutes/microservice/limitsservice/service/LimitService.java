package pl.kukla.krzys.in28minutes.microservice.limitsservice.service;

import pl.kukla.krzys.in28minutes.microservice.limitsservice.domain.LimitConfiguration;

/**
 * @author Krzysztof Kukla
 */
public interface LimitService {

    LimitConfiguration getLimitConfiguration();

}
