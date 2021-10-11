package com.durgesh.program1;
public class Student {
    private String name;
    private String usn;
    private String dept;

    public Student() {
    }

    public Student(String name, String usn, String dept) {
        this.name = name;
        this.usn = usn;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", usn='" + usn + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
