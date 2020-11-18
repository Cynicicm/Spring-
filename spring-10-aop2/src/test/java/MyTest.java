import com.kuang.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:
 *
 * @author wenjie
 * @date Create on 2020/11/17
 */
public class MyTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        // 动态代理代理的是接口
        UserService userService = context.getBean("userService", UserService.class);

        userService.delete();
    }
}


