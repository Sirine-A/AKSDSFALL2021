/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author hp
 */
public class Movie {
    private String name;
    private int releaseyear;
public Movie(String name, int releaseyear){
    this.name = name;
}
public void setName(String name){
    this.name=name;
}
public String getName(){
    return name;
}
public void setReleaseyear(int releaseyear){
    this.releaseyear=releaseyear;
}
public int getReleaseyear(){
    return releaseyear;
}
    
    
}
