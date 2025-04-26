public class CompoundInterest {
    public static void main(String[] args) {
        double amount;
        double capital = 10000.0;
        double rate = 0.05;
        System.out.printf("%s%20s%n","Year","Amount on Deposit");
        for(int year = 1; year <= 10; year++) {
            amount = capital * Math.pow(1 + rate, year);
            System.out.printf("%4d%20.2f%n",year,amount);
        }
    }
}
