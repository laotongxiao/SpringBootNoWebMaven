package test02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 2.在对应类中@Component扫描包法
 * 工程参考http://www.yihaomen.com/article/java/650.htm
 */
//test02 扫描包名
@SpringBootApplication(scanBasePackages = {"test02"})
public class TestMain02 implements CommandLineRunner {
    @Autowired
    private MyTest02 myTest;
    public static void main(String[] args){
        SpringApplication app = new SpringApplication(TestMain02.class);
        //设置是非web应用
        app.setWebApplicationType(WebApplicationType.NONE);
        //关闭spring boot 图标输出
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
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