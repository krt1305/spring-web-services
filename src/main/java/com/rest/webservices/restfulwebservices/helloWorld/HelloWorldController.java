package com.rest.webservices.restfulwebservices.helloWorld;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
public class HelloWorldController implements ErrorController {

    @GetMapping(path="/hello-world")
    public String helloWorld()
    {
        return "hello";


    }

    @GetMapping(path="/hello-world-bean")
    public HelloWorldBean helloWorldBean()
    {
        return new HelloWorldBean("hello world bean ");



    }

    @GetMapping(path="/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name)
    {
        return new HelloWorldBean(String.format("Hello World, %s",name));



    }

    @Override
    public String getErrorPath() {
        return null;
    }
}
