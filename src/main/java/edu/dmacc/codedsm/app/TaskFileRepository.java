package edu.dmacc.codedsm.app;

public interface TaskFileRepository {
    void findAll();
    void create(TaskDataDto data);
}
