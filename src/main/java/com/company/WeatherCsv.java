package com.company;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WeatherCsv {





    private ArrayList<WeatherData> weatherData = new ArrayList<>();

    public WeatherCsv() throws IOException {
        try (
                Reader reader = Files.newBufferedReader(Paths.get("Average-Weather-Data.csv"));
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader())
        ) {
            for (CSVRecord csvRecord : csvParser) {
                // Accessing Values by Column Index
                String date = csvRecord.get(0);
                String high = csvRecord.get(1);
                String low = csvRecord.get(2);

                WeatherData example = new WeatherData(date, high, low);
                weatherData.add(example);
            }
        }
    }

    public ArrayList<WeatherData> getData() {
        return weatherData;
    }
}
