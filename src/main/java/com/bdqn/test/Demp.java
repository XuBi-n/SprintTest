package com.bdqn.test;

public class Demp {
    private  Person person;

    @Override
    public String toString() {
        return "Demp{" +
                "person=" + person +
                '}';
    }

    public Person getPerson2() {
        return person;
    }

    public void setPerson2(Person person) {
        this.person = person;
    }
}
