package ba.unsa.etf.rpr;

import java.util.Scanner;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Unesite vrijednost:" );
        Scanner in= new Scanner(System.in);
        String s=null;
        s=in.nextLine();
        double ev=ExpressionEvaluator.evaluate(s);
        System.out.println(ev);
    }
}
