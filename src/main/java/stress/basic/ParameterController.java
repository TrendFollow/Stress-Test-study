package stress.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class ParameterController {


    @PostMapping("/login-with-id-password")
    public String loginWithIdPassword(@RequestBody IdAndPassword idAndPassword){
        log.info("id: {}, password: {}", idAndPassword.getId(), idAndPassword.getPassword());
        return "Login Success";
    }

    @GetMapping("/search")
    public String search(@RequestParam String query){
        log.info("query : {}", query);

        return "Query Success";
    }


    static class IdAndPassword{

        private String id;
        private String password;

        public String getId(){
            return id;
        }

        public String getPassword(){
            return password;
        }
    }
}
