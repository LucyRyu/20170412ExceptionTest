package majorleague.view;

import majorleague.model.Park;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by danawacomputer on 2017-04-13.
 */
public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        List<String> information = new ArrayList<>();
        Map<List<String>, Park> map = new HashMap<>();
        // list를 넣으려면 Map<List<String>, Object o>로 넣으면 되지만
        // all print됨.
        Park park = new Park();

        try {
            FileReader fr = new FileReader("src\\majorleague\\data\\Parks.csv");
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();

            while((line = br.readLine()) != null){
                String [] splitted = line.split(",");
                String id = splitted[0];
                list.add(splitted[0]);

                /*
                map.put(splitted[0], new Park(splitted[1],splitted[2],splitted[3],splitted[4],splitted[5]));
                */

                information.add(splitted[1]);
                information.add(splitted[2]);
                information.add(splitted[3]);
                information.add(splitted[4]);
                information.add(splitted[5]);

                for(String e:splitted) {
                    park.setParkName(information.get(0));
                    park.setParkAlias(information.get(1));
                    park.setCity(information.get(2));
                    park.setState(information.get(3));
                    park.setCountry(information.get(4));
                }

                map.put(list, park);
                //list에 all 출력됨 , 사용안하는게나음!!!!!!!!!!!!!!!!!!!

            }

            System.out.println(map);


        } catch (FileNotFoundException fne) {
            System.out.println("Failed to find file.");
        } catch (IOException ioe) {
            System.out.println("Failed to load file.");
        }

    }
}