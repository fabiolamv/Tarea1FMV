package activity.whendo;

import appiumControl.Button;
import appiumControl.TextBox;
import appiumControl.TextView;
import org.openqa.selenium.By;

public class TaskManagerActivity {
    public TextBox taskTitle;
    public TextBox taskNotes;
    public Button saveButton;

    public TaskManagerActivity(){
        taskTitle = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
        taskNotes = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
        saveButton = new Button(By.xpath("//android.widget.TextView[@content-desc='Guardar']"));
    }

}
