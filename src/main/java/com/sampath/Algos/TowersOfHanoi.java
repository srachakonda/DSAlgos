package com.sampath.Algos;

import java.util.Scanner;

/**
 * Created by sampathr on 30/6/17.
 */
public class TowersOfHanoi {


    public static void main(String[] args) {
        System.out.println("Towers of Hanoi Problem. Enter Number of Discs: ");
        Scanner input = new Scanner(System.in);
        int discs = input.nextInt();
        towersOfHanoi(discs,"A","B","C");
    }

    public static void towersOfHanoi(int discsSize,String sourcePeg, String auxPeg, String destPeg){

        if (discsSize == 1) {
            System.out.println("Move Disc from " + sourcePeg + " to " + destPeg);
        }else {
            towersOfHanoi(discsSize - 1, sourcePeg, destPeg, auxPeg);
            System.out.println("Move Disc from " + sourcePeg + " to " + destPeg);

            towersOfHanoi(discsSize - 1, auxPeg, sourcePeg, destPeg);
        }

    }


}
