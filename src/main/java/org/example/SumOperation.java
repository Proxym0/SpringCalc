package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SumOperation implements Operation{
    private double num1;
    private  double num2;
    private double result;
    @Override
    public Operation process() {
    this.result=num1+num2;
    return this;
    }

    @Override
    public double getResult() {
        return this.result;
    }

    public SumOperation(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}
