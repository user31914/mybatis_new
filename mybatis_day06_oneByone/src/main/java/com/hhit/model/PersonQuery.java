package com.hhit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class PersonQuery extends Person{
    private int did;
    private String dtype;

    @Override
    public String toString() {
        return "PersonQuery{" +
                "did=" + did +
                ", dtype='" + dtype + '\'' +
                '}'+super.toString();
    }
}
