package stress.basic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScenarioController {
    
    @GetMapping("/login")
    public String login(){
        sleep(20);
        
        return "Login Success";
    }

    @GetMapping("/some-function-one")
    public String someFunctionOne(){
        sleep(30);

        return "Result One";
    }

    @GetMapping("/some-function-two")
    public String someFunctionTwo(){
        sleep(15);

        return "Result Two";
    }

    private void sleep(long millisecond) {
        try {
            Thread.sleep(millisecond);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
