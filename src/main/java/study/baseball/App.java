package study.baseball;

import java.util.regex.Pattern;
import study.baseball.engine.Baseball;
import study.baseball.engine.InputValidator;

public class App {
    public static void main(String[] args) {
        Pattern regex = Pattern.compile("[0-9]{3}");
        InputValidator validator = new InputValidator(regex);
        Baseball baseball = new Baseball(validator);

        baseball.run();
    }
}