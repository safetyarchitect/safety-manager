package shougang.guigang.safety.pojo;

import java.util.Date;

public class TbFireequipment {
    private String fireId;

    private String fireSet;

    private String firePosition;

    private Byte firePowder;

    private Byte fireCarbon;

    private Byte firePowdercar;

    private Byte fireHydrant;

    private Date fireProducedate;

    private Date fireCheckoutdate;

    private String fireDuty;

    private String fireUnit;

    private Byte fireIsinspect;

    private Byte fireIsintact;

    public String getFireId() {
        return fireId;
    }

    public void setFireId(String fireId) {
        this.fireId = fireId == null ? null : fireId.trim();
    }

    public String getFireSet() {
        return fireSet;
    }

    public void setFireSet(String fireSet) {
        this.fireSet = fireSet == null ? null : fireSet.trim();
    }

    public String getFirePosition() {
        return firePosition;
    }

    public void setFirePosition(String firePosition) {
        this.firePosition = firePosition == null ? null : firePosition.trim();
    }

    public Byte getFirePowder() {
        return firePowder;
    }

    public void setFirePowder(Byte firePowder) {
        this.firePowder = firePowder;
    }

    public Byte getFireCarbon() {
        return fireCarbon;
    }

    public void setFireCarbon(Byte fireCarbon) {
        this.fireCarbon = fireCarbon;
    }

    public Byte getFirePowdercar() {
        return firePowdercar;
    }

    public void setFirePowdercar(Byte firePowdercar) {
        this.firePowdercar = firePowdercar;
    }

    public Byte getFireHydrant() {
        return fireHydrant;
    }

    public void setFireHydrant(Byte fireHydrant) {
        this.fireHydrant = fireHydrant;
    }

    public Date getFireProducedate() {
        return fireProducedate;
    }

    public void setFireProducedate(Date fireProducedate) {
        this.fireProducedate = fireProducedate;
    }

    public Date getFireCheckoutdate() {
        return fireCheckoutdate;
    }

    public void setFireCheckoutdate(Date fireCheckoutdate) {
        this.fireCheckoutdate = fireCheckoutdate;
    }

    public String getFireDuty() {
        return fireDuty;
    }

    public void setFireDuty(String fireDuty) {
        this.fireDuty = fireDuty == null ? null : fireDuty.trim();
    }

    public String getFireUnit() {
        return fireUnit;
    }

    public void setFireUnit(String fireUnit) {
        this.fireUnit = fireUnit == null ? null : fireUnit.trim();
    }

    public Byte getFireIsinspect() {
        return fireIsinspect;
    }

    public void setFireIsinspect(Byte fireIsinspect) {
        this.fireIsinspect = fireIsinspect;
    }

    public Byte getFireIsintact() {
        return fireIsintact;
    }

    public void setFireIsintact(Byte fireIsintact) {
        this.fireIsintact = fireIsintact;
    }
}