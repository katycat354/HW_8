package todo;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<Task> taskList = new ArrayList<>();


    public void addTask(String title, String date, String description) {
        Task task = new Task (title, date, description);
        taskList.add(task);
    }

    public void printTask(){
        for (int i = 0; i < taskList.size(); i++){
            Task task = taskList.get(i);
            task.printInformation();
        }
    }
}