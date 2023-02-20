package org.launchcode.techjobs.oo;

import java.util.Objects;
public abstract class JobField {

    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    public int hashCode() {
        return Objects.hash(getId());
    }

    public String toString() {
        return value;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobField)) {
            return false;
        }
        JobField jobField = (JobField) o;
        return id == jobField.id;
    }


}
