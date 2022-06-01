public class Dog extends Animal {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean run(int distance) {
        System.out.println("Dog " + name + " run distance " + distance);
        return distance <= 500;
    }

    @Override
    public boolean swim(int range) {
        System.out.println("Dog " + name + " swim range " + range);
        return range <= 10;
    }
}
