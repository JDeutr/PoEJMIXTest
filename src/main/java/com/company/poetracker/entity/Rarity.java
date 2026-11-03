package com.company.poetracker.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;

public enum Rarity implements EnumClass<String> {

    NORMAL("A"),
    MAGIC("B"),
    RARE("C"),
    UNIQUE("D"),
    CURRENCY("E");

    private final String id;

    Rarity(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Rarity fromId(String id) {
        for (Rarity at : Rarity.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}
