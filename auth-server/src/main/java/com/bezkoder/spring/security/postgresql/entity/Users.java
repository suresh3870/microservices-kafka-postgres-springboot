package com.bezkoder.spring.security.postgresql.entity;

import com.bezkoder.spring.security.postgresql.Enum.Authority;
import com.sun.istack.NotNull;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;


@Table(name = "users", uniqueConstraints = {@UniqueConstraint(columnNames = {"username"})})
@Entity
public class Users {
    @Id
    @Column(length=50)
    private String username;

    @NotNull
    private String password;

    @NotNull
    boolean enabled;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Authority authority;


    public Users(String sk, String sk1, boolean enabled, GrantedAuthority authority) {
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

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Authority getAuthority() {
        return authority;
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
    }

    public Users(String username, String password, boolean enabled, Authority authority) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.authority = authority;
    }

    public Users() {
    }
}

