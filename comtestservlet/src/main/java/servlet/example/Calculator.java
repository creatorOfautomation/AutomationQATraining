package servlet.example;

import java.util.Arrays;

public class Calculator {

    private static int result;

    public static int evaluate(String expression) throws Exception {
        String[] add;
        int elOfExpression[];

        try {
            if (expression.contains("+")) {
                elOfExpression = Arrays.stream(expression.split("[+-/*]+")).mapToInt(Integer::parseInt).toArray();
                for (int i : elOfExpression) {
                    result += + i;
                }
                return result;
            } else if (expression.contains("-")) {
                add = expression.split("-");
                return result = Integer.parseInt(add[0]) - Integer.parseInt(add[1]);
            } else if (expression.contains("*")) {
                add = expression.split("\\*");
                return result = Integer.parseInt(add[0]) * Integer.parseInt(add[1]);
            } else if (expression.contains("/")) {
                add = expression.split("/");
                return result = Integer.parseInt(add[0]) / Integer.parseInt(add[1]);
            } else {
                return 0;
            }
        } catch (NumberFormatException e) {
            throw new Exception("Да что ты твортшь. Остепенись, пожалуйста. Ты делаешь мне больно...");
        }
    }
}
