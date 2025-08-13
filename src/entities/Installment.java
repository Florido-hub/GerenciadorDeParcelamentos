package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Installment {

    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    private LocalDateTime dueDate;
    private Double amount;

    public Installment() {
    }

    public Installment(LocalDateTime dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return dueDate.format(fmt) + " - " +
                String.format("%.2f",amount);
    }
}
