package MakeMyTrip.MakeMyTrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class flight {
    @GetMapping("/flight")
    public String getData() {return  "Please happy birthday suraj book flights indigo ticket with 50% discount" ; }
}