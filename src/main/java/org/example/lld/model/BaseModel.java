package org.example.lld.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;
import java.util.Date;

@MappedSuperclass
public abstract class BaseModel {

    @Id
    private Long id;

    @CreatedDate
    private LocalDate createdAt;

    @LastModifiedDate
    private LocalDate lastModifiedAt;
}
