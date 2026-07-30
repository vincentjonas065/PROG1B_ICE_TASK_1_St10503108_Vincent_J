/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.computerlabreport;

/**
 *
 * @author Student
 */
// Computer Lab Booking Report
public class ComputerLabReport {
    

    public static void main(String[] args) {

        // One-dimensional array
        String[] labs = {
            "PROGRAMMING",
            "NETWORKING",
            "MULTIMEDIA"
        };

        // Two-dimensional array
        int[][] bookings = {
            {32, 18, 24},
            {28, 25, 19},
            {35, 20, 27},
            {30, 22, 21}
        };

        // Display heading
        System.out.println("COMPUTER LAB BOOKING REPORT");
        System.out.println("-----------------------------------------------");

        // Display column headings
        System.out.print("WEEK\t");

        for (int column = 0; column < labs.length; column++) {
            System.out.print(labs[column] + "\t");
        }

        System.out.println();

        // Display rows and values
        for (int row = 0; row < bookings.length; row++) {

            System.out.print("WEEK " + (row + 1) + "\t");

            for (int column = 0; column < bookings[row].length; column++) {
                System.out.print(bookings[row][column] + "\t\t");
            }

            System.out.println();
        }

        System.out.println("-----------------------------------------------");

        // Calculate and display totals
        System.out.print("TOTAL\t");

        for (int column = 0; column < labs.length; column++) {

            int total = 0;

            for (int row = 0; row < bookings.length; row++) {
                total = total + bookings[row][column];
            }

            System.out.print(total + "\t\t");
        }

        System.out.println();

        // Calculate and display averages
        System.out.print("AVERAGE\t");

        for (int column = 0; column < labs.length; column++) {

            int total = 0;

            for (int row = 0; row < bookings.length; row++) {
                total = total + bookings[row][column];
            }

            double average = (double) total / bookings.length;

            System.out.print(average + "\t");
        }

        System.out.println();

        // Display minimum values
        System.out.print("MINIMUM\t");

        for (int column = 0; column < labs.length; column++) {

            int smallest = bookings[0][column];

            for (int row = 1; row < bookings.length; row++) {

                if (bookings[row][column] < smallest) {
                    smallest = bookings[row][column];
                }
            }

            System.out.print(smallest + "\t\t");
        }

        System.out.println();

        // Display maximum values
        System.out.print("MAXIMUM\t");

        for (int column = 0; column < labs.length; column++) {

            int largest = bookings[0][column];

            for (int row = 1; row < bookings.length; row++) {

                if (bookings[row][column] > largest) {
                    largest = bookings[row][column];
                }
            }

            System.out.print(largest + "\t\t");
        }

        System.out.println();
        System.out.println("-----------------------------------------------");
    }
}
