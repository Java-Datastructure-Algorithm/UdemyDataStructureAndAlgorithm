package com.nar.stack.dijkstraInterpreter;

import java.util.Stack;

public class Algorithm {
    private Stack<String> operationStack;
    private Stack<Double> valueStack;

    public Algorithm() {
        this.operationStack = new Stack<>();
        this.valueStack = new Stack<>();
    }

    public void interpretExpression(String expression){
        String[] exprArr = expression.split(" ");

        for(String s : exprArr){
            if("(".equals(s)){
                //do nothig
            } else if ("+".equals(s) || "*".equals(s)) {
                operationStack.push(s);
            }else if (")".equals(s)) {
                String operation = operationStack.pop();
                if ("+".equals(operation)){
                    valueStack.push(valueStack.pop() + valueStack.pop());
                }else if("*".equals(operation)) {
                    valueStack.push(valueStack.pop() * valueStack.pop());
                }
            }else {
                valueStack.push(Double.parseDouble(s));
            }
        }
    }

    public void result(){
        System.out.println(this.valueStack.pop());
    }
}
