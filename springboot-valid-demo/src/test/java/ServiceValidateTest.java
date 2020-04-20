import club.mydlq.valid.Application;
import club.mydlq.valid.param.UserParam;
import club.mydlq.valid.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author DennyFly
 * @since 2020/3/25 18:17
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ServiceValidateTest {

    @Autowired
    private UserService userService;

    @Test
    public void testAddUser() {
        userService.addUser(new UserParam());
    }
}
