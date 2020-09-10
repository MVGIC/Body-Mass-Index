public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        float index = service.calculate(178, 70);
        System.out.println(index);
    }
}
