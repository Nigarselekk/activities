/**
* @author Nigar SELEK
* */
public class Main {

    public static void main(String[] args) {

try {
    System.out.println(repeatChar('A', 3));
    System.out.println(repeatChar('b', 6));
    System.out.println(repeatString("CSE", 123));
    System.out.println(repeatString("CSE", 102));
    System.out.println(repeatString("SE", 102));
    System.out.println(repeatString("CSE", 12));

}catch(StringIndexOutOfBoundsException exc ){
}
    }

    public static String repeatString(String s , int ns) throws StringIndexOutOfBoundsException{

        int times = ns%10;
        String output ="";
        if(s==null){
            return output;
        }

                try {
                    for (int i = 0 ; i<times ; i++) {
                        output += String.valueOf(s.charAt(s.length() - 1));


                        if (s.length() - 1 < 0)
                            throw new StringIndexOutOfBoundsException();
                    }

                }catch (StringIndexOutOfBoundsException exc){

                    return "";
            }

        String newWord = s.length()==0 ?  null : s.substring(0,s.length()-1);

        return  repeatString( newWord , (ns-times)/10)+output;

    }

    public static String repeatChar(char c, int n){

        if (c==' '|| n<= 0){
            return "";
        }
        else
            return c+repeatChar(c,n-1);
    }
        }




















