package kr.pe.chani.simplemsa.service1;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
            http
                    .authorizeRequests()
                    // "/admin/**" 경로는 ADMIN 권한만 접근 가능
                    // 나머지 API는 USER/ADMIN 권한 접근 가능
                    .antMatchers("/admin/**")
                    .hasRole("ADMIN")
                    .anyRequest()
                    .authenticated();
    }
}
