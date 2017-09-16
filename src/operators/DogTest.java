package operators;

class Dog{
    private String name;
    private String says;

    public Dog(String name, String says) {
        setName(name);
        setSays(says);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSays(String says) {
        this.says = says;
    }

    public String getName() {
        return name;
    }

    public String getSays() {
        return says;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.says;
    }
}
public class DogTest {
    public static void main(String[] args) {
        Dog spot = new Dog("Spot", "Ruff!");
        Dog scruffy = new Dog("Scruffy", "Wurf!");
        System.out.println(spot);
        System.out.println(scruffy);
    }
}
