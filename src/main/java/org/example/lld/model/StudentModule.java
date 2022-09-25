package org.example.lld.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class StudentModule extends BaseModel {

    @ManyToOne
    // One student can relation with multiple studentModules
    // One StudentModule can relation with single Student
    private Student student;

    @OneToMany
    private Module module;
}


// SM : S
//  1 : 1
//  M : 1


// SM : M
// 1 : 1
// M : 1

