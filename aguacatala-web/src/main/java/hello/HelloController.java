package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @RequestMapping(value="/malparidos", method=RequestMethod.GET)
    public String index(@RequestParam(value="name", required=false, defaultValue="World") String name, @RequestParam String jason, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("jason", jason);
        return "index";
    }
}
