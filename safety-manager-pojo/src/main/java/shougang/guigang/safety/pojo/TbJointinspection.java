package shougang.guigang.safety.pojo;

import java.util.Date;

public class TbJointinspection {
    private String inspectionId;

    private Date inspectionDate;

    private String inspectionSet;

    private String inspectionDuty;

    private Date inspectionEnddate;

    private String inspectionResult;

    private String inspectionReviewperson;

    private String insepctionReviewresult;

    private String inspectionIssue;

    public String getInspectionId() {
        return inspectionId;
    }

    public void setInspectionId(String inspectionId) {
        this.inspectionId = inspectionId == null ? null : inspectionId.trim();
    }

    public Date getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(Date inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    public String getInspectionSet() {
        return inspectionSet;
    }

    public void setInspectionSet(String inspectionSet) {
        this.inspectionSet = inspectionSet == null ? null : inspectionSet.trim();
    }

    public String getInspectionDuty() {
        return inspectionDuty;
    }

    public void setInspectionDuty(String inspectionDuty) {
        this.inspectionDuty = inspectionDuty == null ? null : inspectionDuty.trim();
    }

    public Date getInspectionEnddate() {
        return inspectionEnddate;
    }

    public void setInspectionEnddate(Date inspectionEnddate) {
        this.inspectionEnddate = inspectionEnddate;
    }

    public String getInspectionResult() {
        return inspectionResult;
    }

    public void setInspectionResult(String inspectionResult) {
        this.inspectionResult = inspectionResult == null ? null : inspectionResult.trim();
    }

    public String getInspectionReviewperson() {
        return inspectionReviewperson;
    }

    public void setInspectionReviewperson(String inspectionReviewperson) {
        this.inspectionReviewperson = inspectionReviewperson == null ? null : inspectionReviewperson.trim();
    }

    public String getInsepctionReviewresult() {
        return insepctionReviewresult;
    }

    public void setInsepctionReviewresult(String insepctionReviewresult) {
        this.insepctionReviewresult = insepctionReviewresult == null ? null : insepctionReviewresult.trim();
    }

    public String getInspectionIssue() {
        return inspectionIssue;
    }

    public void setInspectionIssue(String inspectionIssue) {
        this.inspectionIssue = inspectionIssue == null ? null : inspectionIssue.trim();
    }
}