package com.hibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Cirtificate {
    private String course;
    private  String durration;
}
