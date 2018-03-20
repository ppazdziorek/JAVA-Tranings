package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {


    private static final String template = "Czesc, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greetings")
    public Greetings greetings (@RequestParam(value="name", defaultValue = "Swiecie") String name){
        return new Greetings(counter.incrementAndGet(),
                String.format(template, name));
    }
}
