package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Component
public class OperationStorage {
    private final List<Operation> array=new ArrayList<>();
    public void save(Operation operation){
        array.add(operation);
    }
    public List<Operation> getAll(){
        return new ArrayList<>(this.array);

    }
}
