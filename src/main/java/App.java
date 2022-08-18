import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("Helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("Helloworld");
        Cat cat1 = (Cat) applicationContext.getBean("Cat");
        Cat cat2 = (Cat) applicationContext.getBean("Cat");
        System.out.println(bean == bean2);
        System.out.println(cat1 == cat2);
    }
}