package home.service;

/**
 * Created by Vasilii_Pozdeev on 17/02/2018.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {

    @Value("${name:Worldddd!!!}")
    private String name;

    public String getHelloMessage() {
        return "Hello " + this.name;
    }

}
