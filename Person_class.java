public class Person_class{
    private int age;
    private String name;
    Person_class(){
        age=5;
        name="person1";
    }
    Person_class( int obj_age ,String obj_name){
        age=obj_age;
        name=obj_name;
    }
    public void getdata(int a){
        System.out.print("name="+name+" age="+age);
    }
    
}