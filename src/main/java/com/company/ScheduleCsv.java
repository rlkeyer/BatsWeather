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

public class ScheduleCsv {

    private ArrayList<ScheduleData> scheduleData = new ArrayList<>();

    public ScheduleCsv() throws IOException {
        try (
                Reader reader = Files.newBufferedReader(Paths.get("Bat-Schedule.csv"));
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader())
        ) {
            for (CSVRecord csvRecord : csvParser) {
                // Accessing Values by Column Index
                String date = csvRecord.get(0);
                String time = csvRecord.get(1);
                String opponent = csvRecord.get(2);

                ScheduleData example = new ScheduleData(date, time, opponent);
                scheduleData.add(example);
            }
        }
    }

    public ArrayList<ScheduleData> getData() {
        return scheduleData;
    }

}