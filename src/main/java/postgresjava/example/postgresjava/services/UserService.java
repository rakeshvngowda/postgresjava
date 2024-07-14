package postgresjava.example.postgresjava.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;


import postgresjava.example.postgresjava.models.User;

@Service
public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<User> getAllUsers() {
        String sql = "SELECT * from get_users";
        return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(User.class));
    }
}
