package home.web;

/**
 * Created by Vasilii_Pozdeev on 17/02/2018.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import home.service.HelloWorldService;

@Controller
public class SampleController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping("/")
    @ResponseBody
    public String helloWorld() {
        return this.helloWorldService.getHelloMessage();
    }

}
