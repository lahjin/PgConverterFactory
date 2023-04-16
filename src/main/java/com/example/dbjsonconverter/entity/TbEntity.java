package com.example.dbjsonconverter.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class TbEntity {
    private Integer key;
    private UserInfo data;
    private List<String> list;
}
