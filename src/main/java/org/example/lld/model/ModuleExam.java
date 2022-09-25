package org.example.lld.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class ModuleExam extends BaseModel {

    @ManyToOne
    private Module module;

    @ManyToOne
    private Exam exam;

    private LocalDate examDate;


}
