package com.campusdual.appamazing.model.dto;

public class ContactDTO {

    private int ID;

    private String NAME;

    private String LASTNAME;

    private String MIDDLENAME;

    private int PHONE;

    private String EMAIL;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getLASTNAME() {
        return LASTNAME;
    }

    public void setLASTNAME(String LASTNAME) {
        this.LASTNAME = LASTNAME;
    }

    public String getMIDDLENAME() {
        return MIDDLENAME;
    }

    public void setMIDDLENAME(String MIDDLENAME) {
        this.MIDDLENAME = MIDDLENAME;
    }

    public int getPHONE() {
        return PHONE;
    }

    public void setPHONE(int PHONE) {
        this.PHONE = PHONE;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }
}
