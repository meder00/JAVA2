package com.geektech;

public class Triangle  extends Figure{
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC,String name) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        super.setName(name);

    }

    @Override
    public int colculatePerimeter() {

        return sideA + sideB + sideC;
    }

    @Override
    public String draw() {
        return "\uD83D\uDD3A";

    }
}
