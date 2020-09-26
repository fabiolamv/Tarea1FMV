package activity.whendo;

import appiumControl.Button;
import org.openqa.selenium.By;

public class MenuActivity {
    public Button editListButton;

    public MenuActivity(){
        editListButton = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[4]/android.widget.CheckedTextView\n"));
    }
}
