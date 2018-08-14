package com.hik.demo.dao.mapper;

import com.hik.demo.dao.pojo.UserLogin;
import com.hik.demo.dao.pojo.UserLoginExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login
     *
     * @mbggenerated Fri Aug 10 00:58:49 CST 2018
     */
    int countByExample(UserLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login
     *
     * @mbggenerated Fri Aug 10 00:58:49 CST 2018
     */
    int deleteByExample(UserLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login
     *
     * @mbggenerated Fri Aug 10 00:58:49 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login
     *
     * @mbggenerated Fri Aug 10 00:58:49 CST 2018
     */
    int insert(UserLogin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login
     *
     * @mbggenerated Fri Aug 10 00:58:49 CST 2018
     */
    int insertSelective(UserLogin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login
     *
     * @mbggenerated Fri Aug 10 00:58:49 CST 2018
     */
    List<UserLogin> selectByExample(UserLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login
     *
     * @mbggenerated Fri Aug 10 00:58:49 CST 2018
     */
    UserLogin selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login
     *
     * @mbggenerated Fri Aug 10 00:58:49 CST 2018
     */
    int updateByExampleSelective(@Param("record") UserLogin record, @Param("example") UserLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login
     *
     * @mbggenerated Fri Aug 10 00:58:49 CST 2018
     */
    int updateByExample(@Param("record") UserLogin record, @Param("example") UserLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login
     *
     * @mbggenerated Fri Aug 10 00:58:49 CST 2018
     */
    int updateByPrimaryKeySelective(UserLogin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login
     *
     * @mbggenerated Fri Aug 10 00:58:49 CST 2018
     */
    int updateByPrimaryKey(UserLogin record);

    Map<String, Object> queryInfoByName(String userName);
}