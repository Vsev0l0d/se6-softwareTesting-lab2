package lab2.trigonometric;

import lab2.MockChain;

import static java.lang.Double.NaN;
import static java.lang.Double.POSITIVE_INFINITY;
import static java.lang.Math.PI;
import static org.mockito.Mockito.*;

public class TrigonometryMocks {
    public static SinCalculator getSinMock() {
        SinCalculator m = mock(SinCalculator.class);

        MockChain.when(m)
                .mock(0d, 0.0)
                .mock(-4 * PI / 3, 0.8660254038)
                .mock(PI, 1.2246467991473532e-16)
                .mock(-PI / 4, -0.7071067811865475)
                .mock(-PI, -1.2246467991473532e-16)
                .mock(2 * PI / 3, 0.8660254037844387)
                .mock(-PI / 6, -0.5)
                .mock(2 * PI, -2.4492935982947064e-16)
                .mock(-PI / 2, -1.0)
                .mock(PI / 2, 1.0)
                .mock(-2 * PI, 0.0)
                .mock(-3 * PI / 4, -0.7071067811865476)
                .mock(PI / 6, 0.49999999999999994)
                .mock(PI / 4, 0.7071067811865475)
                .mock(PI / 3, 0.8660254037844386)
                .mock(3 * PI / 4, 0.7071067811865476)
                .mock(5 * PI / 6, 0.49999999999999994)
                .mock(7 * PI / 6, -0.4999999999999997)
                .mock(5 * PI / 4, -0.7071067811865475)
                .mock(4 * PI / 3, -0.8660254037844384)
                .mock(5 * PI / 3, -0.8660254037844386)
                .mock(7 * PI / 4, -0.7071067811865477)
                .mock(11 * PI / 6, -0.5000000000000004)
                .mock(-5 * PI / 4, 0.7071067811865475)
                .mock(-7 * PI / 4, 0.7071067811865477)
        ;

        when(m.calculate(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }

    public static CosCalculator getCosMock() {
        CosCalculator m = mock(CosCalculator.class);

        MockChain.when(m)
                .mock(0d, 1.0000000000)
                .mock(-4 * PI / 3, -0.5000000000)
                .mock(PI / 4, 0.7071067811865476)
                .mock(PI, -1.0000000000)
                .mock(-PI / 4, 0.7071067811865476)
                .mock(-PI, -1.0000000000)
                .mock(2 * PI / 3, -0.4999999999999998)
                .mock(-PI / 6, 0.8660254038)
                .mock(2 * PI, 1.0000000000)
                .mock(-PI / 2, 6.123233995736766e-17)
                .mock(PI / 2, 6.123233995736766e-17)
                .mock(-2 * PI, 1.0000000000)
                .mock(-3 * PI / 4, -0.7071067811865475)
                .mock(PI / 6, 0.8660254037844387)
                .mock(PI / 3, 0.5000000000000001)
                .mock(3 * PI / 4, -0.7071067811865475)
                .mock(5 * PI / 6, -0.8660254037844387)
                .mock(7 * PI / 6, -0.8660254037844388)
                .mock(5 * PI / 4, -0.7071067811865477)
                .mock(4 * PI / 3, -0.5000000000000004)
                .mock(5 * PI / 3, 0.5000000000000001)
                .mock(7 * PI / 4, 0.7071067811865474)
                .mock(11 * PI / 6, 0.8660254037844384)
                .mock(-5 * PI / 4, -0.7071067811865477)
                .mock(-7 * PI / 4, 0.7071067811865474)
        ;

        when(m.calculate(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }

    public static SecCalculator getSecMock() {
        SecCalculator m = mock(SecCalculator.class);

        MockChain.when(m)
                .mock(0d, 1.0)
                .mock(-4 * PI / 3, -2.0)
                .mock(PI / 4, 1.4142135624)
                .mock(PI, -1.0)
                .mock(-PI / 4, 1.4142135624)
                .mock(-PI, -1.0)
                .mock(2 * PI / 3, -2.0)
                .mock(-PI / 6, 1.1547005384)
                .mock(2 * PI, 1.0)
                .mock(-PI / 2, NaN)
                .mock(PI / 2, NaN)
                .mock(-2 * PI, 1.0)
                .mock(-3 * PI / 4, -1.4142135624);

        when(m.calculate(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }

    public static CosecCalculator getCosecMock() {
        CosecCalculator m = mock(CosecCalculator.class);

        MockChain.when(m)
                .mock(0d, POSITIVE_INFINITY)
                .mock(-4 * PI / 3, 1.1547005384)
                .mock(PI / 4, 1.4142135624)
                .mock(PI, 8165619676597685.0)
                .mock(-PI / 4, -1.4142135624)
                .mock(-PI, -8165619676597685.0)
                .mock(2 * PI / 3, 1.1547005384)
                .mock(-PI / 6, -2.0000000000)
                .mock(2 * PI, -4082809838298842.5)
                .mock(-PI / 2, -1.0)
                .mock(PI / 2, 1.0)
                .mock(-2 * PI, 4082809838298842.5)
                .mock(-3 * PI / 4, -1.4142135624);

        when(m.calculate(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }

    public static TanCalculator getTanMock() {
        TanCalculator m = mock(TanCalculator.class);

        MockChain.when(m)
                .mock(m.calculate(PI / 2), Double.POSITIVE_INFINITY)
                .mock(m.calculate(- PI / 2), Double.POSITIVE_INFINITY)
                .mock(m.calculate(PI), 0.0)
                .mock(m.calculate(2 * PI), 0.0)
                .mock(m.calculate(-PI), 0.0)
                .mock(m.calculate(1 * PI / 6), 0.5773502691896257)
                .mock(m.calculate(1 * PI / 4), 0.9999999999999999)
                .mock(m.calculate(1 * PI / 3), 1.7320508075688767)
                .mock(m.calculate(2 * PI / 3), -1.7320508075688783)
                .mock(m.calculate(3 * PI / 4), -1.0000000000000002)
                .mock(m.calculate(5 * PI / 6), -0.5773502691896257)
                .mock(m.calculate(7 * PI / 6), 0.5773502691896254)
                .mock(m.calculate(5 * PI / 4), 0.9999999999999997)
                .mock(m.calculate(4 * PI / 3), 1.7320508075688754)
                .mock(m.calculate(5 * PI / 3), -1.732050807568877)
                .mock(m.calculate(7 * PI / 4), -1.0000000000000004)
                .mock(m.calculate(11 * PI / 6), -0.5773502691896265)
                .mock(m.calculate(-1 * PI / 4), -0.9999999999999999)
                .mock(m.calculate(-3 * PI / 4), 1.0000000000000002)
                .mock(m.calculate(-5 * PI / 4), -0.9999999999999997)
                .mock(m.calculate(-7 * PI / 4), 1.0000000000000004);

        when(m.calculate(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }

    public static CotCalculator getCotMock() {
        CotCalculator m = mock(CotCalculator.class);

        MockChain.when(m)
                .mock(m.calculate(PI / 2), 0.0)
                .mock(m.calculate(- PI / 2), 0.0)
                .mock(m.calculate(PI), Double.POSITIVE_INFINITY)
                .mock(m.calculate(2 * PI), Double.POSITIVE_INFINITY)
                .mock(m.calculate(-PI), Double.POSITIVE_INFINITY)
                .mock(m.calculate(1 * PI / 6), 1.7320508075688774)
                .mock(m.calculate(1 * PI / 4), 0.9999999999999999)
                .mock(m.calculate(1 * PI / 3), 0.577350269189626)
                .mock(m.calculate(2 * PI / 3), -0.5773502691896254)
                .mock(m.calculate(3 * PI / 4), -1.0000000000000002)
                .mock(m.calculate(5 * PI / 6), -1.7320508075688756)
                .mock(m.calculate(7 * PI / 6), 1.7320508075688783)
                .mock(m.calculate(5 * PI / 4), 0.9999999999999997)
                .mock(m.calculate(4 * PI / 3), 0.5773502691896264)
                .mock(m.calculate(5 * PI / 3), -0.5773502691896247)
                .mock(m.calculate(7 * PI / 4), -1.0000000000000004)
                .mock(m.calculate(11 * PI / 6), -1.7320508075688716)
                .mock(m.calculate(-1 * PI / 4), -0.9999999999999999)
                .mock(m.calculate(-3 * PI / 4), 1.0000000000000002)
                .mock(m.calculate(-5 * PI / 4), -0.9999999999999997)
                .mock(m.calculate(-7 * PI / 4), 1.0000000000000004);

        when(m.calculate(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }
}