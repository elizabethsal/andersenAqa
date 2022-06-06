import java.util.ArrayList;

public class BoxApples extends Box<Apple> {

    @Override
    public float getWeight() {

        float appleWeight = 0;
        for (int i = 0; i < items.size(); i++) {
            appleWeight += items.get(i).getWeight();
        }
        return appleWeight;
    }

    @Override
    public boolean compare() {
        return false;
    }
}
