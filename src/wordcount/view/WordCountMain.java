package wordcount.view;

import wordcount.service.WordCountServiceImpl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WordCountMain {

    public static void main(String[] args) {

        //리스트생성
        List list = new ArrayList<>();

        try {
            //파일입출력
            FileReader fr = new FileReader("src\\closer.txt");
            BufferedReader br = new BufferedReader(fr);

            //br.readLine();
            String line = "";

            //토큰 변수
            //StringTokenizer tokenizer = null;


            while ((line = br.readLine()) != null) {
                String [] splitted = line.split(" ");
                //tokenizer = new StringTokenizer(line, " ");
                for(String e:splitted){
                    //System.out.println(e);
                    list.add(e);
                }


                //cnt += tokenizer.countTokens();
            }
            WordCountServiceImpl service = new WordCountServiceImpl();
            System.out.println(service.getWordCount(list));

            br.close();
            fr.close();

        } catch (FileNotFoundException fne) {
            System.out.println("Failed to find file.");
        } catch (IOException ioe) {
            System.out.println("Failed to load file.");
        }
    }
}
