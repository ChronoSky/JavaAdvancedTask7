import org.junit.Assert;
import org.junit.Test;

public class Tests {


    @Test
    public void getResultBeforeSetParameters(){
        Calculator calc = new Calculator();
         Assert.assertTrue("Значение результата до указания параметров задано не корректно.", calc.getResult()==0);
    }

    @Test
    public void setOnlyFirstParameter() throws Exception {
        Calculator calc = new Calculator();
        calc.setFirstParam(1.25);
        calc.doOperation("+");
        Assert.assertEquals("Не корректный результат при указании только первого параметра", calc.getResult() ,1.25);
    }

    @Test
    public void setOnlySecondParameter() throws Exception {
        Calculator calc = new Calculator();
        calc.setSecondParam(2.25);
        calc.doOperation("+");
        Assert.assertEquals("Не корректный результат при указании только второго параметра", 2.25, calc.getResult());
    }


    @Test
    public void checkSumOperation() throws Exception {
        Calculator calc = new Calculator();
        calc.setFirstParam(1.25);
        calc.setSecondParam(2.5);
        calc.doOperation("+");
        Assert.assertEquals("Не корректный результат при сложении", calc.getResult(), 3.75, 0.0);
    }

    @Test
    public void checkSubtractionOperation() throws Exception {
        Calculator calc = new Calculator();
        calc.setFirstParam(1.25);
        calc.setSecondParam(2.5);
        calc.doOperation("-");
        Assert.assertEquals("Не корректный результат при вычитании", calc.getResult(), -1.25, 0.0);
    }

    @Test
    public void checkMultiplicationOperation() throws Exception {
        Calculator calc = new Calculator();
        calc.setFirstParam(1.25);
        calc.setSecondParam(2.5);
        calc.doOperation("*");
        Assert.assertEquals("Не корректный результат при умножении", calc.getResult(), 3.125, 0.0);
    }

    @Test
    public void checkDivisionOperation() throws Exception {
        Calculator calc = new Calculator();
        calc.setFirstParam(2.5);
        calc.setSecondParam(1.25);
        calc.doOperation("/");
        Assert.assertEquals("Не корректный результат при делении", calc.getResult(), 2, 0.0);
    }
}
