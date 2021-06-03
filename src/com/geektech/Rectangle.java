package com.geektech;

public class Rectangle extends Figure{

    private int a;
    private int b;

    public Rectangle(int a, int b,String name) {
        this.a = a;
        this.b = b;
        super.setName(name);
    }

    @Override
    public int colculatePerimeter() {

        return (a + b) * 2;
    }

    @Override
    public String draw() {
        return "▯";

    }
}
