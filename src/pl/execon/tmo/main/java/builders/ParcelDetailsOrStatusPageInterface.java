package pl.execon.tmo.main.java.builders;

import org.openqa.selenium.WebElement;

public interface ParcelDetailsOrStatusPageInterface extends PageInterface {
    WebElement getOrderNumberHeader();

    WebElement getCurrentStatusHeader();
}
