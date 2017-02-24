package com.ibeifeng.spring.action;

import com.ibeifeng.spring.model.Group;
import com.ibeifeng.spring.service.IGroupService;
import com.ibeifeng.spring.service.IUserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by zhm on 2017/2/16.
 */
@Controller
public class GroupAction {
    private IGroupService groupService;
    private Group group;


    public String save(Group group){
        groupService.save(group);
        return "success";
    }

    @Resource
    public void setGroupService(IGroupService groupService) {
        this.groupService = groupService;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

}
