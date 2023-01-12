package core.advanced;

import core.advanced.trace.logTrace.FieldLogTrace;
import core.advanced.trace.logTrace.LogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogTraceConfig {

    @Bean
    public LogTrace logTrace() {
        return new FieldLogTrace();
    }
}
