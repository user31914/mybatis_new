package com.hhit.model;

public class DriverQuery extends Driver{
    private Person person;

    @Override
    public String toString() {
        return "DriverQuery{" +
                "person=" + person +
                '}'+super.toString();
    }
}
