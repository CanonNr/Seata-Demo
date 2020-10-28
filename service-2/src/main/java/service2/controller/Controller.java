package service2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/rm")
    public String rm(){
        System.out.println("rm2");
        return "rm2";
    }
}
