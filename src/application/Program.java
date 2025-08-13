package application;

import entities.Contract;
import entities.Installment;
import services.ContractService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato: ");
        System.out.print("Numero: ");
        Integer number = sc.nextInt();
        sc.nextLine();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(sc.nextLine(), fmt);


        System.out.print("Valor do contrato: ");
        Double totalValue = Double.parseDouble(sc.nextLine());

        Contract obj = new Contract(number, data, totalValue);

        System.out.print("Entre com o numero de parcelas: ");
        Integer parcelas = sc.nextInt();
        sc.nextLine();

        ContractService service = new ContractService(null);

        service.processContract(obj,parcelas);

        System.out.println("Parcelas: ");
        for(Installment installment : obj.getInstallments()){
            System.out.println(installment);
        }



        sc.close();
    }
}
