package my_Packet;

import javax.swing.*;
import java.awt.*;

public class FirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("man");
    
    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectengle r = new Rectengle(2, 4);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

    Point p = new Point(5,6,3,6);
    System.out.println("Расстояние между точками p1 и p2 =" + p.d + ".");

  }

  public static void hello(String somebody) {
    System.out.println("hello? " + somebody + ".");
  }



}