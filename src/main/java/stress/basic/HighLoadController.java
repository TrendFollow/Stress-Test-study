package stress.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

@RestController
@Slf4j
public class HighLoadController {

    @GetMapping("/high-load-cpu")
    public int highLoadCpu(){
        int sum = 0;

        for (int i = 0; i < 20_000_000; i++) {
            int randomInt = ThreadLocalRandom.current().nextInt();

            sum = sum + randomInt;
        }
        return sum;
    }

    @GetMapping("/high-load-memory")
    public int highLoadMemory(){
        ArrayList<Integer> memmoryIntensiveList = new ArrayList<>();

        for (int i = 0; i < 500_000; i++) {
            memmoryIntensiveList.add(i);
        }

        return memmoryIntensiveList.size();
    }
}
