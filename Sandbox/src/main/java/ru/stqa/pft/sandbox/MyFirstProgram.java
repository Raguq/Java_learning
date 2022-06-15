package ru.stqa.pft.sandbox;

import org.w3c.dom.ls.LSOutput;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Alexander");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

        Point p = new Point (2, 6, 2, 6);
        System.out.println("Расстояние между точками" + " = " + p.distance());
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

}