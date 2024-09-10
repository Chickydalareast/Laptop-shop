package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @GetMapping("/")
    public String index(){
        return"Hey Kewtie dsa";
    }

    @GetMapping("/user")
    public String userPage(){
        return"Hey Kewtie User";
    }

    @GetMapping("/admin")
    public String adminPage(){
        return"Hey Kewtie ADmin";
    }
    
}
