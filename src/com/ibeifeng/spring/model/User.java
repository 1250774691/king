package com.ibeifeng.spring.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by zhm on 2017/2/16.
 */
public class User {
    private String[] names;
    private List<Group> groupList;
    private Set<Group> groupSet;
    private Map<String,Group> groupMap;

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }

    public Set<Group> getGroupSet() {
        return groupSet;
    }

    public void setGroupSet(Set<Group> groupSet) {
        this.groupSet = groupSet;
    }

    public Map<String, Group> getGroupMap() {
        return groupMap;
    }

    public void setGroupMap(Map<String, Group> groupMap) {
        this.groupMap = groupMap;
    }
}
