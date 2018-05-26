package shougang.guigang.safety.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbSpecialoperationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbSpecialoperationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSpecialIdIsNull() {
            addCriterion("special_id is null");
            return (Criteria) this;
        }

        public Criteria andSpecialIdIsNotNull() {
            addCriterion("special_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialIdEqualTo(String value) {
            addCriterion("special_id =", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdNotEqualTo(String value) {
            addCriterion("special_id <>", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdGreaterThan(String value) {
            addCriterion("special_id >", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdGreaterThanOrEqualTo(String value) {
            addCriterion("special_id >=", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdLessThan(String value) {
            addCriterion("special_id <", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdLessThanOrEqualTo(String value) {
            addCriterion("special_id <=", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdLike(String value) {
            addCriterion("special_id like", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdNotLike(String value) {
            addCriterion("special_id not like", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdIn(List<String> values) {
            addCriterion("special_id in", values, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdNotIn(List<String> values) {
            addCriterion("special_id not in", values, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdBetween(String value1, String value2) {
            addCriterion("special_id between", value1, value2, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdNotBetween(String value1, String value2) {
            addCriterion("special_id not between", value1, value2, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialNameIsNull() {
            addCriterion("special_name is null");
            return (Criteria) this;
        }

        public Criteria andSpecialNameIsNotNull() {
            addCriterion("special_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialNameEqualTo(String value) {
            addCriterion("special_name =", value, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialNameNotEqualTo(String value) {
            addCriterion("special_name <>", value, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialNameGreaterThan(String value) {
            addCriterion("special_name >", value, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialNameGreaterThanOrEqualTo(String value) {
            addCriterion("special_name >=", value, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialNameLessThan(String value) {
            addCriterion("special_name <", value, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialNameLessThanOrEqualTo(String value) {
            addCriterion("special_name <=", value, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialNameLike(String value) {
            addCriterion("special_name like", value, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialNameNotLike(String value) {
            addCriterion("special_name not like", value, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialNameIn(List<String> values) {
            addCriterion("special_name in", values, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialNameNotIn(List<String> values) {
            addCriterion("special_name not in", values, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialNameBetween(String value1, String value2) {
            addCriterion("special_name between", value1, value2, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialNameNotBetween(String value1, String value2) {
            addCriterion("special_name not between", value1, value2, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialSexIsNull() {
            addCriterion("special_sex is null");
            return (Criteria) this;
        }

        public Criteria andSpecialSexIsNotNull() {
            addCriterion("special_sex is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialSexEqualTo(String value) {
            addCriterion("special_sex =", value, "specialSex");
            return (Criteria) this;
        }

        public Criteria andSpecialSexNotEqualTo(String value) {
            addCriterion("special_sex <>", value, "specialSex");
            return (Criteria) this;
        }

        public Criteria andSpecialSexGreaterThan(String value) {
            addCriterion("special_sex >", value, "specialSex");
            return (Criteria) this;
        }

        public Criteria andSpecialSexGreaterThanOrEqualTo(String value) {
            addCriterion("special_sex >=", value, "specialSex");
            return (Criteria) this;
        }

        public Criteria andSpecialSexLessThan(String value) {
            addCriterion("special_sex <", value, "specialSex");
            return (Criteria) this;
        }

        public Criteria andSpecialSexLessThanOrEqualTo(String value) {
            addCriterion("special_sex <=", value, "specialSex");
            return (Criteria) this;
        }

        public Criteria andSpecialSexLike(String value) {
            addCriterion("special_sex like", value, "specialSex");
            return (Criteria) this;
        }

        public Criteria andSpecialSexNotLike(String value) {
            addCriterion("special_sex not like", value, "specialSex");
            return (Criteria) this;
        }

        public Criteria andSpecialSexIn(List<String> values) {
            addCriterion("special_sex in", values, "specialSex");
            return (Criteria) this;
        }

        public Criteria andSpecialSexNotIn(List<String> values) {
            addCriterion("special_sex not in", values, "specialSex");
            return (Criteria) this;
        }

        public Criteria andSpecialSexBetween(String value1, String value2) {
            addCriterion("special_sex between", value1, value2, "specialSex");
            return (Criteria) this;
        }

        public Criteria andSpecialSexNotBetween(String value1, String value2) {
            addCriterion("special_sex not between", value1, value2, "specialSex");
            return (Criteria) this;
        }

        public Criteria andSpecialUnitIsNull() {
            addCriterion("special_unit is null");
            return (Criteria) this;
        }

        public Criteria andSpecialUnitIsNotNull() {
            addCriterion("special_unit is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialUnitEqualTo(String value) {
            addCriterion("special_unit =", value, "specialUnit");
            return (Criteria) this;
        }

        public Criteria andSpecialUnitNotEqualTo(String value) {
            addCriterion("special_unit <>", value, "specialUnit");
            return (Criteria) this;
        }

        public Criteria andSpecialUnitGreaterThan(String value) {
            addCriterion("special_unit >", value, "specialUnit");
            return (Criteria) this;
        }

        public Criteria andSpecialUnitGreaterThanOrEqualTo(String value) {
            addCriterion("special_unit >=", value, "specialUnit");
            return (Criteria) this;
        }

        public Criteria andSpecialUnitLessThan(String value) {
            addCriterion("special_unit <", value, "specialUnit");
            return (Criteria) this;
        }

        public Criteria andSpecialUnitLessThanOrEqualTo(String value) {
            addCriterion("special_unit <=", value, "specialUnit");
            return (Criteria) this;
        }

        public Criteria andSpecialUnitLike(String value) {
            addCriterion("special_unit like", value, "specialUnit");
            return (Criteria) this;
        }

        public Criteria andSpecialUnitNotLike(String value) {
            addCriterion("special_unit not like", value, "specialUnit");
            return (Criteria) this;
        }

        public Criteria andSpecialUnitIn(List<String> values) {
            addCriterion("special_unit in", values, "specialUnit");
            return (Criteria) this;
        }

        public Criteria andSpecialUnitNotIn(List<String> values) {
            addCriterion("special_unit not in", values, "specialUnit");
            return (Criteria) this;
        }

        public Criteria andSpecialUnitBetween(String value1, String value2) {
            addCriterion("special_unit between", value1, value2, "specialUnit");
            return (Criteria) this;
        }

        public Criteria andSpecialUnitNotBetween(String value1, String value2) {
            addCriterion("special_unit not between", value1, value2, "specialUnit");
            return (Criteria) this;
        }

        public Criteria andSpecialTeamIsNull() {
            addCriterion("special_team is null");
            return (Criteria) this;
        }

        public Criteria andSpecialTeamIsNotNull() {
            addCriterion("special_team is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialTeamEqualTo(String value) {
            addCriterion("special_team =", value, "specialTeam");
            return (Criteria) this;
        }

        public Criteria andSpecialTeamNotEqualTo(String value) {
            addCriterion("special_team <>", value, "specialTeam");
            return (Criteria) this;
        }

        public Criteria andSpecialTeamGreaterThan(String value) {
            addCriterion("special_team >", value, "specialTeam");
            return (Criteria) this;
        }

        public Criteria andSpecialTeamGreaterThanOrEqualTo(String value) {
            addCriterion("special_team >=", value, "specialTeam");
            return (Criteria) this;
        }

        public Criteria andSpecialTeamLessThan(String value) {
            addCriterion("special_team <", value, "specialTeam");
            return (Criteria) this;
        }

        public Criteria andSpecialTeamLessThanOrEqualTo(String value) {
            addCriterion("special_team <=", value, "specialTeam");
            return (Criteria) this;
        }

        public Criteria andSpecialTeamLike(String value) {
            addCriterion("special_team like", value, "specialTeam");
            return (Criteria) this;
        }

        public Criteria andSpecialTeamNotLike(String value) {
            addCriterion("special_team not like", value, "specialTeam");
            return (Criteria) this;
        }

        public Criteria andSpecialTeamIn(List<String> values) {
            addCriterion("special_team in", values, "specialTeam");
            return (Criteria) this;
        }

        public Criteria andSpecialTeamNotIn(List<String> values) {
            addCriterion("special_team not in", values, "specialTeam");
            return (Criteria) this;
        }

        public Criteria andSpecialTeamBetween(String value1, String value2) {
            addCriterion("special_team between", value1, value2, "specialTeam");
            return (Criteria) this;
        }

        public Criteria andSpecialTeamNotBetween(String value1, String value2) {
            addCriterion("special_team not between", value1, value2, "specialTeam");
            return (Criteria) this;
        }

        public Criteria andSpecialCertificateIsNull() {
            addCriterion("special_certificate is null");
            return (Criteria) this;
        }

        public Criteria andSpecialCertificateIsNotNull() {
            addCriterion("special_certificate is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialCertificateEqualTo(String value) {
            addCriterion("special_certificate =", value, "specialCertificate");
            return (Criteria) this;
        }

        public Criteria andSpecialCertificateNotEqualTo(String value) {
            addCriterion("special_certificate <>", value, "specialCertificate");
            return (Criteria) this;
        }

        public Criteria andSpecialCertificateGreaterThan(String value) {
            addCriterion("special_certificate >", value, "specialCertificate");
            return (Criteria) this;
        }

        public Criteria andSpecialCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("special_certificate >=", value, "specialCertificate");
            return (Criteria) this;
        }

        public Criteria andSpecialCertificateLessThan(String value) {
            addCriterion("special_certificate <", value, "specialCertificate");
            return (Criteria) this;
        }

        public Criteria andSpecialCertificateLessThanOrEqualTo(String value) {
            addCriterion("special_certificate <=", value, "specialCertificate");
            return (Criteria) this;
        }

        public Criteria andSpecialCertificateLike(String value) {
            addCriterion("special_certificate like", value, "specialCertificate");
            return (Criteria) this;
        }

        public Criteria andSpecialCertificateNotLike(String value) {
            addCriterion("special_certificate not like", value, "specialCertificate");
            return (Criteria) this;
        }

        public Criteria andSpecialCertificateIn(List<String> values) {
            addCriterion("special_certificate in", values, "specialCertificate");
            return (Criteria) this;
        }

        public Criteria andSpecialCertificateNotIn(List<String> values) {
            addCriterion("special_certificate not in", values, "specialCertificate");
            return (Criteria) this;
        }

        public Criteria andSpecialCertificateBetween(String value1, String value2) {
            addCriterion("special_certificate between", value1, value2, "specialCertificate");
            return (Criteria) this;
        }

        public Criteria andSpecialCertificateNotBetween(String value1, String value2) {
            addCriterion("special_certificate not between", value1, value2, "specialCertificate");
            return (Criteria) this;
        }

        public Criteria andSpecialDossierIsNull() {
            addCriterion("special_dossier is null");
            return (Criteria) this;
        }

        public Criteria andSpecialDossierIsNotNull() {
            addCriterion("special_dossier is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialDossierEqualTo(String value) {
            addCriterion("special_dossier =", value, "specialDossier");
            return (Criteria) this;
        }

        public Criteria andSpecialDossierNotEqualTo(String value) {
            addCriterion("special_dossier <>", value, "specialDossier");
            return (Criteria) this;
        }

        public Criteria andSpecialDossierGreaterThan(String value) {
            addCriterion("special_dossier >", value, "specialDossier");
            return (Criteria) this;
        }

        public Criteria andSpecialDossierGreaterThanOrEqualTo(String value) {
            addCriterion("special_dossier >=", value, "specialDossier");
            return (Criteria) this;
        }

        public Criteria andSpecialDossierLessThan(String value) {
            addCriterion("special_dossier <", value, "specialDossier");
            return (Criteria) this;
        }

        public Criteria andSpecialDossierLessThanOrEqualTo(String value) {
            addCriterion("special_dossier <=", value, "specialDossier");
            return (Criteria) this;
        }

        public Criteria andSpecialDossierLike(String value) {
            addCriterion("special_dossier like", value, "specialDossier");
            return (Criteria) this;
        }

        public Criteria andSpecialDossierNotLike(String value) {
            addCriterion("special_dossier not like", value, "specialDossier");
            return (Criteria) this;
        }

        public Criteria andSpecialDossierIn(List<String> values) {
            addCriterion("special_dossier in", values, "specialDossier");
            return (Criteria) this;
        }

        public Criteria andSpecialDossierNotIn(List<String> values) {
            addCriterion("special_dossier not in", values, "specialDossier");
            return (Criteria) this;
        }

        public Criteria andSpecialDossierBetween(String value1, String value2) {
            addCriterion("special_dossier between", value1, value2, "specialDossier");
            return (Criteria) this;
        }

        public Criteria andSpecialDossierNotBetween(String value1, String value2) {
            addCriterion("special_dossier not between", value1, value2, "specialDossier");
            return (Criteria) this;
        }

        public Criteria andSpecialItemIsNull() {
            addCriterion("special_item is null");
            return (Criteria) this;
        }

        public Criteria andSpecialItemIsNotNull() {
            addCriterion("special_item is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialItemEqualTo(String value) {
            addCriterion("special_item =", value, "specialItem");
            return (Criteria) this;
        }

        public Criteria andSpecialItemNotEqualTo(String value) {
            addCriterion("special_item <>", value, "specialItem");
            return (Criteria) this;
        }

        public Criteria andSpecialItemGreaterThan(String value) {
            addCriterion("special_item >", value, "specialItem");
            return (Criteria) this;
        }

        public Criteria andSpecialItemGreaterThanOrEqualTo(String value) {
            addCriterion("special_item >=", value, "specialItem");
            return (Criteria) this;
        }

        public Criteria andSpecialItemLessThan(String value) {
            addCriterion("special_item <", value, "specialItem");
            return (Criteria) this;
        }

        public Criteria andSpecialItemLessThanOrEqualTo(String value) {
            addCriterion("special_item <=", value, "specialItem");
            return (Criteria) this;
        }

        public Criteria andSpecialItemLike(String value) {
            addCriterion("special_item like", value, "specialItem");
            return (Criteria) this;
        }

        public Criteria andSpecialItemNotLike(String value) {
            addCriterion("special_item not like", value, "specialItem");
            return (Criteria) this;
        }

        public Criteria andSpecialItemIn(List<String> values) {
            addCriterion("special_item in", values, "specialItem");
            return (Criteria) this;
        }

        public Criteria andSpecialItemNotIn(List<String> values) {
            addCriterion("special_item not in", values, "specialItem");
            return (Criteria) this;
        }

        public Criteria andSpecialItemBetween(String value1, String value2) {
            addCriterion("special_item between", value1, value2, "specialItem");
            return (Criteria) this;
        }

        public Criteria andSpecialItemNotBetween(String value1, String value2) {
            addCriterion("special_item not between", value1, value2, "specialItem");
            return (Criteria) this;
        }

        public Criteria andSpecialItemcodeIsNull() {
            addCriterion("special_itemCode is null");
            return (Criteria) this;
        }

        public Criteria andSpecialItemcodeIsNotNull() {
            addCriterion("special_itemCode is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialItemcodeEqualTo(String value) {
            addCriterion("special_itemCode =", value, "specialItemcode");
            return (Criteria) this;
        }

        public Criteria andSpecialItemcodeNotEqualTo(String value) {
            addCriterion("special_itemCode <>", value, "specialItemcode");
            return (Criteria) this;
        }

        public Criteria andSpecialItemcodeGreaterThan(String value) {
            addCriterion("special_itemCode >", value, "specialItemcode");
            return (Criteria) this;
        }

        public Criteria andSpecialItemcodeGreaterThanOrEqualTo(String value) {
            addCriterion("special_itemCode >=", value, "specialItemcode");
            return (Criteria) this;
        }

        public Criteria andSpecialItemcodeLessThan(String value) {
            addCriterion("special_itemCode <", value, "specialItemcode");
            return (Criteria) this;
        }

        public Criteria andSpecialItemcodeLessThanOrEqualTo(String value) {
            addCriterion("special_itemCode <=", value, "specialItemcode");
            return (Criteria) this;
        }

        public Criteria andSpecialItemcodeLike(String value) {
            addCriterion("special_itemCode like", value, "specialItemcode");
            return (Criteria) this;
        }

        public Criteria andSpecialItemcodeNotLike(String value) {
            addCriterion("special_itemCode not like", value, "specialItemcode");
            return (Criteria) this;
        }

        public Criteria andSpecialItemcodeIn(List<String> values) {
            addCriterion("special_itemCode in", values, "specialItemcode");
            return (Criteria) this;
        }

        public Criteria andSpecialItemcodeNotIn(List<String> values) {
            addCriterion("special_itemCode not in", values, "specialItemcode");
            return (Criteria) this;
        }

        public Criteria andSpecialItemcodeBetween(String value1, String value2) {
            addCriterion("special_itemCode between", value1, value2, "specialItemcode");
            return (Criteria) this;
        }

        public Criteria andSpecialItemcodeNotBetween(String value1, String value2) {
            addCriterion("special_itemCode not between", value1, value2, "specialItemcode");
            return (Criteria) this;
        }

        public Criteria andSpecialAuthorityIsNull() {
            addCriterion("special_authority is null");
            return (Criteria) this;
        }

        public Criteria andSpecialAuthorityIsNotNull() {
            addCriterion("special_authority is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialAuthorityEqualTo(String value) {
            addCriterion("special_authority =", value, "specialAuthority");
            return (Criteria) this;
        }

        public Criteria andSpecialAuthorityNotEqualTo(String value) {
            addCriterion("special_authority <>", value, "specialAuthority");
            return (Criteria) this;
        }

        public Criteria andSpecialAuthorityGreaterThan(String value) {
            addCriterion("special_authority >", value, "specialAuthority");
            return (Criteria) this;
        }

        public Criteria andSpecialAuthorityGreaterThanOrEqualTo(String value) {
            addCriterion("special_authority >=", value, "specialAuthority");
            return (Criteria) this;
        }

        public Criteria andSpecialAuthorityLessThan(String value) {
            addCriterion("special_authority <", value, "specialAuthority");
            return (Criteria) this;
        }

        public Criteria andSpecialAuthorityLessThanOrEqualTo(String value) {
            addCriterion("special_authority <=", value, "specialAuthority");
            return (Criteria) this;
        }

        public Criteria andSpecialAuthorityLike(String value) {
            addCriterion("special_authority like", value, "specialAuthority");
            return (Criteria) this;
        }

        public Criteria andSpecialAuthorityNotLike(String value) {
            addCriterion("special_authority not like", value, "specialAuthority");
            return (Criteria) this;
        }

        public Criteria andSpecialAuthorityIn(List<String> values) {
            addCriterion("special_authority in", values, "specialAuthority");
            return (Criteria) this;
        }

        public Criteria andSpecialAuthorityNotIn(List<String> values) {
            addCriterion("special_authority not in", values, "specialAuthority");
            return (Criteria) this;
        }

        public Criteria andSpecialAuthorityBetween(String value1, String value2) {
            addCriterion("special_authority between", value1, value2, "specialAuthority");
            return (Criteria) this;
        }

        public Criteria andSpecialAuthorityNotBetween(String value1, String value2) {
            addCriterion("special_authority not between", value1, value2, "specialAuthority");
            return (Criteria) this;
        }

        public Criteria andSpecialApprovaldateIsNull() {
            addCriterion("special_approvalDate is null");
            return (Criteria) this;
        }

        public Criteria andSpecialApprovaldateIsNotNull() {
            addCriterion("special_approvalDate is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialApprovaldateEqualTo(String value) {
            addCriterion("special_approvalDate =", value, "specialApprovaldate");
            return (Criteria) this;
        }

        public Criteria andSpecialApprovaldateNotEqualTo(String value) {
            addCriterion("special_approvalDate <>", value, "specialApprovaldate");
            return (Criteria) this;
        }

        public Criteria andSpecialApprovaldateGreaterThan(String value) {
            addCriterion("special_approvalDate >", value, "specialApprovaldate");
            return (Criteria) this;
        }

        public Criteria andSpecialApprovaldateGreaterThanOrEqualTo(String value) {
            addCriterion("special_approvalDate >=", value, "specialApprovaldate");
            return (Criteria) this;
        }

        public Criteria andSpecialApprovaldateLessThan(String value) {
            addCriterion("special_approvalDate <", value, "specialApprovaldate");
            return (Criteria) this;
        }

        public Criteria andSpecialApprovaldateLessThanOrEqualTo(String value) {
            addCriterion("special_approvalDate <=", value, "specialApprovaldate");
            return (Criteria) this;
        }

        public Criteria andSpecialApprovaldateLike(String value) {
            addCriterion("special_approvalDate like", value, "specialApprovaldate");
            return (Criteria) this;
        }

        public Criteria andSpecialApprovaldateNotLike(String value) {
            addCriterion("special_approvalDate not like", value, "specialApprovaldate");
            return (Criteria) this;
        }

        public Criteria andSpecialApprovaldateIn(List<String> values) {
            addCriterion("special_approvalDate in", values, "specialApprovaldate");
            return (Criteria) this;
        }

        public Criteria andSpecialApprovaldateNotIn(List<String> values) {
            addCriterion("special_approvalDate not in", values, "specialApprovaldate");
            return (Criteria) this;
        }

        public Criteria andSpecialApprovaldateBetween(String value1, String value2) {
            addCriterion("special_approvalDate between", value1, value2, "specialApprovaldate");
            return (Criteria) this;
        }

        public Criteria andSpecialApprovaldateNotBetween(String value1, String value2) {
            addCriterion("special_approvalDate not between", value1, value2, "specialApprovaldate");
            return (Criteria) this;
        }

        public Criteria andSpecialEffectivedateIsNull() {
            addCriterion("special_effectiveDate is null");
            return (Criteria) this;
        }

        public Criteria andSpecialEffectivedateIsNotNull() {
            addCriterion("special_effectiveDate is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialEffectivedateEqualTo(String value) {
            addCriterion("special_effectiveDate =", value, "specialEffectivedate");
            return (Criteria) this;
        }

        public Criteria andSpecialEffectivedateNotEqualTo(String value) {
            addCriterion("special_effectiveDate <>", value, "specialEffectivedate");
            return (Criteria) this;
        }

        public Criteria andSpecialEffectivedateGreaterThan(String value) {
            addCriterion("special_effectiveDate >", value, "specialEffectivedate");
            return (Criteria) this;
        }

        public Criteria andSpecialEffectivedateGreaterThanOrEqualTo(String value) {
            addCriterion("special_effectiveDate >=", value, "specialEffectivedate");
            return (Criteria) this;
        }

        public Criteria andSpecialEffectivedateLessThan(String value) {
            addCriterion("special_effectiveDate <", value, "specialEffectivedate");
            return (Criteria) this;
        }

        public Criteria andSpecialEffectivedateLessThanOrEqualTo(String value) {
            addCriterion("special_effectiveDate <=", value, "specialEffectivedate");
            return (Criteria) this;
        }

        public Criteria andSpecialEffectivedateLike(String value) {
            addCriterion("special_effectiveDate like", value, "specialEffectivedate");
            return (Criteria) this;
        }

        public Criteria andSpecialEffectivedateNotLike(String value) {
            addCriterion("special_effectiveDate not like", value, "specialEffectivedate");
            return (Criteria) this;
        }

        public Criteria andSpecialEffectivedateIn(List<String> values) {
            addCriterion("special_effectiveDate in", values, "specialEffectivedate");
            return (Criteria) this;
        }

        public Criteria andSpecialEffectivedateNotIn(List<String> values) {
            addCriterion("special_effectiveDate not in", values, "specialEffectivedate");
            return (Criteria) this;
        }

        public Criteria andSpecialEffectivedateBetween(String value1, String value2) {
            addCriterion("special_effectiveDate between", value1, value2, "specialEffectivedate");
            return (Criteria) this;
        }

        public Criteria andSpecialEffectivedateNotBetween(String value1, String value2) {
            addCriterion("special_effectiveDate not between", value1, value2, "specialEffectivedate");
            return (Criteria) this;
        }

        public Criteria andSpecialReview1IsNull() {
            addCriterion("special_review1 is null");
            return (Criteria) this;
        }

        public Criteria andSpecialReview1IsNotNull() {
            addCriterion("special_review1 is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialReview1EqualTo(String value) {
            addCriterion("special_review1 =", value, "specialReview1");
            return (Criteria) this;
        }

        public Criteria andSpecialReview1NotEqualTo(String value) {
            addCriterion("special_review1 <>", value, "specialReview1");
            return (Criteria) this;
        }

        public Criteria andSpecialReview1GreaterThan(String value) {
            addCriterion("special_review1 >", value, "specialReview1");
            return (Criteria) this;
        }

        public Criteria andSpecialReview1GreaterThanOrEqualTo(String value) {
            addCriterion("special_review1 >=", value, "specialReview1");
            return (Criteria) this;
        }

        public Criteria andSpecialReview1LessThan(String value) {
            addCriterion("special_review1 <", value, "specialReview1");
            return (Criteria) this;
        }

        public Criteria andSpecialReview1LessThanOrEqualTo(String value) {
            addCriterion("special_review1 <=", value, "specialReview1");
            return (Criteria) this;
        }

        public Criteria andSpecialReview1Like(String value) {
            addCriterion("special_review1 like", value, "specialReview1");
            return (Criteria) this;
        }

        public Criteria andSpecialReview1NotLike(String value) {
            addCriterion("special_review1 not like", value, "specialReview1");
            return (Criteria) this;
        }

        public Criteria andSpecialReview1In(List<String> values) {
            addCriterion("special_review1 in", values, "specialReview1");
            return (Criteria) this;
        }

        public Criteria andSpecialReview1NotIn(List<String> values) {
            addCriterion("special_review1 not in", values, "specialReview1");
            return (Criteria) this;
        }

        public Criteria andSpecialReview1Between(String value1, String value2) {
            addCriterion("special_review1 between", value1, value2, "specialReview1");
            return (Criteria) this;
        }

        public Criteria andSpecialReview1NotBetween(String value1, String value2) {
            addCriterion("special_review1 not between", value1, value2, "specialReview1");
            return (Criteria) this;
        }

        public Criteria andSpecialReview2IsNull() {
            addCriterion("special_review2 is null");
            return (Criteria) this;
        }

        public Criteria andSpecialReview2IsNotNull() {
            addCriterion("special_review2 is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialReview2EqualTo(String value) {
            addCriterion("special_review2 =", value, "specialReview2");
            return (Criteria) this;
        }

        public Criteria andSpecialReview2NotEqualTo(String value) {
            addCriterion("special_review2 <>", value, "specialReview2");
            return (Criteria) this;
        }

        public Criteria andSpecialReview2GreaterThan(String value) {
            addCriterion("special_review2 >", value, "specialReview2");
            return (Criteria) this;
        }

        public Criteria andSpecialReview2GreaterThanOrEqualTo(String value) {
            addCriterion("special_review2 >=", value, "specialReview2");
            return (Criteria) this;
        }

        public Criteria andSpecialReview2LessThan(String value) {
            addCriterion("special_review2 <", value, "specialReview2");
            return (Criteria) this;
        }

        public Criteria andSpecialReview2LessThanOrEqualTo(String value) {
            addCriterion("special_review2 <=", value, "specialReview2");
            return (Criteria) this;
        }

        public Criteria andSpecialReview2Like(String value) {
            addCriterion("special_review2 like", value, "specialReview2");
            return (Criteria) this;
        }

        public Criteria andSpecialReview2NotLike(String value) {
            addCriterion("special_review2 not like", value, "specialReview2");
            return (Criteria) this;
        }

        public Criteria andSpecialReview2In(List<String> values) {
            addCriterion("special_review2 in", values, "specialReview2");
            return (Criteria) this;
        }

        public Criteria andSpecialReview2NotIn(List<String> values) {
            addCriterion("special_review2 not in", values, "specialReview2");
            return (Criteria) this;
        }

        public Criteria andSpecialReview2Between(String value1, String value2) {
            addCriterion("special_review2 between", value1, value2, "specialReview2");
            return (Criteria) this;
        }

        public Criteria andSpecialReview2NotBetween(String value1, String value2) {
            addCriterion("special_review2 not between", value1, value2, "specialReview2");
            return (Criteria) this;
        }

        public Criteria andSpecialReview3IsNull() {
            addCriterion("special_review3 is null");
            return (Criteria) this;
        }

        public Criteria andSpecialReview3IsNotNull() {
            addCriterion("special_review3 is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialReview3EqualTo(String value) {
            addCriterion("special_review3 =", value, "specialReview3");
            return (Criteria) this;
        }

        public Criteria andSpecialReview3NotEqualTo(String value) {
            addCriterion("special_review3 <>", value, "specialReview3");
            return (Criteria) this;
        }

        public Criteria andSpecialReview3GreaterThan(String value) {
            addCriterion("special_review3 >", value, "specialReview3");
            return (Criteria) this;
        }

        public Criteria andSpecialReview3GreaterThanOrEqualTo(String value) {
            addCriterion("special_review3 >=", value, "specialReview3");
            return (Criteria) this;
        }

        public Criteria andSpecialReview3LessThan(String value) {
            addCriterion("special_review3 <", value, "specialReview3");
            return (Criteria) this;
        }

        public Criteria andSpecialReview3LessThanOrEqualTo(String value) {
            addCriterion("special_review3 <=", value, "specialReview3");
            return (Criteria) this;
        }

        public Criteria andSpecialReview3Like(String value) {
            addCriterion("special_review3 like", value, "specialReview3");
            return (Criteria) this;
        }

        public Criteria andSpecialReview3NotLike(String value) {
            addCriterion("special_review3 not like", value, "specialReview3");
            return (Criteria) this;
        }

        public Criteria andSpecialReview3In(List<String> values) {
            addCriterion("special_review3 in", values, "specialReview3");
            return (Criteria) this;
        }

        public Criteria andSpecialReview3NotIn(List<String> values) {
            addCriterion("special_review3 not in", values, "specialReview3");
            return (Criteria) this;
        }

        public Criteria andSpecialReview3Between(String value1, String value2) {
            addCriterion("special_review3 between", value1, value2, "specialReview3");
            return (Criteria) this;
        }

        public Criteria andSpecialReview3NotBetween(String value1, String value2) {
            addCriterion("special_review3 not between", value1, value2, "specialReview3");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}