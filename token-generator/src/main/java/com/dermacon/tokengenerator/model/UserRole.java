package com.dermacon.tokengenerator.model;

public enum UserRole {

    ROLE_USER("user"), ROLE_ADMIN("admin");

    private final String roleName;

    UserRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

}
