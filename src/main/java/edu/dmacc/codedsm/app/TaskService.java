package edu.dmacc.codedsm.app;

public interface TaskService {
    void createTask(TaskInputDto task);
    void listTasks();
}
