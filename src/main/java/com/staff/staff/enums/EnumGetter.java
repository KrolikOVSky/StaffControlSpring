package com.staff.staff.enums;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EnumGetter {



    public List<String> getLevel() {
        return Level.getValues();
    }

//    public String getLevel() {
//        var current = Level.getValues();
//
//        return current.toString();
//    }

//    private List<String> level = Level.getValues();
}


enum Level{

    Admin("Admin"),
    Manager("Manager"),
    Shop_assistant("Shop assistant"),
    Cook("Cook");

    private static final List<String> VALUES;
    private final String value;

    static {
        VALUES = new ArrayList<>();
        for(var el : Level.values()){
            VALUES.add(el.value);
        }
    }

    private Level(String value){
        this.value = value;
    }

    public static List<String> getValues(){
        return Collections.unmodifiableList(VALUES);
    }
}