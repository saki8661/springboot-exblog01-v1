package shop.mtcoding.exblog01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/test")
    public String test(Model model) {
        model.addAttribute("username", "ssar");
        return "test";
    }

}
