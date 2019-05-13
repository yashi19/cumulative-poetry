package cumulative.poetry;

import java.util.HashMap;
import java.util.Map;

public class InputHandler {

    private Map<Integer,Poetry> mapOfPoetries;

    InputHandler(){
        mapOfPoetries= new HashMap<>();
    }

    public  Map<Integer,Poetry> getPoetries(){

        this.mapOfPoetries.put(1,new Poetry(1,AppConstants.DAY1_POETRY));
        this.mapOfPoetries.put(2,new Poetry(2,AppConstants.DAY2_POETRY));
        this.mapOfPoetries.put(3,new Poetry(3,AppConstants.DAY3_POETRY));
        this.mapOfPoetries.put(4,new Poetry(4,AppConstants.DAY4_POETRY));
        this.mapOfPoetries.put(5,new Poetry(5,AppConstants.DAY5_POETRY));
        this.mapOfPoetries.put(6,new Poetry(6,AppConstants.DAY6_POETRY));
        this.mapOfPoetries.put(7,new Poetry(7,AppConstants.DAY7_POETRY));
        this.mapOfPoetries.put(8,new Poetry(8,AppConstants.DAY8_POETRY));
        this.mapOfPoetries.put(9,new Poetry(9,AppConstants.DAY9_POETRY));
        this.mapOfPoetries.put(10,new Poetry(10,AppConstants.DAY10_POETRY));
        this.mapOfPoetries.put(11,new Poetry(11,AppConstants.DAY11_POETRY));
        this.mapOfPoetries.put(12,new Poetry(12,AppConstants.DAY12_POETRY));

        return this.mapOfPoetries;

    }
}
