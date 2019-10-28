package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @RequestMapping("/saludo")
    public Greeting saludo(@RequestParam(value="nombre", defaultValue="Mundo") String name) {
        return new FormalGreeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    

    @RequestMapping("/equipo")
    public Empleado equipo(@RequestParam(value="name", defaultValue="World") String name) {
//        Jugador central = new Jugador();
//        central.setNombre(name);
//        central.setPosicion("CENTRAL");
        Empleado central = new Empleado();
        central.setNombre(name);
        return central;
    }
}
