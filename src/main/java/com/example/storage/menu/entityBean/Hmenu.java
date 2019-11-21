package com.example.storage.menu.entityBean;

import lombok.Data;

@Data
public class Hmenu {
    private Integer hId;

    private Integer hPid;

    private String hName;

    private Integer hStatus;

    private Integer hDeleted;

    private String hUrl;

    private String hTarget;

    public Integer gethId() {
        return hId;
    }

    public void sethId(Integer hId) {
        this.hId = hId;
    }

    public Integer gethPid() {
        return hPid;
    }

    public void sethPid(Integer hPid) {
        this.hPid = hPid;
    }

    public String gethName() {
        return hName;
    }

    public void sethName(String hName) {
        this.hName = hName == null ? null : hName.trim();
    }

    public Integer gethStatus() {
        return hStatus;
    }

    public void sethStatus(Integer hStatus) {
        this.hStatus = hStatus;
    }

    public Integer gethDeleted() {
        return hDeleted;
    }

    public void sethDeleted(Integer hDeleted) {
        this.hDeleted = hDeleted;
    }

    public String gethUrl() {
        return hUrl;
    }

    public void sethUrl(String hUrl) {
        this.hUrl = hUrl == null ? null : hUrl.trim();
    }

    public String gethTarget() {
        return hTarget;
    }

    public void sethTarget(String hTarget) {
        this.hTarget = hTarget == null ? null : hTarget.trim();
    }
}