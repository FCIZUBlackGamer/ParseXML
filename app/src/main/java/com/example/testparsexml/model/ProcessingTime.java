package com.example.testparsexml.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "ProcessingTime")
public class ProcessingTime {
    @Attribute(name = "units")
    private String units;

    public String getUnits()
    {
        return units;
    }

    public void setUnits(String units)
    {
        this.units = units;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [units = "+ units +"]";
    }
}
