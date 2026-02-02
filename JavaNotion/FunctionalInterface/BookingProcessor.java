package JavaNotion.FunctionalInterface;
//Co 4 interface co san Java cung cap trong java.util.functional

import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//Gia su ta tao cac helper method cho booking
public class BookingProcessor {

    public static void main(String[] args) {
        //Predicate <T> nhan vao T va tra ve boolean
        Predicate<Double> isValid = (price) ->{
            return price > 0;
        };
        // () -> { } day la 1 Lambda Expression
        //Predicate<Double> isVal1d = price -> price > 0 ;

        //Consumer<T> nhan vao T va ko tra ve gi
        //Thong bao khach hang het bao nhieu tien
        Consumer<Double> notification = price -> System.out.println("So tien phai thanh toan " + price );

        //Supplier<T> ko nhan vao gi va tra ve T
        //Tao 1 ma coupon random cho khach hang
        Supplier<String> coupon = () -> "COUPON "+ UUID.randomUUID().toString();

        //Function<T ,R> nhan vao T va tra ve R
        //Apply coupon vao price
        Function<Double , Double> total = price -> price * 30/100 ;

        //Thuc thi logic
        double price = 69.96;
        if (isValid.test(price)){
            //Tinh gia cuoi cung
            double finalPrice = total.apply(price);
            //In ra gia tri
            notification.accept(finalPrice);
            //Dua cho khach hang coupon sau khi thanh toan xong
            System.out.println("COUPON: "+ coupon.get());
        }
    }
}
