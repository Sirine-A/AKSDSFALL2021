/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListQuiz;

/**
 *
 * @author hp
 */
public class LinkedList implements ListInterface{
     private class Node{
       Object value;
       Node next;
       public Node(Object value){
           this.value=value;
       }

        private void next() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
   } 
private Node head;
    @Override
    public void add(Object newElement) {
        if(head==null){
         head=new Node(newElement);}
         else{
           Node currentNode=head;
           while(currentNode!=null){
             currentNode=currentNode.next;
                 }
           currentNode.next =new Node(newElement);
                 }
    }

    @Override
    public int indexOf(Object element) {
         Node currentNode=head;
      int index=0;
     while(currentNode!=null){
         if(currentNode.value.equals(element)){
             return index;
         }
         index++;
         currentNode.next=currentNode;
     }
     return -1;
    }

    @Override
    public Object remove(int index) {
       if(isEmpty()){
          throw new RuntimeException("list is empty");
      } 
      else{
          if(index==0){
              return this.removeHead();
      }
      else{
          Node nodeAtIndex=this.getNode(index);
          Node currentNode=this.head;
          while(!currentNode.equals(nodeAtIndex)){
              currentNode= currentNode.next;
          }
          currentNode.next=nodeAtIndex.next;
          return nodeAtIndex.value;
          }
      }
    }

    @Override
    public boolean remove(Object element) {
         final int indexOfElementToRemove=indexOf(element);
       if(indexOfElementToRemove==-1){
           return false;
       }
       this. remove(indexOfElementToRemove);
        return true;
    }

    @Override
    public int size() {
        int size=0;
    Node currentNode=head;
    while(currentNode!=null){
       currentNode.next=currentNode;
       size++;
    }
     return size;
    }
   public Object removeHead(){
        if(isEmpty()){
            throw new RuntimeException("list is empty");
        }
        else{
            Node nodeToRemove=this.head;
            nodeToRemove.next=this.head;
            return nodeToRemove.value;
        }
    }
    public Object get(int index) {
      Node currentNode =head;
      int count=0;
      while(currentNode!=null){
          if(count==index){
              return currentNode.value;
          }
          currentNode.next=currentNode;
          count++;
      }
      throw new RuntimeException("Object at give index is not found");}
    public boolean isEmpty() {
    return this.head==null;
    }
    public void print(){
        if(isEmpty()){
            throw new RuntimeException("the list is empty");
        }
        else{
            Node currentNode=this.head;
            while(currentNode!=null){
                System.out.println(currentNode.value+"...");
                currentNode=currentNode.next;
            }
            System.out.println(" ");
        }
    }
    public int countOccurences(Object element){
        if(isEmpty()){
            throw new RuntimeException("list is empty");            
        }
        else{
            Node currentNode=head;
            int count=0;
            while(currentNode!=null){
                currentNode=currentNode.next;
                count++;
            }
            return  occurs;
        }
    }
    public Object getNext(Object element){
        if(isEmpty()){
            throw new RuntimeException("list is empty");}
        else{
            Node currentNode=this.head;
            while(currentNode!=null){
                if(currentNode.equals(element)){
                    return currentNode;
                }
                currentNode=currentNode.next;
            }
            return currentNode;
        }
    }
    public Object getPrevious(Object element){
        if(isEmpty()){
            throw new RuntimeException("list is empty");
        }
        else{ 
            Node nodeprevious=this.head;
            Node currentNode=this.head;
            while(!currentNode.equals(nodeprevious)){
                currentNode=currentNode.next;
            }
            currentNode.next=nodeprevious;
     return nodeprevious;
            
        }
    }
}
