package com.tavisca.javatraining.hcm.model;

import java.time.Instant;

public class SkillMatrix {
    private int id;
    private Level proficiency;
    private Instant acquired;

    public SkillMatrix() {
    }

    public SkillMatrix(String skill, Level proficiency, Instant acquired) {
        this.proficiency = proficiency;
        this.acquired = acquired;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Level getProficiency() {
        return proficiency;
    }

    public void setProficiency(Level proficiency) {
        this.proficiency = proficiency;
    }

    public Instant getAcquired() {
        return acquired;
    }

    public void setAcquired(Instant acquired) {
        this.acquired = acquired;
    }
}
