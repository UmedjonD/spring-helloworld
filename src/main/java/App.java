import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean.getMessage());

        HelloWorld bean2 = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean.getMessage());

        Cat cat1 = applicationContext.getBean("cat", Cat.class);
        System.out.println(cat1.getMes());

        Cat cat2 = applicationContext.getBean("cat", Cat.class);
        System.out.println(cat2.getMes());

        System.out.println(cat1.equals(cat2)); // false
        System.out.println(bean.equals(bean2)); // true

    }
}