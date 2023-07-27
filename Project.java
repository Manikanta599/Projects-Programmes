import java.lang.Math;
import java.util.*;
class Project
{
    public static void NumberGuess()
    {
        Scanner sc = new Scanner(System.in);
        // generate numbres
        int num = 1+(int)(100*Math.random());
        int trails=5;
        int i,guess;
        System.out.println("Choose a number between 1 to 100"+"\n"+"Guess the number within 5 trails");
        for(i=0;i<trails;i++)
        {
            System.out.println("Guess the number");
            guess=sc.nextInt();
            if(num==guess)
            {
                System.out.println("Congratulations you guessed the correct number");
                break;
            }
            else if(num>guess)
            {
                System.out.printf("The number is Bigger than %d \n",guess);

            }
            else if(num<guess)
            {
                System.out.printf("The number is Smaller than %d \n",guess);

            }

        }

        if(i==trails)
        {
            System.out.printf("You have exhasted %d Trails \n",trails);
            System.out.println("The number was "+ num);
        }

    }

    public static void main(String args[])
    {
        NumberGuess();
    }
}