package circus.animal;

import circus.Asset;

public abstract class Animal implements Asset {

    public abstract String speak();

    public static class Duck extends Bird {
        @Override
        public String speak() {
            return "Quack Quack";
        }

        @Override
        public String toString() {
            return "I'm a circus.animal.Animal.Duck";
        }

        public void swim() {
            System.out.println("I'm swimming...");
        }

        @Override
        public void fly() {
            System.out.println("fly");
        }

        @Override
        public int getValue() {
            return 10;
        }
    }

    public static class Parrot extends Bird {
        @Override
        public String speak() {
            return "Polly wants a cracker";
        }

        @Override
        public String toString() {
            return "I'm a parrot";
        }

        @Override
        public int getValue() {
            return 5;
        }

        @Override
        public void fly() {
            System.out.println("fly");
        }
    }
}
