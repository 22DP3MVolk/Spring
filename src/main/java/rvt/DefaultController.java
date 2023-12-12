package rvt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
    
   @GetMapping(value = "/")
    String index(@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
        
        String myName = "Josh Washington";
        model.addAttribute("name",myName);

        return "index";
    }

    @GetMapping(value = "/fileadada")
    ModelAndView fileadada() {
        ModelAndView modelAndView = new ModelAndView("fileadada");
        return modelAndView;
    }
   
}
    