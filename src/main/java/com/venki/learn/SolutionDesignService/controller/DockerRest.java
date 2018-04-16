package com.venki.learn.SolutionDesignService.controller
 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import com.websystique.springmvc.domain.Message;
 
@RestController
public class DockerRest {
 
    @RequestMapping("/")
    public String welcome() {//Welcome page, non-rest
        return "Welcome to RestTemplate Example.";
    }
 
    @RequestMapping("/hello/{player}")
    public Message message(@PathVariable String player) {//REST Endpoint.
	
             return "Welcome to RestTemplate Venki.";
        
    }
}
