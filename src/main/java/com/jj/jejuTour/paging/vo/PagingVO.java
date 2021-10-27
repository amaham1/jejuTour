package com.jj.jejuTour.paging.vo;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class PagingVO {

    int draw;
    int start;
    int length;
    int recordsTotal;
    int recordsFiltered;

    private List data;

    public List getData(){
        if(CollectionUtils.isEmpty(data)){
            data = new ArrayList();
        }
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(int recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public int getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(int recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }
}
