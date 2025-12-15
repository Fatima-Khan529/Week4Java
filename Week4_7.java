/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

public class Week4_7 {
    
    public static void main(String[] args){
        int a=45;
        int b=23;
        int c=67;
        int d=142;
        if((a<b) && (a<c) && (a<d))
            System.out.println(a+" is the smallest");
        else if((b<a) && (b<c) && (b<d))
            System.out.println(b+" is the smallest");
        else if((c<a) && (c<b) && (c<d))
            System.out.println(c+" is the smallest");
        else
            System.out.println(d+" is the smallest");        
    }
}
