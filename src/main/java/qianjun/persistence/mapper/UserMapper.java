package qianjun.persistence.mapper;

import org.apache.ibatis.annotations.*;

import java.util.List;

import qianjun.persistence.domain.User;


/**
 * Created by ZiJun
 * Description:
 * Date: 2017/5/4 :14:19.
 */
@Mapper
public interface UserMapper {

  @Select("SELECT * FROM USER WHERE NAME = #{name}")
  User findByName(@Param("name") String name);

  @Select("SELECT * FROM USER ")
  List<User> findAll();

  @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
  int insert(@Param("name") String name, @Param("age") Integer age);
}
