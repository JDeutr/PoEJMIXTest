package com.company.poetracker.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

@JmixEntity
@Table(name = "POE_CHARACTER", indexes = {
        @Index(name = "IDX_POE_CHARACTER_LEAGUE", columnList = "LEAGUE_ID"),
        @Index(name = "IDX_POE_CHARACTER_USER", columnList = "USER_ID")
})
@Entity
public class PoeCharacter {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @JoinColumn(name = "USER_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private User user;

    @InstanceName
    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @Column(name = "CHARACTER_CLASS", nullable = false)
    @NotNull
    private String characterClass;

    @Column(name = "ASCENDANCY")
    private String ascendancy;

    @Min(1)
    @Max(100)
    @NotNull
    @Column(name = "LEVEL_", nullable = false)
    private Integer level;

    @JoinColumn(name = "LEAGUE_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private League league;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getAscendancy() {
        return ascendancy;
    }

    public void setAscendancy(String ascendancy) {
        this.ascendancy = ascendancy;
    }

    public CharacterClass getCharacterClass() {
        return characterClass == null ? null : CharacterClass.fromId(characterClass);
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass == null ? null : characterClass.getId();
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
