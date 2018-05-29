package com.hellokoding.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

/**
 * Created by VBelov on 29.05.2018.
 */
@Repository
public class TestRepository {


    @Autowired
    JdbcTemplate jdbcTemplate;


    private class TestRowMapper implements RowMapper<Test> {
        @Override
        public Test mapRow(ResultSet rs, int rowNum) throws SQLException {
            Test student = new Test();
            student.setId(rs.getLong("id"));
            student.setName(rs.getString("name"));
            return student;
        }
    }

    public List<Test> getAll() {
        return jdbcTemplate.query("select * from test", new TestRowMapper());
    }

    public int deleteById(long id) {
        return jdbcTemplate.update("delete from test where id=?", id);
    }
    public int insert(Test test) {
        return jdbcTemplate.update("insert into test (id, name) " + "values(?,  ?)",
                test.getId(), test.getName());
    }
    public int update(Test test) {
        return jdbcTemplate.update("update test set name = ? where id = ?",
                test.getName(), test.getId());
    }
}