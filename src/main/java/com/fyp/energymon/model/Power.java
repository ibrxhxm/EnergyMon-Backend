package com.fyp.energymon.model;

import java.time.LocalDateTime;

public class Power {
    private LocalDateTime timestamp;
    private double rmsCurrent;
    private double rmsVoltage;
    private double powerFactor;
    private double apparentPower;
    private double realPower;

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public double getRmsCurrent() {
        return rmsCurrent;
    }

    public void setRmsCurrent(double rmsCurrent) {
        this.rmsCurrent = rmsCurrent;
    }

    public double getRmsVoltage() {
        return rmsVoltage;
    }

    public void setRmsVoltage(double rmsVoltage) {
        this.rmsVoltage = rmsVoltage;
    }

    public double getPowerFactor() {
        return powerFactor;
    }

    public void setPowerFactor(double powerFactor) {
        this.powerFactor = powerFactor;
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
}
