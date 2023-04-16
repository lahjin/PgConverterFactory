package com.example.dbjsonconverter.controller;

import com.example.dbjsonconverter.entity.TbEntity;
import com.example.dbjsonconverter.repository.TbDao;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final TbDao tbDao;

    @GetMapping("/finda")
    public List<TbEntity> findAll() {
        return tbDao.findAll();
    }

    @GetMapping("/find")
    public List<TbEntity> find() {
        return tbDao.find();
    }
}
