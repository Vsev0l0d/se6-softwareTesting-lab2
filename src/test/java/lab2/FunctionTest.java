package lab2;

import lab2.logariphmic.LnCalculator;
import lab2.logariphmic.LogBaseCalculator;
import lab2.logariphmic.LogMock;
import lab2.trigonometric.*;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(value = PER_CLASS)
public class FunctionTest {
    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.0001;

    private Function function;

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void stubsTest(double expected, double num, double den) {
        SinCalculator sin = TrigonometryMocks.getSinMock();
        CosecCalculator cosec = TrigonometryMocks.getCosecMock();
        SecCalculator sec = TrigonometryMocks.getSecMock();
        TanCalculator tan = TrigonometryMocks.getTanMock();
        CotCalculator cot = TrigonometryMocks.getCotMock();
        LnCalculator ln = LogMock.getLnMock();
        LogBaseCalculator log2 = LogMock.getLog2Mock();
        LogBaseCalculator log3 = LogMock.getLog3Mock();
        LogBaseCalculator log5 = LogMock.getLog5Mock();

        function = new Function(ACCURACY, sin, cosec, sec, tan, cot, ln, log2, log3, log5);
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void log2StubTest(double expected, double num, double den) {
        SinCalculator sin = TrigonometryMocks.getSinMock();
        CosecCalculator cosec = TrigonometryMocks.getCosecMock();
        SecCalculator sec = TrigonometryMocks.getSecMock();
        TanCalculator tan = TrigonometryMocks.getTanMock();
        CotCalculator cot = TrigonometryMocks.getCotMock();
        LnCalculator ln = LogMock.getLnMock();
        LogBaseCalculator log2 = new LogBaseCalculator(ACCURACY, 2, ln);
        LogBaseCalculator log3 = LogMock.getLog3Mock();
        LogBaseCalculator log5 = LogMock.getLog5Mock();

        function = new Function(ACCURACY, sin, cosec, sec, tan, cot, ln, log2, log3, log5);
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void log3StubTest(double expected, double num, double den) {
        SinCalculator sin = TrigonometryMocks.getSinMock();
        CosecCalculator cosec = TrigonometryMocks.getCosecMock();
        SecCalculator sec = TrigonometryMocks.getSecMock();
        TanCalculator tan = TrigonometryMocks.getTanMock();
        CotCalculator cot = TrigonometryMocks.getCotMock();
        LnCalculator ln = LogMock.getLnMock();
        LogBaseCalculator log2 = LogMock.getLog2Mock();
        LogBaseCalculator log3 = new LogBaseCalculator(ACCURACY, 3, ln);
        LogBaseCalculator log5 = LogMock.getLog5Mock();

        function = new Function(ACCURACY, sin, cosec, sec, tan, cot, ln, log2, log3, log5);
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void log5StubTest(double expected, double num, double den) {
        SinCalculator sin = TrigonometryMocks.getSinMock();
        CosecCalculator cosec = TrigonometryMocks.getCosecMock();
        SecCalculator sec = TrigonometryMocks.getSecMock();
        TanCalculator tan = TrigonometryMocks.getTanMock();
        CotCalculator cot = TrigonometryMocks.getCotMock();
        LnCalculator ln = LogMock.getLnMock();
        LogBaseCalculator log2 = LogMock.getLog2Mock();
        LogBaseCalculator log3 = LogMock.getLog3Mock();
        LogBaseCalculator log5 = new LogBaseCalculator(ACCURACY, 5, ln);

        function = new Function(ACCURACY, sin, cosec, sec, tan, cot, ln, log2, log3, log5);
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void lnStubTest(double expected, double num, double den) {
        SinCalculator sin = TrigonometryMocks.getSinMock();
        CosecCalculator cosec = TrigonometryMocks.getCosecMock();
        SecCalculator sec = TrigonometryMocks.getSecMock();
        TanCalculator tan = TrigonometryMocks.getTanMock();
        CotCalculator cot = TrigonometryMocks.getCotMock();
        LnCalculator ln = new LnCalculator(ACCURACY);
        LogBaseCalculator log2 = new LogBaseCalculator(ACCURACY, 2, ln);
        LogBaseCalculator log3 = new LogBaseCalculator(ACCURACY, 3, ln);
        LogBaseCalculator log5 = new LogBaseCalculator(ACCURACY, 5, ln);

        function = new Function(ACCURACY, sin, cosec, sec, tan, cot, ln, log2, log3, log5);
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void cosecStubTest(double expected, double num, double den) {
        SinCalculator sin = TrigonometryMocks.getSinMock();
        CosecCalculator cosec = new CosecCalculator(ACCURACY, sin);
        SecCalculator sec = TrigonometryMocks.getSecMock();
        TanCalculator tan = TrigonometryMocks.getTanMock();
        CotCalculator cot = TrigonometryMocks.getCotMock();
        LnCalculator ln = LogMock.getLnMock();
        LogBaseCalculator log2 = LogMock.getLog2Mock();
        LogBaseCalculator log3 = LogMock.getLog3Mock();
        LogBaseCalculator log5 = LogMock.getLog5Mock();

        function = new Function(ACCURACY, sin, cosec, sec, tan, cot, ln, log2, log3, log5);
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void secStubTest(double expected, double num, double den) {
        SinCalculator sin = TrigonometryMocks.getSinMock();
        CosecCalculator cosec = TrigonometryMocks.getCosecMock();
        SecCalculator sec = new SecCalculator(ACCURACY, TrigonometryMocks.getCosMock());
        TanCalculator tan = TrigonometryMocks.getTanMock();
        CotCalculator cot = TrigonometryMocks.getCotMock();
        LnCalculator ln = LogMock.getLnMock();
        LogBaseCalculator log2 = LogMock.getLog2Mock();
        LogBaseCalculator log3 = LogMock.getLog3Mock();
        LogBaseCalculator log5 = LogMock.getLog5Mock();

        function = new Function(ACCURACY, sin, cosec, sec, tan, cot, ln, log2, log3, log5);
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void tanStubTest(double expected, double num, double den) {
        SinCalculator sin = TrigonometryMocks.getSinMock();
        CosecCalculator cosec = TrigonometryMocks.getCosecMock();
        SecCalculator sec = TrigonometryMocks.getSecMock();
        TanCalculator tan = new TanCalculator(ACCURACY, sin, TrigonometryMocks.getCosMock());
        CotCalculator cot = TrigonometryMocks.getCotMock();
        LnCalculator ln = LogMock.getLnMock();
        LogBaseCalculator log2 = LogMock.getLog2Mock();
        LogBaseCalculator log3 = LogMock.getLog3Mock();
        LogBaseCalculator log5 = LogMock.getLog5Mock();

        function = new Function(ACCURACY, sin, cosec, sec, tan, cot, ln, log2, log3, log5);
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void cotStubTest(double expected, double num, double den) {
        SinCalculator sin = TrigonometryMocks.getSinMock();
        CosecCalculator cosec = TrigonometryMocks.getCosecMock();
        SecCalculator sec = TrigonometryMocks.getSecMock();
        TanCalculator tan = TrigonometryMocks.getTanMock();
        CotCalculator cot = new CotCalculator(ACCURACY, sin, TrigonometryMocks.getCosMock());
        LnCalculator ln = LogMock.getLnMock();
        LogBaseCalculator log2 = LogMock.getLog2Mock();
        LogBaseCalculator log3 = LogMock.getLog3Mock();
        LogBaseCalculator log5 = LogMock.getLog5Mock();

        function = new Function(ACCURACY, sin, cosec, sec, tan, cot, ln, log2, log3, log5);
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void cosStubTest(double expected, double num, double den) {
        SinCalculator sin = TrigonometryMocks.getSinMock();
        CosCalculator cos = new CosCalculator(ACCURACY, sin);
        CosecCalculator cosec = TrigonometryMocks.getCosecMock();
        SecCalculator sec = new SecCalculator(ACCURACY, cos);
        TanCalculator tan = new TanCalculator(ACCURACY, sin, cos);
        CotCalculator cot = new CotCalculator(ACCURACY, sin, cos);
        LnCalculator ln = LogMock.getLnMock();
        LogBaseCalculator log2 = LogMock.getLog2Mock();
        LogBaseCalculator log3 = LogMock.getLog3Mock();
        LogBaseCalculator log5 = LogMock.getLog5Mock();

        function = new Function(ACCURACY, sin, cosec, sec, tan, cot, ln, log2, log3, log5);
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void sinStubTest(double expected, double num, double den) {
        SinCalculator sin = new SinCalculator(ACCURACY);
        CosCalculator cos = new CosCalculator(ACCURACY, sin);
        CosecCalculator cosec = new CosecCalculator(ACCURACY, sin);
        SecCalculator sec = new SecCalculator(ACCURACY, cos);
        TanCalculator tan = new TanCalculator(ACCURACY, sin, cos);
        CotCalculator cot = new CotCalculator(ACCURACY, sin, cos);
        LnCalculator ln = LogMock.getLnMock();
        LogBaseCalculator log2 = LogMock.getLog2Mock();
        LogBaseCalculator log3 = LogMock.getLog3Mock();
        LogBaseCalculator log5 = LogMock.getLog5Mock();

        function = new Function(ACCURACY, sin, cosec, sec, tan, cot, ln, log2, log3, log5);
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void allStubTest(double expected, double num, double den) {
        SinCalculator sin = new SinCalculator(ACCURACY);
        CosCalculator cos = new CosCalculator(ACCURACY, sin);
        CosecCalculator cosec = new CosecCalculator(ACCURACY, sin);
        SecCalculator sec = new SecCalculator(ACCURACY, cos);
        TanCalculator tan = new TanCalculator(ACCURACY, sin, cos);
        CotCalculator cot = new CotCalculator(ACCURACY, sin, cos);
        LnCalculator ln = new LnCalculator(ACCURACY);
        LogBaseCalculator log2 = new LogBaseCalculator(ACCURACY, 2, ln);
        LogBaseCalculator log3 = new LogBaseCalculator(ACCURACY, 3, ln);
        LogBaseCalculator log5 = new LogBaseCalculator(ACCURACY, 5, ln);

        function = new Function(ACCURACY, sin, cosec, sec, tan, cot, ln, log2, log3, log5);
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }
}