package com.atguigu.crowd.entity;

/**
 * @author JSQ
 * @ClassName Subject.java
 * @Description TODO
 * @createTime 2021年03月10日 15:52:00
 */
public class Subject {
    private String subjectName;
    private Integer subjectScore;

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                ", subjectScore=" + subjectScore +
                '}';
    }

    public Subject() {
    }

    public Subject(String subjectName, Integer subjectScore) {
        this.subjectName = subjectName;
        this.subjectScore = subjectScore;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Integer getSubjectScore() {
        return subjectScore;
    }

    public void setSubjectScore(Integer subjectScore) {
        this.subjectScore = subjectScore;
    }
}
