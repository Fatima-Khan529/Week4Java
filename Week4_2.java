/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

public class Week4_2 {
    
    public static void main(String[] args){
        int a=84;
        int b=17;
        int c=29;
        
        if(a>b){
            if(a>c)
                System.out.println(a+" is the largest among the three");
            else
                System.out.println(c+" is the largest among the three");
        }
        else if(b>c)
            System.out.println(b+" is the largest among the three");
        else
            System.out.println(c+" is the largest among the three");
    }
}
