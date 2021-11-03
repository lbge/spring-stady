import com.linge.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserT user = (UserT) context.getBean("t");
        //User和UserT都放在了容器中，在创建context对象时，所有的对象都创建了。
        // 即使这里没有getBean，也会创建实例
        user.show();
    }
}
