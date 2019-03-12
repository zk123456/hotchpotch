import com.zk.jetcache.User;
import com.zk.jetcache.UserService;
import com.zk.jetcache.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author Zhangk
 * @Date 16:15 2018/11/9
 * @Description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/app-spring-config-info.xml")
public class TestTest1 {

    @Test
    public void test1() {
        UserService imp = new UserServiceImpl();
        User userById = imp.getUserById(1);
        System.out.println(userById);
    }

    public static void main(String []args) {
        UserService imp = new UserServiceImpl();
        User userById = imp.getUserById(1);
        System.out.println(userById);
    }
}
