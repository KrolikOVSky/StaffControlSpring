package com.staff.staff.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name, position;
    private Date time;
    private int totalSalary, everyDaySalary, everyWeekSalary, everyMonthSalary;
    private boolean atWork;

    public Long getId() {
        return id;
    }

    public boolean isAtWork() {
        return atWork;
    }

    public void setAtWork(boolean atWork) {
        this.atWork = atWork;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(int totalSalary) {
        this.totalSalary = totalSalary;
    }

    public int getEveryDaySalary() {
        return everyDaySalary;
    }

    public void setEveryDaySalary(int everyDaySalary) {
        this.everyDaySalary = everyDaySalary;
    }

    public int getEveryWeekSalary() {
        return everyWeekSalary;
    }

    public void setEveryWeekSalary(int everyWeekSalary) {
        this.everyWeekSalary = everyWeekSalary;
    }

    public int getEveryMonthSalary() {
        return everyMonthSalary;
    }

    public void setEveryMonthSalary(int everyMonthSalary) {
        this.everyMonthSalary = everyMonthSalary;
    }
}
