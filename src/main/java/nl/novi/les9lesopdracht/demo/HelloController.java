package nl.novi.les9lesopdracht.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//je gebruikt een rest controller omdat we werken met rest-api
@RestController
public class HelloController {
    //variabelen
    private String myName;

    @GetMapping("/hello")
    public String sayHello(@RequestParam (required = false) String name){
        if (name !=null){
        return "Hello " + name;
        } else {
            return "Hello stranger";
        }
    }
    // output localhost:8080/hello?name=jan geeft: "Hello Jan". En localhost:8080/hello geeft: "Hello stranger"

    // naam bewaren
    @PostMapping("/save")
    public void saveName(@RequestParam String name){
        this.myName = name;
    }

    // naam ophalen
    @GetMapping("/retrieve")
    public String retrieveName(){
        return this.myName;
    }
}
