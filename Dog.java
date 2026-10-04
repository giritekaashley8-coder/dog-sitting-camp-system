
public abstract class Dog {
    private final String id;
    private String name;
    private int age;
    private PlayArea currentArea;

    public Dog(String id, String name, int age) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("ID cannot be empty.");
        }
        this.id = id;
        this.name = name;
        setAge(age);
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be strictly positive.");
        }
        this.age = age;
    }

    public PlayArea getCurrentArea() { return currentArea; }
    public void setCurrentArea(PlayArea currentArea) { this.currentArea = currentArea; }
}
