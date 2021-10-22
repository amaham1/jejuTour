package com.jj.jejuTour.tour.vo;

import java.util.List;

public class TourVo {

    String tour_place_name;
    String tour_place_explanation;
    String create_dt;
    String update_dt;
    int ROWNUM;

    String alltag;
    String contentscd;
    String title;
    String region1cd;
    String address;
    String introduction;
    String latitude;
    String longitude;
    String phoneno;
    String imgpath;
    String thumbnailpath;

    //페이징용
    int draw;
    int start;
    int length;

    public String getTour_place_name() {
        return tour_place_name;
    }

    public void setTour_place_name(String tour_place_name) {
        this.tour_place_name = tour_place_name;
    }

    public String getTour_place_explanation() {
        return tour_place_explanation;
    }

    public void setTour_place_explanation(String tour_place_explanation) {
        this.tour_place_explanation = tour_place_explanation;
    }

    public String getCreate_dt() {
        return create_dt;
    }

    public void setCreate_dt(String create_dt) {
        this.create_dt = create_dt;
    }

    public String getUpdate_dt() {
        return update_dt;
    }

    public void setUpdate_dt(String update_dt) {
        this.update_dt = update_dt;
    }

    public int getROWNUM() {
        return ROWNUM;
    }

    public void setROWNUM(int ROUNUM) {
        this.ROWNUM = ROUNUM;
    }

    public String getAlltag() {
        return alltag;
    }

    public void setAlltag(String alltag) {
        this.alltag = alltag;
    }

    public String getContentscd() {
        return contentscd;
    }

    public void setContentscd(String contentscd) {
        this.contentscd = contentscd;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRegion1cd() {
        return region1cd;
    }

    public void setRegion1cd(String region1cd) {
        this.region1cd = region1cd;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public String getThumbnailpath() {
        return thumbnailpath;
    }

    public void setThumbnailpath(String thumbnailpath) {
        this.thumbnailpath = thumbnailpath;
    }

    //페이징용

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
}
