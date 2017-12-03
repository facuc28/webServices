package com.thc.code.userpanelapi.framework;

import java.util.List;

public class ChannelNotifications {

    private List<ErrorResponse> fieldErrors;
    private List<ErrorResponse> formErrors;
    private List<MessageNotification> Messages;

    public List<ErrorResponse> getFieldErrors() {
        return fieldErrors;
    }

    public void setFieldErrors(List<ErrorResponse> fieldErrors) {
        this.fieldErrors = fieldErrors;
    }

    public List<ErrorResponse> getFormErrors() {
        return formErrors;
    }

    public void setFormErrors(List<ErrorResponse> formErrors) {
        this.formErrors = formErrors;
    }

    public List<MessageNotification> getMessages() {
        return Messages;
    }

    public void setMessages(List<MessageNotification> messages) {
        Messages = messages;
    }
}
