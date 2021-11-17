/*
A number is called a sunny number if the number next to the given number is a perfect square.
 In other words, a number N will be a sunny number if N+1 is a perfect square.
*/
import java.io.*;
public class sunnyNum {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long num = Long.parseLong(br.readLine());
        System.out.println((check(num)==true)? "Yes" : "No");
    }
    static  boolean check(long num){
        return ((Math.sqrt(num+1) % 1 == 0 )? true : false );
    }
}
