package shougang.guigang.safety.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbBasicpersonnelinformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbBasicpersonnelinformationExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPersonIdIsNull() {
            addCriterion("person_id is null");
            return (Criteria) this;
        }

        public Criteria andPersonIdIsNotNull() {
            addCriterion("person_id is not null");
            return (Criteria) this;
        }

        public Criteria andPersonIdEqualTo(String value) {
            addCriterion("person_id =", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotEqualTo(String value) {
            addCriterion("person_id <>", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThan(String value) {
            addCriterion("person_id >", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("person_id >=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThan(String value) {
            addCriterion("person_id <", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThanOrEqualTo(String value) {
            addCriterion("person_id <=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLike(String value) {
            addCriterion("person_id like", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotLike(String value) {
            addCriterion("person_id not like", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdIn(List<String> values) {
            addCriterion("person_id in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotIn(List<String> values) {
            addCriterion("person_id not in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdBetween(String value1, String value2) {
            addCriterion("person_id between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotBetween(String value1, String value2) {
            addCriterion("person_id not between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonPasswordIsNull() {
            addCriterion("person_password is null");
            return (Criteria) this;
        }

        public Criteria andPersonPasswordIsNotNull() {
            addCriterion("person_password is not null");
            return (Criteria) this;
        }

        public Criteria andPersonPasswordEqualTo(String value) {
            addCriterion("person_password =", value, "personPassword");
            return (Criteria) this;
        }

        public Criteria andPersonPasswordNotEqualTo(String value) {
            addCriterion("person_password <>", value, "personPassword");
            return (Criteria) this;
        }

        public Criteria andPersonPasswordGreaterThan(String value) {
            addCriterion("person_password >", value, "personPassword");
            return (Criteria) this;
        }

        public Criteria andPersonPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("person_password >=", value, "personPassword");
            return (Criteria) this;
        }

        public Criteria andPersonPasswordLessThan(String value) {
            addCriterion("person_password <", value, "personPassword");
            return (Criteria) this;
        }

        public Criteria andPersonPasswordLessThanOrEqualTo(String value) {
            addCriterion("person_password <=", value, "personPassword");
            return (Criteria) this;
        }

        public Criteria andPersonPasswordLike(String value) {
            addCriterion("person_password like", value, "personPassword");
            return (Criteria) this;
        }

        public Criteria andPersonPasswordNotLike(String value) {
            addCriterion("person_password not like", value, "personPassword");
            return (Criteria) this;
        }

        public Criteria andPersonPasswordIn(List<String> values) {
            addCriterion("person_password in", values, "personPassword");
            return (Criteria) this;
        }

        public Criteria andPersonPasswordNotIn(List<String> values) {
            addCriterion("person_password not in", values, "personPassword");
            return (Criteria) this;
        }

        public Criteria andPersonPasswordBetween(String value1, String value2) {
            addCriterion("person_password between", value1, value2, "personPassword");
            return (Criteria) this;
        }

        public Criteria andPersonPasswordNotBetween(String value1, String value2) {
            addCriterion("person_password not between", value1, value2, "personPassword");
            return (Criteria) this;
        }

        public Criteria andPersonNameIsNull() {
            addCriterion("person_name is null");
            return (Criteria) this;
        }

        public Criteria andPersonNameIsNotNull() {
            addCriterion("person_name is not null");
            return (Criteria) this;
        }

        public Criteria andPersonNameEqualTo(String value) {
            addCriterion("person_name =", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotEqualTo(String value) {
            addCriterion("person_name <>", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThan(String value) {
            addCriterion("person_name >", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("person_name >=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThan(String value) {
            addCriterion("person_name <", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThanOrEqualTo(String value) {
            addCriterion("person_name <=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLike(String value) {
            addCriterion("person_name like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotLike(String value) {
            addCriterion("person_name not like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameIn(List<String> values) {
            addCriterion("person_name in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotIn(List<String> values) {
            addCriterion("person_name not in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameBetween(String value1, String value2) {
            addCriterion("person_name between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotBetween(String value1, String value2) {
            addCriterion("person_name not between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonSexIsNull() {
            addCriterion("person_sex is null");
            return (Criteria) this;
        }

        public Criteria andPersonSexIsNotNull() {
            addCriterion("person_sex is not null");
            return (Criteria) this;
        }

        public Criteria andPersonSexEqualTo(String value) {
            addCriterion("person_sex =", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexNotEqualTo(String value) {
            addCriterion("person_sex <>", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexGreaterThan(String value) {
            addCriterion("person_sex >", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexGreaterThanOrEqualTo(String value) {
            addCriterion("person_sex >=", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexLessThan(String value) {
            addCriterion("person_sex <", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexLessThanOrEqualTo(String value) {
            addCriterion("person_sex <=", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexLike(String value) {
            addCriterion("person_sex like", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexNotLike(String value) {
            addCriterion("person_sex not like", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexIn(List<String> values) {
            addCriterion("person_sex in", values, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexNotIn(List<String> values) {
            addCriterion("person_sex not in", values, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexBetween(String value1, String value2) {
            addCriterion("person_sex between", value1, value2, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexNotBetween(String value1, String value2) {
            addCriterion("person_sex not between", value1, value2, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonAgeIsNull() {
            addCriterion("person_age is null");
            return (Criteria) this;
        }

        public Criteria andPersonAgeIsNotNull() {
            addCriterion("person_age is not null");
            return (Criteria) this;
        }

        public Criteria andPersonAgeEqualTo(Byte value) {
            addCriterion("person_age =", value, "personAge");
            return (Criteria) this;
        }

        public Criteria andPersonAgeNotEqualTo(Byte value) {
            addCriterion("person_age <>", value, "personAge");
            return (Criteria) this;
        }

        public Criteria andPersonAgeGreaterThan(Byte value) {
            addCriterion("person_age >", value, "personAge");
            return (Criteria) this;
        }

        public Criteria andPersonAgeGreaterThanOrEqualTo(Byte value) {
            addCriterion("person_age >=", value, "personAge");
            return (Criteria) this;
        }

        public Criteria andPersonAgeLessThan(Byte value) {
            addCriterion("person_age <", value, "personAge");
            return (Criteria) this;
        }

        public Criteria andPersonAgeLessThanOrEqualTo(Byte value) {
            addCriterion("person_age <=", value, "personAge");
            return (Criteria) this;
        }

        public Criteria andPersonAgeIn(List<Byte> values) {
            addCriterion("person_age in", values, "personAge");
            return (Criteria) this;
        }

        public Criteria andPersonAgeNotIn(List<Byte> values) {
            addCriterion("person_age not in", values, "personAge");
            return (Criteria) this;
        }

        public Criteria andPersonAgeBetween(Byte value1, Byte value2) {
            addCriterion("person_age between", value1, value2, "personAge");
            return (Criteria) this;
        }

        public Criteria andPersonAgeNotBetween(Byte value1, Byte value2) {
            addCriterion("person_age not between", value1, value2, "personAge");
            return (Criteria) this;
        }

        public Criteria andPersonBirthdayIsNull() {
            addCriterion("person_birthday is null");
            return (Criteria) this;
        }

        public Criteria andPersonBirthdayIsNotNull() {
            addCriterion("person_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andPersonBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("person_birthday =", value, "personBirthday");
            return (Criteria) this;
        }

        public Criteria andPersonBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("person_birthday <>", value, "personBirthday");
            return (Criteria) this;
        }

        public Criteria andPersonBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("person_birthday >", value, "personBirthday");
            return (Criteria) this;
        }

        public Criteria andPersonBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("person_birthday >=", value, "personBirthday");
            return (Criteria) this;
        }

        public Criteria andPersonBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("person_birthday <", value, "personBirthday");
            return (Criteria) this;
        }

        public Criteria andPersonBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("person_birthday <=", value, "personBirthday");
            return (Criteria) this;
        }

        public Criteria andPersonBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("person_birthday in", values, "personBirthday");
            return (Criteria) this;
        }

        public Criteria andPersonBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("person_birthday not in", values, "personBirthday");
            return (Criteria) this;
        }

        public Criteria andPersonBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("person_birthday between", value1, value2, "personBirthday");
            return (Criteria) this;
        }

        public Criteria andPersonBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("person_birthday not between", value1, value2, "personBirthday");
            return (Criteria) this;
        }

        public Criteria andPersonEducationIsNull() {
            addCriterion("person_education is null");
            return (Criteria) this;
        }

        public Criteria andPersonEducationIsNotNull() {
            addCriterion("person_education is not null");
            return (Criteria) this;
        }

        public Criteria andPersonEducationEqualTo(String value) {
            addCriterion("person_education =", value, "personEducation");
            return (Criteria) this;
        }

        public Criteria andPersonEducationNotEqualTo(String value) {
            addCriterion("person_education <>", value, "personEducation");
            return (Criteria) this;
        }

        public Criteria andPersonEducationGreaterThan(String value) {
            addCriterion("person_education >", value, "personEducation");
            return (Criteria) this;
        }

        public Criteria andPersonEducationGreaterThanOrEqualTo(String value) {
            addCriterion("person_education >=", value, "personEducation");
            return (Criteria) this;
        }

        public Criteria andPersonEducationLessThan(String value) {
            addCriterion("person_education <", value, "personEducation");
            return (Criteria) this;
        }

        public Criteria andPersonEducationLessThanOrEqualTo(String value) {
            addCriterion("person_education <=", value, "personEducation");
            return (Criteria) this;
        }

        public Criteria andPersonEducationLike(String value) {
            addCriterion("person_education like", value, "personEducation");
            return (Criteria) this;
        }

        public Criteria andPersonEducationNotLike(String value) {
            addCriterion("person_education not like", value, "personEducation");
            return (Criteria) this;
        }

        public Criteria andPersonEducationIn(List<String> values) {
            addCriterion("person_education in", values, "personEducation");
            return (Criteria) this;
        }

        public Criteria andPersonEducationNotIn(List<String> values) {
            addCriterion("person_education not in", values, "personEducation");
            return (Criteria) this;
        }

        public Criteria andPersonEducationBetween(String value1, String value2) {
            addCriterion("person_education between", value1, value2, "personEducation");
            return (Criteria) this;
        }

        public Criteria andPersonEducationNotBetween(String value1, String value2) {
            addCriterion("person_education not between", value1, value2, "personEducation");
            return (Criteria) this;
        }

        public Criteria andPersonUnitIsNull() {
            addCriterion("person_unit is null");
            return (Criteria) this;
        }

        public Criteria andPersonUnitIsNotNull() {
            addCriterion("person_unit is not null");
            return (Criteria) this;
        }

        public Criteria andPersonUnitEqualTo(String value) {
            addCriterion("person_unit =", value, "personUnit");
            return (Criteria) this;
        }

        public Criteria andPersonUnitNotEqualTo(String value) {
            addCriterion("person_unit <>", value, "personUnit");
            return (Criteria) this;
        }

        public Criteria andPersonUnitGreaterThan(String value) {
            addCriterion("person_unit >", value, "personUnit");
            return (Criteria) this;
        }

        public Criteria andPersonUnitGreaterThanOrEqualTo(String value) {
            addCriterion("person_unit >=", value, "personUnit");
            return (Criteria) this;
        }

        public Criteria andPersonUnitLessThan(String value) {
            addCriterion("person_unit <", value, "personUnit");
            return (Criteria) this;
        }

        public Criteria andPersonUnitLessThanOrEqualTo(String value) {
            addCriterion("person_unit <=", value, "personUnit");
            return (Criteria) this;
        }

        public Criteria andPersonUnitLike(String value) {
            addCriterion("person_unit like", value, "personUnit");
            return (Criteria) this;
        }

        public Criteria andPersonUnitNotLike(String value) {
            addCriterion("person_unit not like", value, "personUnit");
            return (Criteria) this;
        }

        public Criteria andPersonUnitIn(List<String> values) {
            addCriterion("person_unit in", values, "personUnit");
            return (Criteria) this;
        }

        public Criteria andPersonUnitNotIn(List<String> values) {
            addCriterion("person_unit not in", values, "personUnit");
            return (Criteria) this;
        }

        public Criteria andPersonUnitBetween(String value1, String value2) {
            addCriterion("person_unit between", value1, value2, "personUnit");
            return (Criteria) this;
        }

        public Criteria andPersonUnitNotBetween(String value1, String value2) {
            addCriterion("person_unit not between", value1, value2, "personUnit");
            return (Criteria) this;
        }

        public Criteria andPersonPostIsNull() {
            addCriterion("person_post is null");
            return (Criteria) this;
        }

        public Criteria andPersonPostIsNotNull() {
            addCriterion("person_post is not null");
            return (Criteria) this;
        }

        public Criteria andPersonPostEqualTo(String value) {
            addCriterion("person_post =", value, "personPost");
            return (Criteria) this;
        }

        public Criteria andPersonPostNotEqualTo(String value) {
            addCriterion("person_post <>", value, "personPost");
            return (Criteria) this;
        }

        public Criteria andPersonPostGreaterThan(String value) {
            addCriterion("person_post >", value, "personPost");
            return (Criteria) this;
        }

        public Criteria andPersonPostGreaterThanOrEqualTo(String value) {
            addCriterion("person_post >=", value, "personPost");
            return (Criteria) this;
        }

        public Criteria andPersonPostLessThan(String value) {
            addCriterion("person_post <", value, "personPost");
            return (Criteria) this;
        }

        public Criteria andPersonPostLessThanOrEqualTo(String value) {
            addCriterion("person_post <=", value, "personPost");
            return (Criteria) this;
        }

        public Criteria andPersonPostLike(String value) {
            addCriterion("person_post like", value, "personPost");
            return (Criteria) this;
        }

        public Criteria andPersonPostNotLike(String value) {
            addCriterion("person_post not like", value, "personPost");
            return (Criteria) this;
        }

        public Criteria andPersonPostIn(List<String> values) {
            addCriterion("person_post in", values, "personPost");
            return (Criteria) this;
        }

        public Criteria andPersonPostNotIn(List<String> values) {
            addCriterion("person_post not in", values, "personPost");
            return (Criteria) this;
        }

        public Criteria andPersonPostBetween(String value1, String value2) {
            addCriterion("person_post between", value1, value2, "personPost");
            return (Criteria) this;
        }

        public Criteria andPersonPostNotBetween(String value1, String value2) {
            addCriterion("person_post not between", value1, value2, "personPost");
            return (Criteria) this;
        }

        public Criteria andPersonTeamIsNull() {
            addCriterion("person_team is null");
            return (Criteria) this;
        }

        public Criteria andPersonTeamIsNotNull() {
            addCriterion("person_team is not null");
            return (Criteria) this;
        }

        public Criteria andPersonTeamEqualTo(String value) {
            addCriterion("person_team =", value, "personTeam");
            return (Criteria) this;
        }

        public Criteria andPersonTeamNotEqualTo(String value) {
            addCriterion("person_team <>", value, "personTeam");
            return (Criteria) this;
        }

        public Criteria andPersonTeamGreaterThan(String value) {
            addCriterion("person_team >", value, "personTeam");
            return (Criteria) this;
        }

        public Criteria andPersonTeamGreaterThanOrEqualTo(String value) {
            addCriterion("person_team >=", value, "personTeam");
            return (Criteria) this;
        }

        public Criteria andPersonTeamLessThan(String value) {
            addCriterion("person_team <", value, "personTeam");
            return (Criteria) this;
        }

        public Criteria andPersonTeamLessThanOrEqualTo(String value) {
            addCriterion("person_team <=", value, "personTeam");
            return (Criteria) this;
        }

        public Criteria andPersonTeamLike(String value) {
            addCriterion("person_team like", value, "personTeam");
            return (Criteria) this;
        }

        public Criteria andPersonTeamNotLike(String value) {
            addCriterion("person_team not like", value, "personTeam");
            return (Criteria) this;
        }

        public Criteria andPersonTeamIn(List<String> values) {
            addCriterion("person_team in", values, "personTeam");
            return (Criteria) this;
        }

        public Criteria andPersonTeamNotIn(List<String> values) {
            addCriterion("person_team not in", values, "personTeam");
            return (Criteria) this;
        }

        public Criteria andPersonTeamBetween(String value1, String value2) {
            addCriterion("person_team between", value1, value2, "personTeam");
            return (Criteria) this;
        }

        public Criteria andPersonTeamNotBetween(String value1, String value2) {
            addCriterion("person_team not between", value1, value2, "personTeam");
            return (Criteria) this;
        }

        public Criteria andPersonPoliticalIsNull() {
            addCriterion("person_political is null");
            return (Criteria) this;
        }

        public Criteria andPersonPoliticalIsNotNull() {
            addCriterion("person_political is not null");
            return (Criteria) this;
        }

        public Criteria andPersonPoliticalEqualTo(String value) {
            addCriterion("person_political =", value, "personPolitical");
            return (Criteria) this;
        }

        public Criteria andPersonPoliticalNotEqualTo(String value) {
            addCriterion("person_political <>", value, "personPolitical");
            return (Criteria) this;
        }

        public Criteria andPersonPoliticalGreaterThan(String value) {
            addCriterion("person_political >", value, "personPolitical");
            return (Criteria) this;
        }

        public Criteria andPersonPoliticalGreaterThanOrEqualTo(String value) {
            addCriterion("person_political >=", value, "personPolitical");
            return (Criteria) this;
        }

        public Criteria andPersonPoliticalLessThan(String value) {
            addCriterion("person_political <", value, "personPolitical");
            return (Criteria) this;
        }

        public Criteria andPersonPoliticalLessThanOrEqualTo(String value) {
            addCriterion("person_political <=", value, "personPolitical");
            return (Criteria) this;
        }

        public Criteria andPersonPoliticalLike(String value) {
            addCriterion("person_political like", value, "personPolitical");
            return (Criteria) this;
        }

        public Criteria andPersonPoliticalNotLike(String value) {
            addCriterion("person_political not like", value, "personPolitical");
            return (Criteria) this;
        }

        public Criteria andPersonPoliticalIn(List<String> values) {
            addCriterion("person_political in", values, "personPolitical");
            return (Criteria) this;
        }

        public Criteria andPersonPoliticalNotIn(List<String> values) {
            addCriterion("person_political not in", values, "personPolitical");
            return (Criteria) this;
        }

        public Criteria andPersonPoliticalBetween(String value1, String value2) {
            addCriterion("person_political between", value1, value2, "personPolitical");
            return (Criteria) this;
        }

        public Criteria andPersonPoliticalNotBetween(String value1, String value2) {
            addCriterion("person_political not between", value1, value2, "personPolitical");
            return (Criteria) this;
        }

        public Criteria andPersonNativeplaceIsNull() {
            addCriterion("person_nativePlace is null");
            return (Criteria) this;
        }

        public Criteria andPersonNativeplaceIsNotNull() {
            addCriterion("person_nativePlace is not null");
            return (Criteria) this;
        }

        public Criteria andPersonNativeplaceEqualTo(String value) {
            addCriterion("person_nativePlace =", value, "personNativeplace");
            return (Criteria) this;
        }

        public Criteria andPersonNativeplaceNotEqualTo(String value) {
            addCriterion("person_nativePlace <>", value, "personNativeplace");
            return (Criteria) this;
        }

        public Criteria andPersonNativeplaceGreaterThan(String value) {
            addCriterion("person_nativePlace >", value, "personNativeplace");
            return (Criteria) this;
        }

        public Criteria andPersonNativeplaceGreaterThanOrEqualTo(String value) {
            addCriterion("person_nativePlace >=", value, "personNativeplace");
            return (Criteria) this;
        }

        public Criteria andPersonNativeplaceLessThan(String value) {
            addCriterion("person_nativePlace <", value, "personNativeplace");
            return (Criteria) this;
        }

        public Criteria andPersonNativeplaceLessThanOrEqualTo(String value) {
            addCriterion("person_nativePlace <=", value, "personNativeplace");
            return (Criteria) this;
        }

        public Criteria andPersonNativeplaceLike(String value) {
            addCriterion("person_nativePlace like", value, "personNativeplace");
            return (Criteria) this;
        }

        public Criteria andPersonNativeplaceNotLike(String value) {
            addCriterion("person_nativePlace not like", value, "personNativeplace");
            return (Criteria) this;
        }

        public Criteria andPersonNativeplaceIn(List<String> values) {
            addCriterion("person_nativePlace in", values, "personNativeplace");
            return (Criteria) this;
        }

        public Criteria andPersonNativeplaceNotIn(List<String> values) {
            addCriterion("person_nativePlace not in", values, "personNativeplace");
            return (Criteria) this;
        }

        public Criteria andPersonNativeplaceBetween(String value1, String value2) {
            addCriterion("person_nativePlace between", value1, value2, "personNativeplace");
            return (Criteria) this;
        }

        public Criteria andPersonNativeplaceNotBetween(String value1, String value2) {
            addCriterion("person_nativePlace not between", value1, value2, "personNativeplace");
            return (Criteria) this;
        }

        public Criteria andPersonAddressIsNull() {
            addCriterion("person_address is null");
            return (Criteria) this;
        }

        public Criteria andPersonAddressIsNotNull() {
            addCriterion("person_address is not null");
            return (Criteria) this;
        }

        public Criteria andPersonAddressEqualTo(String value) {
            addCriterion("person_address =", value, "personAddress");
            return (Criteria) this;
        }

        public Criteria andPersonAddressNotEqualTo(String value) {
            addCriterion("person_address <>", value, "personAddress");
            return (Criteria) this;
        }

        public Criteria andPersonAddressGreaterThan(String value) {
            addCriterion("person_address >", value, "personAddress");
            return (Criteria) this;
        }

        public Criteria andPersonAddressGreaterThanOrEqualTo(String value) {
            addCriterion("person_address >=", value, "personAddress");
            return (Criteria) this;
        }

        public Criteria andPersonAddressLessThan(String value) {
            addCriterion("person_address <", value, "personAddress");
            return (Criteria) this;
        }

        public Criteria andPersonAddressLessThanOrEqualTo(String value) {
            addCriterion("person_address <=", value, "personAddress");
            return (Criteria) this;
        }

        public Criteria andPersonAddressLike(String value) {
            addCriterion("person_address like", value, "personAddress");
            return (Criteria) this;
        }

        public Criteria andPersonAddressNotLike(String value) {
            addCriterion("person_address not like", value, "personAddress");
            return (Criteria) this;
        }

        public Criteria andPersonAddressIn(List<String> values) {
            addCriterion("person_address in", values, "personAddress");
            return (Criteria) this;
        }

        public Criteria andPersonAddressNotIn(List<String> values) {
            addCriterion("person_address not in", values, "personAddress");
            return (Criteria) this;
        }

        public Criteria andPersonAddressBetween(String value1, String value2) {
            addCriterion("person_address between", value1, value2, "personAddress");
            return (Criteria) this;
        }

        public Criteria andPersonAddressNotBetween(String value1, String value2) {
            addCriterion("person_address not between", value1, value2, "personAddress");
            return (Criteria) this;
        }

        public Criteria andPersonStartworkIsNull() {
            addCriterion("person_startWork is null");
            return (Criteria) this;
        }

        public Criteria andPersonStartworkIsNotNull() {
            addCriterion("person_startWork is not null");
            return (Criteria) this;
        }

        public Criteria andPersonStartworkEqualTo(Date value) {
            addCriterionForJDBCDate("person_startWork =", value, "personStartwork");
            return (Criteria) this;
        }

        public Criteria andPersonStartworkNotEqualTo(Date value) {
            addCriterionForJDBCDate("person_startWork <>", value, "personStartwork");
            return (Criteria) this;
        }

        public Criteria andPersonStartworkGreaterThan(Date value) {
            addCriterionForJDBCDate("person_startWork >", value, "personStartwork");
            return (Criteria) this;
        }

        public Criteria andPersonStartworkGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("person_startWork >=", value, "personStartwork");
            return (Criteria) this;
        }

        public Criteria andPersonStartworkLessThan(Date value) {
            addCriterionForJDBCDate("person_startWork <", value, "personStartwork");
            return (Criteria) this;
        }

        public Criteria andPersonStartworkLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("person_startWork <=", value, "personStartwork");
            return (Criteria) this;
        }

        public Criteria andPersonStartworkIn(List<Date> values) {
            addCriterionForJDBCDate("person_startWork in", values, "personStartwork");
            return (Criteria) this;
        }

        public Criteria andPersonStartworkNotIn(List<Date> values) {
            addCriterionForJDBCDate("person_startWork not in", values, "personStartwork");
            return (Criteria) this;
        }

        public Criteria andPersonStartworkBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("person_startWork between", value1, value2, "personStartwork");
            return (Criteria) this;
        }

        public Criteria andPersonStartworkNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("person_startWork not between", value1, value2, "personStartwork");
            return (Criteria) this;
        }

        public Criteria andPersonStart3workIsNull() {
            addCriterion("person_start3work is null");
            return (Criteria) this;
        }

        public Criteria andPersonStart3workIsNotNull() {
            addCriterion("person_start3work is not null");
            return (Criteria) this;
        }

        public Criteria andPersonStart3workEqualTo(Date value) {
            addCriterionForJDBCDate("person_start3work =", value, "personStart3work");
            return (Criteria) this;
        }

        public Criteria andPersonStart3workNotEqualTo(Date value) {
            addCriterionForJDBCDate("person_start3work <>", value, "personStart3work");
            return (Criteria) this;
        }

        public Criteria andPersonStart3workGreaterThan(Date value) {
            addCriterionForJDBCDate("person_start3work >", value, "personStart3work");
            return (Criteria) this;
        }

        public Criteria andPersonStart3workGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("person_start3work >=", value, "personStart3work");
            return (Criteria) this;
        }

        public Criteria andPersonStart3workLessThan(Date value) {
            addCriterionForJDBCDate("person_start3work <", value, "personStart3work");
            return (Criteria) this;
        }

        public Criteria andPersonStart3workLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("person_start3work <=", value, "personStart3work");
            return (Criteria) this;
        }

        public Criteria andPersonStart3workIn(List<Date> values) {
            addCriterionForJDBCDate("person_start3work in", values, "personStart3work");
            return (Criteria) this;
        }

        public Criteria andPersonStart3workNotIn(List<Date> values) {
            addCriterionForJDBCDate("person_start3work not in", values, "personStart3work");
            return (Criteria) this;
        }

        public Criteria andPersonStart3workBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("person_start3work between", value1, value2, "personStart3work");
            return (Criteria) this;
        }

        public Criteria andPersonStart3workNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("person_start3work not between", value1, value2, "personStart3work");
            return (Criteria) this;
        }

        public Criteria andPersonStartpostIsNull() {
            addCriterion("person_startPost is null");
            return (Criteria) this;
        }

        public Criteria andPersonStartpostIsNotNull() {
            addCriterion("person_startPost is not null");
            return (Criteria) this;
        }

        public Criteria andPersonStartpostEqualTo(String value) {
            addCriterion("person_startPost =", value, "personStartpost");
            return (Criteria) this;
        }

        public Criteria andPersonStartpostNotEqualTo(String value) {
            addCriterion("person_startPost <>", value, "personStartpost");
            return (Criteria) this;
        }

        public Criteria andPersonStartpostGreaterThan(String value) {
            addCriterion("person_startPost >", value, "personStartpost");
            return (Criteria) this;
        }

        public Criteria andPersonStartpostGreaterThanOrEqualTo(String value) {
            addCriterion("person_startPost >=", value, "personStartpost");
            return (Criteria) this;
        }

        public Criteria andPersonStartpostLessThan(String value) {
            addCriterion("person_startPost <", value, "personStartpost");
            return (Criteria) this;
        }

        public Criteria andPersonStartpostLessThanOrEqualTo(String value) {
            addCriterion("person_startPost <=", value, "personStartpost");
            return (Criteria) this;
        }

        public Criteria andPersonStartpostLike(String value) {
            addCriterion("person_startPost like", value, "personStartpost");
            return (Criteria) this;
        }

        public Criteria andPersonStartpostNotLike(String value) {
            addCriterion("person_startPost not like", value, "personStartpost");
            return (Criteria) this;
        }

        public Criteria andPersonStartpostIn(List<String> values) {
            addCriterion("person_startPost in", values, "personStartpost");
            return (Criteria) this;
        }

        public Criteria andPersonStartpostNotIn(List<String> values) {
            addCriterion("person_startPost not in", values, "personStartpost");
            return (Criteria) this;
        }

        public Criteria andPersonStartpostBetween(String value1, String value2) {
            addCriterion("person_startPost between", value1, value2, "personStartpost");
            return (Criteria) this;
        }

        public Criteria andPersonStartpostNotBetween(String value1, String value2) {
            addCriterion("person_startPost not between", value1, value2, "personStartpost");
            return (Criteria) this;
        }

        public Criteria andPersonPostlevelIsNull() {
            addCriterion("person_postLevel is null");
            return (Criteria) this;
        }

        public Criteria andPersonPostlevelIsNotNull() {
            addCriterion("person_postLevel is not null");
            return (Criteria) this;
        }

        public Criteria andPersonPostlevelEqualTo(String value) {
            addCriterion("person_postLevel =", value, "personPostlevel");
            return (Criteria) this;
        }

        public Criteria andPersonPostlevelNotEqualTo(String value) {
            addCriterion("person_postLevel <>", value, "personPostlevel");
            return (Criteria) this;
        }

        public Criteria andPersonPostlevelGreaterThan(String value) {
            addCriterion("person_postLevel >", value, "personPostlevel");
            return (Criteria) this;
        }

        public Criteria andPersonPostlevelGreaterThanOrEqualTo(String value) {
            addCriterion("person_postLevel >=", value, "personPostlevel");
            return (Criteria) this;
        }

        public Criteria andPersonPostlevelLessThan(String value) {
            addCriterion("person_postLevel <", value, "personPostlevel");
            return (Criteria) this;
        }

        public Criteria andPersonPostlevelLessThanOrEqualTo(String value) {
            addCriterion("person_postLevel <=", value, "personPostlevel");
            return (Criteria) this;
        }

        public Criteria andPersonPostlevelLike(String value) {
            addCriterion("person_postLevel like", value, "personPostlevel");
            return (Criteria) this;
        }

        public Criteria andPersonPostlevelNotLike(String value) {
            addCriterion("person_postLevel not like", value, "personPostlevel");
            return (Criteria) this;
        }

        public Criteria andPersonPostlevelIn(List<String> values) {
            addCriterion("person_postLevel in", values, "personPostlevel");
            return (Criteria) this;
        }

        public Criteria andPersonPostlevelNotIn(List<String> values) {
            addCriterion("person_postLevel not in", values, "personPostlevel");
            return (Criteria) this;
        }

        public Criteria andPersonPostlevelBetween(String value1, String value2) {
            addCriterion("person_postLevel between", value1, value2, "personPostlevel");
            return (Criteria) this;
        }

        public Criteria andPersonPostlevelNotBetween(String value1, String value2) {
            addCriterion("person_postLevel not between", value1, value2, "personPostlevel");
            return (Criteria) this;
        }

        public Criteria andPersonWorktypeIsNull() {
            addCriterion("person_workType is null");
            return (Criteria) this;
        }

        public Criteria andPersonWorktypeIsNotNull() {
            addCriterion("person_workType is not null");
            return (Criteria) this;
        }

        public Criteria andPersonWorktypeEqualTo(String value) {
            addCriterion("person_workType =", value, "personWorktype");
            return (Criteria) this;
        }

        public Criteria andPersonWorktypeNotEqualTo(String value) {
            addCriterion("person_workType <>", value, "personWorktype");
            return (Criteria) this;
        }

        public Criteria andPersonWorktypeGreaterThan(String value) {
            addCriterion("person_workType >", value, "personWorktype");
            return (Criteria) this;
        }

        public Criteria andPersonWorktypeGreaterThanOrEqualTo(String value) {
            addCriterion("person_workType >=", value, "personWorktype");
            return (Criteria) this;
        }

        public Criteria andPersonWorktypeLessThan(String value) {
            addCriterion("person_workType <", value, "personWorktype");
            return (Criteria) this;
        }

        public Criteria andPersonWorktypeLessThanOrEqualTo(String value) {
            addCriterion("person_workType <=", value, "personWorktype");
            return (Criteria) this;
        }

        public Criteria andPersonWorktypeLike(String value) {
            addCriterion("person_workType like", value, "personWorktype");
            return (Criteria) this;
        }

        public Criteria andPersonWorktypeNotLike(String value) {
            addCriterion("person_workType not like", value, "personWorktype");
            return (Criteria) this;
        }

        public Criteria andPersonWorktypeIn(List<String> values) {
            addCriterion("person_workType in", values, "personWorktype");
            return (Criteria) this;
        }

        public Criteria andPersonWorktypeNotIn(List<String> values) {
            addCriterion("person_workType not in", values, "personWorktype");
            return (Criteria) this;
        }

        public Criteria andPersonWorktypeBetween(String value1, String value2) {
            addCriterion("person_workType between", value1, value2, "personWorktype");
            return (Criteria) this;
        }

        public Criteria andPersonWorktypeNotBetween(String value1, String value2) {
            addCriterion("person_workType not between", value1, value2, "personWorktype");
            return (Criteria) this;
        }

        public Criteria andPersonSpecialIsNull() {
            addCriterion("person_special is null");
            return (Criteria) this;
        }

        public Criteria andPersonSpecialIsNotNull() {
            addCriterion("person_special is not null");
            return (Criteria) this;
        }

        public Criteria andPersonSpecialEqualTo(String value) {
            addCriterion("person_special =", value, "personSpecial");
            return (Criteria) this;
        }

        public Criteria andPersonSpecialNotEqualTo(String value) {
            addCriterion("person_special <>", value, "personSpecial");
            return (Criteria) this;
        }

        public Criteria andPersonSpecialGreaterThan(String value) {
            addCriterion("person_special >", value, "personSpecial");
            return (Criteria) this;
        }

        public Criteria andPersonSpecialGreaterThanOrEqualTo(String value) {
            addCriterion("person_special >=", value, "personSpecial");
            return (Criteria) this;
        }

        public Criteria andPersonSpecialLessThan(String value) {
            addCriterion("person_special <", value, "personSpecial");
            return (Criteria) this;
        }

        public Criteria andPersonSpecialLessThanOrEqualTo(String value) {
            addCriterion("person_special <=", value, "personSpecial");
            return (Criteria) this;
        }

        public Criteria andPersonSpecialLike(String value) {
            addCriterion("person_special like", value, "personSpecial");
            return (Criteria) this;
        }

        public Criteria andPersonSpecialNotLike(String value) {
            addCriterion("person_special not like", value, "personSpecial");
            return (Criteria) this;
        }

        public Criteria andPersonSpecialIn(List<String> values) {
            addCriterion("person_special in", values, "personSpecial");
            return (Criteria) this;
        }

        public Criteria andPersonSpecialNotIn(List<String> values) {
            addCriterion("person_special not in", values, "personSpecial");
            return (Criteria) this;
        }

        public Criteria andPersonSpecialBetween(String value1, String value2) {
            addCriterion("person_special between", value1, value2, "personSpecial");
            return (Criteria) this;
        }

        public Criteria andPersonSpecialNotBetween(String value1, String value2) {
            addCriterion("person_special not between", value1, value2, "personSpecial");
            return (Criteria) this;
        }

        public Criteria andPersonOnecardIsNull() {
            addCriterion("person_oneCard is null");
            return (Criteria) this;
        }

        public Criteria andPersonOnecardIsNotNull() {
            addCriterion("person_oneCard is not null");
            return (Criteria) this;
        }

        public Criteria andPersonOnecardEqualTo(String value) {
            addCriterion("person_oneCard =", value, "personOnecard");
            return (Criteria) this;
        }

        public Criteria andPersonOnecardNotEqualTo(String value) {
            addCriterion("person_oneCard <>", value, "personOnecard");
            return (Criteria) this;
        }

        public Criteria andPersonOnecardGreaterThan(String value) {
            addCriterion("person_oneCard >", value, "personOnecard");
            return (Criteria) this;
        }

        public Criteria andPersonOnecardGreaterThanOrEqualTo(String value) {
            addCriterion("person_oneCard >=", value, "personOnecard");
            return (Criteria) this;
        }

        public Criteria andPersonOnecardLessThan(String value) {
            addCriterion("person_oneCard <", value, "personOnecard");
            return (Criteria) this;
        }

        public Criteria andPersonOnecardLessThanOrEqualTo(String value) {
            addCriterion("person_oneCard <=", value, "personOnecard");
            return (Criteria) this;
        }

        public Criteria andPersonOnecardLike(String value) {
            addCriterion("person_oneCard like", value, "personOnecard");
            return (Criteria) this;
        }

        public Criteria andPersonOnecardNotLike(String value) {
            addCriterion("person_oneCard not like", value, "personOnecard");
            return (Criteria) this;
        }

        public Criteria andPersonOnecardIn(List<String> values) {
            addCriterion("person_oneCard in", values, "personOnecard");
            return (Criteria) this;
        }

        public Criteria andPersonOnecardNotIn(List<String> values) {
            addCriterion("person_oneCard not in", values, "personOnecard");
            return (Criteria) this;
        }

        public Criteria andPersonOnecardBetween(String value1, String value2) {
            addCriterion("person_oneCard between", value1, value2, "personOnecard");
            return (Criteria) this;
        }

        public Criteria andPersonOnecardNotBetween(String value1, String value2) {
            addCriterion("person_oneCard not between", value1, value2, "personOnecard");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneIsNull() {
            addCriterion("person_phone is null");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneIsNotNull() {
            addCriterion("person_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneEqualTo(String value) {
            addCriterion("person_phone =", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneNotEqualTo(String value) {
            addCriterion("person_phone <>", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneGreaterThan(String value) {
            addCriterion("person_phone >", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("person_phone >=", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneLessThan(String value) {
            addCriterion("person_phone <", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneLessThanOrEqualTo(String value) {
            addCriterion("person_phone <=", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneLike(String value) {
            addCriterion("person_phone like", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneNotLike(String value) {
            addCriterion("person_phone not like", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneIn(List<String> values) {
            addCriterion("person_phone in", values, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneNotIn(List<String> values) {
            addCriterion("person_phone not in", values, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneBetween(String value1, String value2) {
            addCriterion("person_phone between", value1, value2, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneNotBetween(String value1, String value2) {
            addCriterion("person_phone not between", value1, value2, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonEmergencypersonIsNull() {
            addCriterion("person_emergencyPerson is null");
            return (Criteria) this;
        }

        public Criteria andPersonEmergencypersonIsNotNull() {
            addCriterion("person_emergencyPerson is not null");
            return (Criteria) this;
        }

        public Criteria andPersonEmergencypersonEqualTo(String value) {
            addCriterion("person_emergencyPerson =", value, "personEmergencyperson");
            return (Criteria) this;
        }

        public Criteria andPersonEmergencypersonNotEqualTo(String value) {
            addCriterion("person_emergencyPerson <>", value, "personEmergencyperson");
            return (Criteria) this;
        }

        public Criteria andPersonEmergencypersonGreaterThan(String value) {
            addCriterion("person_emergencyPerson >", value, "personEmergencyperson");
            return (Criteria) this;
        }

        public Criteria andPersonEmergencypersonGreaterThanOrEqualTo(String value) {
            addCriterion("person_emergencyPerson >=", value, "personEmergencyperson");
            return (Criteria) this;
        }

        public Criteria andPersonEmergencypersonLessThan(String value) {
            addCriterion("person_emergencyPerson <", value, "personEmergencyperson");
            return (Criteria) this;
        }

        public Criteria andPersonEmergencypersonLessThanOrEqualTo(String value) {
            addCriterion("person_emergencyPerson <=", value, "personEmergencyperson");
            return (Criteria) this;
        }

        public Criteria andPersonEmergencypersonLike(String value) {
            addCriterion("person_emergencyPerson like", value, "personEmergencyperson");
            return (Criteria) this;
        }

        public Criteria andPersonEmergencypersonNotLike(String value) {
            addCriterion("person_emergencyPerson not like", value, "personEmergencyperson");
            return (Criteria) this;
        }

        public Criteria andPersonEmergencypersonIn(List<String> values) {
            addCriterion("person_emergencyPerson in", values, "personEmergencyperson");
            return (Criteria) this;
        }

        public Criteria andPersonEmergencypersonNotIn(List<String> values) {
            addCriterion("person_emergencyPerson not in", values, "personEmergencyperson");
            return (Criteria) this;
        }

        public Criteria andPersonEmergencypersonBetween(String value1, String value2) {
            addCriterion("person_emergencyPerson between", value1, value2, "personEmergencyperson");
            return (Criteria) this;
        }

        public Criteria andPersonEmergencypersonNotBetween(String value1, String value2) {
            addCriterion("person_emergencyPerson not between", value1, value2, "personEmergencyperson");
            return (Criteria) this;
        }

        public Criteria andPersonEmergencynumberIsNull() {
            addCriterion("person_emergencyNumber is null");
            return (Criteria) this;
        }

        public Criteria andPersonEmergencynumberIsNotNull() {
            addCriterion("person_emergencyNumber is not null");
            return (Criteria) this;
        }

        public Criteria andPersonEmergencynumberEqualTo(String value) {
            addCriterion("person_emergencyNumber =", value, "personEmergencynumber");
            return (Criteria) this;
        }

        public Criteria andPersonEmergencynumberNotEqualTo(String value) {
            addCriterion("person_emergencyNumber <>", value, "personEmergencynumber");
            return (Criteria) this;
        }

        public Criteria andPersonEmergencynumberGreaterThan(String value) {
            addCriterion("person_emergencyNumber >", value, "personEmergencynumber");
            return (Criteria) this;
        }

        public Criteria andPersonEmergencynumberGreaterThanOrEqualTo(String value) {
            addCriterion("person_emergencyNumber >=", value, "personEmergencynumber");
            return (Criteria) this;
        }

        public Criteria andPersonEmergencynumberLessThan(String value) {
            addCriterion("person_emergencyNumber <", value, "personEmergencynumber");
            return (Criteria) this;
        }

        public Criteria andPersonEmergencynumberLessThanOrEqualTo(String value) {
            addCriterion("person_emergencyNumber <=", value, "personEmergencynumber");
            return (Criteria) this;
        }

        public Criteria andPersonEmergencynumberLike(String value) {
            addCriterion("person_emergencyNumber like", value, "personEmergencynumber");
            return (Criteria) this;
        }

        public Criteria andPersonEmergencynumberNotLike(String value) {
            addCriterion("person_emergencyNumber not like", value, "personEmergencynumber");
            return (Criteria) this;
        }

        public Criteria andPersonEmergencynumberIn(List<String> values) {
            addCriterion("person_emergencyNumber in", values, "personEmergencynumber");
            return (Criteria) this;
        }

        public Criteria andPersonEmergencynumberNotIn(List<String> values) {
            addCriterion("person_emergencyNumber not in", values, "personEmergencynumber");
            return (Criteria) this;
        }

        public Criteria andPersonEmergencynumberBetween(String value1, String value2) {
            addCriterion("person_emergencyNumber between", value1, value2, "personEmergencynumber");
            return (Criteria) this;
        }

        public Criteria andPersonEmergencynumberNotBetween(String value1, String value2) {
            addCriterion("person_emergencyNumber not between", value1, value2, "personEmergencynumber");
            return (Criteria) this;
        }

        public Criteria andPersonIssoldierIsNull() {
            addCriterion("person_isSoldier is null");
            return (Criteria) this;
        }

        public Criteria andPersonIssoldierIsNotNull() {
            addCriterion("person_isSoldier is not null");
            return (Criteria) this;
        }

        public Criteria andPersonIssoldierEqualTo(String value) {
            addCriterion("person_isSoldier =", value, "personIssoldier");
            return (Criteria) this;
        }

        public Criteria andPersonIssoldierNotEqualTo(String value) {
            addCriterion("person_isSoldier <>", value, "personIssoldier");
            return (Criteria) this;
        }

        public Criteria andPersonIssoldierGreaterThan(String value) {
            addCriterion("person_isSoldier >", value, "personIssoldier");
            return (Criteria) this;
        }

        public Criteria andPersonIssoldierGreaterThanOrEqualTo(String value) {
            addCriterion("person_isSoldier >=", value, "personIssoldier");
            return (Criteria) this;
        }

        public Criteria andPersonIssoldierLessThan(String value) {
            addCriterion("person_isSoldier <", value, "personIssoldier");
            return (Criteria) this;
        }

        public Criteria andPersonIssoldierLessThanOrEqualTo(String value) {
            addCriterion("person_isSoldier <=", value, "personIssoldier");
            return (Criteria) this;
        }

        public Criteria andPersonIssoldierLike(String value) {
            addCriterion("person_isSoldier like", value, "personIssoldier");
            return (Criteria) this;
        }

        public Criteria andPersonIssoldierNotLike(String value) {
            addCriterion("person_isSoldier not like", value, "personIssoldier");
            return (Criteria) this;
        }

        public Criteria andPersonIssoldierIn(List<String> values) {
            addCriterion("person_isSoldier in", values, "personIssoldier");
            return (Criteria) this;
        }

        public Criteria andPersonIssoldierNotIn(List<String> values) {
            addCriterion("person_isSoldier not in", values, "personIssoldier");
            return (Criteria) this;
        }

        public Criteria andPersonIssoldierBetween(String value1, String value2) {
            addCriterion("person_isSoldier between", value1, value2, "personIssoldier");
            return (Criteria) this;
        }

        public Criteria andPersonIssoldierNotBetween(String value1, String value2) {
            addCriterion("person_isSoldier not between", value1, value2, "personIssoldier");
            return (Criteria) this;
        }

        public Criteria andPersonIsinjuryIsNull() {
            addCriterion("person_isInjury is null");
            return (Criteria) this;
        }

        public Criteria andPersonIsinjuryIsNotNull() {
            addCriterion("person_isInjury is not null");
            return (Criteria) this;
        }

        public Criteria andPersonIsinjuryEqualTo(Byte value) {
            addCriterion("person_isInjury =", value, "personIsinjury");
            return (Criteria) this;
        }

        public Criteria andPersonIsinjuryNotEqualTo(Byte value) {
            addCriterion("person_isInjury <>", value, "personIsinjury");
            return (Criteria) this;
        }

        public Criteria andPersonIsinjuryGreaterThan(Byte value) {
            addCriterion("person_isInjury >", value, "personIsinjury");
            return (Criteria) this;
        }

        public Criteria andPersonIsinjuryGreaterThanOrEqualTo(Byte value) {
            addCriterion("person_isInjury >=", value, "personIsinjury");
            return (Criteria) this;
        }

        public Criteria andPersonIsinjuryLessThan(Byte value) {
            addCriterion("person_isInjury <", value, "personIsinjury");
            return (Criteria) this;
        }

        public Criteria andPersonIsinjuryLessThanOrEqualTo(Byte value) {
            addCriterion("person_isInjury <=", value, "personIsinjury");
            return (Criteria) this;
        }

        public Criteria andPersonIsinjuryIn(List<Byte> values) {
            addCriterion("person_isInjury in", values, "personIsinjury");
            return (Criteria) this;
        }

        public Criteria andPersonIsinjuryNotIn(List<Byte> values) {
            addCriterion("person_isInjury not in", values, "personIsinjury");
            return (Criteria) this;
        }

        public Criteria andPersonIsinjuryBetween(Byte value1, Byte value2) {
            addCriterion("person_isInjury between", value1, value2, "personIsinjury");
            return (Criteria) this;
        }

        public Criteria andPersonIsinjuryNotBetween(Byte value1, Byte value2) {
            addCriterion("person_isInjury not between", value1, value2, "personIsinjury");
            return (Criteria) this;
        }

        public Criteria andPersonIsadminIsNull() {
            addCriterion("person_isAdmin is null");
            return (Criteria) this;
        }

        public Criteria andPersonIsadminIsNotNull() {
            addCriterion("person_isAdmin is not null");
            return (Criteria) this;
        }

        public Criteria andPersonIsadminEqualTo(Byte value) {
            addCriterion("person_isAdmin =", value, "personIsadmin");
            return (Criteria) this;
        }

        public Criteria andPersonIsadminNotEqualTo(Byte value) {
            addCriterion("person_isAdmin <>", value, "personIsadmin");
            return (Criteria) this;
        }

        public Criteria andPersonIsadminGreaterThan(Byte value) {
            addCriterion("person_isAdmin >", value, "personIsadmin");
            return (Criteria) this;
        }

        public Criteria andPersonIsadminGreaterThanOrEqualTo(Byte value) {
            addCriterion("person_isAdmin >=", value, "personIsadmin");
            return (Criteria) this;
        }

        public Criteria andPersonIsadminLessThan(Byte value) {
            addCriterion("person_isAdmin <", value, "personIsadmin");
            return (Criteria) this;
        }

        public Criteria andPersonIsadminLessThanOrEqualTo(Byte value) {
            addCriterion("person_isAdmin <=", value, "personIsadmin");
            return (Criteria) this;
        }

        public Criteria andPersonIsadminIn(List<Byte> values) {
            addCriterion("person_isAdmin in", values, "personIsadmin");
            return (Criteria) this;
        }

        public Criteria andPersonIsadminNotIn(List<Byte> values) {
            addCriterion("person_isAdmin not in", values, "personIsadmin");
            return (Criteria) this;
        }

        public Criteria andPersonIsadminBetween(Byte value1, Byte value2) {
            addCriterion("person_isAdmin between", value1, value2, "personIsadmin");
            return (Criteria) this;
        }

        public Criteria andPersonIsadminNotBetween(Byte value1, Byte value2) {
            addCriterion("person_isAdmin not between", value1, value2, "personIsadmin");
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