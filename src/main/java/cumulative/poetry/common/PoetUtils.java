package cumulative.poetry.common;

import cumulative.poetry.models.Poetry;

import java.util.List;

public class PoetUtils {

    public static String revealPoetryDayWise(List<Poetry> poetries, int day){
        StringBuilder poetryMessage= new StringBuilder();
        if( day < AppConstants.MINIMUM_DAY ){
            return  AppConstants.INVALID_DAY_ARGUMENT;
        }
        poetryMessage.append(AppConstants.THIS_IS_STRING);
        for(int i = day-1 ; i >= 0 ; i--){
            poetryMessage.append(poetries.get(i).getPoetryMessage());
            poetryMessage.append('\n');
        }
        return poetryMessage.toString();
    }
}
