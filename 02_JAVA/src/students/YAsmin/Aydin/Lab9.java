package src.students.YAsmin.Aydin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lab9 {
    public static void main(String[] args) {
        //        ## Lab 09 -         (ArrayList) Remove "hello"
        //        Given a list of people' names: "Amed", "hello", Eric", "mike".....
        //        Write a java operation to remove all the names named hello
        String[] str_array = {"Ahmet","Elif", "Ahmet","Elif","Recep", "Elif", "Ela","Ada","Elif"};
        List<String> list = new ArrayList<String>(Arrays.asList(str_array));
        for (int i=0; i <= list.size()-1; i++){
            list.remove("Ahmet");
        }
        System.out.println(list);
    }
}
