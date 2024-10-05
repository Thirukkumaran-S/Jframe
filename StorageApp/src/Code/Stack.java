/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;
/**
 *
 * @author ThirukkumaranShanmug
 */
public class Stack {
    int maxSize;
    Unit stackArray[]; // to hold Box objects
    int top;

    public Stack(int max){
        maxSize=max;
        stackArray=new Unit[maxSize];
        top=-1;
    }

    public boolean isEmpty(){

        return top==-1;

    }
    public boolean isFull(){
        return top==maxSize-1;
 
    }
    
    public void push(Unit b) {
        if (!isFull()) {
            stackArray[++top] = b;
        } else {
            System.out.println("Stack is full");
        }        
    }
    public Unit pop(){
        if(!isEmpty()){
            return stackArray[top--];
        }
        else {
            System.out.println("Stack is full");
             return null;
        }
       
    }
    public Unit peek(){
        if(!isFull()){
            return stackArray[top];     
        }else {
            System.out.println("Stack is empty");
            return null;
        }
    }
    
     public int getSize() {
        return top + 1;
    }
    
      public Unit get(int index) {
        if (index >= 0 && index <= top) {
            return stackArray[index];
         
    }
        return null;
      }
    
}
