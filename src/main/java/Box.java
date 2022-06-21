import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> items = new ArrayList();


    public Box() {

    }

    public ArrayList<T> getItems() {
        return items;
    }

    public float getWeight() {

        float getWeight = 0.0f;
        for (int i = 0; i < items.size(); i++) {
            getWeight += items.get(i).getWeight();
        }
        return getWeight;
    }

    public boolean compare(Box anotherBox) {
        return getWeight() != anotherBox.getWeight();
    }

    public void addFruit(T fruit, int amount) {
        for (int i = 0; i < amount; i++) {
            items.add(fruit);
        }
    }
    public void replaceFruitsToAnotherBox(Box<T> anotherBox) {
        anotherBox.items.addAll(this.items);
        this.items.clear();
    }

}
