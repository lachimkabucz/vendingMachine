package model;

import pl.sdacademy.vending.util.Configuration;

public class VendingMachine {

    private final Configuration configuration;
    private final Long rowsCount;


    public VendingMachine(Configuration configuration){
        this.configuration = configuration;

        rowsCount = configuration.getLongProperty(
                "machine.size.rows",
                6L);
        if(rowsCount <=0){
            throw new IllegalArgumentException(
                    "Row count" + rowsCount + "is invalid");

        }
    }

    public Long rowsCount(){
        return rowsCount;

    }

    public Long colsCount(){
        return configuration.getLongProperty(
                "machine.size.cols",
                4L
        );
    }
}
