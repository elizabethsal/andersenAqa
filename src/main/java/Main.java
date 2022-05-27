
public class Main {


    public static void main(String[] args) {
        newEmployee();
    }

    public static void newEmployee() {
        Employee[] employees = new Employee[5];
        String[] names = {"A", "Q", "C", "V", "P"};
        String[] positions = {"QA", "PM", "HR", "Developer", "Staff"};

        for (int i = 0; i < employees.length; i++) {
            Employee employee = new Employee(names[i], positions[i], getRandomNumber(87466, 98956) + "@gmail.com",
                    "+" + getRandomNumber(879541, 98796519), getRandomNumber(600, 3000), getRandomNumber(20, 40));
            employees[i] = employee;
            System.out.println(employee);
        }
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }


}

