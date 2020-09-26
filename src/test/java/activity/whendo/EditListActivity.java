package activity.whendo;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class EditListActivity {
    public TextBox listName;
    public Button colorList;
    public Button saveItemButton;

    public EditListActivity(){
        listName = new TextBox(By.id("com.vrproductiveapps.whendo:id/categoryTitle"));
        colorList = new Button(By.id("com.vrproductiveapps.whendo:id/color_select2"));
        saveItemButton = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
    }
}
