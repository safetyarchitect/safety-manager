package shougang.guigang.safety.pojo;

import java.util.Date;

public class TbGasalarm {
    private String alarmId;

    private String alarmName;

    private String alarmType;

    private String alarmNumber;

    private String alarmSet;

    private String alarmRoom;

    private String alarmDuty;

    private String alarmTeam;

    private Date alarmDate;

    private Byte alarmIsintact;

    private Byte alarmIscharge;

    private Byte alarmIsborrow;

    private String alarmBorrowid;

    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId == null ? null : alarmId.trim();
    }

    public String getAlarmName() {
        return alarmName;
    }

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName == null ? null : alarmName.trim();
    }

    public String getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType == null ? null : alarmType.trim();
    }

    public String getAlarmNumber() {
        return alarmNumber;
    }

    public void setAlarmNumber(String alarmNumber) {
        this.alarmNumber = alarmNumber == null ? null : alarmNumber.trim();
    }

    public String getAlarmSet() {
        return alarmSet;
    }

    public void setAlarmSet(String alarmSet) {
        this.alarmSet = alarmSet == null ? null : alarmSet.trim();
    }

    public String getAlarmRoom() {
        return alarmRoom;
    }

    public void setAlarmRoom(String alarmRoom) {
        this.alarmRoom = alarmRoom == null ? null : alarmRoom.trim();
    }

    public String getAlarmDuty() {
        return alarmDuty;
    }

    public void setAlarmDuty(String alarmDuty) {
        this.alarmDuty = alarmDuty == null ? null : alarmDuty.trim();
    }

    public String getAlarmTeam() {
        return alarmTeam;
    }

    public void setAlarmTeam(String alarmTeam) {
        this.alarmTeam = alarmTeam == null ? null : alarmTeam.trim();
    }

    public Date getAlarmDate() {
        return alarmDate;
    }

    public void setAlarmDate(Date alarmDate) {
        this.alarmDate = alarmDate;
    }

    public Byte getAlarmIsintact() {
        return alarmIsintact;
    }

    public void setAlarmIsintact(Byte alarmIsintact) {
        this.alarmIsintact = alarmIsintact;
    }

    public Byte getAlarmIscharge() {
        return alarmIscharge;
    }

    public void setAlarmIscharge(Byte alarmIscharge) {
        this.alarmIscharge = alarmIscharge;
    }

    public Byte getAlarmIsborrow() {
        return alarmIsborrow;
    }

    public void setAlarmIsborrow(Byte alarmIsborrow) {
        this.alarmIsborrow = alarmIsborrow;
    }

    public String getAlarmBorrowid() {
        return alarmBorrowid;
    }

    public void setAlarmBorrowid(String alarmBorrowid) {
        this.alarmBorrowid = alarmBorrowid == null ? null : alarmBorrowid.trim();
    }
}