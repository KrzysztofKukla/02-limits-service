package pl.kukla.krzys.in28minutes.microservice.limitsservice.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Krzysztof Kukla
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LimitConfiguration {
    private int minimum;
    private int maximum;

}
