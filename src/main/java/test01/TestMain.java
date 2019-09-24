package test01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * 1.启动时就扫描包法
 * 工程参考http://www.yihaomen.com/article/java/650.htm
 */
//test01 扫描包名
@SpringBootApplication(scanBasePackages = {"test01"})
public class TestMain implements CommandLineRunner {
    @Autowired
    private MyTest myTest;
    public static void main(String[] args){
        SpringApplication app = new SpringApplication(TestMain.class);
        //设置是非web应用
        app.setWebApplicationType(WebApplicationType.NONE);
        //关闭spring boot 图标输出
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
    @Bean
    public MyTest my() {
        return new MyTest();
    }
    @Override
    public void run(String... args) throws Exception {
        if (args.length > 0 ) {
            System.out.println(myTest.getMessage(args[0].toString()));
        }else{
            System.out.println(myTest.getMessage());
        }
    }
}
