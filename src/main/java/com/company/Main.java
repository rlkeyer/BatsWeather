package com.company;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVPrinter;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {


        switch (DisplayMenu.DisplayMenu()) {
            case 1:
                List<WeatherData> weatherData = new WeatherCsv().getData();
                List<ScheduleData> scheduleData = new ScheduleCsv().getData();

                List<BatWeather> batWeather = new ArrayList<>();

                int index = 0;

                //Create the header for a table for displaying data
                String leftAlignFormat = "| %-10s | %-5s | %-13s | %-5s | %-5s |%n";

                System.out.format("+------------+-------+---------------+-------+-------+%n");
                System.out.format("| Date       | Time  | Opponent      | High  | Low   |%n");
                System.out.format("+------------+-------+---------------+-------+-------+%n");
                while (index < 26) {
                    String date = weatherData.get(index).getDate();
                    String time = scheduleData.get(index).getTime();
                    String opponent = scheduleData.get(index).getOpponent();
                    String high = weatherData.get(index).getHigh();
                    String low = weatherData.get(index).getLow();

                    //Add the data to the new object and format the data to display in a table
                    BatWeather fullData = new BatWeather(date, time, opponent, high, low);
                    batWeather.add(fullData);
                    System.out.format(leftAlignFormat, batWeather.get(index).getDate(), batWeather.get(index).getTime(), batWeather.get(index).getOpponent(), batWeather.get(index).getHigh(), batWeather.get(index).getLow());
                    index++;
                }
                System.out.format("+------------+-------+---------------+-------+-------+%n");

                try (CSVPrinter printer = new CSVPrinter(new FileWriter("Schedule-Weather.csv"), CSVFormat.EXCEL)) {
                    //Save the header of the new csv file as the first record
                    printer.printRecord("Date", "Time", "Opponent", "High", "Low");

                    //Use a for each loop to iterate through the array list and save each record to the new csv file
                    for (BatWeather record : batWeather) {
                        printer.printRecord(record.getDate(), record.getTime(), record.getOpponent(), record.getHigh(), record.getLow());
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            case 2:
                System.out.println("Exiting......");
                System.exit(0);
            default:
                System.exit(0);
        }




    }


}
