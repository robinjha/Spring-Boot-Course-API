package io.javaspring.springbootquickstart.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by robin on 2/10/18.
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHi (){
        return "Hi";
    }
}
