/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author ThirukkumaranShanmug
 */
public class Unit {
    
    private String boxCode;
    public String handleWithCare;
    private double weight;

public Unit(String boxCode, String handleWithCare,double weight) {
     this.boxCode=boxCode;
     this.handleWithCare=handleWithCare;
     this.weight=weight;
 }
 public String getBoxCode() {
     return boxCode;
 }
 public double getWeight() {
     return weight;
 }

    
}
