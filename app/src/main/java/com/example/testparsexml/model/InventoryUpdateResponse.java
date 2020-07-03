package com.example.testparsexml.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Root(name = "InventoryUpdateResponse", strict = false)
public class InventoryUpdateResponse {
    @Element(name = "Status")
    private String Status ="";
    @ElementList(name = "Product", inline = true)
    List< Product > Product = new ArrayList < Product > ();
    @Element(name = "TotalProducts")
    private String TotalProducts;
    @Element(name = "ProcessingTime")
    ProcessingTime ProcessingTimeObject;


    // Getter Methods

    public String getStatus() {
        return Status;
    }

    public String getTotalProducts() {
        return TotalProducts;
    }

    public ProcessingTime getProcessingTime() {
        return ProcessingTimeObject;
    }

    // Setter Methods

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public void setTotalProducts(String TotalProducts) {
        this.TotalProducts = TotalProducts;
    }

    public void setProcessingTime(ProcessingTime ProcessingTimeObject) {
        this.ProcessingTimeObject = ProcessingTimeObject;
    }

    public void setProduct(List<com.example.testparsexml.model.Product> product) {
        Product = product;
    }

    public void setProcessingTimeObject(ProcessingTime processingTimeObject) {
        ProcessingTimeObject = processingTimeObject;
    }

    public List<com.example.testparsexml.model.Product> getProduct() {
        return Product;
    }

    public ProcessingTime getProcessingTimeObject() {
        return ProcessingTimeObject;
    }
}
