package com.example.omaru.bmi;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**1.73
 * Created by omaru on 14/09/17.
 */

public class BMI {

    public static final BigDecimal calculate(BigDecimal height, BigDecimal mass){
        return mass.divide(height.pow(2),2, RoundingMode.HALF_UP);
    }

    public static final BigDecimal calculate(String height,String mass){
        return calculate(BigDecimal.valueOf(Double.valueOf(height)),BigDecimal.valueOf(Double.valueOf(mass)));
    }
}
