package com.thc.code.userpanelapi.framework;

import org.springframework.stereotype.Component;

@Component
public class ChannelResponse {

    private Object data;
    private boolean success;
    private ChannelNotifications notifications;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public ChannelNotifications getNotifications() {
        return notifications;
    }

    public void setNotifications(ChannelNotifications notifications) {
        this.notifications = notifications;
    }
}
