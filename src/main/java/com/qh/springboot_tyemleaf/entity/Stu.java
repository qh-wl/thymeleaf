package com.qh.springboot_tyemleaf.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "student")
public class Stu {
    @Id
    private Integer stu_id;
    @Column(name = "stu_name")
    private String  stu_name;

    public Stu(Integer stu_id, String stu_name) {
        this.stu_id = stu_id;
        this.stu_name = stu_name;
    }

    public Integer getStu_id() {
        return stu_id;
    }

    public void setStu_id(Integer stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public Stu() {
    }

    @Override
    public String toString() {
        return "Stu{" +
                "stu_id=" + stu_id +
                ", stu_name='" + stu_name + '\'' +
                '}';
    }
}
