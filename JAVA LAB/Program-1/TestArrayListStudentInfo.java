package com.durgesh.program1;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListStudentInfo
{
    public static void main(String[] args) {
        List<Student> obj=new ArrayList<>();

        Student student=new Student("Durgesh","1RV20MC015","MCA");
        obj.add(student);
        obj.add(new Student("Sonu","1RV20MC066","M.tech"));
        obj.add(new Student("Prince","1RV20MC088","CS"));

        System.out.println("___________print data_________________");
        System.out.println(obj);

        System.out.println("isEmpty():"+obj.isEmpty());

        System.out.println("contains():"+obj.contains(student));

        System.out.println("indexOf(student):"+obj.indexOf(student));

        System.out.println("get(1):"+obj.get(1));

        System.out.println("remove(student):"+obj.remove(student));

        System.out.println("size():"+obj.size());

        System.out.println("______________Remove all Data from ArrayList_________________");
        obj.clear();
        System.out.println(obj);

    }
}
