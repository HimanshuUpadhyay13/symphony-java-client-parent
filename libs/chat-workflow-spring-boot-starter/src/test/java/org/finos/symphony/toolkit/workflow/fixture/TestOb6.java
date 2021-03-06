package org.finos.symphony.toolkit.workflow.fixture;

import org.finos.symphony.toolkit.workflow.java.Work;

import java.util.ArrayList;
import java.util.List;

@Work(name = "Test Object 6", instructions = "Test Object 6 instructions")
public class TestOb6 {

    private List<String> names = new ArrayList<>();
    private List<Integer> integerList = new ArrayList<>();
    private List<Number> numberList = new ArrayList<>();

    public TestOb6() {
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public void setIntegerList(List<Integer> integerList) {
        this.integerList = integerList;
    }

    public List<Number> getNumberList() {
        return numberList;
    }

    public void setNumberList(List<Number> numberList) {
        this.numberList = numberList;
    }
}

