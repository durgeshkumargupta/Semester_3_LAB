package com.durgesh.program1;

import java.util.LinkedList;

public class TestLinkedListEmpInfo
{
    public static void main(String[] args) {
        LinkedList<Employee> obj=new LinkedList<>();

        Employee emp = new Employee("EMP1", "Rohit", "Patna");

        obj.add(emp);
        obj.add(new Employee("EMP2","Ravi","UP"));
        obj.add(new Employee("EMP3","Ayush","Delhi"));

        System.out.println("______________Print Data____________________");
        System.out.println(obj);

        System.out.println("_________Add First_______________________");
        obj.addFirst(new Employee("EMP4","Adity","Mumbai"));

        System.out.println(obj);

        System.out.println("___________Add Last_________________");
        obj.addLast(new Employee("EMP5","Aman","Patna"));
        System.out.println(obj);

        System.out.println("____________Remove First___________________");
        System.out.println("removeLast():"+obj.removeLast());
        System.out.println(obj);

        System.out.println("___________Remove last______________________");
        System.out.println("removeFirst():"+obj.removeFirst());
        System.out.println(obj);

        System.out.println("_____________________getFirst()______________________");
        System.out.println("getFirst():"+obj.getFirst());

        System.out.println("_________________getLast()____________________________");
        System.out.println("getLast():"+obj.getLast());

        System.out.println("___________________________________________________");
        System.out.println("size():"+obj.size());

        System.out.println("get(2):"+obj.get(2));

        System.out.println("contains(emp):"+obj.contains(emp));

    }
}
