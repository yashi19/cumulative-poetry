package cumulative.poetry.service;

import cumulative.poetry.common.AppConstants;

import java.util.ArrayList;
import java.util.List;

public class Poem {

    private List<String> poetries;

    public Poem(){
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

    public List<String> getPoetries() {
        return poetries;
    }
}
