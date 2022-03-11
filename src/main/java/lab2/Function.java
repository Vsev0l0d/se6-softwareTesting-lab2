package lab2;

import lab2.logariphmic.LnCalculator;
import lab2.logariphmic.LogBaseCalculator;
import lab2.trigonometric.*;

public class Function extends Calculator {
    private final SinCalculator sin;
    private final CosecCalculator cosec;
    private final SecCalculator sec;
    private final TanCalculator tan;
    private final CotCalculator cot;
    private final LnCalculator ln;
    private final LogBaseCalculator log2;
    private final LogBaseCalculator log5;
    private final LogBaseCalculator log3;

    public Function(double accuracy, SinCalculator sin, CosecCalculator cosec, SecCalculator sec,
                    TanCalculator tan, CotCalculator cot, LnCalculator ln, LogBaseCalculator log2,
                    LogBaseCalculator log5, LogBaseCalculator log3) {
        super(accuracy);
        this.sin = sin;
        this.cosec = cosec;
        this.sec = sec;
        this.tan = tan;
        this.cot = cot;
        this.ln = ln;
        this.log2 = log2;
        this.log5 = log5;
        this.log3 = log3;
    }

    public double calculate(double x) {
        if (x <= 0) {
            return (((((Math.pow(((cosec.calculate(x) + tan.calculate(x)) + sin.calculate(x)), 3) / cot.calculate(x))
                    - sec.calculate(x)) - cot.calculate(x)) / ((sin.calculate(x) - cot.calculate(x))
                    + ((cosec.calculate(x) - sec.calculate(x)) / (Math.pow((sin.calculate(x) - sec.calculate(x)), 3)
                    - (sin.calculate(x) + cot.calculate(x)))))) / sec.calculate(x));
        } else {
            return Math.pow(((((log2.calculate(x) - log5.calculate(x)) * log3.calculate(x)) * ln.calculate(x)) - log5.calculate(x)), 3);
        }
    }
}
