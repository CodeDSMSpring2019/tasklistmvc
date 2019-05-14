package edu.dmacc.codedsm.app;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        TaskFileRepository repository = new DefaultTaskFileRepository();
        TaskService service = new DefaultTaskService(repository);
        TaskController controller = new DefaultTaskController(service);
        View firstView = controller.showInitialView();
        System.out.println(firstView.render());

        Scanner in = new Scanner(System.in);
        String fullInput = in.nextLine();
        String[] splitString = fullInput.split(" ");
        String firstName = splitString[0];
        String lastName = splitString[1];
        String task = splitString[2];
        String due = splitString[3];
        controller.handleInput(firstName, lastName, task, due);
    }

}
