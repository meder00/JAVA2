package com.geektech;

public class Dog extends Animal implements SoundProuducable{

    public Dog(String name){

        super.setName(name);
    }

    @Override
    public String draw() {
        return "\uD83D\uDC36";
    }

    @Override
    public String callSound() {
        return " ГАВ ГАВ ";
    }
}
