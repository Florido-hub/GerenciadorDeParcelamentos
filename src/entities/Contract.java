package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Contract {
    private Integer number;
    private LocalDateTime date;
    private Double totalValue;

    private ArrayList<Installment> installments;

    public Contract(Integer number, LocalDateTime date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
        this.installments = new ArrayList<>();
    }


}
