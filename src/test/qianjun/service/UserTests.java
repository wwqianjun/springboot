package qianjun.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import qianjun.Bootstrap;
import qianjun.persistence.domain.User;
import qianjun.persistence.mapper.UserMapper;

/**
 * Created by ZiJun
 * Description:
 * Date: 2017/5/4 :14:43.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Bootstrap.class) // 指定我们SpringBoot工程的Application启动类
@Transactional
public class UserTests {
  @Autowired
  private UserService userService;

  @Autowired
  private UserMapper userMapper;

  @Test
  @Rollback //我们单元测试为了保证每个测试之间的数据独立，会使用@Rollback注解让每个单元测试都能在结束时回滚
  public void findByName() throws Exception {
    userService.insert("AAA", 20);
    User u = userService.findByName("AAA");
    Assert.assertEquals(20, u.getAge().intValue());
  }

  @Test
  @Rollback
  public void insert() throws Exception {
    userMapper.insert("AAA", 20);
    User u = userMapper.findByName("AAA");
    Assert.assertEquals(20, u.getAge().intValue());
  }
}
