public class FinancialForecasting {



    // recursive method

    static double forecast(double amount, double rate, int years) {


        if(years == 0) {

            return amount;
        }


        return forecast(amount + (amount * rate), rate, years - 1);

    }






    public static void main(String args[]) {


        double initialAmount = 10000;

        double growthRate = 0.10;


        int years = 5;



        double futureValue =
        forecast(initialAmount, growthRate, years);



        System.out.println("Initial Amount: "+initialAmount);

        System.out.println("Growth Rate: "+growthRate);


        System.out.println("Future Value: "+futureValue);


    }

}