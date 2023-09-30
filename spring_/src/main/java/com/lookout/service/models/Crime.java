package com.lookout.service.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "crimes")
public class Crime {

    @Id
    private String id;

    private String nature;

    private String caseNumber;

    private Date reported;

    private Date occurred;

    private String location;

    private String disposition;

    private boolean onCampus;

    // Constructors, getters, setters.

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getNature()
    {
        return nature;
    }

    public void setNature(String nature)
    {
        this.nature = nature;
    }

    public String getCaseNumber()
    {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber)
    {
        this.caseNumber = caseNumber;
    }

    public Date getReported()
    {
        return reported;
    }

    public void setReported(Date reported)
    {
        this.reported = reported;
    }

    public Date getOccurred()
    {
        return occurred;
    }

    public void setOccurred(Date occurred)
    {
        this.occurred = occurred;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public String getDisposition()
    {
        return disposition;
    }

    public void setDisposition(String disposition)
    {
        this.disposition = disposition;
    }

    public boolean isOnCampus()
    {
        return onCampus;
    }

    public void setOnCampus(boolean onCampus)
    {
        this.onCampus = onCampus;
    }
}
