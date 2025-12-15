/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;
import java.util.Scanner;
public class Week4_4 {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        int sum=0;
       
        for(int i=0; i<=n; i++){
            sum=sum+i;
        }
        System.out.println("Sum of 1+2+3+ ...+"+n+"= "+sum);
    }
}
