public class typecasting {
    public static void main(String[] args) {

        double num1 = 25.75;
        int intValue = (int) num1;

        int num2 = 50;
        double doubleValue = (double) num2;

        System.out.println("Double Value = " + num1);
        System.out.println("After Casting to Int = " + intValue);

        System.out.println("Int Value = " + num2);
        System.out.println("After Casting to Double = " + doubleValue);
    }
}