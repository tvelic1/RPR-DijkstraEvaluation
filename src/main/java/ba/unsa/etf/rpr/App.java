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
        /*System.out.println( "Unesite vrijednost:" );
        Scanner in= new Scanner(System.in);
        String s=null;
        s=in.nextLine();


        try{ ValidInput.isValid(s);
            double ev=ExpressionEvaluator.evaluate(s);
            System.out.println(ev);

        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());} */






                try{ ValidInput.isValid(args[0]);
                   String g=args[0];
                    double ev=ExpressionEvaluator.evaluate(g);
                    System.out.println(ev);

                }catch(RuntimeException e)
                {
                    System.out.println(e.getMessage());
                }

                //na prvu sam mislio da treba da se parsira string ali napisali ste kolegi da se string salje kao jedan odnosno da nema parsiranja





    }
}
