/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;
import java.util.Scanner;
public class Week4_10 {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        
        for(int i=1; i<=n; i++){
            if(n%i==0)
            System.out.println("Factors of "+n+" are = "+i);
        }
    }    
}
