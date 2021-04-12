package com.calculator.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Calculator {

    private String operation;
    private String expression;
    private String error;
    private String result;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

   @Override
    public String toString() {
        return "Calculate{" +
                "operation=" + operation +
                "expression=" + expression +
                "result=" + result +
                '}';
    }
}
