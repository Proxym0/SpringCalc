package org.example;

import org.springframework.stereotype.Component;

@Component
public class ConsoleApplication implements Application {
    private final ConsoleReader consoleReader;
    private final ConsoleWriter consoleWriter;
    private final OperationService operationService;

    public ConsoleApplication(ConsoleReader consoleReader, ConsoleWriter consoleWriter, OperationService operationService) {
        this.consoleReader = consoleReader;
        this.consoleWriter = consoleWriter;
        this.operationService = operationService;
    }

    @Override
    public void run() {
        consoleWriter.write("enter num1");
        double num1 = consoleReader.readDouble();
        consoleWriter.write("enter num2");
        double num2 = consoleReader.readDouble();
        consoleWriter.write("enter type");
        String type = consoleReader.readString();
        switch (type) {
            case "sum":
                SumOperation sumOperation = new SumOperation(num1, num2);
                Operation result = operationService.calc(sumOperation);
                consoleWriter.write("Result: " + result.getResult());
                break;
            case "sub":
                SubOperation subOperation = new SubOperation(num1, num2);
                Operation result1 = operationService.calc(subOperation);
                consoleWriter.write("Result: " + result1.getResult());
                break;
        }

    }
}
