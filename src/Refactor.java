import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Refactor {
    //invoices
    List<Invoice> invoices = new ArrayList<>();

    // stream 1 - oracle
    // List<Invoice> oracleAndTrainingInvoices = new ArrayList<>();
    List<Invoice> oracleAndTrainingInvoices = invoices.stream()
            .filter(training -> training.title.contains("Training"))
            .collect(Collectors.toList());

    // stream 2 - sort
    List<Invoice> oracleAndTrainingInvoicesSorted = oracleAndTrainingInvoices.stream()
            .sorted((o1, o2) -> o2.amount.compareTo(o1.amount))
            .collect(Collectors.toList());

    // stream 3 - id
    // List<Integer> ids = new ArrayList<>();
    List<Integer> ids = oracleAndTrainingInvoicesSorted.stream()
            .map(invoice -> invoice.id)
            .collect(Collectors.toList());


    // stream 4 - five id
    List<Integer> firstFiveIds = ids.stream()
            .limit(5)
            .collect(Collectors.toList());

}
