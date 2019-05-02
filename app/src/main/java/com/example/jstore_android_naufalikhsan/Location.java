package com.example.jstore_android_naufalikhsan;

public class Location {

    private String provinceLocation;
    private String descriptionLocation;
    private String cityLocation;

    public Location(String provinceLocation, String descriptionLocation, String cityLocation){
        this.cityLocation=cityLocation;
        this.provinceLocation=provinceLocation;
        this.cityLocation=cityLocation;
    }

    public String getProvinceLocation()
    {
        return provinceLocation;
    }



    public String getCityLocation()
    {
        return cityLocation;
    }



    public String getDescriptionLocation()
    {
        return descriptionLocation;
    }


    public void setProvinceLocation(String provinceLocation)
    {
        this.provinceLocation=provinceLocation;
    }


    public void setCityLocation(String cityLocation)
    {
        this.cityLocation=cityLocation;
    }


    public void setDescriptionLocation(String descriptionLocation)
    {
        this.descriptionLocation=descriptionLocation;
    }

}

