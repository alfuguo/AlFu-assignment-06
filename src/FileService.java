import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FileService {
    public List<TeslaSales> readFile(String filename) throws IOException {
        List<TeslaSales> teslaSales = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(filename));

        reader.readLine();
        String line;

        while ((line = reader.readLine()) != null) {
            String[] columns = line.split(",");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM-yy");
            TeslaSales teslaSalesTemp = new TeslaSales(YearMonth.parse(columns[0], formatter),
                                                       Integer.parseInt(columns[1]));
            teslaSales.add(teslaSalesTemp);
        }
        return teslaSales;


    }
}
