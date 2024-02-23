
package businessstrategyshowing_programme;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.ArrayIndexOutOfBoundsException;

//make a node to linked list
class Node{ 
    Node nextNode;
    double value;
    int data;
    Node(double getValue,int getData){
        this.value = getValue;
        this.data = getData;
        this.nextNode = null;
    }
}

//make linked list to add values to data structure 
class Linkedlist{
    Node head;
    
    public Linkedlist(){
        head = null;
    }
    //add values to linkedlist
    public void insertData(double value_Pass,int data_Pass){
        Node node = new Node(value_Pass,data_Pass);
        if(head == null){
           head = node;
           return;
        }
        Node last = head;
        while(last.nextNode != null){
            last = last.nextNode;
        }
        last.nextNode = node;
    }
    //display value in the linked list
    public void displayValue(){
        String RESET = "\u001B[0m";
        String RED_TEXT = "\u001B[31m";
        String GREEN_TEXT = "\u001B[32m";
        String YELLOW_TEXT = "\u001B[33m";
        String WHITE_BG = "\u001B[47m";
        Node current = head;//meke a node to get head value 
        System.out.println(GREEN_TEXT+WHITE_BG+"\n<< Data in the System >>"+RESET);
        //make a loop to run the programm
        while(current != null){
            System.out.println("Date  => "+YELLOW_TEXT+current.data+RESET);
            System.out.println("Value => "+RED_TEXT+current.value+RESET);
            current = current.nextNode;
        }
    }
    //Add values to the tree
    public void addValue(){
        String RESET = "\u001B[0m";
        String RED_TEXT = "\u001B[31m";
        String BLACK_BG = "\u001B[40m";
        //make the Binary Tree object to get the data.
        BinaryTree tree = new BinaryTree();
        Node current = head;
        while(current != null){
            tree.insertData(current.value);
            current = current.nextNode;
        }
       System.out.println(RED_TEXT+BLACK_BG+"\n<< Convert profit values to low value to high value >>"+RESET);
       tree.inorderTraversal(tree.root);
    }
    //make array to get data from the user
    double [] arrayValue = new double[3000];
    int [] arrayDate = new int[3000];
    int j = 0;
    public void getValue(){
        Scanner inputs = new Scanner(System.in);
        //Get colours to the Terminal
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        int con = 0;
        while(con == 0 ){
        System.out.println(RED+"\nEnter the day"+RESET);
        arrayDate[j] = inputs.nextInt();
        System.out.println(RED+"Enter the profit"+RESET);
        arrayValue[j] = inputs.nextDouble();
        j++;
        System.out.println("Enter any nuber to stop the process or enter"+RED+" <<0>> "+RESET+"to enter another value");
        con = inputs.nextInt();
        }
    }
    
    //insert value to the linked list 
    public void insertValue(){
        Linkedlist list = new Linkedlist();
        for(int i=0;i< j;i++){
            list.insertData(arrayValue[i], arrayDate[i]);
        }
        list.displayValue();
        list.addValue();
    }
    
}

//make a node to create binary tree;
class TreeNode{
    double value;
    TreeNode left;
    TreeNode right;
}

class BinaryTree{
    TreeNode root;
    public BinaryTree(){
        root = null;
    }
    public void insertData(double data){
        root = insertRoot(root,data);
    }
    public TreeNode insertRoot(TreeNode root,double data){
        if(root == null){
            root = new TreeNode();
            root.value = data;
            return root;
        } 
        if(data < root.value){
            root.left = insertRoot(root.left,data);
        }
        else if(data > root.value){
            root.right = insertRoot(root.right,data);
        }
        return root;
    }
     public void inorderTraversal(TreeNode node) {
         
        if (node != null) {
            inorderTraversal(node.left);
            System.out.println(node.value + " ");
            inorderTraversal(node.right);
        }
    }
}

public class BusinessStrategyShowing_Programme {

    
    public static void main(String[] args) {
       String RESET = "\u001B[0m";
        String BLUE_TEXT = "\u001B[34m";
       System.out.println(BLUE_TEXT+">>===========================================================================<<\n"
+BLUE_TEXT+"|| ______   ______   ________   ___   ___                                    ||\n" 
+BLUE_TEXT+"||/_____/\\ /_____/\\ /_______/\\ /___/\\/__/\\                                   ||\n" 
+BLUE_TEXT+"||\\:::_ \\ \\\\::::_\\/_\\::: _  \\ \\\\::.\\ \\\\ \\ \\                                  ||\n" 
+BLUE_TEXT+"|| \\:(_) \\ \\\\:\\/___/\\\\::(_)  \\ \\\\:: \\/_) \\ \\                                 ||\n" 
+BLUE_TEXT+"||  \\: ___\\/ \\::___\\/_\\:: __  \\ \\\\:. __  ( (                                 ||\n" 
+BLUE_TEXT+"||   \\ \\ \\    \\:\\____/\\\\:.\\ \\  \\ \\\\: \\ )  \\ \\                                ||\n" 
+BLUE_TEXT+"|| ___\\_\\/_  __\\_____\\/ \\__\\/\\__\\/_\\__\\/\\__\\/_ __ __   ______                ||\n" 
+BLUE_TEXT+"||/_______/\\/__/\\ /__/\\ /_____/\\ /_____/\\ /__//_//_/\\ /_____/\\               ||\n" 
+BLUE_TEXT+"||\\__.::._\\/\\::\\_\\\\  \\ \\\\:::__\\/ \\:::_ \\ \\\\::\\| \\| \\ \\\\::::_\\/_              ||\n" 
+BLUE_TEXT+"||   \\::\\ \\  \\:. `-\\  \\ \\\\:\\ \\  __\\:\\ \\ \\ \\\\:.      \\ \\\\:\\/___/\\             ||\n" 
+BLUE_TEXT+"||   _\\::\\ \\__\\:. _    \\ \\\\:\\ \\/_/\\\\:\\ \\ \\ \\\\:.\\-/\\  \\ \\\\::___\\/_            ||\n" 
+BLUE_TEXT+"||  /__\\::\\__/\\\\. \\`-\\  \\ \\\\:\\_\\ \\ \\\\:\\_\\ \\ \\\\. \\  \\  \\ \\\\:\\____/\\           ||\n" 
+BLUE_TEXT+"|| _\\________\\/_\\__\\/ \\__\\/_\\_____\\/_\\_____\\/_\\__\\/_\\__\\/_\\_____\\/_____      ||\n" 
+BLUE_TEXT+"||/________/\\/_____/\\  /_______/\\ /_____/\\ /___/\\/__/\\ /_____/\\ /_____/\\     ||\n" 
+BLUE_TEXT+"||\\__.::.__\\/\\:::_ \\ \\ \\::: _  \\ \\\\:::__\\/ \\::.\\ \\\\ \\ \\\\::::_\\/_\\:::_ \\ \\    ||\n" 
+BLUE_TEXT+"||   \\::\\ \\   \\:(_) ) )_\\::(_)  \\ \\\\:\\ \\  __\\:: \\/_) \\ \\\\:\\/___/\\\\:(_) ) )_  ||\n" 
+BLUE_TEXT+"||    \\::\\ \\   \\: __ `\\ \\\\:: __  \\ \\\\:\\ \\/_/\\\\:. __  ( ( \\::___\\/_\\: __ `\\ \\ ||\n" 
+BLUE_TEXT+"||     \\::\\ \\   \\ \\ `\\ \\ \\\\:.\\ \\  \\ \\\\:\\_\\ \\ \\\\: \\ )  \\ \\ \\:\\____/\\\\ \\ `\\ \\ \\||\n" 
+BLUE_TEXT+"||      \\__\\/    \\_\\/ \\_\\/ \\__\\/\\__\\/ \\_____\\/ \\__\\/\\__\\/  \\_____\\/ \\_\\/ \\_\\/||\n" +BLUE_TEXT+
">>===========================================================================<<\n"+RESET);
       Linkedlist list = new Linkedlist();
       try{
       list.getValue();
       list.insertValue();
       }
       catch(InputMismatchException e){
           System.out.println("Incorrect input ");
       }
       catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Can't store more values to the system");
       }  
    }
}
