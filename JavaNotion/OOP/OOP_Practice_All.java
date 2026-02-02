package JavaNotion.OOP;

interface PaymentMethod{
    void pay(double amount);
}

class CreditCardPayment implements PaymentMethod{
    private String accountId ;
    private String walletAddress;

    public CreditCardPayment(String accountId, String walletAddress) {
        this.accountId = accountId;
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount){
        System.out.println("Credit card payment " + amount);
    }

}

class PaypalPayment implements  PaymentMethod{
    private String accountId ;
    private String walletAddress;

    public PaypalPayment(String accountId, String walletAddress) {
        this.accountId = accountId;
        this.walletAddress = walletAddress;
    }
    @Override
    public void pay(double amount){
        System.out.println("Paypal credit payment " + amount);
    }
}

class CryptoPayment implements PaymentMethod{
    private String accountId ;
    private String walletAddress;

    public CryptoPayment(String accountId, String walletAddress) {
        this.accountId = accountId;
        this.walletAddress = walletAddress;
    }
    @Override
    public void pay(double amount){
        System.out.println("Crypto credit payment " + amount);
    }
}

//Inject dependency
class PaymentService{
    private final PaymentMethod paymentMethod;

    public PaymentService(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public void proccess(double amount){
        paymentMethod.pay(amount);
    }

}

public class OOP_Practice_All {
    public static void main(String[] args){
        double amount = 69.96;
        CreditCardPayment creditCardPayment = new CreditCardPayment("123456" ,"abcdef");
        PaypalPayment paypalPayment = new PaypalPayment("654321" ,"fedcba");
        CryptoPayment cryptoPayment = new CryptoPayment("98765" , "ghijkl");

        new PaymentService(creditCardPayment).proccess(amount);
        new PaymentService(paypalPayment).proccess(amount);
        new PaymentService(cryptoPayment).proccess(amount);

    }
}
