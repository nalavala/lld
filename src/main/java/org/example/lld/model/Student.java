package org.example.lld.model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Student extends BaseModel {

    private String name;
    private String email;
    private String phoneNumber;
    private String password;
    @ManyToMany
    private List<Module> moduleList;
}

// S : M
// 1 : m
// m  : 1
