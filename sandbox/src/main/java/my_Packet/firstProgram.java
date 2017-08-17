package my_Packet;

public class FirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("man");

    double l = 5;
    System.out.println("Площадь квадрата со стороной "+l+" = " + area(l));

    double a = 2;
    double b = 3;
    System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));

  }

  public static void hello(String somebody) {
    System.out.println("hello? " + somebody +".");

  }

  public static double area(double len) {
    return  len * len;
  }

  public static double area(double a, double b){
    return a+b;
  }
}