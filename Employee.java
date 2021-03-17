package com.example.demo.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "Employee")
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empId")
    private int empId;
    @Column(name = "userName")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "age")
    private int age;
    @Column(name = "CTC")
    private int CTC;
    @Column(name = "JOIdate")
    @Temporal(TemporalType.DATE)
    private Date JOIdate;
    @Column(name = "status")
    private boolean status;

    //    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(foreignKey = @ForeignKey(name = "Department"), name = "deptId")
//    private int deptId;
//    @ManyToOne()
//    @JoinColumn(name = "deptId")
    @Column(name="deptId")
    private int deptId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCTC() {
        return CTC;
    }

    public void setCTC(int CTC) {
        this.CTC = CTC;
    }

    public Date getJOIdate() {
        return JOIdate;
    }

    public void setJOIdate(Date JOIdate) {
        this.JOIdate = JOIdate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", CTC=" + CTC +
                ", JOIdate=" + JOIdate +
                ", status=" + status +
                ", department=" + deptId +
                '}';
    }
}
