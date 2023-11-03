package practice;
import java.util.Scanner;
public class Practice1{  
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
        int ourNo= (int)(Math.random()*100);  
        System.out.println(" guess the no. "); 
        int guess = sc.nextInt();
        do {           
            if (guess == ourNo) {
                System.out.println("you guessed it !!!!!!"); 
                break;
            }
            else if (guess >= ourNo) {
                System.out.println("No. is actually smaller than that ... "); 
            }
            else{
                System.out.println("No. is actually bigger than that ... "); 
            }
            System.out.println("guess the no. "); 
            int temp = sc.nextInt();
            guess = temp; 
        } while (guess>-1);
    }
}