package circle.test;

import circle.model.Cylinder;

public class CylinderTest {
  public static void main(String[] args) {
    Cylinder cylinder1 = new Cylinder();
    Cylinder cylinder2 = new Cylinder(12,"blue",10);

    System.out.println(cylinder1);
    System.out.println(cylinder2);
  }
}
