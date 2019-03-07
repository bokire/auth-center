package com.github.bokire.auth.common.mvc.criteria;

/**
 * @Author: sschen
 * @Description:
 * @Date: Created on 2017/11/23
 */
public class Sorter{
    private String field;
    private boolean asc;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public boolean isAsc() {
        return asc;
    }

    public void setAsc(boolean asc) {
        this.asc = asc;
    }
}