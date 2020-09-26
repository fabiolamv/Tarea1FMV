package activity.whendo;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class AddListActivity {
    public Button addListButton;

    public AddListActivity(){
        addListButton = new Button(By.id("com.vrproductiveapps.whendo:id/addCategoryItem"));
    }

    public boolean isDisplayedList(String nameList){
        String locator = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.TextView[@text='"+nameList+"']";
        Label list = new Label(By.xpath(locator));
        return list.isDisplayed();
    }
}
