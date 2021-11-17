import java.io.*;

/*A number is said to be Peterson 
if the sum of factorials of each digit is equal to the sum of the number itself.
*/
public class petersonNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine().trim();

        
        int sum = 0;
        for(int i = 0; i<num.length(); i++){
            sum=sum + factorial(Integer.parseInt(num.charAt(i)+""));
        }
        System.out.println((num.equals(String.valueOf(sum))==true)? "Yes":"No");
    }
    static int factorial(int num){

        if(num <= 1) return 1 ;
        else return num*factorial(num-1);
    }
}
