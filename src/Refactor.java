import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Refactor {
    public static void main(String[] args) {
        //invoices
        List<Invoice> invoices = new ArrayList<>();

        Invoice invoice1= new Invoice();
        invoice1.setId(1);
        invoice1.setAmount(1000);
        invoice1.setCustomer("Oracle");
        invoice1.setTitle("Training A");

        Invoice invoice2 = new Invoice();
        invoice2.setId(2);
        invoice2.setAmount(2000);
        invoice2.setCustomer("Oracle");
        invoice2.setTitle("No train B");

        Invoice invoice3 = new Invoice();
        invoice3.setId(3);
        invoice3.setAmount(750);
        invoice3.setCustomer("Oracle");
        invoice3.setTitle("C Training");

        Invoice invoice4 = new Invoice();
        invoice4.setId(4);
        invoice4.setAmount(500);
        invoice4.setCustomer("Oracle");
        invoice4.setTitle("Kelas");

        Invoice invoice5 = new Invoice();
        invoice5.setId(5);
        invoice5.setAmount(1500);
        invoice5.setCustomer("Oracle");
        invoice5.setTitle("Training kelas");

        Invoice invoice6 = new Invoice();
        invoice6.setId(6);
        invoice6.setAmount(900);
        invoice6.setCustomer("Oracle");
        invoice6.setTitle("kelas");

        Invoice invoice7 = new Invoice();
        invoice7.setId(7);
        invoice7.setAmount(1900);
        invoice7.setCustomer("IBM");
        invoice7.setTitle("Kelas again");

        Invoice invoice8 = new Invoice();
        invoice8.setId(8);
        invoice8.setAmount(2400);
        invoice8.setCustomer("Oracle");
        invoice8.setTitle("Last Training");

        Invoice invoice9 = new Invoice();
        invoice9.setId(9);
        invoice9.setAmount(3000);
        invoice9.setCustomer("Oracle");
        invoice9.setTitle("Training Last");

        invoices.add(invoice1);
        invoices.add(invoice2);
        invoices.add(invoice3);
        invoices.add(invoice4);
        invoices.add(invoice5);
        invoices.add(invoice6);
        invoices.add(invoice7);
        invoices.add(invoice8);
        invoices.add(invoice9);
        // stream 1 - oracle
        // List<Invoice> oracleAndTrainingInvoices = new ArrayList<>();
        List<Invoice> oracleAndTrainingInvoices = invoices.stream()
        //      .filter(customer -> customer.getCustomer().equals("ORACLE"))
                .filter(training -> training.getTitle().contains("Training"))
                .collect(Collectors.toList());

        // stream 2 - sort
        List<Invoice> oracleAndTrainingInvoicesSorted = oracleAndTrainingInvoices.stream()
                .sorted((o1, o2) -> o2.getAmount().compareTo(o1.getAmount()))
                .collect(Collectors.toList());

        // stream 3 - id
        // List<Integer> ids = new ArrayList<>();
        List<Integer> ids = oracleAndTrainingInvoicesSorted.stream()
                .map(Invoice::getId)
                .collect(Collectors.toList());


        // stream 4 - five id
        List<Integer> firstFiveIds = ids.stream()
                .limit(5)
                .collect(Collectors.toList());

        //System.out.println(oracleAndTrainingInvoicesSorted);
        for (Invoice invoice: oracleAndTrainingInvoicesSorted) {
            System.out.println(invoice.getId());
            System.out.println(invoice.getTitle());
            System.out.println(invoice.getAmount());
            System.out.println("- - - - -");
        }
        System.out.println("----");
        System.out.println(firstFiveIds);
    }

}
