package org.example;

import org.springframework.stereotype.Component;

import java.util.Optional;
@Component
public class OperationService {
    private final OperationStorage operationStorage;

    public OperationService(OperationStorage operationStorage) {
        this.operationStorage = operationStorage;
    }

    public Operation calc(Operation operation) {
        Operation process = operation.process();
        operationStorage.save(process);
        return operation;

    }
}
