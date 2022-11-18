package ba.unsa.etf.rpr;

public class ValidInput {

    /**
     * * method for validation of input
     * @param a
     * @author tvelic1
     */

    public static boolean isValid(String a){
        boolean valid=true;
        char prva=a.charAt(0);
        char last=a.charAt(a.length()-1);
        if(prva!='(' || last != ')' ){ //mora pocet zagradom i zavrsit zatvorenom zagradom
            valid=false;
            throw new RuntimeException("Invalid input");
        }
        for(int i=0;i<a.length();i++) {

            //najosnovnija provjera ne smije biti nista sto nije cifra ili operator ili razmak ili sqrt
            if(a.charAt(i)!=')' && a.charAt(i)!=' ' && a.charAt(i)!='(' && isSqrt(a.charAt(i))==false && isDigit(a.charAt(i))==false && isOperator(a.charAt(i))==false)
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
                int duzina_potkorijene_velicine=pom2.length()-8; //prebrojavanjem se dobije
                for(int i=pom.indexOf("t")+4;i<pom.indexOf("t")+4+duzina_potkorijene_velicine;i++)
                {
                    if(isDigit(pom.charAt(i))==false) { valid=false; //da li je svaki element potkorijene velicine cifra
                        throw new RuntimeException("Invalid inputtt");}
                }

           }int br=0;
            for(int i=0; i<a.length();i++)
            {
                if(a.charAt(i)=='(') br++;
                else if(a.charAt(i)==')') br--;
            }
            if(br!=0){
                valid=false;
                throw new RuntimeException("Unmached"); //za zagrade

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
        if(c=='s' || c=='q' || c=='r' || c=='t') return true;
        return false;
    }



}

