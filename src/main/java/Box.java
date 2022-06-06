import java.util.ArrayList;

public abstract class Box<T extends Fruit> {

    ArrayList<T> items =  new ArrayList();

    public float getWeight() {

        float getWeightOrange = 0;
        for(int i =0; i<items.size(); i++){
            getWeightOrange += items.get(i).getWeight();
        }

        return getWeightOrange;
    }

    public abstract boolean compare();

}
