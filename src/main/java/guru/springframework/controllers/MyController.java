package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 5/23/17.
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        int i = 5;
        int s = 2992;
        int summ = i*s ;
        System.out.println("Hello from initial controller!!! " + summ);

        return greetingService.sayGreeting();
    }
}
