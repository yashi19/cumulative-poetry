package cumulative.poetry.main;

import cumulative.poetry.service.Poet;
import cumulative.poetry.common.AppConstants;
import cumulative.poetry.common.Parser;
import cumulative.poetry.models.ArgsDTO;
import cumulative.poetry.service.Poem;

public class Application {

    public static void main(String[] args) {

        if (args.length < AppConstants.MINIMUM_ARGUMENTS) {
            System.out.println(AppConstants.INVALID_ARGUMENT);
        } else {

            ArgsDTO argsDTO = Parser.parseArguments(args);
            Poem poem = new Poem(argsDTO);
            Poet poet = new Poet(poem);
            String poetryMessage = "";
            if (argsDTO.isReciteOptionSelected()){
                poetryMessage = poet.recite();
            }
            else if (argsDTO.isRevealOptionSelected()){
                poetryMessage = poem.revealPoetryDayWise(argsDTO.getDay());
            }
            System.out.println(poetryMessage);
        }
    }
}
