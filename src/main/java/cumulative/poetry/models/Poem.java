package cumulative.poetry.models;

import cumulative.poetry.common.AppConstants;

import java.util.ArrayList;
import java.util.List;

public class Poem {

    private List<Poetry> poetries;

    public Poem(){
        this.poetries = new ArrayList<>();
        this.poetries.add(new Poetry(1, AppConstants.DAY1_POETRY));
        this.poetries.add(new Poetry(2, AppConstants.DAY2_POETRY));
        this.poetries.add(new Poetry(3, AppConstants.DAY3_POETRY));
        this.poetries.add(new Poetry(4, AppConstants.DAY4_POETRY));
        this.poetries.add(new Poetry(5, AppConstants.DAY5_POETRY));
        this.poetries.add(new Poetry(6, AppConstants.DAY6_POETRY));
        this.poetries.add(new Poetry(7, AppConstants.DAY7_POETRY));
        this.poetries.add(new Poetry(8, AppConstants.DAY8_POETRY));
        this.poetries.add(new Poetry(9, AppConstants.DAY9_POETRY));
        this.poetries.add(new Poetry(10, AppConstants.DAY10_POETRY));
        this.poetries.add(new Poetry(11, AppConstants.DAY11_POETRY));
        this.poetries.add(new Poetry(12, AppConstants.DAY12_POETRY));
    }

    public List<Poetry> getPoetries(){
        return poetries;
    }

    public  String revealPoetryDayWise(int day){
        StringBuilder poetryMessage= new StringBuilder();
        if( day < AppConstants.MINIMUM_DAY ){
            return  AppConstants.INVALID_DAY_ARGUMENT;
        }
        poetryMessage.append(AppConstants.THIS_IS_STRING);
        for(int i = day-1 ; i >= 0 ; i--){
            poetryMessage.append(this.poetries.get(i).getPoetryMessage());
            poetryMessage.append('\n');
        }
        return poetryMessage.toString();
    }

}
