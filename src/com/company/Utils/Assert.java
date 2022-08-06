package com.company.Utils;

public class Assert {
    public static void equals(String name,String a,String b){
        if(name == null)
            name = "";
        if (a.equals(b))
            System.out.println("Passed "+name);
        else
        {System.out.print("Faied "+name +" |");
            System.out.print("Expected " +a +",");
            System.out.print("Got " +b);
            System.out.println();}
    }

    public static void equals() {
    }
}
