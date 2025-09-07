package MakeMyTrip.MakeMyTrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bus {
    @GetMapping("/bus")
    public String getData() {return  "Please  abchdblcjkbdsjlblbook Hotel JW marriot  with 40% discount" ; }
}