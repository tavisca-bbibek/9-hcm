package com.tavisca.javatraining.hcm.model;

import java.util.List;
import java.util.Set;

public class User {
    private int id;
    private String name;
    private String department;
    private List<Role> roles;
    private Set<Skill> skills;

    public User() {
    }

    public User(String name, List<Role> roles, Set<Skill> skills) {
        this.name = name;
        this.roles = roles;
        this.skills = skills;
    }

    public User(String name, List<Role> roles, Set<Skill> skills, String department) {
        this(name, roles, skills);
        this.department = department;
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

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Set<Skill> skills) {
        this.skills = skills;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
