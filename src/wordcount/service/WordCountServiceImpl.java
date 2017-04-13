package wordcount.service;

import java.util.List;

public class WordCountServiceImpl implements IWordCountService{

    @Override
    public int getWordCount(List<String> list){

        int wordCount = 0;

        for(String e:list){
            if(!e.isEmpty()){
                wordCount++;
            }
        }

        return wordCount;
    }
}
