package com.aerosales.aviaticketsspring.pojo;

import javax.persistence.*;

@Entity
@Table(name="users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="user_id")
    private Integer user_id;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;
    
    @Column(name="role")
    private String role;

    public Users() { }

    public Users(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public Integer getUsers_id() {
        return user_id;
    }

    public void setUsers_id(Integer users_id) {
        this.user_id = users_id;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
