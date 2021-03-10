package com.atguigu.crowd.service.api;

import com.atguigu.crowd.entity.Admin;

import java.util.List;

/**
 * @author JSQ
 * @ClassName AdminService.java
 * @Description TODO
 * @createTime 2021年03月09日 15:34:00
 */
public interface AdminService {
    void saveAdmin(Admin admin);

    List<Admin> getAlll();
}
