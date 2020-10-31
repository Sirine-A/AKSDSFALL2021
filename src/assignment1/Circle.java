/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author hp
 */
public class Circle {
      private double radius;
 private String color;
 public Circle()
 {radius=1.0;color="red";}
 public Circle(double radius,String color)
 {this.radius=radius;
 this.color=color;}
 public void setradius(double radius)
 {this .radius=radius;}
 public double getradius()
 {return radius;}
 public void setcolor(String color)
 {this.color=color;}
 public String getcolor()
 {return color;}
 public double getArea()
 {return radius*radius*Math.PI;}
 public void print()
 {System.out.println("the Circle has radius of"+radius);
 }}
 class TestCircle{
 public void main(String[]args){
  Circle C1=new Circle(1.0,"red");
  System.out.println("the Circle has radius of"+C1.getradius()+"and color"+C1.getcolor());
  Circle C2=new Circle(2.0,"blue");
  System.out.println("the Circle has radius of"+C2.getradius()+"and color"+C2.getcolor());
  Circle C3=new Circle(3.0,"green");
  System.out.println("the Circle has radius of"+C3.getradius()+"and color"+C3.getcolor());
 }
 }
    
    

