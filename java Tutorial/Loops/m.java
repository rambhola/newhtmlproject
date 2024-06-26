
//random class // if have in range a n number 
import java.util.Random;
import java.util.Scanner;

class m {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);

        int cnum = r.nextInt(454);
        int unum = s.nextInt();

        if (cnum == unum) {
            System.out.println("Congratulation ! You Gussed Correct Number ");

        } else {
            System.out.println("Wrong Number ! better luck next time");
            System.out.println("Computer mumber was" + cnum);
        }

    }
}