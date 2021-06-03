package com.geektech;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Circle circle = new Circle(15, "Круг  ");
        Triangle triangle = new Triangle(10, 10, 6, "Треугольник ");
        Rectangle rectangle = new Rectangle(10, 20, "Прямоугльник ");
        Figure[] figures = new Figure[]{circle, rectangle, triangle};

        Dog dog = new Dog("layka ");
        Drawable[] drawables = {circle,rectangle,triangle,dog};
        for (int i = 0; i < drawables.length; i++) {
            System.out.println("Рисунок ");
            if (drawables[i] instanceof Figure) {
                System.out.println(((Figure) drawables[i]).getName() + " " + drawables[i].draw());
                System.out.println(" " + (((Figure) drawables[i]).getName() +
                        ((Figure) drawables[i]).colculatePerimeter()));
            }
            if (drawables[i] instanceof Animal) {
                System.out.println(((Animal) drawables[i]).getName() + " " + drawables[i].draw() +
                       " Издал звук " +  dog.callSound());
            }
        }
    }
}
