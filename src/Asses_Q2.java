import java.util.ArrayList;
import java.util.Scanner;

public class Asses_Q2 {

    /*
    Q2) Write a program to read user input until user writes XDONE
    and then show the entered text by the user on commandline
    */
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        ArrayList<String> lines = new ArrayList<>();

        while (sc.hasNextLine()) {
            String line = sc.nextLine();

            if (line.equals("XDONE")) {
                break;
            }
            lines.add(line);
        }

        for (String line : lines) {
            System.out.println(line);
        }

    }
}