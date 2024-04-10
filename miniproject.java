import java.util.Scanner;
public class miniproject{
    public static void main(String[] args){
        int number;
        int num= (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Guess the number");
            number=sc.nextInt();
            if(number==num){
                System.out.println("You guessed it right");
                break;
            }
            else if(number>num)  
            {
                System.out.println("Enter a smaller number");
            }
            else
            {
                System.out.println("Enter a bigger number");
            }
        }while(number>=0);
    }
}
