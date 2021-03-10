package com.atguigu.crowd.entity;

import java.util.List;

/**
 * @author JSQ
 * @ClassName ParamData.java
 * @Description TODO
 * @createTime 2021年03月10日 12:39:00
 */
public class ParamData {
    private List<Integer> array;

    public ParamData() {

    }

    public ParamData(List<Integer> array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "ParamData{" +
                "array=" + array +
                '}';
    }

    public List<Integer> getArray() {
        return array;
    }

    public void setArray(List<Integer> array) {
        this.array = array;
    }
}
