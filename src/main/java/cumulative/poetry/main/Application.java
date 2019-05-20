package cumulative.poetry.main;

import cumulative.poetry.Poet;
import cumulative.poetry.common.AppConstants;
import cumulative.poetry.models.Poem;

public class Application {

    public static void main(String[] args){

        if(args.length < AppConstants.MINIMUM_ARGUMENTS){
            System.out.println(AppConstants.INVALID_ARGUMENT);
        } else {
            // If echo option is present
            String actionOption = null;
            int day = 0;
            String poetryMessage = "";
            Poem poem = new Poem();
            Poet poet = new Poet(poem);

            if( args[0].equals(AppConstants.OPTION_ECHO) ){
                 actionOption = args[1];
                if(args.length <= AppConstants.MAXIMUM_ARGUMENTS && actionOption.equals(AppConstants.OPTION_REVEAL_FOR_DAY)) {
                    day = Integer.parseInt(args[2]);
                }

                if(actionOption.equals(AppConstants.OPTION_REVEAL_FOR_DAY)){
                    poetryMessage = poem.revealPoetryDayWiseWithEcho(day);
                } else if(actionOption.equals(AppConstants.OPTION_RECITE)){
                    poetryMessage = poet.reciteWithEcho();
                }

            } else {
                actionOption = args[0];
                if (args.length <= AppConstants.MAXIMUM_ARGUMENTS && actionOption.equals(AppConstants.OPTION_REVEAL_FOR_DAY)) {
                    day = Integer.parseInt(args[1]);
                }
                if(actionOption.equals(AppConstants.OPTION_REVEAL_FOR_DAY)){
                     poetryMessage = poem.revealPoetryDayWise(day);
                } else if(actionOption.equals(AppConstants.OPTION_RECITE)){
                     poetryMessage = poet.recite();
                }
            }
                System.out.println(poetryMessage);

            }
        }

    }
