package Labs12_5_2;


import java.util.ArrayList;
import java.util.List;

public class Stack implements LIFO {
    private List<Integer> elements;

    public Stack(){
        this.elements = new ArrayList<>();
    }

    @Override
    public void push(Integer value){
        elements.add(value);
    }

    @Override
    public Integer pop(){
        if (elements.isEmpty()){
            throw new IllegalArgumentException();
        }
        return elements.remove(elements.size()-1);
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}