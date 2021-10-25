package shalimov.tasks.task3;

import java.util.Scanner;


public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        Helper helper = new Helper();
        InOut inOut = new InOut();

        inOut.printArray(inOut.getArray(line), "bebra", 3);
        System.out.println(helper.findMax(inOut.getArray(line)));
    }
}
