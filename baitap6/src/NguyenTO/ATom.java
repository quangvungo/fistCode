package NguyenTO;

import java.util.Scanner;

public class ATom {
    protected int number;
    protected String symbol;
    protected String name;
    protected float weight;

    public ATom(int number, String symbol, String name, float weight) {
        this.number = number;
        this.symbol = symbol;
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }



    @Override
    public String toString() {
        return "aTom{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", symbol='" + symbol + '\'' +
                ", weight=" + weight +
                '}';
    }
}


