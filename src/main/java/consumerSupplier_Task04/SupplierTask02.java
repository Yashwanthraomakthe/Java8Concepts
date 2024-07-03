package consumerSupplier_Task04;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierTask02 {
	 public static void main(String[] args) {
	        Supplier<String> randomOtpSupplier = () -> {
	            Random random = new Random();
	            StringBuilder otp = new StringBuilder();
	            for (int i = 0; i < 6; i++) {
	                otp.append(random.nextInt(10));
	            }
	            return otp.toString();
	        };

	        String randomOtp = randomOtpSupplier.get();
	        System.out.println("Random OTP: " + randomOtp);
	    }
}
