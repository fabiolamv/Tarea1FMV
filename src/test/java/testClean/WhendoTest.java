package testClean;

import activity.whendo.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sesionManager.Session;

import java.net.MalformedURLException;

public class WhendoTest {
   MainActivity mainActivity= new MainActivity();
   TaskManagerActivity taskManagerActivity = new TaskManagerActivity();

   Main2Activity main2Activity = new Main2Activity();
   MenuActivity menuActivity = new MenuActivity();
   AddListActivity addListActivity = new AddListActivity();
   EditListActivity editListActivity = new EditListActivity();



    @Test
    public void verifyCreateTask() throws MalformedURLException {
        String titleTask = "TareaTest1";
        mainActivity.addTaskButton.click();
        taskManagerActivity.taskTitle.type(titleTask);
        taskManagerActivity.taskNotes.type("Test Notas");
        taskManagerActivity.saveButton.click();

        //Verification

        Assert.assertTrue("ERROR no es posible crear la tarea",mainActivity.isDiplayedTask(titleTask));

    }

    @Test
    public void verifyCreateList() throws MalformedURLException {
        String titleList = "Lista Test1";

        main2Activity.navegationMenu.click();
        menuActivity.editListButton.click();
        addListActivity.addListButton.click();
        editListActivity.listName.type(titleList);
        editListActivity.colorList.click();
        editListActivity.saveItemButton.click();

        //Verification

        Assert.assertTrue("Error al crear la lista", addListActivity.isDisplayedList(titleList));

    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
