package ba.unsa.etf.rpr;

public class ValidInput {

    public static boolean isValid(String a){
        boolean valid=true;
        char prva=a.charAt(0);
        char last=a.charAt(a.length()-1);
        if(prva!='(' || last != ')' ){
            valid=false;
            throw new RuntimeException("Invalid input");
        }
        for(int i=0;i<a.length();i++) {

            //najosnovnija provjera ne smije biti nista sto nije cifra ili operator ili razmak ili sqrt
            if(a.charAt(i)!=')' && a.charAt(i)!=' ' && a.charAt(i)!='(' && a.charAt(i)!='s' && a.charAt(i)!='r' && a.charAt(i)!='q' && a.charAt(i)!='t' && isDigit(a.charAt(i))==false && isOperator(a.charAt(i))==false)
            {valid=false; throw new RuntimeException("Greska");}


            if (a.charAt(i) == ' ') {
                if (isOperator(a.charAt(i + 1)) == false && isDigit(a.charAt(i + 1)) == false && a.charAt(i + 1) != '(' && a.charAt(i + 1) != ')' && a.charAt(i+1)!='s') {
                    valid = false;
                    throw new RuntimeException("Invalid inputt");
                }
                if (a.charAt(i - 1) != '(' && a.charAt(i - 1) != ')' && isOperator(a.charAt(i - 1)) == false && isDigit(a.charAt(i - 1)) == false && a.charAt(i-1)!='t') {
                    valid = false;
                    throw new RuntimeException("Invalid inputt");

                } // razmak mora biti izmedju neka 2 od ovih karaktera
            }}


            if(a.contains("sqrt"))
            { String pom=a.substring(a.indexOf("s")); //uzmi string od s pa nadalje

                String pom2=pom.substring(pom.indexOf("s"),pom.indexOf(")")); // od s pa do prve zatvorene
                int duzina_potkorijene_velicine=pom2.length()-6; //prebrojavanjem se dobije
                for(int i=pom.indexOf("t")+2;i<pom.indexOf("t")+2+duzina_potkorijene_velicine;i++)
                {
                    if(isDigit(pom.charAt(i))==false) { valid=false; //da li je svaki element potkorijene velicine cifra
                        throw new RuntimeException("Invalid inputtt");}
                }

           }

        return valid;


    }
    public static boolean isOperator(char c){
        if(c=='+' || c=='-' || c=='/' || c=='*') return true;
        return false;
    }

    public static boolean isDigit(char c ){
        if(c>='0' && c<='9') return true;
        return false;

    }
    public static boolean isOpened(char c){
        if(c=='(') return true;
        return false;
    }
    public static boolean isClosed(char c){
        if(c==')') return true;
        return false;
    }
    public static boolean isSqrt(char c){
        if(c!='s' || c!='q' || c!='r' || c!='t') return false;
        return true;
    }



}

