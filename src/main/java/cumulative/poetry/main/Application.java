package cumulative.poetry.main;

import cumulative.poetry.Poet;
import cumulative.poetry.common.AppConstants;
import cumulative.poetry.models.Poem;

public class Application {

    public static void main(String[] args){

        if(args.length < AppConstants.MINIMUM_ARGUMENTS){
            System.out.println(AppConstants.INVALID_ARGUMENT);
        } else {

            String option = args[0];
            int day = 0;

            if(args.length == AppConstants.MAXIMUM_ARGUMENTS && option.equals(AppConstants.OPTION_REVEAL_FOR_DAY)) {
                day = Integer.parseInt(args[1]);
            }
            String poetryMessage = "";
            Poem poem = new Poem();
            Poet poet = new Poet(poem);
            if(option.equals(AppConstants.OPTION_REVEAL_FOR_DAY)){
                 poetryMessage = poem.revealPoetryDayWise(day);
            } else if(option.equals(AppConstants.OPTION_RECITE)){
                 poetryMessage = poet.recite();
            }
            System.out.println(poetryMessage);
        }

    }
}
