package com.example.model;

public class News {
    private Integer goodsid;

    private String text;

    private Byte spansize;

    private String imageurl;

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public Byte getSpansize() {
        return spansize;
    }

    public void setSpansize(Byte spansize) {
        this.spansize = spansize;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl == null ? null : imageurl.trim();
    }
}