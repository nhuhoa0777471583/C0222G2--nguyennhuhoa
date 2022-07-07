package com.codegym.model.login;


import javax.persistence.*;
import java.util.Set;

@Entity
public class User {
    @Id
    private String username;
    private String password;
    @ManyToMany(mappedBy = "userSet")

    private Set<Role> roleSet;

    public User() {
    }

    public User(String username, String password, Set<Role> roleSet) {
        this.username = username;
        this.password = password;
        this.roleSet = roleSet;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoleSet() {
        return roleSet;
    }

    public void setRoleSet(Set<Role> roleSet) {
        this.roleSet = roleSet;
    }
}
