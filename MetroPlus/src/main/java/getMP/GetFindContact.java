package getMP;

import base.commonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by mahmudurrahman
 * On 4/28/18.
 */

public class GetFindContact extends commonAPI {
    public void getContact(){
        driver.findElement(By.cssSelector("#menuElem > li:nth-child(2) > a")).click();
    }
}
