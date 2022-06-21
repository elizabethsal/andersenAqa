
public class Main {


    public static void main(String[] args) {
        //Почему не могу написать так? Конструтор в Box дефолтный, значит в теории могу туда запихнуть что угодно?
        // Box<Orange> boxWithOranges = new Box<>(new Orange(), new Orange(), new Orange());
        // Box<Apple> boxWithApples = new Box<>(new Apple(), new Apple(), new Apple());

        Box<Orange> boxWithOranges = new Box<>();
        Box<Apple> boxWithApples = new Box<>();
        Box<Orange> anotherBoxWithOranges = new Box<>();
        boxWithOranges.addFruit(new Orange(), 7);
        boxWithApples.addFruit(new Apple(), 4);
        System.out.println("Box 1: " + boxWithOranges.getWeight());
        System.out.println("Box 2: " + boxWithApples.getWeight());
        System.out.println(boxWithApples.compare(boxWithOranges));
        boxWithOranges.replaceFruitsToAnotherBox(anotherBoxWithOranges);
        System.out.println(boxWithOranges.getItems());
        System.out.println(anotherBoxWithOranges.getItems());


    }


}

