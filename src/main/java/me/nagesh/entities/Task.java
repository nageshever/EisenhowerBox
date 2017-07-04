package me.nagesh.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by lakinep on 7/3/17.
 */
@Entity
public class Task {

    public long getId() {
        return id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String taskName;
    private String taskdesc;
    private Date targetDate;

    public Task(String taskName, String taskdesc, Date targetDate) {
        this.taskName = taskName;
        this.taskdesc = taskdesc;
        this.targetDate = targetDate;
    }

    public Task() {
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskdesc() {
        return taskdesc;
    }

    public void setTaskdesc(String taskdesc) {
        this.taskdesc = taskdesc;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", taskName='" + taskName + '\'' +
                ", taskdesc='" + taskdesc + '\'' +
                ", targetDate=" + targetDate +
                '}';
    }
}
