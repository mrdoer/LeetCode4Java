package chen.practice;

import java.math.BigDecimal;

public class Demo2 {

	    public static void main(String[] args) {
	        BigDecimal decimal = new BigDecimal("1.12345");
	        System.out.println(decimal);
	        BigDecimal setScale = decimal.setScale(4,BigDecimal.ROUND_HALF_DOWN);
	        System.out.println(setScale);
	        
	        BigDecimal setScale1 = decimal.setScale(4,BigDecimal.ROUND_HALF_UP);
	        System.out.println(setScale1);
	    }
}
