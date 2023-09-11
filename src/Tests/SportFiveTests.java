package Tests;

import Flows.SportFiveFlow;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SportFiveTests extends BaseTest {

    @Test
    public void sportNews() throws InterruptedException {
        try {
            sportFiveFlow.flowSportFive();
            oneFlow.flowOne();        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        sportFiveFlow.flowSportFive();
//        oneFlow.flowOne();
    }
}
