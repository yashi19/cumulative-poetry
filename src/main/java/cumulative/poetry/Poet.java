/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package cumulative.poetry;

import cumulative.poetry.common.AppConstants;
import cumulative.poetry.common.PoetUtils;
import cumulative.poetry.models.Poetry;

import java.util.ArrayList;
import java.util.List;


public class Poet {

    private List<Poetry> poetries;

    public Poet(){
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


    public String recite() {
        StringBuilder poetryMessage = new StringBuilder();
        for(int day = 1; day <= poetries.size(); day++){
                poetryMessage.append("Day "+day+ " - \n");
                poetryMessage.append(PoetUtils.revealPoetryDayWise(poetries,day));
                poetryMessage.append('\n');
        }
        return poetryMessage.toString();
    }

}
