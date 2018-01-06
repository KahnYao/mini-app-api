package com.dpt.model;

public class Order {
    private Integer id;

    private String openid;

    private Integer payendtime;

    private Integer prepayendtime;

    private String prepayid;

    private Integer productid;

    private Double total;

    private Integer createdtime;

    private Integer updatedtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public Integer getPayendtime() {
        return payendtime;
    }

    public void setPayendtime(Integer payendtime) {
        this.payendtime = payendtime;
    }

    public Integer getPrepayendtime() {
        return prepayendtime;
    }

    public void setPrepayendtime(Integer prepayendtime) {
        this.prepayendtime = prepayendtime;
    }

    public String getPrepayid() {
        return prepayid;
    }

    public void setPrepayid(String prepayid) {
        this.prepayid = prepayid == null ? null : prepayid.trim();
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }

    public Integer getUpdatedtime() {
        return updatedtime;
    }

    public void setUpdatedtime(Integer updatedtime) {
        this.updatedtime = updatedtime;
    }
}