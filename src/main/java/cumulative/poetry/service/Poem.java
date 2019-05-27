package cumulative.poetry.service;

import cumulative.poetry.common.AppConstants;
import cumulative.poetry.models.ArgsDTO;

import java.util.ArrayList;
import java.util.List;

public class Poem implements IPoem{

    private List<String> poetries;
    private ArgsDTO argsDTO;

    public Poem(ArgsDTO argsDTO){
        this.argsDTO = argsDTO;
        this.poetries = new ArrayList<>();
        this.poetries.add(AppConstants.DAY1_POETRY);
        this.poetries.add(AppConstants.DAY2_POETRY);
        this.poetries.add(AppConstants.DAY3_POETRY);
        this.poetries.add(AppConstants.DAY4_POETRY);
        this.poetries.add(AppConstants.DAY5_POETRY);
        this.poetries.add(AppConstants.DAY6_POETRY);
        this.poetries.add(AppConstants.DAY7_POETRY);
        this.poetries.add(AppConstants.DAY8_POETRY);
        this.poetries.add(AppConstants.DAY9_POETRY);
        this.poetries.add(AppConstants.DAY10_POETRY);
        this.poetries.add(AppConstants.DAY11_POETRY);
        this.poetries.add(AppConstants.DAY12_POETRY);
    }

    public List<String> getPoetries(){
        return poetries;
    }

    public ArgsDTO getArgsDTO(){
        return this.argsDTO;
    }

    public  String revealPoetryDayWise(int day){
        StringBuilder poetryMessage= new StringBuilder();
        if( day < AppConstants.MINIMUM_DAY ){
            return  AppConstants.INVALID_DAY_ARGUMENT;
        }
        poetryMessage.append(AppConstants.THIS_IS_STRING);
        for(int i = day-1 ; i >= 0 ; i--){
            echoPoetry(poetryMessage, i);
            if(argsDTO.isEchoSelected()){
                echoPoetry(poetryMessage, i);
            }
        }
        return poetryMessage.toString();
    }

    private void echoPoetry(StringBuilder poetryMessage, int i) {
        poetryMessage.append(this.poetries.get(i) + '\n');
    }

}
