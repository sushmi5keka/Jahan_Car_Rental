package com.israt.carrentalproject.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false)
    @NotEmpty(message = "Enter Role Name")
    @Size(min = 2,max = 20,message = "Rolename must be between 2 and 20 Characters")
    private String roleName;

    public Role() {
    }
    public Role(Long id) {
        this.id=id;
    }

    public Role(String roleName) {
        this.roleName = roleName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}


