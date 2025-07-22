package controller;

import model.BillRecords;
import view.CaculateBillView;
import view.HighestPayingView;

public class ViewController {
    public static void getCalculateBillView() {
        CaculateBillView.showCalculateBillView();
    }

    public static void getHighestPayingView() {
        HighestPayingView.showHighestPayingView();
    }
}
