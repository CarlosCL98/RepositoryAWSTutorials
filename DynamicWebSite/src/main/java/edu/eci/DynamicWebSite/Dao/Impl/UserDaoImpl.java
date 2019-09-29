package edu.eci.DynamicWebSite.Dao.Impl;

import edu.eci.DynamicWebSite.Dao.UserDao;
import edu.eci.DynamicWebSite.Model.User;
/*import edu.eci.DynamicWebSite.Model.UserRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;*/
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDaoImpl implements UserDao {

    //private NamedParameterJdbcTemplate template;

    /*public UserDaoImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }*/

    @Override
    public List<User> getAllUsers() {
        /*
        return template.query("select id, name, email, pwd from \"user\"", new UserRowMapper());
        */
        return null;
    }

    @Override
    public void saveUser(User user) {
        /*final String sql = "insert into \"user\" (id, name, email, pwd) values(:id,:name,:email,:pwd);";
        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("id", user.getId())
                .addValue("name", user.getName())
                .addValue("email", user.getEmail())
                .addValue("pwd", user.getPwd());
        template.update(sql,param, holder);*/
    }
}
