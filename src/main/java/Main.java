
public class Main {


    public static void main(String[] args) {
        Cat[] cats = new Cat[6];
        Dog[] dogs = new Dog[9];
        Bowl bowlOfFood = new Bowl(80);

        String[] names = {"Vaf", "Basic", "Fluff", "SomeKindOfMagic", "Biscuit", "Oreo", "Jay-Z", "Сurie", "Brock", "Rockie", "Dust", "Hush", "Regular", "Extra", "Orange", "Null"};
        for (int i = 0; i < cats.length; i++) {

            Cat cat = new Cat(names[getRandomNumber(0, names.length - 1)], getRandomNumber(15, 20));
            cats[i] = cat;
            cat.run(getRandomNumber(0, 200));
            cat.swim(5);
        }
        for (int i = 0; i < dogs.length; i++) {
            Dog dog = new Dog(names[getRandomNumber(0, names.length - 1)]);

            dogs[i] = dog;
            dog.run(getRandomNumber(0, 500));
            dog.swim(getRandomNumber(0, 10));
        }

        System.out.println("Count of cats: " + cats.length);
        System.out.println("Count of dogs: " + dogs.length);
        for (int i = 0; i < cats.length; i++) {
            bowlOfFood.food = cats[i].eat(bowlOfFood.food);

        }
        System.out.println("Food remain: " + bowlOfFood.food);
        System.out.println(new Payment());

    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }


}

