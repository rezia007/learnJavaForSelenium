class Car {
    String colour="Black";
    String name="Toyato";

    void run(){
        System.out.println("It's running like Tiger");
    }
}
class BMW extends Car
{
  String mainAction="Moving";
    public BMW(){
        System.out.println("I am BMW Constructor");

    }

    public static void main(String[] args) {
        BMW obj = new BMW();
        System.out.println(obj.colour);
        System.out.println(obj.name);
    }



    }

