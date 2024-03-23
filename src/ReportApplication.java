import java.io.IOException;

public class ReportApplication {
    public static void main(String[] args) throws IOException {

        FileService read = new FileService();
        SaleDataService.generateTeslaSaleReport(read);

    }

}

