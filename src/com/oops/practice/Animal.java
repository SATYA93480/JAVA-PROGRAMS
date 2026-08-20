package com.oops.practice;

class test {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends test {

    void sound() {
        System.out.println("Bow Bow");
    }
}

 class Animal {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();

    }
}