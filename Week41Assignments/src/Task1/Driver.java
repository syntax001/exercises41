package Task1;

public class Driver {
    private String name;
    private int age;

    public Driver(String tmpName, int tmpAge) {
        name = tmpName;
        age = tmpAge;
    }

    public String toString() {
        return "Is driven by: " + name;
    }
}
