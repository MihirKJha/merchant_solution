package com.db.merchant_solution.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Enums to map integer signal to enum constants
 */
public enum Numbers {
    CANCEL(0),
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4);


    //reverse look up map to get literal from int signal
    private static final Map<Integer, Numbers> lookupMap = new HashMap<>();

    static {
        for(Numbers s : Numbers.values() ){
            lookupMap.put(s.getValue(),s);
        }
    }

    private final int value;

    Numbers(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Numbers get(int value){
        return lookupMap.get(value);
    }
}
