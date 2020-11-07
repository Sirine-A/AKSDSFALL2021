/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2;

import com.sun.corba.se.spi.orb.OperationFactory;
import java.util.Arrays;

/**
 *
 * @author hp
 */
public class ArrayList implements NewInterface {
   private Object[]List;
private int effectiveSize=0;
private static final int BUFFER_SIZE=10;
public ArrayList(){
 List= new Object[BUFFER_SIZE];
}
    @Override
    public void add(Object newElement){
if(List.length==effectiveSize){
List=Arrays.copyOf(List,List.length+BUFFER_SIZE);
}
List[effectiveSize]= newElement;
effectiveSize++;
}
   @Override
    public int size(){
        return effectiveSize;
    }
    @Override
    public Object remove(int index){
if(index<0 || index>=effectiveSize){
throw new ArrayIndexOutOfBoundsException("invalid index"+index);
}
final Object ValueToRemove=List[index];
if(effectiveSize%BUFFER_SIZE==0){
List=Arrays.copyOf(List,List.length-BUFFER_SIZE);
}
effectiveSize--;
return ValueToRemove;
}
    @Override
    public boolean remove(Object element){
    final int indexOfElementToRemove=indexOf(element);
    if(indexOfElementToRemove==-1){
return false;}
remove(indexOfElementToRemove);
return true;
}
    @Override
    public int indexOf(Object element){
    for(int i=0;i<List.length;i++){
        if(List[i].equals(element)){
            return i;
        }
    }
return -1;
}

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
