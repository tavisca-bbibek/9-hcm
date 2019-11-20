package com.tavisca.javatraining.hcm.model;

import java.util.Objects;

public class Skill {
    private int id;
    private String name;
    private String description;
    private SkillMatrix skillMatrix;

    public Skill() {
    }

    public Skill(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skill skill = (Skill) o;
        return name.equals(skill.name) &&
                description.equals(skill.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }
}
