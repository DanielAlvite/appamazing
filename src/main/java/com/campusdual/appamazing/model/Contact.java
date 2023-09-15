package com.campusdual.appamazing.model;

import javax.persistence.*;
@Entity
@Table(name = "CONTACTS")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column
    private String NAME;

    @Column
    private String LASTNAME;

    @Column
    private String MIDDLENAME;

    @Column
    private int PHONE;

    @Column
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
