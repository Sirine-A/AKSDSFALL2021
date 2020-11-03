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
public class ArrayList {
private Object[]List;
private int effectiveSize;
private static final int BUFFER-SIZE=10;
public ArrayList(){
List= new Object[BUFFER-SIZE];
effecticeSize=0;
}
public void add(Objective newElement){
if(List.Length==effectiveSize){
List=Arrays.copyOf(List,List.Length+BUFFER-SIZE);
}
List[effectiveSize]= newElement;
effectiveSize;
}
public Object remove(int index){
if(index<0 || index>=effectiveSize){
throw newArrayIndexOutOfBoundsException("invalid index"+index);
}
final object ValueToRemove=List[index];
List[]newList= new List[List.Length-1];
for(int i=0;i<List.Length;i++){
List[i]= newList[i-1];
}
List=newList;}
List[effectiveSize]=newElement;
effectiveSize--;
}
public boolean remove(Object element){
return false;
}
public int IndexOf(Object element){
return -1;
}
}
