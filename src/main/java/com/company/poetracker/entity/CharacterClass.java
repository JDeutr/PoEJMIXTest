package com.company.poetracker.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;

public enum CharacterClass implements EnumClass<String> {

    MARAUDER("A"),
    WITCH("B"),
    SCION("C"),
    SHADOW("D"),
    RANGER("E"),
    TEMPLAR("F"),
    DUELIST("G");

    private final String id;

    CharacterClass(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static CharacterClass fromId(String id) {
        for (CharacterClass at : CharacterClass.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}
