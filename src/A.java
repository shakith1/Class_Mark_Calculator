
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Shakith
 */
public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark;

        while (true) {
            System.out.print("Enter Mark : ");
            mark = sc.nextInt();

            System.out.println("Final Mark : " + Math.round(mark * 2.5));
        }
    }
}
