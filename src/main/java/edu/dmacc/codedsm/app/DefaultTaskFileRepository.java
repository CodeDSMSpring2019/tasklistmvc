package edu.dmacc.codedsm.app;

public class DefaultTaskFileRepository implements TaskFileRepository {
    @Override
    public void findAll() {

    }

    @Override
    public void create(TaskDataDto data) {
        System.out.println("data = [" + data + "]");
    }
}
