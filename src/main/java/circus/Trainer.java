package circus;

import circus.animal.Animal;
import circus.animal.Bird;

public class Trainer {
    public static void main(String[] args) {
        Animal.Duck d = new Animal.Duck();
        System.out.println(d.speak());
        Bird b = (Bird)d;  // upcasting
        Animal a = (Animal)b; // upcasting
        System.out.println(a.speak());
        Animal.Duck d2 = (Animal.Duck) a; // downcasting
        train(new Animal.Duck());
        train(new Animal.Parrot());
        //circus.animal.Animal a2 = new circus.animal.Animal();
        //circus.animal.Bird b2 = new circus.animal.Bird();
    }

    private static void train(Bird bird) {
        if (bird instanceof Animal.Duck) {
            Animal.Duck d = (Animal.Duck) bird;
            d.swim();
        } else {
            System.out.println("Help I'm not a circus.animal.Animal.Duck and I can't swim");
        }
    }
}
