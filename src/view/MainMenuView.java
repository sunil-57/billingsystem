package view;

import controller.ViewController;

import java.util.Scanner;


public class MainMenuView {
    public static void showMainMenuView(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1: Calculate Bill");
        System.out.println("Enter 2: Show highest paying");
        System.out.println("Enter 3: Exit");
        int option = Integer.parseInt(scan.nextLine());
        if(option < 0){
            System.out.println("Err...Not a valid option..");
        }else{
            if(option == 1){
                ViewController.getCalculateBillView();
            }
            else if(option == 2)
            {
                ViewController.getHighestPayingView();
            }
        }
    }
}
