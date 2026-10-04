// PlayArea.java
import java.util.ArrayList;
import java.util.List;

public class PlayArea {
    private String name;
    private int capacity;
    private List<Dog> dogs;

    public PlayArea(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.dogs = new ArrayList<>();
    }

    public String getName() { return name; }
    public int getCapacity() { return capacity; }
    public List<Dog> getDogs() { return dogs; }

    public boolean addDog(Dog dog) {
        if (dogs.size() < capacity) {
            dogs.add(dog);
            dog.setCurrentArea(this);
            return true;
        }
        return false;
    }

    public void removeDog(Dog dog) {
        if (dogs.remove(dog)) {
            dog.setCurrentArea(null);
        }
    }
}
