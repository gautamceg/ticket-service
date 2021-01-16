package com.gautam.codechallenge.model;

public enum GENDER {
    MALE("Male"),
    FEMALE("Female"),
    OTHERS("Others");
    private String value;
    GENDER(String value) {
        this.value = value;
    }
}
