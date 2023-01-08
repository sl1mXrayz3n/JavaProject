package Parse;

import Parameters.Grand;
import Sqlite.Conn;
import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.ColumnPositionMappingStrategy;
import au.com.bytecode.opencsv.bean.CsvToBean;

import java.io.FileReader;
import java.util.List;

public class CsvReader {

    public static void main(String[] args) throws Exception
    {
        CsvToBean csv = new CsvToBean();
        Conn conn = new Conn();
        conn.Delete();
        String csvFilename = "src/main/resources/Гранты.csv";
        CSVReader csvReader1 = new CSVReader(new FileReader(csvFilename));
        List list1 = csv.parse(setColumMapping1(), csvReader1);
        for (Object object : list1) {
            Grand grand = (Grand) object;
            try {conn.insert(grand);}
            catch (Exception e) {}}
    }

    private static ColumnPositionMappingStrategy setColumMapping1()
    {
        ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
        strategy.setType(Grand.class);
        String[] columns = new String[] {"company","street", "money","year","type","places"};
        strategy.setColumnMapping(columns);
        return strategy;
    }
}
