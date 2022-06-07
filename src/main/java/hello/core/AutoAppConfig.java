package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "hello.core.member",     // 탐색 시작 경로 미지정 시 굉장히 오래걸릴 수 있다
        basePackageClasses = AutoAppConfig.class,   // 경로 미지정 시 시작 경로는 ComponentScan의 package부터 시작
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
