import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {
    @Test
    public void subtration(){
      Calculator myCalc = new Calculator();
        Assert.assertEquals(12, myCalc.sub(18,6));
    }

    @Test
    public void multiplication(){
        Calculator myCalc = new Calculator();
          Assert.assertEquals(72, myCalc.mult(6,3,4));
    }

    @Test
    public void division(){
      Calculator myCalc = new Calculator();
         Assert.assertEquals(20,myCalc.div(500, 4,3,2));
    }
}
