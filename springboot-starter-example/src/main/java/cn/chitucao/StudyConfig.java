package cn.chitucao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author DennyFly
 * @since 2020/3/25 11:48
 */
@Configuration
public class StudyConfig {
    @Bean
    public Study gupaoCore(){
        return new Study();
    }
}
