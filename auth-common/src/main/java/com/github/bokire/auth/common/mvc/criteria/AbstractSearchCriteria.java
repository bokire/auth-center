package com.github.bokire.auth.common.mvc.criteria;

import org.hibernate.validator.constraints.Range;

import com.github.bokire.auth.common.annotation.validate.SearchGroup;

/**
 * 
 * @author bokire
 *
 */
public abstract class AbstractSearchCriteria implements SearchCriteria {

    @Range(min = 1, message = "页码必须大于0", groups = { SearchGroup.class })
    private Integer pageNum = 1;

    @Range(min = 1, max = 50, message = "分页大小为正整数，最大值不能超过50", groups = { SearchGroup.class })
    private Integer pageSize = 20;

    private Sorter sorter;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Sorter getSorter() {
        return sorter;
    }

    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }
}