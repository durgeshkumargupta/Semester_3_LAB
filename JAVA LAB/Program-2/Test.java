package com.durgesh.program2;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args) {
        TreeMapExample obj = new TreeMapExample();
        HashMapExample obj2= new HashMapExample();

        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("1.Adding Element");
            System.out.println("2.Searching Value");
            System.out.println("3.Display");
            System.out.println("4.Sort Value of TreeMap ");
            System.out.println("Enter your choice:");
            int ch = sc.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("Enter the state name");
                    String state = sc.next();
                    System.out.println("Enter the capital name");
                    String capital = sc.next();
                    obj.setValue(state, capital);
                    obj2.setValue(state, capital);
                    break;
                case 2:
                    System.out.println("Enter the key to search");
                    String key = sc.next();
                    obj.searchValue(key);
                    break;
                case 3:
                    System.out.println("______________Tree Map_____________________");
                    obj.getValue();
                    System.out.println("______________Hash Map_____________________");
                    obj2.getValue();
                    System.out.println("________________________________________________");

                    break;
                case 4:
                    obj2.sortValue();
                    break;
                default:
                    System.out.println("Please try again!!");

            }
        }
    }
}
