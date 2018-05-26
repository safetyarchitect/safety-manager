package shougang.guigang.safety.pojo;

import java.util.Date;

public class TbNotification {
    private Short notificationId;

    private String notificationTitle;

    private String notificationCreateperson;

    private Date notificationCreatetime;

    private String notificationContent;

    public Short getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(Short notificationId) {
        this.notificationId = notificationId;
    }

    public String getNotificationTitle() {
        return notificationTitle;
    }

    public void setNotificationTitle(String notificationTitle) {
        this.notificationTitle = notificationTitle == null ? null : notificationTitle.trim();
    }

    public String getNotificationCreateperson() {
        return notificationCreateperson;
    }

    public void setNotificationCreateperson(String notificationCreateperson) {
        this.notificationCreateperson = notificationCreateperson == null ? null : notificationCreateperson.trim();
    }

    public Date getNotificationCreatetime() {
        return notificationCreatetime;
    }

    public void setNotificationCreatetime(Date notificationCreatetime) {
        this.notificationCreatetime = notificationCreatetime;
    }

    public String getNotificationContent() {
        return notificationContent;
    }

    public void setNotificationContent(String notificationContent) {
        this.notificationContent = notificationContent == null ? null : notificationContent.trim();
    }
}