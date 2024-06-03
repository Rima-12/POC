package com.poc1;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerSearch {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of customers: ");
        int n = Integer.parseInt(scanner.nextLine());

       
        ArrayList<String> customers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of customer " + (i + 1) + ": ");
            customers.add(scanner.nextLine().toLowerCase());
        }

        
        System.out.println("Enter the name you want to search");
        String searchName = scanner.nextLine().toLowerCase();

        
        if (customers.contains(searchName)) {
            System.out.println(searchName + " found!");
        } else {
            System.out.println(searchName + " not found.");
        }

       
    }

}
