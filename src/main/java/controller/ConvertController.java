package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConvertController {
    @GetMapping
    public String show() {
        return "index";
    }

    @GetMapping("/convert")
    public ModelAndView result(@RequestParam double usd) {
        double result = usd * 23000;
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("result", result);
        return  modelAndView;
    }
}
