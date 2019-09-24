package test01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import test04.MyTest04;
import test04.TestMain04;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestMain04.class)
public class AppTest {
    @Autowired
    private MyTest04 object;
    @Test
    public void test(){
        System.out.println(object.getMessage());
    }
}
