package com;

public class Main {
    public static void main(String[] args) {
        Animal animal=new Dog();
        animal.doJob(new ConcreteVisitor());
        Animal animal2=new Cat();
        animal2.doJob(new ConcreteVisitor());
    }
}
interface Animal{
    void doJob(Visitor visitor);
}
class Dog implements Animal{
    @Override
    public void doJob(Visitor visitor) {
        visitor.doDog();
    }
}
class Cat implements Animal{
    @Override
    public void doJob(Visitor visitor) {
        visitor.doCat();
    }
}
interface Visitor{
    void doDog();
    void doCat();
}
class ConcreteVisitor implements Visitor{
    @Override
    public void doDog() {
        System.out.println("Gawwww");
    }

    @Override
    public void doCat() {
        System.out.println("mau mau");
    }
}































