package edu.dmacc.codedsm.app;

import java.util.Objects;

public class TaskInputDto {

    private String firstName;
    private String lastName;
    private String task;
    private String due;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDue() {
        return due;
    }

    public void setDue(String due) {
        this.due = due;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskInputDto that = (TaskInputDto) o;
        return Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(task, that.task) &&
                Objects.equals(due, that.due);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, task, due);
    }

    @Override
    public String toString() {
        return "TaskInputDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", task='" + task + '\'' +
                ", due='" + due + '\'' +
                '}';
    }
}
