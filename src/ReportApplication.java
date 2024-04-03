import java.io.IOException;

public class ReportApplication {
    public static void main(String[] args) throws IOException {

        FileService fileService = new FileService();
        SaleDataService.generateTeslaSaleReport(fileService);

    }

}

