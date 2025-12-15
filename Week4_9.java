/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;
import java.util.Scanner;
public class Week4_9 {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int year=sc.nextInt();
        
        if((year%4==0) && (year%100!=0) || (year%400==0))
            System.out.println("The given year "+year+" is a leap year");
        else
            System.out.println("The given year "+year+" is not a leap year");
    }
    
}
