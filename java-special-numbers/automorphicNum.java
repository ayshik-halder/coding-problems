import java.io.*;

/*
A number is called an automorphic number if and only if the square of the given number ends with the same number itself. 
For example, 25, 76 are automorphic numbers because their square is 625 and 5776, respectively 
and the last two digits of the square represent the number itself. 
Some other automorphic numbers are 5, 6, 36, 890625, etc.
*/
public class automorphicNum {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        System.out.println((checkAutomorphic(num) == true)? "Yes":"No");
    }
    public static boolean checkAutomorphic(String num){
        String square = String.valueOf((long)Math.pow((Integer.parseInt(num)),2)); 
        return ( (square.lastIndexOf(num) == (square.length()-num.length()))
                        ? true : false  );
    }
}

/* Case
num = 76,  length = 2890625
square = 3776,   length = 4
square.indexOf(num) = 2
*/
