public class Cat extends Animal {
    private String name;
    private int ration;
    boolean hungryPet;

    public Cat(String name, int ration) {
        this.name = name;
        this.ration = ration;
    }

    @Override
    public boolean run(int distance) {
        System.out.println("Cat " + name + " run distance " + distance);
        return distance <= 200;
    }


    @Override
    public boolean swim(int range) {
        System.out.println("Cats don't swim!");
        return false;
    }

    @Override
    public String getName() {
        return name;
    }

    public int eat(int bowl) {
        if (bowl < ration) {
            System.out.println("It's not enough hooman -_-.");
            hungryPet = true;
            return 0;
        } else {
            System.out.println("So far I'm happy, but don't think that this will continue.");
            hungryPet = false;
            return bowl - ration;
        }

    }

}
