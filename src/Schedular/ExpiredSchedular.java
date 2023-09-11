package Schedular;
//import Service.SubscriptionService;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.TimerTask;
import Tests.SportFiveTests;

@Component
public class ExpiredSchedular extends TimerTask {
    private final SportFiveTests sportFiveTests;

    public ExpiredSchedular(SportFiveTests sportFiveTests) {
        this.sportFiveTests = sportFiveTests;
    }
   @Override
   public void run() {

       System.out.println(new Date());
       try {
           sportFiveTests.sportNews();
       } catch (InterruptedException e) {
           e.printStackTrace();
       }

    }
}

