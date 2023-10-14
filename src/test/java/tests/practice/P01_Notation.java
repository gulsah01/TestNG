package tests.practice;

import org.testng.annotations.Test;

public class P01_Notation {
    @Test
    public void Nergiz(){
        System.out.println("Nergiz");
    }
    @Test (priority = 1)
    public  void Omer(){
        System.out.println("Omer");

    }
    @Test (priority = 30)
    public void Senol(){
        System.out.println("Senol");
    }
    @Test (priority = -1)
    public void Bugra(){
        System.out.println("Bugra Kaan");
    }

}
