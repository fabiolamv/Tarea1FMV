package activity.whendo;

import appiumControl.Button;
import org.openqa.selenium.By;

public class Main2Activity {
    public Button navegationMenu;
    public Main2Activity(){

        navegationMenu = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"Abrir el caj\u00f3n de navegaci\u00f3n\"]"));

    }


}
