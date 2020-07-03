package com.example.testparsexml.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "rss", strict = false)
public class Codebeautify {
    @Element(name = "InventoryUpdateResponse")
    InventoryUpdateResponse InventoryUpdateResponse;


    // Getter Methods

    public InventoryUpdateResponse getInventoryUpdateResponse() {
        return InventoryUpdateResponse;
    }

    // Setter Methods

    public void setInventoryUpdateResponse(InventoryUpdateResponse InventoryUpdateResponseObject) {
        this.InventoryUpdateResponse = InventoryUpdateResponseObject;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [InventoryUpdateResponse = "+ InventoryUpdateResponse +"]";
    }
}
