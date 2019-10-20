package com.learn.springrecipes.sequence.domain;

public class Sequence {

    private String prefix;
    private String suffix;
    private int id;

    
    public Sequence(int sequenceId, String prefix, String suffix) {

        this.id = sequenceId;
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
