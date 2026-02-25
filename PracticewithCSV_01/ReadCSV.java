package PracticewithCSV_01; 

import java.io.File;
import java.util.Scanner;

public class ReadCSV { 
    public static void main(String[] args) throws Exception {
        
        File file = new File("PracticewithCSV_01/data.csv");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }

}
