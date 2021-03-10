package br.com.pedrodavi.anrea2ghpages.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class IndexController {

    @Value("${URL_DOC}")
    private String urlDoc;

    @GetMapping
    public ModelAndView index() {
        return new ModelAndView("redirect:" + urlDoc);
    }

}
