package com.gla.Inheritance.AssistedProblems.AnimalHierarchy;
class Main {
    public static void main(String[] args) {
        Animal[] a = {new Dog(), new Cat(), new Bird()};
        for (Animal x : a) x.makeSound();
    }
}
