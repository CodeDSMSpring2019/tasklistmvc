package edu.dmacc.codedsm.app;

import java.util.Random;

public class DefaultTaskService implements TaskService {

    private TaskFileRepository repository;

    public DefaultTaskService(TaskFileRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createTask(TaskInputDto task) {
        Integer id = new Random().nextInt();
        TaskDataDto data = new TaskDataDto();
        data.setId(id);
        data.setFirstName(task.getFirstName());
        data.setLastName(task.getLastName());
        data.setTask(task.getTask());
        data.setDue(task.getDue());

        repository.create(data);
    }

    @Override
    public void listTasks() {

    }
}
