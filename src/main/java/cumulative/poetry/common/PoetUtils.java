package cumulative.poetry.common;

import java.util.List;

public class PoetUtils {

    public static StringBuilder echoPoetry(List<String> poetries, int i) {
        StringBuilder poetryMessage = new StringBuilder();
        poetryMessage.append(poetries.get(i) + '\n');
        return poetryMessage;
    }
}
