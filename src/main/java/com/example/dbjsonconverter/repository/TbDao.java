package com.example.dbjsonconverter.repository;

import com.example.dbjsonconverter.entity.TbEntity;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TbDao {
    private final JdbcTemplate jdbcTemplate;
    private final RowMapper<TbEntity> mapper;

    public TbDao(final JdbcTemplate jdbcTemplate, final DefaultConversionService conversion) {
        this.jdbcTemplate = jdbcTemplate;
        this.mapper = BeanPropertyRowMapper.newInstance(TbEntity.class, conversion);
    }

    public List<TbEntity> findAll() {
        return jdbcTemplate.query("select * from tb_user", mapper);
    }

    public List<TbEntity> find() {
        return jdbcTemplate.query("select * from tb_user", mapper);
    }
}
