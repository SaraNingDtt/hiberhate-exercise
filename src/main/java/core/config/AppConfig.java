package core.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Configuration //地位如同組態檔
@ComponentScan("web.*.*.impl")
public class AppConfig {
}
