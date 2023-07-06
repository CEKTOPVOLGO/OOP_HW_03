import java.util.*;

public class Main {
    public static void main(String[] args) {
    Cat cat1 = new Cat(10, "Барсик");
    Cat cat2 = new Cat(13, "Буся");
    Cat cat3 = new Cat(8, "Васька");
    Cat cat4 = new Cat(3, "Мурка");
    cat1.About();
    Iterator<String> components = cat1;

    while (components.hasNext()) {
        System.out.println(cat1.next());
    }
    List<Cat> cats = new ArrayList<Cat>();
    cats.add(cat1);
    cats.add(cat2);
    cats.add(cat3);
    cats.add(cat4);

    System.out.println(cats);

    Collections.sort(cats);

    System.out.println(cats);
    }
}
