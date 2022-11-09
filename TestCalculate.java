import java.io.FileReader;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;

public class TestCalculate {
    @Test
    public void simpleTestCalculateSumm() throws Exception{
        Calculator calc = new Calculator();
        double res = calc.add(2, 3);
        Assert.assertEquals(5, res, 0.00001);
    }
    @Test
    public void simpleTestCalculateSum() throws Exception{
        Calculator calc = new Calculator();
        double res = calc.add(5.9, 3.6);
        Assert.assertEquals(9.5, res, 0.00001);
    }
    @Test
    public void simpleTestCalculateSum1() throws Exception{
        Calculator calc = new Calculator();
        double res = calc.min(0, 3.6);
        Assert.assertEquals(-3.6, res, 0.00001);
    }
    @Test
    public void simpleTestCalculateSum2() throws Exception{
        Calculator calc = new Calculator();
        double res = calc.min(1, 3.6);
        Assert.assertEquals(-2.6, res, 0.00001);
    }
    @Test
    public void simpleTestCalculateSum3() throws Exception{
        Calculator calc = new Calculator();
        double res = calc.del(1, 2);
        Assert.assertEquals(0.5, res, 0.00001);
    }
    @Test
    public void simpleTestCalculateSum4() throws Exception{
        Calculator calc = new Calculator();
        double res = calc.del(4, 2);
        Assert.assertEquals(2, res, 0.00001);
    }
    @Test
    public void simpleTestCalculateSum5() throws Exception{
        Calculator calc = new Factorial();
        double res = calc.del(3.6, 2);
        Assert.assertEquals(1.8, res, 0.00001);
    }
    @Test
    public void simpleTestCalculateSum6() throws Exception{
        Calculator calc = new Calculator();
        double res = calc.multip(10, 2);
        Assert.assertEquals(20, res, 0.00001);
    }
    @Test
    public void simpleTestCalculateSum7() throws Exception{
        Calculator calc = new Calculator();
        double res = calc.multip(0, 2);
        Assert.assertEquals(0, res, 0.00001);
    }
    @Test
    public void simpleTestCalculateDivByZero() throws Exception{
        Calculator calc = new Calculator();
        Calculator.returnStruct res = calc.div(1, 0);
        Assert.assertEquals(false, res.exists);}
}