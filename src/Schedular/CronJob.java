package Schedular;


import Tests.SportFiveTests;

import java.util.Timer;
import java.util.TimerTask;

//public class CronJob {
//    public static void main(String[] args) {
//        Timer timer = new Timer();
//        TimerTask task = new ExpiredSchedular();
//        timer.schedule(task, 1, 54000000);
//
//
//    }
//}


public class CronJob {
    public static void main(String[] args) {
        Timer timer = new Timer();
        SportFiveTests sportFiveTests = new SportFiveTests(); // Create an instance of SportFiveTests
        TimerTask task = new ExpiredSchedular(sportFiveTests); // Pass the instance to the constructor
        timer.schedule(task, 1, 54000000);
    }
}

