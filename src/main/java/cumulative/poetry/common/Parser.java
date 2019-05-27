package cumulative.poetry.common;

import cumulative.poetry.models.ArgsDTO;

public class Parser {

    public static ArgsDTO parseArguments(String[] args){

        ArgsDTO argsDTO = new ArgsDTO();
        String actionOption = null;

        if( args[0].equals(AppConstants.OPTION_ECHO) ){
            actionOption = args[1];
            if(args.length <= AppConstants.MAXIMUM_ARGUMENTS && actionOption.equals(AppConstants.OPTION_REVEAL_FOR_DAY)) {
                argsDTO.setDay(Integer.parseInt(args[2]));
            }
           argsDTO.setEchoSelected(true);
        } else {
            actionOption = args[0];
            if (args.length <= AppConstants.MAXIMUM_ARGUMENTS && actionOption.equals(AppConstants.OPTION_REVEAL_FOR_DAY)) {
                argsDTO.setDay(Integer.parseInt(args[1]));
            }
        }

        if(actionOption.equals(AppConstants.OPTION_REVEAL_FOR_DAY)){
           argsDTO.setRevealOptionSelected(true);
        } else if(actionOption.equals(AppConstants.OPTION_RECITE)){
            argsDTO.setReciteOptionSelected(true);
        }

        return argsDTO;
    }
}
