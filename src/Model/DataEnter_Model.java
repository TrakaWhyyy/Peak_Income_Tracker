
package Model;


public class DataEnter_Model {
    
}

class Node{ 
    Node nextNode;
    double value;
    int data;
}

class Linkedline{
    Node head;
    public Linkedline(){
        head = null;
    }
    public void insertData(double value_Pass,int data_Pass){
        if(head == null){
            Node node = new Node();
            node.value = value_Pass;
            node.data = data_Pass;
            head = node;
        }
        else{
            Node node = new Node();
            node.value = value_Pass;
            node.data = data_Pass;
            node = node.nextNode;
            head = node;

        }
    }
    
    
}