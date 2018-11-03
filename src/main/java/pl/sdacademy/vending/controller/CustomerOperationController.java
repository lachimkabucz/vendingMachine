package pl.sdacademy.vending.controller;

import model.VendingMachine;

public class CustomerOperationController {
    private VendingMachine machine;

    public CustomerOperationController(){

        machine = new VendingMachine();
    }

    public void printMachine() {

        for (int rowsNo = 0; rowsNo < machine.rowsCount(); rowsNo++){
            //gorno krawedz
            //lewa krwadz
            for (int colNo = 0; colNo<machine.colsCount(); colNo++){
                System.out.print("+--------+");
            }

            System.out.println();

            for (int colNo = 0; colNo<machine.colsCount(); colNo++){
                char symbolLetter = (char) ('A' + rowsNo);
                int symbolNumber = colNo + 1;
                System.out.print("|   "+ symbolLetter + symbolNumber +"   |");
            }

            System.out.println();


            for (int colNo = 0; colNo<machine.colsCount(); colNo++){
                System.out.print("+--------+");
            }

            System.out.println();

        }

    }
}
