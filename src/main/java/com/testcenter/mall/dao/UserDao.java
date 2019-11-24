package com.testcenter.mall.dao;

import com.testcenter.mall.model.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<UserDO, Long> {
}
