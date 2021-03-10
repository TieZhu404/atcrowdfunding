package com.atguigu.crowd.service.impl;

import com.atguigu.crowd.entity.Admin;
import com.atguigu.crowd.entity.AdminExample;
import com.atguigu.crowd.mapper.AdminMapper;
import com.atguigu.crowd.service.api.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author JSQ
 * @ClassName AdminServiceImpl.java
 * @Description TODO
 * @createTime 2021年03月09日 15:33:00
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public void saveAdmin(Admin admin) {
        adminMapper.insert(admin);

        throw new RuntimeException();
    }

    @Override
    public List<Admin> getAlll() {
        return adminMapper.selectByExample(new AdminExample());
    }
}
