package org.example;

import java.util.Set;

public class User {
    private boolean active;
    private String name;
    private Set<String> roles;

    public User(boolean active, String name, Set<String> roles) {
        this.active = active;
        this.name = name;
        this.roles = roles;
    }

    public boolean isActive() {
        return active;
    }

    public String getName() {
        return name;
    }

    public Set<String> getRoles() {
        return roles;
    }
}
