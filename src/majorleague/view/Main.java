package majorleague.view;

import majorleague.control.ParkService;
import majorleague.model.Park;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Park> map = new HashMap<>();

        try {
            FileReader fr = new FileReader("src\\majorleague\\data\\Parks.csv");
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();

            while((line = br.readLine()) != null){
                String [] splitted = line.split(",");
                map.put(splitted[0], new Park(splitted[1],splitted[2],splitted[3],splitted[4],splitted[5]));
            }

        } catch (FileNotFoundException fne) {
            System.out.println("Failed to find file.");
        } catch (IOException ioe) {
            System.out.println("Failed to load file.");
        }

        //System.out.println(map);

        ParkService service = new ParkService();
        service.validateUserId(map, "BOS04");
        //service.validateUserPassword();

    }
}