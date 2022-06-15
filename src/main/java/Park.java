import java.util.ArrayList;

public class Park {

    String[] ridesNames = {"Alpine slide", "Ali Baba", "Booster", "Bumper boats", "Merry-go-round", "Condor", "Devils Wheel", "Enterprise", "Evolution", "Gravitron"};
    String[] timesHour = {"10 a.m. - 3 p.m.", "10 a.m. - 6 p.m.", "9 a.m. - 4 p.m.", "10 a.m. - 8 p.m."};
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 10;
    ArrayList<Rides> amusementPark = new ArrayList<>();

    @Override
    public String toString() {
        String rv = "";
        for (int i = 0; i < amusementPark.size() - 1; i++) {
            rv += amusementPark.get(i) + "\n";
        }
        return rv;
    }

    public Park() {
        for (int i = 0; i < ridesNames.length; i++) {
            amusementPark.add(new Rides(ridesNames[getRandomNumber(0, ridesNames.length - 1)], getRandomNumber(MIN_VALUE, MAX_VALUE), getRandomNumber(MIN_VALUE, MAX_VALUE), timesHour[getRandomNumber(0, timesHour.length - 1)]));
        }
    }

    public class Rides {
        String name;
        int cost;
        int danger;
        String time;

        public Rides(String name, int cost, int danger, String time) {
            this.name = name;
            this.cost = cost;
            this.danger = danger;
            this.time = time;
        }

        @Override
        public String toString() {
            return "Name of Ride: " + name + " cost: " + cost + "$ " + " danger: " + danger + " working hour" + time;
        }
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }


}
