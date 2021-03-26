package lab;

public class Circle {

    static double pi = 3.1416;
    double radi;

    Circle(double n) {
        this.radi = n;

    }

    Circle() {
        this.radi = 10;

    }

    double Area() {
        return pi * radi * radi;

    }

    double perimeter() {
        return 2 * pi * radi;
    }

}

