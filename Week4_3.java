/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;
import java.util.Scanner;
public class Week4_3 {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        System.out.println(n+"'s multiplication table upto 10");
        
        for(int i=1; i<=10; i++){
            int p=n*i;
            System.out.println(n+"x"+i+"="+p);
        }
    }   
}
