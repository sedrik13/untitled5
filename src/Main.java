public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 76; //вес
        double height = 1.72; // рост
        double bmi = (int) service.calculate(weight, height);

        System.out.println(bmi);
    }
}