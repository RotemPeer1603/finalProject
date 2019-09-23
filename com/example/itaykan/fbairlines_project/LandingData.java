package com.example.itaykan.fbairlines_project;

import java.io.Serializable;

public class LandingData implements Serializable {

    public String airport;
    public String apptime;
    public String city;
    public int companyid;
    public long number;

    public LandingData()
    {

    }

    @Override
    public String toString() {
        return "number : " + number + " approximate time : " + apptime +
                " city : " + city + " company id : " + companyid +
                " airport : " + airport;
    }


}
