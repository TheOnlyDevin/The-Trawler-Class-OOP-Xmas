package ie.atu.Xmas22;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;


public class TrawlerMain{
        public static void main (String[] args) {

    String info ="";
    String splitBy = ",";
        try {
            BufferedReader br = new BufferedReader(new FileReader("Trawler.csv"));
            while ((info = br.readLine()) != null) {
                String[] details = info.split(splitBy);
                System.out.println("Trawler Name:" + details[0] + ", Transponder ID" + details[1] + ",Trawler Type:" + details[3]);
            }
        }
         catch (IOException e) {
            e.printStackTrace();
        }

        }

    }

