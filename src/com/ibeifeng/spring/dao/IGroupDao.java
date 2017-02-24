package com.ibeifeng.spring.dao;

import com.ibeifeng.spring.annotation.Log;
import com.ibeifeng.spring.model.Group;

/**
 * Created by zhm on 2017/2/16.
 */
public interface IGroupDao {
    @Log("执行了添加组操作")
    public void add(Group group) ;

    public Group load();
}
