package com.linge.mapper;

import com.linge.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> selectAll() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectAll();
    }
}
