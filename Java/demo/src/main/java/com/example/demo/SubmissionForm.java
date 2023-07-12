package com.example.demo;

public class SubmissionForm
{
    public String Id;
    public String VendorName;
    public int rate;
    public String leadName;
    public String Technology;
    public String Name;
    public String getId() {
        return  Id;
    }
    public void setId(String id) {
        this.Id = id;
    }
    public String getVendorName() {
        return VendorName;
    }
    public void setVendorName(String vendorName) {
        this.VendorName = vendorName;
    }
    public int getRate() {
        return rate;
    }
    public void setRate(int rate) {
        this.rate = rate;
    }
    public String getLeadName() {
        return leadName;
    }
    public void setLeadName(String leadName) {
        this.leadName = leadName;
    }
    public String getTechnology() {
        return Technology;
    }
    public void setTechnology(String technology) {
        this.Technology = technology;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        this.Name = name;
    }
}
