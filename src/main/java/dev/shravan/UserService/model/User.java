package dev.shravan.UserService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Entity(name = "ECOM_USER")
@Setter
@Getter
public class User extends BaseModel {
    private String email;
    private String password;
    @ManyToMany
    private Set<Role> roles = new HashSet<>();
}
