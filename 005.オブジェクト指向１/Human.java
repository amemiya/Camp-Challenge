/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge6;

/**
 *
 * @author shuhei
 */
public class Human {
   public String name;
   public int num;
   
   public void setHuman(String name,int num){
   this.name = name;
   this.num=num;
   }
   
   public void print(){
   System.out.print(name);
   System.out.print(num);
   }
   
   /*public void hu(){
   System.out.print(name);
   System.out.print(num);
   }*/
}
