import com.kuang.dao.UserMySQLImpl;
import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:
 *
 * @author wenjie
 * @date Create on 2020/11/14
 */
public class MyTest {
    public static void main(String[] args) {
        // 获取ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) context.getBean("userServiceImpl");
        userService.getUserDao();
//        // 用户实际调用的是业务层，dao层他们不需要接触
//        UserService userService = new UserServiceImpl();
//        userService.setUserDao(new UserMySQLImpl());
//        userService.getUserDao();
    }
}
