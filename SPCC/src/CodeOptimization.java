import java.util.*;

public class CodeOptimization {

    // Helper function to check if two expressions are equivalent
    private static boolean equivalentExpressions(String expr1, String expr2) {
        return expr1.equals(expr2);
    }

    // Common subexpression elimination
    private static List<String> eliminateCommonSubexpressions(List<String> expressions) {
        Map<String, String> expressionMap = new HashMap<>();
        List<String> optimizedExpressions = new ArrayList<>();

        for (String expression : expressions) {
            String[] parts = expression.split("=");
            String lhs = parts[0].trim();
            String rhs = parts[1].trim();

            // Check if the expression has already been encountered
            if (expressionMap.containsValue(rhs)) {
                for (Map.Entry<String, String> entry : expressionMap.entrySet()) {
                    if (entry.getValue().equals(rhs)) {
                        String replacedExpr = entry.getKey();
                        expression = expression.replace(rhs, replacedExpr);
                        break;
                    }
                }
            } else {
                // Add the expression to the map
                expressionMap.put(lhs, rhs);
            }
            optimizedExpressions.add(expression);
        }

        return optimizedExpressions;
    }

    // Algebraic simplification
    private static String simplifyExpression(String expression) {
        // Algebraic simplification rules can be applied here
        // For simplicity, let's assume no simplification is done
        return expression;
    }

    public static void main(String[] args) {
        // Sample list of expressions
        List<String> expressions = new ArrayList<>();
        expressions.add("x = a + b * c");
        expressions.add("y = a + b * c");
        expressions.add("z = x * 2");
        expressions.add("w = x + y");

        // Apply common subexpression elimination
        List<String> optimizedExpressions = eliminateCommonSubexpressions(expressions);
        System.out.println("After Common Subexpression Elimination:");
        for (String expr : optimizedExpressions) {
            System.out.println(expr);
        }

        // Apply algebraic simplification
        System.out.println("\nAfter Algebraic Simplification:");
        for (String expr : optimizedExpressions) {
            String simplifiedExpr = simplifyExpression(expr);
            System.out.println(simplifiedExpr);
        }
    }
}
