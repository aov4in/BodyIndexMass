public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double  bodyIndexMass= service.calculate(65.2, 178);
        System.out.println(bodyIndexMass);
    }
}
