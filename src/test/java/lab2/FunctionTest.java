package lab2;

import lab2.logariphmic.LnCalculator;
import lab2.logariphmic.LogBaseCalculator;
import lab2.logariphmic.LogMocks;
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

    private final SinCalculator sinMock = TrigonometryMocks.getSinMock();
    private final CosCalculator cosMock = TrigonometryMocks.getCosMock();
    private final CosecCalculator cosecMock = TrigonometryMocks.getCosecMock();
    private final SecCalculator secMock = TrigonometryMocks.getSecMock();
    private final TanCalculator tanMock = TrigonometryMocks.getTanMock();
    private final CotCalculator cotMock = TrigonometryMocks.getCotMock();
    private final LnCalculator lnMock = LogMocks.getLnMock();
    private final LogBaseCalculator log2Mock = LogMocks.getLog2Mock();
    private final LogBaseCalculator log3Mock = LogMocks.getLog3Mock();
    private final LogBaseCalculator log5Mock = LogMocks.getLog5Mock();

    private final SinCalculator sin = new SinCalculator(ACCURACY);
    private final CosCalculator cos = new CosCalculator(ACCURACY, sin);
    private final CosecCalculator cosec = new CosecCalculator(ACCURACY, sin);
    private final SecCalculator sec = new SecCalculator(ACCURACY, cos);
    private final TanCalculator tan = new TanCalculator(ACCURACY, sin, cos);
    private final CotCalculator cot = new CotCalculator(ACCURACY, sin, cos);
    private final LnCalculator ln = new LnCalculator(ACCURACY);
    private final LogBaseCalculator log2 = new LogBaseCalculator(ACCURACY, 2, ln);
    private final LogBaseCalculator log3 = new LogBaseCalculator(ACCURACY, 3, ln);
    private final LogBaseCalculator log5 = new LogBaseCalculator(ACCURACY, 5, ln);

    private Function function;

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void stubsTest(double expected, double num, double den) {
        function = new Function(ACCURACY,
                sinMock, cosecMock, secMock, tanMock, cotMock, lnMock, log2Mock, log3Mock, log5Mock
        );
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void log2StubTest(double expected, double num, double den) {
        LogBaseCalculator log2Stub = new LogBaseCalculator(ACCURACY, 2, lnMock);

        function = new Function(ACCURACY,
                sinMock, cosecMock, secMock, tanMock, cotMock, lnMock, log2Stub, log3Mock, log5Mock
        );
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void log3StubTest(double expected, double num, double den) {
        LogBaseCalculator log3Stub = new LogBaseCalculator(ACCURACY, 3, lnMock);

        function = new Function(ACCURACY,
                sinMock, cosecMock, secMock, tanMock, cotMock, lnMock, log2Mock, log3Stub, log5Mock
        );
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void log5StubTest(double expected, double num, double den) {
        LogBaseCalculator log5Stub = new LogBaseCalculator(ACCURACY, 5, lnMock);

        function = new Function(ACCURACY,
                sinMock, cosecMock, secMock, tanMock, cotMock, lnMock, log2Mock, log3Mock, log5Stub
        );
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void lnStubTest(double expected, double num, double den) {
        function = new Function(ACCURACY,
                sinMock, cosecMock, secMock, tanMock, cotMock, ln, log2, log3, log5
        );
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void cosecStubTest(double expected, double num, double den) {
        CosecCalculator cosecStub = new CosecCalculator(ACCURACY, sinMock);

        function = new Function(ACCURACY,
                sinMock, cosecStub, secMock, tanMock, cotMock, lnMock, log2Mock, log3Mock, log5Mock
        );
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void secStubTest(double expected, double num, double den) {
        SecCalculator secStub = new SecCalculator(ACCURACY, cosMock);

        function = new Function(ACCURACY,
                sinMock, cosecMock, secStub, tanMock, cotMock, lnMock, log2Mock, log3Mock, log5Mock
        );
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void tanStubTest(double expected, double num, double den) {
        TanCalculator tanStub = new TanCalculator(ACCURACY, sinMock, cosMock);

        function = new Function(ACCURACY,
                sinMock, cosecMock, secMock, tanStub, cotMock, lnMock, log2Mock, log3Mock, log5Mock
        );
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void cotStubTest(double expected, double num, double den) {
        CotCalculator cotStub = new CotCalculator(ACCURACY, sinMock, cosMock);

        function = new Function(ACCURACY,
                sinMock, cosecMock, secMock, tanMock, cotStub, lnMock, log2Mock, log3Mock, log5Mock
        );
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void cosStubTest(double expected, double num, double den) {
        CosCalculator cosStub = new CosCalculator(ACCURACY, sinMock);
        SecCalculator secStub = new SecCalculator(ACCURACY, cosStub);
        TanCalculator tanStub = new TanCalculator(ACCURACY, sinMock, cosStub);
        CotCalculator cotStub = new CotCalculator(ACCURACY, sinMock, cosStub);

        function = new Function(ACCURACY,
                sinMock, cosecMock, secStub, tanStub, cotStub, lnMock, log2Mock, log3Mock, log5Mock
        );
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void sinStubTest(double expected, double num, double den) {
        function = new Function(ACCURACY,
                sin, cosec, sec, tan, cot, lnMock, log2Mock, log3Mock, log5Mock
        );
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void allStubTest(double expected, double num, double den) {
        function = new Function(ACCURACY,
                sin, cosec, sec, tan, cot, ln, log2, log3, log5
        );
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }
}