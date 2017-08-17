package my_Packet;

public class Point {

  public double xp1 = 0;
  public double yp1 = 0;
  public double xp2 = 5;
  public double yp2 = 5;
  public double d =Math.sqrt((xp1-xp2)*(xp1-xp2) + (yp1-yp2)*(yp1-yp2));

  public Point(double xp1, double yp1, double xp2, double yp2){
    this.xp1 = xp1;
    this.xp2 = xp2;
    this.yp1 = yp1;
    this.yp2 = yp2;
  }

  public double area () {
   return Math.sqrt((this.xp1-this.xp2)*(this.xp1-this.xp2) + (this.yp1-this.yp2)*(this.yp1-this.yp2));
  }

}
