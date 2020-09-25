package test.main;

import java.util.Scanner;
import test.first.First;
import test.five.Five;
import test.second.Second;
import test.six.Six;
import test.three.Three;
import test.four.Four;

public class Main {
    public static void main(String[] args) {
        if(args.length==0){
            String[] newargs = {"Hello","world!"};
            args=newargs;
        }
        Scanner in = new Scanner(System.in);
        int j=1;
        program:
        {
            while (j > 0) {
                System.out.print("Input a task number (1-6 or q): ");
                switch (in.nextLine()) {
                    case "1":
                        System.out.println("TASK 1");
                        First.main(args);
                        break;
                    case "2":
                        System.out.println("TASK 2");
                        Second.main(args);
                        break;
                    case "3":
                        System.out.println("TASK 3");
                        Three.main(args);
                        break;
                    case "4":
                        System.out.println("TASK 4");
                        Four.main(args);
                        break;
                    case "5":
                        System.out.println("TASK 5");
                        Five.main(args);
                        break;
                    case "6":
                        System.out.println("TASK 6");
                        Six.main(args);
                        break;
                    case "q":
                        break program;
                    default:
                        System.out.println("not found");
                        break;
                }
            }
        }
    }
}
