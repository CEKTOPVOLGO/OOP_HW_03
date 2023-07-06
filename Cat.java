import java.util.Iterator;

public class Cat extends Animal implements Iterator<String>, Comparable<Cat> {
    private final String name;
    private final int age;
    private int NUMOFLEGS = 4;
    private int SP = 15;
    private int EYE = 2;
    int index;

    @Override
    public boolean hasNext() {
        return index++ < 3;
    }

    @Override
    public String next() {
        switch (index) {
            case 1:
                //return firstName;
                return String.format("Name: %s", name);
            case 2:
                //return lastName;
                return String.format("Age: %s", age);
            case 3:
                return String.format("Says: %s", says());
            default:
                return String.format("Age: %s", age);
        }
    }

    @Override
    public int numLegs() {
        return NUMOFLEGS;
    }
    @Override
    public int speed() {
        return SP;
    }
    @Override
    public String says() {
        return "Meow";
    }

    @Override
    public int eye() {
        return EYE;
    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void About(){
        System.out.println("Котика зовут: " + name + ". Возраст: " + age + ". Глаз: " + eye() + ". Лапок: " + numLegs() + ". Бегает со скоростью: " + speed() + " км/ч . Умеет говорить: " + says() + ".");
    }

    @Override
    public String toString() {
        return String.format("Котика зовут: " + name + ". Возраст: " + age + ". Глаз: " + eye() + ". Лапок: " + numLegs() + ". Бегает со скоростью: " + speed() + " км/ч . Умеет говорить: " + says() + ".\n");
    }

    @Override
    public int compareTo(Cat o) {
        if (this.age > o.age)
            return 1;
        else if (this.age < o.age)
            return -1;
        else
            return 0;
    }
}
