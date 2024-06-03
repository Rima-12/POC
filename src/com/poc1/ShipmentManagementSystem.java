package com.poc1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ShipmentManagementSystem {
	public static void main(String[] args) { 
	Scanner scanner = new Scanner(System.in);

    
    System.out.println("Enter the number of cargo");
    int numberOfCargos = Integer.parseInt(scanner.nextLine());

    
    System.out.println("Enter the cargo id");
    List<Integer> cargoIds = IntStream.range(0, numberOfCargos)
                                      .mapToObj(i -> Integer.parseInt(scanner.nextLine()))
                                      .collect(Collectors.toList());

  
    System.out.println("Enter the number of shipment");
    int numberOfShipments = Integer.parseInt(scanner.nextLine());

   
    System.out.println("Enter the shipment name");
    List<String> shipmentNames = IntStream.range(0, numberOfShipments)
                                          .mapToObj(i -> scanner.nextLine())
                                          .collect(Collectors.toList());

  
    Map<Integer, String> cargoShipmentMap = IntStream.range(0, Math.min(numberOfCargos, numberOfShipments))
                                                     .boxed()
                                                     .collect(Collectors.toMap(cargoIds::get, shipmentNames::get));

    
    System.out.println("Enter the cargo id");
    int searchCargoId = Integer.parseInt(scanner.nextLine());

   
    System.out.println(cargoShipmentMap.getOrDefault(searchCargoId, "Yet to be shipped"));

   
}
}
