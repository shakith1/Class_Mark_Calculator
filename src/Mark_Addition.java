
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Shakith
 */
public class Mark_Addition {

    public static void main(String[] args) {
        int mark1, mark2;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Mark 1 : ");
            mark1 = sc.nextInt();

            System.out.print("Enter Mark 2 : ");
            mark2 = sc.nextInt();

            System.out.println("Final Mark : " + (mark1 + mark2));
            System.out.println();
        }
    }
}
