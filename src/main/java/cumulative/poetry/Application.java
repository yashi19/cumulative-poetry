package cumulative.poetry;

public class Application {

    public static void main(String[] args){

        if(args.length < 1){
            System.out.println(AppConstants.INVALID_ARGUMENT);
        } else {

            String option = args[0];
            int value = 0;

            if(args.length == 2 && option.equals(AppConstants.OPTION_REVEAL_FOR_DAY)) {
                value = Integer.parseInt(args[1]);
            }
            String poetryMessage = "";
            Poet poet = new Poet();
            if(option.equals(AppConstants.OPTION_REVEAL_FOR_DAY)){
                 poetryMessage = poet.revealPoetryDayWise(value);
            } else if(option.equals(AppConstants.OPTION_RECITE)){
                 poetryMessage = poet.recite();
            }
            System.out.println(poetryMessage);
        }

    }
}
