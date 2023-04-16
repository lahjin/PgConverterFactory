package com.example.dbjsonconverter.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserInfo {
    private Long user;
    private String name;

    public UserInfo(Long user, String name) {
        this.user = user;
        this.name = name;
    }
}
