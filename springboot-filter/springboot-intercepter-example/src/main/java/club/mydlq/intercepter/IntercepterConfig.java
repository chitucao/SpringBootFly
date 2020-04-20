package club.mydlq.intercepter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author DennyFly
 * @since 2020/3/4 16:38
 */
@Configuration
public class IntercepterConfig implements WebMvcConfigurer {
    @Autowired
    private MyCustomIntercepter myCustomIntercepter;

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(myCustomIntercepter).addPathPatterns("/aa/**");
    }
}
