import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Cloj {
  public static void main(String [] args) {
    List<Animal> animals = new ArrayList<Animal>();
    animals.add(new Dog());
    animals.add(new Cat());
    animals.add(new Fish());

    List<Runnable> speaks = new ArrayList<Runnable>();

    for (final Animal animal : animals) {
      speaks.add(new Runnable() {
        public void run() {
          animal.speak();
        }
      });
    }

    Collections.reverse(speaks);

    for (Runnable runme : speaks) {
      runme.run();
    }
  }
}

abstract class Animal {
  abstract public void speak();
}

class Dog extends Animal {
  public void speak() {
    System.out.println("bark");
  }
}

class Cat extends Animal {
  public void speak() {
    System.out.println("meow");
  }
}

class Fish extends Animal {
  public void speak() {
    System.out.println("bubble");
  }
}
