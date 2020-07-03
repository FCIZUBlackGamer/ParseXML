package com.example.testparsexml.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "Product")
public class Product {
    @Attribute(name = "consumed")
    private String consumed;
    @Attribute(name = "orderedLastWeek")
    private String orderedLastWeek;
    @Attribute(name = "code")
    private String code;
    @Attribute(name = "quantity")
    private String quantity;
    @Attribute(name = "created")
    private String created;
    @Attribute(name = "pending")
    private String pending;
    @Attribute(name = "backordered")
    private String backordered;
    @Attribute(name = "availableDate")
    private String availableDate;


    public String getConsumed() {
        return consumed;
    }

    public void setConsumed(String consumed) {
        this.consumed = consumed;
    }

    public String getOrderedLastWeek() {
        return orderedLastWeek;
    }

    public void setOrderedLastWeek(String orderedLastWeek) {
        this.orderedLastWeek = orderedLastWeek;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getPending() {
        return pending;
    }

    public void setPending(String pending) {
        this.pending = pending;
    }

    public String getBackordered() {
        return backordered;
    }

    public void setBackordered(String backordered) {
        this.backordered = backordered;
    }

    public String getAvailableDate() {
        return availableDate;
    }

    public void setAvailableDate(String availableDate) {
        this.availableDate = availableDate;
    }


    @Override
    public String toString() {
        return "ClassPojo [consumed = " + consumed + ", orderedLastWeek = " + orderedLastWeek + ", code = " + code + ", quantity = " + quantity + ", created = " + created + ", pending = " + pending + ", backordered = " + backordered + ", availableDate = " + availableDate  + "]";
    }
}
