package test01;
import org.springframework.beans.factory.annotation.Value;


public class MyTest {
    @Value("${name:unknown}")
    private String name;

    public String getMessage() {
        return getMessage(name);
    }

    public String getMessage(String name) {
        return "Hello " + name;
    }
}
