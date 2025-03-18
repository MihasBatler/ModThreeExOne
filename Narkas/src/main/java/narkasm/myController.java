package narkasm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class myController {

    @GetMapping("/")
    public String showFirst() {
        return "vsw";
    }
}

