package test04;

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
//test04 扫描包名
@SpringBootApplication(scanBasePackages = {"test04"})
public class TestMain04 {
    @Autowired
    private MyTest04 myTest;
    public static void main(String[] args){
        SpringApplication app = new SpringApplication(TestMain04.class);
        //设置是非web应用
        app.setWebApplicationType(WebApplicationType.NONE);
        //关闭spring boot 图标输出
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

}
