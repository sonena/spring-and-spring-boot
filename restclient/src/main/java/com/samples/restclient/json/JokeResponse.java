package com.samples.restclient.json;

public class JokeResponse {

    private String type;
    private Value value;

    public JokeResponse() {
    }

    public JokeResponse(String type, Value value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}