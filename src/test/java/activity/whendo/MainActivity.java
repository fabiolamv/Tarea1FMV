package activity.whendo;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class MainActivity {

    public Button addTaskButton;


    public MainActivity(){
        addTaskButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
    }

    public boolean isDiplayedTask(String titleTask){
        String locator="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.ListView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='"+titleTask+"']";
        Label task = new Label(By.xpath(locator));
       return task.isDisplayed();

    }
}
