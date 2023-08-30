package com.fitness.app.model;

import javax.persistence.*;

@Entity
@Table(name = "userrole")
public class UserRole {
    @EmbeddedId
    private UserRolePK id;

    public UserRole() {
    }

    public UserRole(User user, Role role) {
        this.id = new UserRolePK(user, role);
    }

    public UserRolePK getId() {
        return id;
    }

    public void setId(UserRolePK id) {
        this.id = id;
    }
}
