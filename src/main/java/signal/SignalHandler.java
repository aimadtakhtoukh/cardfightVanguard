package signal;

import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class SignalHandler {

    public void handleSignal(String s) {
        System.out.println("Called!");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(s);
        System.out.println("Done.");
    }

}
