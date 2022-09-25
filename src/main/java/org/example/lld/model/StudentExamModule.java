package org.example.lld.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class StudentExamModule extends BaseModel {

    @ManyToOne
    public Student student;


    @ManyToOne
    private ModuleExam moduleExam;
}


// SEM : S
//  1 : 1
//  M : 1

// SEM : ME
//   1 : 1
//   M  : 1