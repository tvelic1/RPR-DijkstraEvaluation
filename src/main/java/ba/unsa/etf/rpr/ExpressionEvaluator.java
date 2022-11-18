package ba.unsa.etf.rpr;

import java.util.Stack;
/* Klasa za odredjivanje vrijednost*/
public class ExpressionEvaluator {
    /**
     * * Method for evaluation of expression based on Djikstra's algorithm
     * @param s
     *
     */

    public static double evaluate(String s){
        Stack<Double> vrijednosti=new Stack<Double>();
        Stack<String> operatori=new Stack<String>();
        String[] expr=s.split("\\s+");
        //razdvaja po blank s tim da ih moze biti i vise

        for(String a : expr)
        {
            if(a.equals("(")) ;
            else if(a.equals("+")) operatori.push(a);
            else if(a.equals("-")) operatori.push(a);
            else if(a.equals("*")) operatori.push(a);
            else if(a.equals("/")) operatori.push(a);
            else if(a.equals("sqrt") || a.equals("Sqrt")) operatori.push(a); //ubacuje sve operatore u stek
            else if(a.equals(")")) //znak da smo dosli do kraja ako je validan unos
            {
                String pomocni=operatori.pop(); //posljednji validan operator
                double pom=vrijednosti.pop(); //posljednja validna vrijednost
                if(pomocni.equals("+")) pom=vrijednosti.pop()+pom;
                else if(pomocni.equals("-")) pom=vrijednosti.pop()-pom;
                else if(pomocni.equals("*")) pom=vrijednosti.pop()*pom;
                else if(pomocni.equals("/")) pom=vrijednosti.pop()/pom;
                else if(pomocni.equals("sqrt") || pomocni.equals("Sqrt")) pom=Math.sqrt(pom);
                vrijednosti.push(pom); //prvi clan ce biti onaj koji se dobio prilikom prve operacije, drugi prilikom druge,... razmotavanje

            }
            else vrijednosti.push(Double.parseDouble(a));
        }
        return vrijednosti.pop(); // iz posljednjeg komentara se zakljucuje da je trazeni rezultat prvi element steka;


    }
}
