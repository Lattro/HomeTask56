import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Animal> animalList = new ArrayList<>();
        Animal animal1 = new Animal("Слон");
        Animal animal2 = new Animal("Тигр");
        Animal animal3 = new Animal("Акула");
        Animal animal4 = new Animal("Обезьяна");
        Animal animal5 = new Animal("Змея");
        animalList.add(animal1);
        animalList.add(animal2);
        animalList.add(animal3);
        animalList.add(animal4);
        animalList.add(animal5);
        System.out.println("Коллекция до сортировки");
        for (Animal animal: animalList)
        {
            System.out.println(animal.getName());
        }
        Collections.sort(animalList);
        System.out.println("Коллекция после сортировки");
        for (Animal animal: animalList)
        {
            System.out.println(animal.getName());
        }
    }
}
