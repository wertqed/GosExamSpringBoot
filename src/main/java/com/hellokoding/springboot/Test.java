package com.hellokoding.springboot;

/**
 * Created by VBelov on 29.05.2018.
 */
public class Test {

    private Long id;
    private String name;

    public Test(){

    }
    public Test(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
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

    @Override
    public String toString() {
        return String.format("Student [id=%s, name=%s]", id, name);
    }
}
