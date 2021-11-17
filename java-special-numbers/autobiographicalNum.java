/*
An autobiographical number is a number (N) such that 
the first digit of N counts how many zeroes are presented in N, 
the second digit counts how many ones are presented in N, 
the third digit counts how many twos are presented in N, and so on. 
Sometimes, it is also known as a curious number. It is the sequence OEIS A046043.
eg 21200
*/
import java.io.*;
public class autobiographicalNum {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine().trim();
        checkAutoBioNum(num);
    }
    static void checkAutoBioNum(String num){
        int flag = 0;
        for(int digit = 0; digit < num.length(); digit++){
            flag = 0;
            for(int i = 0; i<num.length(); i++){
                
                if(Integer.parseInt(num.charAt(i)+"")==digit){
                    flag++;
                }
            }
            if(Integer.parseInt(num.charAt(digit)+"")==flag){
                continue;
            }
            else{
                System.out.println("Nope");
                System.exit(0);
            }
        }
        System.out.println(num+"is autobiographical");
    }
}

