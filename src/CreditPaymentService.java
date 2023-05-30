public class CreditPaymentService {
    public int calculate(int credit, double percent, int year) {

        double monthlyrate = percent / 12 / 100;

        double payment = credit * monthlyrate * Math.pow((1 + monthlyrate), (year * 12)) / ((Math.pow((1 + monthlyrate), (year * 12))) - 1);
        return (int) payment;
    }


}
