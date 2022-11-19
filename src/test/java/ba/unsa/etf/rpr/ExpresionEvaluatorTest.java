package ba.unsa.etf.rpr;

//import static junit.framework.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


/**
 * Unit test for simple App.
 */
public class ExpresionEvaluatorTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
     void test1(){
        String s="( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )";
        assertEquals(101.0,ExpressionEvaluator.evaluate(s));
    }
    // besmislen unos
    @Test
    void test2(){ String s="(a)";
        assertThrows(RuntimeException.class, () ->{ValidInput.isValid("(a)");},"Greska");

    }

    @Test
    void test3(){ String s="(a)";
        assertThrows(RuntimeException.class, () ->{ValidInput.isValid("( 1 + 2 ) )");},"Unmached");

    }
    @Test
    void test4(){
        String s="( 1 + ( ( 2 + 3 ) * ( sqrt ( 16 ) * 5 ) ) )";
        assertEquals(101.0,ExpressionEvaluator.evaluate(s));
    }
    @Test
    void test5(){
        String h="( 1 + sqrt ( 4 ) )";
        assertEquals(3.0,ExpressionEvaluator.evaluate(h));
    }

    @Test
    void test6(){ String s="( 1 + 2";
        assertThrows(RuntimeException.class, () ->{ValidInput.isValid("( 1 + 2 ) )");},"Invalid input");

    }




}
