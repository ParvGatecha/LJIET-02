import java.util.Scanner;

class circle {
    double radius, area, circumference;
    final double pi = 3.14;

    void setRadius() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        radius = sc.nextDouble();
        sc.close();
    }

    void display() {
        area = pi * radius * radius;
        System.out.println("Area of the circle is " + area);
    }

    public static void main(String[] args) {
        circle c = new circle();
        c.setRadius();
        c.display();
    }
}