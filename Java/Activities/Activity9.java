package activities;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> mylist = new ArrayList<String>();

        mylist.add("Apple");
        mylist.add("Ball");
        mylist.add("Cat");
        mylist.add("Dog");
        mylist.add("Egg");
        System.out.println("Names of all elements :");
        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }
        boolean value =mylist.contains("Dog");
        System.out.println("Value of 3rd element :"+mylist.get(2));
        if(value = true) {
            System.out.println("The name DOG excits in the list");
        }
        else {
            System.out.println("The name DOG does not excits in the list");
        }
       int sizeoflist= mylist.size();
        System.out.println("The size of the given array is :" +sizeoflist);
        mylist.remove(3);
        int sizeoflistafterremoval= mylist.size();
        System.out.println("The size of the given array after removal of index 3 is :"+sizeoflistafterremoval);


    }
}