package microserviceclientui.clientui.Configuration;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    AuthInterceptor authFeign(){
    return new AuthInterceptor();
}


}
 class AuthInterceptor implements RequestInterceptor{

     @Override
     public void apply(RequestTemplate requestTemplate) {
         requestTemplate.header("Authorization","Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmb28iLCJleHAiOjE1ODM5NDY0ODQsImlhdCI6MTU4MzkxMDQ4NH0.Reo2yGz-WgscoGBMwtq4vPxUvUh3hn3RQDGOvlE58y8");
     }
 }
