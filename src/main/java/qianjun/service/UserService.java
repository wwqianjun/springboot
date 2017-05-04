package qianjun.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import qianjun.persistence.domain.User;
import qianjun.persistence.mapper.UserMapper;

/**
 * Created by ZiJun
 * Description:
 * Date: 2017/5/4 :14:32.
 */
@Service
public class UserService {

  @Autowired
  private UserMapper userMapper;

//  @Transactional
  public List<User> findAll(){
    return  userMapper.findAll();
  }

  @Transactional
  public int insert(String name, int age) {
    return userMapper.insert(name, age);
  }

  public User findByName(String name) {
    return userMapper.findByName(name);
  }
}
