package edu.dmacc.codedsm.app;

public class DefaultTaskController implements TaskController {

    private TaskService service;

    public DefaultTaskController(TaskService service) {
        this.service = service;
    }

    @Override
    public View showInitialView() {
        return new InputView();
    }

    @Override
    public View handleInput(String firstName, String lastName, String task, String due) {
        TaskInputDto inputDto = new TaskInputDto();
        inputDto.setFirstName(firstName);
        inputDto.setLastName(lastName);
        inputDto.setTask(task);
        inputDto.setDue(due);

        service.createTask(inputDto);
        return null;
    }
}
