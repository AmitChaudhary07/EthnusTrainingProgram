class Animal {
    String name;
    int age ;
    
    public void getInfo(){
        System.out.println("the name is "+ this.name);
        System.out.println("the name is "+ this.age);
    }
    Animal(){
        System.out.println("This is a constructor ");
    }

}
public class oops{
    public static void main (String []args){

        Animal a1= new Animal();
        a1.name ="Anil";
        a1.age  =  21;
        a1.getInfo();


        Animal a2 = new Animal();
        a2.name = "abc ";
        a2.age= 22;

        a2.getInfo(); 


    }
}

