package guru.springframework.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 5/24/17.
 */
@Component
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Gurus!!!! - Original";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }

    public String getEnglishGreating(){
        return "Hello in English!";
    }
    public String getGermanGreating(){
        return "Hello in German!";
    }
    public String getSpanishGreating(){
        return "Hello in Spanosh!";
    }

}
