package view;

import model.BillRecords;
import model.Customer;

import java.util.Scanner;

public class CaculateBillView{
    public static void showCalculateBillView(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter customer name: ");
        String customerName = scan.nextLine();
        System.out.println("Enter house number: ");
        String houseNumber = scan.nextLine();
        System.out.println("Enter units consumed: ");
        double unitsConsumed = Double.parseDouble(scan.nextLine());
        Customer customer = new Customer(customerName, houseNumber, unitsConsumed);
        double billAmount = customer.calculateBill();
        BillRecords record = new BillRecords(customer, billAmount);
        if(BillRecords.addBillRecord(record)){
            System.out.println("Record added successfully....");
            System.out.println("Bill Info: ");
            //TODO print the bill here
        }else{
            System.out.println("Failed...");
        }
    }
}
