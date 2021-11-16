package com.javabrains.courseapidatabase.department;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {

    @Id
    private String id;
    private String name;

    public Department(String id, String name) {
        this.id = id;
        this.name = name;

    }

    public Department() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
     
}
