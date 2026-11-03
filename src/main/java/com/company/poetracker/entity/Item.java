package com.company.poetracker.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

@JmixEntity
@Table(name = "ITEM", indexes = {
        @Index(name = "IDX_ITEM_OWNER", columnList = "OWNER_ID")
})
@Entity
public class Item {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @InstanceName
    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @Column(name = "BASE_TYPE", nullable = false)
    @NotNull
    private String baseType;

    @Column(name = "RARITY", nullable = false)
    @NotNull
    private String rarity;

    @JoinColumn(name = "OWNER_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private PoeCharacter owner;

    public PoeCharacter getOwner() {
        return owner;
    }

    public void setOwner(PoeCharacter owner) {
        this.owner = owner;
    }

    public Rarity getRarity() {
        return rarity == null ? null : Rarity.fromId(rarity);
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity == null ? null : rarity.getId();
    }

    public String getBaseType() {
        return baseType;
    }

    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}
