/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

/**
 *
 * @author hp
 */
public class StackImplentation {
    private final list.List st=new ArrayList();
    public void Stack(){
        ArrayList Stack = new ArrayList();   
    }
    public void push(Object element){
        st.add(element);
    }
    public Object pop(){
        if(!isEmpty()){
           st.remove(st.size()-1);
            Object popValue = null;
           return popValue;
        }
        else{
      return -1;}  
    }
    public Object peek(){
    return st.remove(st.size()-1);
    }
    public boolean isEmpty(){
      if(st.isEmty()){
       return true;
      }
      else{
          return false;
      }
        
    }
    public int size(){
        return st.size();
    }
}

    

