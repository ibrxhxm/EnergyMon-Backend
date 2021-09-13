package com.fyp.energymon.dto;

public class PowerDTO {
    private double rmsVoltage;
    private double rmsCurrent;
    private double apparentPower;
    private double realPower;
    private double powerfactor;

    public double getRmsVoltage() {
        return rmsVoltage;
    }

    public void setRmsVoltage(double rmsVoltage) {
        this.rmsVoltage = rmsVoltage;
    }

    public double getRmsCurrent() {
        return rmsCurrent;
    }

    public void setRmsCurrent(double rmsCurrent) {
        this.rmsCurrent = rmsCurrent;
    }

    public double getApparentPower() {
        return apparentPower;
    }

    public void setApparentPower(double apparentPower) {
        this.apparentPower = apparentPower;
    }

    public double getRealPower() {
        return realPower;
    }

    public void setRealPower(double realPower) {
        this.realPower = realPower;
    }

    public double getPowerfactor() {
        return powerfactor;
    }

    public void setPowerfactor(double powerfactor) {
        this.powerfactor = powerfactor;
    }
}
