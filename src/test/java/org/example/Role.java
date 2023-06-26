package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Role {
    @Id
    private int id;

    private String role_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }


    @Override
    public String toString() {
        return "Role{" +
                "role_id=" + id +
                ", role_name='" + role_name + '\'' +
                '}';
    }
}
