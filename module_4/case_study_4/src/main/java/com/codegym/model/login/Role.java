package com.codegym.model.login;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Role {
    @Id
    private Integer idRole;
    private String nameRole;
    @ManyToMany
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "username"))
    private Set<User> userSet;

    public Role() {
    }

    public Role(Integer idRole, String nameRole, Set<User> userSet) {
        this.idRole = idRole;
        this.nameRole = nameRole;
        this.userSet = userSet;
    }

    public Integer getIdRole() {
        return idRole;
    }

    public void setIdRole(Integer idRole) {
        this.idRole = idRole;
    }

    public String getNameRole() {
        return nameRole;
    }

    public void setNameRole(String nameRole) {
        this.nameRole = nameRole;
    }

    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
    }
}
