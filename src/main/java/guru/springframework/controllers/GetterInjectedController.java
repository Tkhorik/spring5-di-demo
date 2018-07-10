package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 5/24/17.
 */
@Controller
public class GetterInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
/* @Qualifier Квалификатор аннотации позволяет устранить неоднозначность ссылок бина,
когда сам Spring не сможет этого сделать. Spring XML конфигурация поддерживает такой вариант,
  но, конечно, без поддержки безопасности типов. В этом примере мы обращаем внимание на использование
Java конфигурации и сканировании компонентов для регистрации бинов.*/
    @Autowired
    public void setGreetingService(@Qualifier("getterGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
