package com.geektech;

public class  Circle extends Figure{

    private int radius;

    public Circle(int radius,String name) {
        super.setName(name);
        this.radius = radius;
    }

    @Override
    public int colculatePerimeter() {

        return (int) ((radius * Math.PI) * 2);
    }

    @Override
    public String draw() {
        return "\uD83D\uDD34";
    }
}
