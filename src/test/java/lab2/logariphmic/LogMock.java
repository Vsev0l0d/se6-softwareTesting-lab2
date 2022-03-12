package lab2.logariphmic;

import lab2.MockChain;

import static java.lang.Double.*;
import static java.lang.Math.PI;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LogMock {
    public static LnCalculator getLnMock() {
        LnCalculator m = mock(LnCalculator.class);

        MockChain.when(m)
                .mock(2 * PI, 1.8378770664093453)
                .mock(11 * PI / 6, 1.7508656894197157)
                .mock(7 * PI / 4, 1.7043456737848228)
                .mock(5 * PI / 3, 1.6555555096153909)
                .mock(4 * PI / 3, 1.432411958301181)
                .mock(5 * PI / 4, 1.3678734371636099)
                .mock(7 * PI / 6, 1.2988805656766584)
                .mock(PI, 1.1447298858494002)
                .mock(5 * PI / 6, 0.9624083290554456)
                .mock(3 * PI / 4, 0.8570478133976193)
                .mock(2 * PI / 3, 0.7392647777412357)
                .mock(PI / 2, 0.4515827052894548)
                .mock(1 * PI / 3, 0.046117597181290375)
                .mock(1 * PI / 4, -0.2415644752704905)
                .mock(1 * PI / 6, -0.6470295833786549)
                .mock(0d, NEGATIVE_INFINITY)
                .mock(-PI / 6, NaN)
                .mock(-PI / 4, NaN)
                .mock(-PI / 2, NaN)
                .mock(-3 * PI / 4, NaN)
                .mock(-PI, NaN)
                .mock(-5 * PI / 4, NaN)
                .mock(-4 * PI / 3, NaN)
                .mock(-7 * PI / 4, NaN)
                .mock(-2 * PI, NaN)
                .mock(2, 0.6931471805599453)
                .mock(3, 1.0986122886681098)
                .mock(5, 1.6094379124341003)
                .mock(10, 2.302585092994);

        when(m.calculate(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.calculate(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }

    public static LogBaseCalculator getLog2Mock() {
        LogBaseCalculator m = mock(LogBaseCalculator.class);

        MockChain.when(m)
                .mock(2 * PI, 2.6514961295)
                .mock(PI, 1.6514961295)
                .mock(2 * PI / 3, 1.0665336288)
                .mock(PI / 2, 0.6514961295)
                .mock(PI / 4, -0.3485038705)
                .mock(0d, NEGATIVE_INFINITY)
                .mock(-PI / 6, NaN)
                .mock(-PI / 4, NaN)
                .mock(-PI / 2, NaN)
                .mock(-3 * PI / 4, NaN)
                .mock(-PI, NaN)
                .mock(-4 * PI / 3, NaN)
                .mock(-2 * PI, NaN)
                .mock(2, 1.0)
                .mock(3, 1.584962500721156)
                .mock(5, 2.321928094887362)
                .mock(10, 3.321928094887362)
        ;

        when(m.calculate(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.calculate(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }

    public static LogBaseCalculator getLog3Mock() {
        LogBaseCalculator m = mock(LogBaseCalculator.class);

        MockChain.when(m)
                .mock(2 * PI, 1.6729077996)
                .mock(PI, 1.0419780460)
                .mock(2 * PI / 3, 0.6729077996)
                .mock(PI / 2, 0.4110482924)
                .mock(PI / 4, -0.2198814612)
                .mock(0d, NEGATIVE_INFINITY)
                .mock(-PI / 6, NaN)
                .mock(-PI / 4, NaN)
                .mock(-PI / 2, NaN)
                .mock(-3 * PI / 4, NaN)
                .mock(-PI, NaN)
                .mock(-4 * PI / 3, NaN)
                .mock(-2 * PI, NaN)
                .mock(2, 0.630929753571457)
                .mock(3, 1.0)
                .mock(5, 1.464973520717927)
                .mock(10, 2.0959032742893846)
        ;

        when(m.calculate(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.calculate(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }

    public static LogBaseCalculator getLog5Mock() {
        LogBaseCalculator m = mock(LogBaseCalculator.class);

        MockChain.when(m)
                .mock(2 * PI, 1.1419372268)
                .mock(PI, 0.7112606687)
                .mock(2 * PI / 3, 0.4593310323)
                .mock(PI / 2, 0.2805841106)
                .mock(PI / 4, -0.1500924474)
                .mock(0d, NEGATIVE_INFINITY)
                .mock(-PI / 6, NaN)
                .mock(-PI / 4, NaN)
                .mock(-PI / 2, NaN)
                .mock(-3 * PI / 4, NaN)
                .mock(-PI, NaN)
                .mock(-4 * PI / 3, NaN)
                .mock(-2 * PI, NaN)
                .mock(2, 0.430676558073)
                .mock(3, 0.682606194486)
                .mock(5, 1.0)
                .mock(10, 1.430676558073393)
        ;

        when(m.calculate(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.calculate(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }
}