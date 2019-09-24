package test03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/**
 * 2.在对应类中@Component扫描包法
 * 用上下文ApplicationContext取得Bean
 * 工程参考http://www.yihaomen.com/article/java/650.htm
 */
//test02 扫描包名
@SpringBootApplication(scanBasePackages = {"test03"})
public class TestMain03 {
    @Autowired
    private MyTest03 myTest;
    public static void main(String[] args){
        SpringApplication app = new SpringApplication(TestMain03.class);
        //设置是非web应用
        app.setWebApplicationType(WebApplicationType.NONE);
        //关闭spring boot 图标输出不能作用于spring-boot-starter-test的测试图标要application文件yml
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");
            MyTest03 object = (MyTest03) ctx.getBean("myTest03");
            System.out.println(object.getMessage());
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }

        };
    }

}