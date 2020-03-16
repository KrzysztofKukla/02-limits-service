package pl.kukla.krzys.in28minutes.microservice.limitsservice.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.kukla.krzys.in28minutes.microservice.limitsservice.domain.LimitConfiguration;
import pl.kukla.krzys.in28minutes.microservice.limitsservice.service.LimitService;

/**
 * @author Krzysztof Kukla
 */
@RestController
@RequestMapping("/v1/limits")
@RequiredArgsConstructor
@Slf4j
public class LimitConfigurationController {

    private final LimitService limitService;

    @GetMapping
    public ResponseEntity<LimitConfiguration> retrieveLimitFromConfiguration() {
        LimitConfiguration limitConfiguration = limitService.getLimitConfiguration();
        return ResponseEntity.ok(limitConfiguration);
    }

}
