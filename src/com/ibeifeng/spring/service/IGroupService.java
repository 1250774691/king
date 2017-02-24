package com.ibeifeng.spring.service;

import com.ibeifeng.spring.model.Group;

/**
 * Created by zhm on 2017/2/16.
 */
public interface IGroupService {
    public void save(Group group);
    public Group load();
}
