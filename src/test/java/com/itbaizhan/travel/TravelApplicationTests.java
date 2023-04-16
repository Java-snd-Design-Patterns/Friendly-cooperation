package com.itbaizhan.travel;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itbaizhan.travel.bean.RoleWithStatus;
import com.itbaizhan.travel.mapper.AdminMapper;
import com.itbaizhan.travel.mapper.RoleMapper;
import com.itbaizhan.travel.pojo.Admin;
import com.itbaizhan.travel.service.AdminService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TravelApplicationTests {
    @Autowired
    private AdminService adminService;
    @Autowired
    private AdminMapper adminMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Test
    void contextLoads() {
//        Page<Admin> page = adminService.findPage(1,5);
//        System.out.println(page);
//        Admin desc = adminMapper.findDesc(1);
//        System.out.println(desc);
        List<RoleWithStatus> role = adminService.findRole(1);
        System.out.println(role);
    }

}