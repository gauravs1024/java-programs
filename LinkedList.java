
import java.util.Scanner;
class LinkedList{


    class node {
        int data;
        node next;
    }
    int count=0; // to count the number nodes in the Linked list

    node fst=null,last,temp,curr,prev;

    public  boolean isempty(){
        return fst==null;
    }

   public  void add_first(){
        count++;
        node temp=new node();
        Scanner m=new Scanner(System.in);
        System.out.println("enter the data in newly inserted noode");
        temp.data=m.nextInt();
        if(fst==null)
        last=fst;
        temp.next=fst;
        fst=temp;


    }

   public   void display(){
    temp=fst;
    System.out.printf("\n\n your Linked List data is.....\n");
        while(true)
        {   
            if(temp==null)
            break;
            else {
                System.out.println(temp.data);
            
            }
            temp=temp.next;
        }
    }


    public void delete(){
        temp=curr=fst;
        int element_delete;
        System.out.println("Enter the value should be deleted!");
         Scanner m=new Scanner(System.in);
         element_delete=m.nextInt();
        while(curr!=null)
        {
            if(curr.data==element_delete){
                break;
            }
            temp=curr;
            curr=curr.next;
            
        }
      // System.out.println(curr.data);  

        if(curr==fst)
        fst=curr.next;
        else    
        temp.next=curr.next;
        System.out.printf("\nElement deleted successfully!!!!!!\n\n");
         
         
    }

    public void  insert(){
        int element_insert,position,i=1;
    System.out.printf("\nenter the value to be insert in the linked list =");
    Scanner m=new Scanner(System.in);
    element_insert=m.nextInt();
    System.out.printf("\nenter the position where have  to insert the given element=");
    position=m.nextInt();
    curr=fst;
    
    System.out.printf("\ncount= "+count);

    if(count<position)
    System.out.printf("\nsorry the given postion does not exist...!!\n\n");
    else {                  // loop for finding the index enter by the user to insert a new element 
        curr=fst;
        while(i<position){
        prev=curr;
        curr=curr.next;
        i++;
        }

        System.out.println("curr="+curr.data);
        node temp=new node();
        temp.data=element_insert;

        if(position==1)
        add_first();

        else if(curr.next==null){// logic for insert a node in the end
            curr.next=temp;
            temp.next=null;
        }
        else{
        prev.next=temp;
        temp.next=curr;
        }

       count++;
    }
}


void sort(){
    curr=fst;
    temp=fst.next;
    while(curr!=null){
        while(temp!=null){
        if(curr.data>temp.data){
            curr.data=curr.data+temp.data;
            temp.data=curr.data-temp.data;
            curr.data=curr.data-temp.data;
        }
       
        temp=temp.next;
        
    }
    curr=curr.next;
    }
    System.out.printf("\n sorted succesfully!!!!!!!!!");


}

    public static void main(String []args ){
        Scanner a=new Scanner(System.in);
        int choice;
        LinkedList obj=new LinkedList();
        while(true){

        System.out.println("enter your choice");
        System.out.println("1.insert a new node");
        System.out.println("2.display");
        System.out.println("3.delete");
        System.out.println("4.insert a element");
        System.out.println("5.sort");
        System.out.println("6.exit");
        choice=a.nextInt();
        if(choice==1)
        obj.add_first();
        else if(choice==2)
        obj.display();
        else if(choice==3)
        obj.delete();
        else if(choice==4)
        obj.insert();
        else if(choice==5)
        obj.sort();
        else
        break;

        }

    }
}