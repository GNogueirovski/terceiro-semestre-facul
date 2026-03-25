package br.com.fiap.spring_aula1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellospringbootControlller {
    @GetMapping("/hello")
    public String index(){
        return "<h1>Hello World!</h1>";
    }

}