public class Animal implements Comparable<Animal>
{
    private String name;
    public  Animal(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    @Override
    public int compareTo(Animal animal)
    {
        return this.name.compareTo(animal.getName());
    }
}
