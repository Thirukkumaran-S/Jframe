/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;
import Code.Order;

/**
 *
 * @author ThirukkumaranShanmug
 */
public class Queue {
    private int maxSize;
    private Order queueArray[];
    private int front;
    private int rear;
    private int nItems;

 public Queue(int s){
    maxSize=s;
    queueArray=new Order[maxSize];
    front=0;
    rear=-1;
    nItems=0;
    
 } 
 public boolean isEmpty(){
   return nItems==0;
  
 } 
 public boolean isFull(){
 return nItems==maxSize;
 } 
 public void insert(int i, String p[],int q[]){
     if(!isFull()){
          rear=rear+1%maxSize;
        queueArray[rear]=new Order(p,q);
       
        nItems++;
     }
 }
 public Order remove(){
    if(!isEmpty()){
        Order o=queueArray[front];
        front=front+1%maxSize;
        nItems--;
        return o;
    }
    return null;
}
 
}
