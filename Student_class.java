public class Student_class extends Person_class{
    private int rollno;
    protected Student_class(){
        rollno=10;
    }
    protected Student_class( int r){
        rollno=r;
    }
    public void get_rollno(){
        System.out.println("rollno="+rollno);
    }
   
    class child{
        child(){
            System.out.print(" hello i am a constructor  in child class");
        }
         void getdata(){
            System.out.print("i am getdata");
        }
       
    }
    
}