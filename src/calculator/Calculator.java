package calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Calculator {

  private boolean exited;
  private String input;
  private final State calculatorState;
  private HashMap<String, Operator> operators;

  public Calculator() {
    exited = false;
    calculatorState = new State();
    operators = new HashMap<String, Operator>();
    
    operators.put("+", new OperatorAdd(calculatorState));
    operators.put("-", new OperatorSub(calculatorState));
    operators.put("*", new OperatorMult(calculatorState));
    operators.put("/", new OperatorDiv(calculatorState));
    operators.put("sqrt", new OperatorSqrt(calculatorState));
    operators.put("x^2", new OperatorPow(calculatorState));
    operators.put("1/x", new OperatorInvert(calculatorState));
    operators.put("+/-", new OperatorSignInv(calculatorState));
    operators.put("C", new OperatorC(calculatorState));
  }

  public static boolean isNumber(String val) {
    if (val == null || val.isEmpty()) {
      return false;
      }
    try {
      Double.parseDouble(val);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

  /*
   *
   */
  public void run() {
    System.out.println("java Calculator");
    try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
      while (!exited) {
        System.out.print("> ");
        input = in.readLine();

        if (input.equals("exit")) {
          exited = true;
          continue;
        } else if (isNumber(input)) {
          new OperatorNumber(calculatorState, Double.parseDouble(input)).execute();
          new OperatorEnter(calculatorState).execute();
        } else {
          Operator op = operators.get(input);
          if (op != null) {
            // Pop dernier élément de la stack, car les opérateurs utilisent la valeur courante et non le haut de la pile
            if (calculatorState.stack.pop() != null) {
              op.execute();
              if (!input.equals("C")) {
                new OperatorEnter(calculatorState).execute();
              }
            }
          } else {
            System.out.println("Invalid");
          }
        }

        // Affiche la Stack
        String stackDisplay = "";

        if (calculatorState.stack.empty()) {
          stackDisplay = "<empty>";
        } else {
          for (String s : calculatorState.stack.getStackString()) {
            stackDisplay = stackDisplay.concat(s + " ");
          }
          stackDisplay = stackDisplay.trim();
        }

        System.out.println(stackDisplay);

      }

    } catch (Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}
