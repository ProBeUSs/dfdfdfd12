import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 6));
        shapes.add(new Triangle(3, 7));

        System.out.println("Фигуры");
        for (Shape shape : shapes) {
            shape.displayInfo();
        }


        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Bird());

        System.out.println("\nЖивотные");
        for (Animal animal : animals) {
            animal.displayInfo();
        }
    }
}
