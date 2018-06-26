package com.example.demo.service.impl;

import com.example.demo.dao.consigneeManageMapper;
import com.example.demo.entity.consigneeManage;
import com.example.demo.service.consigneeManageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("consigneeManageService")
public class consigneeManageServiceImpl implements consigneeManageService {
    @Resource
    private consigneeManageMapper consigneeManageDao;
    public consigneeManage getConsigneeManageById(int consigneeManageId) {
        return consigneeManageDao.selectByPrimaryKey(consigneeManageId);
    }
}
