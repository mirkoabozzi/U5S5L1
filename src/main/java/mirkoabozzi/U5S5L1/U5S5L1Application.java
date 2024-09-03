package mirkoabozzi.U5S5L1;

import mirkoabozzi.U5S5L1.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5S5L1Application {

    public static void main(String[] args) {

        SpringApplication.run(U5S5L1Application.class, args);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5S5L1Application.class);

//        Topping topping = (Topping) ctx.getBean("getToppingProsciutto");
//        Topping topping1 = (Topping) ctx.getBean("getToppingPatatine");
//
//        System.out.println(topping);
//        System.out.println(topping1);
//
//        Pizza pizza = (Pizza) ctx.getBean("getPizzaProsciutto");
//        Pizza pizza1 = (Pizza) ctx.getBean("getPizzaPatatine");
//
//        System.out.println(pizza);
//        System.out.println(pizza1);
//
//        Drink drink = (Drink) ctx.getBean("getDrinkCocaCola");
//        Drink drink2 = (Drink) ctx.getBean("getBeer");
//
//        System.out.println(drink);
//        System.out.println(drink2);


        Menu menu = ctx.getBean(Menu.class);

//        System.out.println(menu);
//        menu.getProduct().forEach(System.out::println);
        menu.getDrinkList().forEach(System.out::println);
        menu.getPizzaList().forEach(System.out::println);
        menu.getToppingList().forEach(System.out::println);

    }

}
