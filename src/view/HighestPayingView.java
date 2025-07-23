package view;

import model.Bill;

public class HighestPayingView {
    public static void showHighestPayingView(){
        Bill record = Bill.showHighestPayingCustomer();
        System.out.println("model.Customer name: "+ record.getCustomer().getName());
        System.out.println("House Number: "+ record.getCustomer().getHouseNumber());
        System.out.println("Units Consumed: "+ record.getCustomer().getUnitsConsumed());
        System.out.println("Bill Amount: "+ record.getBillAmount());
    }
}
