package ba.unsa.etf.rpr;

import java.sql.SQLOutput;
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


        try{ ValidInput.isValid(s);
            double ev=ExpressionEvaluator.evaluate(s);
            System.out.println(ev);

        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());}



 //String a = "( sqrt ( 1 ) + 1 )";
       // String pom2=a.substring(a.indexOf("s"),a.indexOf(")"));
        //int k=pom2.length()-8;
        //.out.println(k);
       // System.out.println(a.charAt(9));
        //System.out.println(s.charAt(2));
        //String myStr = "( ( sqrt ( 11 )";
        //System.out.println(myStr.substring(myStr.indexOf("s"),myStr.indexOf(")")).length()-8);
    }
}
