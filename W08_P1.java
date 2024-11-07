import java.util.*;
class Animal{
  protected String name;
  protected String sound;
  
  Animal(String n,String s){
    name=n;
    sound=s;
  }
  
  public void makeSound(){
    System.out.println(name+" says: "+sound);
  }
  

}

class Dog extends Animal{
  Dog(String n)
  {
     super(n,"Woof");
  }
  
  
}

class Cat extends Animal{
  
  Cat(String n){
    super(n,"meow");
    
  }
}

class W08_P1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Plz Enter dog name & cat name : ");
        String dogName = scanner.nextLine();
        String catName = scanner.nextLine();

        Dog dog = new Dog(dogName);
        Cat cat = new Cat(catName);

        dog.makeSound(); 
        cat.makeSound();  

        scanner.close();
    }
}