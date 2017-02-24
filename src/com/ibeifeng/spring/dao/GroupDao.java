package com.ibeifeng.spring.dao;

import com.ibeifeng.spring.model.Group;
import org.springframework.stereotype.Repository;

/**
 * Created by zhm on 2017/2/16.
 */
@Repository("groupDao")
public class GroupDao implements IGroupDao {
    @Override
    public void add(Group group) {
        System.out.println("添加了:"+group);
    }

    @Override
    public Group load() {
        System.out.println("查找到了Group");
        return null;
    }
}
