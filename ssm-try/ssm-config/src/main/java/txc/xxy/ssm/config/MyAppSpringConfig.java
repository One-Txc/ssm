package txc.xxy.ssm.config;

import org.springframework.boot.actuate.autoconfigure.EndpointAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.HealthIndicatorAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.PublicMetricsAutoConfiguration;
import org.springframework.boot.actuate.endpoint.HealthEndpoint;
import org.springframework.boot.actuate.endpoint.MetricsEndpoint;
import org.springframework.boot.actuate.endpoint.mvc.EndpointHandlerMapping;
import org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter;
import org.springframework.boot.actuate.endpoint.mvc.HealthMvcEndpoint;
import org.springframework.boot.actuate.endpoint.mvc.MvcEndpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.Collection;

/**
 * 给传统的spring项目添加 actuator 监控功能，失败 todo
 * Created by txc on 17-12-2.
 */
//@Configuration
@Import({ EndpointAutoConfiguration.class,
        PublicMetricsAutoConfiguration.class,
        HealthIndicatorAutoConfiguration.class})
public class MyAppSpringConfig {

    @Bean
    public EndpointHandlerMapping endpointHandlerMapping(
            Collection<? extends MvcEndpoint> endpoints) {
        return new EndpointHandlerMapping(endpoints);
    }

    @Bean
    public HealthMvcEndpoint healthMvcEndpoint(HealthEndpoint delegate) {
        return new HealthMvcEndpoint(delegate, false);
    }

    @Bean
    public EndpointMvcAdapter metricsEndPoint(MetricsEndpoint delegate) {
        return new EndpointMvcAdapter(delegate);
    }

}
