/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class exc2 {
      public static void main(String[]args){
 int nbattendees=2;
 int min=0,max=0;
 String[]movie={"La Presto","Luna"};
 Scanner input=new Scanner(System.in);
 System.out.println("enter the number of movie");
 int nbmovie=input.nextInt();
 int[]rate=new int[nbattendees];
 for(int i=0;i<movie.length;i++){
 for(int j=0;j<nbattendees;j++){
 System.out.println("enter the number of movie");
 movie[i]=input.next();
 System.out.println("enter the number of attendees");
 int attendees=input.nextInt();
 int sum[]=new int[nbattendees];
 System.out.println("rate"+movie[i]+"from 1 to 5");
 rate[i]=input.nextInt();
 sum[i]+=rate[j];
 min=sum[0];
 max=sum[0];
 System.out.println("sum rate of movie"+sum[i]);
 System.out.println("rate is"+rate[j]);
 double avg=(sum[i]/nbattendees);
 if (min>sum[i])
     min=sum[i];
 if(max<sum[i])
     max=sum[i];
 }
 System.out.println("minium rate of movie is"+min);
 System.out.println("the maximium rate movie is"+max);
 System.out.println("the average of movie"+movie[i]+"is"+ double avg);
    



