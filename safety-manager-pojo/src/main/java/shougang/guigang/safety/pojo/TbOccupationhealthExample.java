package shougang.guigang.safety.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbOccupationhealthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbOccupationhealthExample() {
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

        public Criteria andOccupationalIdIsNull() {
            addCriterion("occupational_id is null");
            return (Criteria) this;
        }

        public Criteria andOccupationalIdIsNotNull() {
            addCriterion("occupational_id is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationalIdEqualTo(String value) {
            addCriterion("occupational_id =", value, "occupationalId");
            return (Criteria) this;
        }

        public Criteria andOccupationalIdNotEqualTo(String value) {
            addCriterion("occupational_id <>", value, "occupationalId");
            return (Criteria) this;
        }

        public Criteria andOccupationalIdGreaterThan(String value) {
            addCriterion("occupational_id >", value, "occupationalId");
            return (Criteria) this;
        }

        public Criteria andOccupationalIdGreaterThanOrEqualTo(String value) {
            addCriterion("occupational_id >=", value, "occupationalId");
            return (Criteria) this;
        }

        public Criteria andOccupationalIdLessThan(String value) {
            addCriterion("occupational_id <", value, "occupationalId");
            return (Criteria) this;
        }

        public Criteria andOccupationalIdLessThanOrEqualTo(String value) {
            addCriterion("occupational_id <=", value, "occupationalId");
            return (Criteria) this;
        }

        public Criteria andOccupationalIdLike(String value) {
            addCriterion("occupational_id like", value, "occupationalId");
            return (Criteria) this;
        }

        public Criteria andOccupationalIdNotLike(String value) {
            addCriterion("occupational_id not like", value, "occupationalId");
            return (Criteria) this;
        }

        public Criteria andOccupationalIdIn(List<String> values) {
            addCriterion("occupational_id in", values, "occupationalId");
            return (Criteria) this;
        }

        public Criteria andOccupationalIdNotIn(List<String> values) {
            addCriterion("occupational_id not in", values, "occupationalId");
            return (Criteria) this;
        }

        public Criteria andOccupationalIdBetween(String value1, String value2) {
            addCriterion("occupational_id between", value1, value2, "occupationalId");
            return (Criteria) this;
        }

        public Criteria andOccupationalIdNotBetween(String value1, String value2) {
            addCriterion("occupational_id not between", value1, value2, "occupationalId");
            return (Criteria) this;
        }

        public Criteria andOccupationalNameIsNull() {
            addCriterion("occupational_name is null");
            return (Criteria) this;
        }

        public Criteria andOccupationalNameIsNotNull() {
            addCriterion("occupational_name is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationalNameEqualTo(String value) {
            addCriterion("occupational_name =", value, "occupationalName");
            return (Criteria) this;
        }

        public Criteria andOccupationalNameNotEqualTo(String value) {
            addCriterion("occupational_name <>", value, "occupationalName");
            return (Criteria) this;
        }

        public Criteria andOccupationalNameGreaterThan(String value) {
            addCriterion("occupational_name >", value, "occupationalName");
            return (Criteria) this;
        }

        public Criteria andOccupationalNameGreaterThanOrEqualTo(String value) {
            addCriterion("occupational_name >=", value, "occupationalName");
            return (Criteria) this;
        }

        public Criteria andOccupationalNameLessThan(String value) {
            addCriterion("occupational_name <", value, "occupationalName");
            return (Criteria) this;
        }

        public Criteria andOccupationalNameLessThanOrEqualTo(String value) {
            addCriterion("occupational_name <=", value, "occupationalName");
            return (Criteria) this;
        }

        public Criteria andOccupationalNameLike(String value) {
            addCriterion("occupational_name like", value, "occupationalName");
            return (Criteria) this;
        }

        public Criteria andOccupationalNameNotLike(String value) {
            addCriterion("occupational_name not like", value, "occupationalName");
            return (Criteria) this;
        }

        public Criteria andOccupationalNameIn(List<String> values) {
            addCriterion("occupational_name in", values, "occupationalName");
            return (Criteria) this;
        }

        public Criteria andOccupationalNameNotIn(List<String> values) {
            addCriterion("occupational_name not in", values, "occupationalName");
            return (Criteria) this;
        }

        public Criteria andOccupationalNameBetween(String value1, String value2) {
            addCriterion("occupational_name between", value1, value2, "occupationalName");
            return (Criteria) this;
        }

        public Criteria andOccupationalNameNotBetween(String value1, String value2) {
            addCriterion("occupational_name not between", value1, value2, "occupationalName");
            return (Criteria) this;
        }

        public Criteria andOccupationalSexIsNull() {
            addCriterion("occupational_sex is null");
            return (Criteria) this;
        }

        public Criteria andOccupationalSexIsNotNull() {
            addCriterion("occupational_sex is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationalSexEqualTo(String value) {
            addCriterion("occupational_sex =", value, "occupationalSex");
            return (Criteria) this;
        }

        public Criteria andOccupationalSexNotEqualTo(String value) {
            addCriterion("occupational_sex <>", value, "occupationalSex");
            return (Criteria) this;
        }

        public Criteria andOccupationalSexGreaterThan(String value) {
            addCriterion("occupational_sex >", value, "occupationalSex");
            return (Criteria) this;
        }

        public Criteria andOccupationalSexGreaterThanOrEqualTo(String value) {
            addCriterion("occupational_sex >=", value, "occupationalSex");
            return (Criteria) this;
        }

        public Criteria andOccupationalSexLessThan(String value) {
            addCriterion("occupational_sex <", value, "occupationalSex");
            return (Criteria) this;
        }

        public Criteria andOccupationalSexLessThanOrEqualTo(String value) {
            addCriterion("occupational_sex <=", value, "occupationalSex");
            return (Criteria) this;
        }

        public Criteria andOccupationalSexLike(String value) {
            addCriterion("occupational_sex like", value, "occupationalSex");
            return (Criteria) this;
        }

        public Criteria andOccupationalSexNotLike(String value) {
            addCriterion("occupational_sex not like", value, "occupationalSex");
            return (Criteria) this;
        }

        public Criteria andOccupationalSexIn(List<String> values) {
            addCriterion("occupational_sex in", values, "occupationalSex");
            return (Criteria) this;
        }

        public Criteria andOccupationalSexNotIn(List<String> values) {
            addCriterion("occupational_sex not in", values, "occupationalSex");
            return (Criteria) this;
        }

        public Criteria andOccupationalSexBetween(String value1, String value2) {
            addCriterion("occupational_sex between", value1, value2, "occupationalSex");
            return (Criteria) this;
        }

        public Criteria andOccupationalSexNotBetween(String value1, String value2) {
            addCriterion("occupational_sex not between", value1, value2, "occupationalSex");
            return (Criteria) this;
        }

        public Criteria andOccupationalAgeIsNull() {
            addCriterion("occupational_age is null");
            return (Criteria) this;
        }

        public Criteria andOccupationalAgeIsNotNull() {
            addCriterion("occupational_age is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationalAgeEqualTo(String value) {
            addCriterion("occupational_age =", value, "occupationalAge");
            return (Criteria) this;
        }

        public Criteria andOccupationalAgeNotEqualTo(String value) {
            addCriterion("occupational_age <>", value, "occupationalAge");
            return (Criteria) this;
        }

        public Criteria andOccupationalAgeGreaterThan(String value) {
            addCriterion("occupational_age >", value, "occupationalAge");
            return (Criteria) this;
        }

        public Criteria andOccupationalAgeGreaterThanOrEqualTo(String value) {
            addCriterion("occupational_age >=", value, "occupationalAge");
            return (Criteria) this;
        }

        public Criteria andOccupationalAgeLessThan(String value) {
            addCriterion("occupational_age <", value, "occupationalAge");
            return (Criteria) this;
        }

        public Criteria andOccupationalAgeLessThanOrEqualTo(String value) {
            addCriterion("occupational_age <=", value, "occupationalAge");
            return (Criteria) this;
        }

        public Criteria andOccupationalAgeLike(String value) {
            addCriterion("occupational_age like", value, "occupationalAge");
            return (Criteria) this;
        }

        public Criteria andOccupationalAgeNotLike(String value) {
            addCriterion("occupational_age not like", value, "occupationalAge");
            return (Criteria) this;
        }

        public Criteria andOccupationalAgeIn(List<String> values) {
            addCriterion("occupational_age in", values, "occupationalAge");
            return (Criteria) this;
        }

        public Criteria andOccupationalAgeNotIn(List<String> values) {
            addCriterion("occupational_age not in", values, "occupationalAge");
            return (Criteria) this;
        }

        public Criteria andOccupationalAgeBetween(String value1, String value2) {
            addCriterion("occupational_age between", value1, value2, "occupationalAge");
            return (Criteria) this;
        }

        public Criteria andOccupationalAgeNotBetween(String value1, String value2) {
            addCriterion("occupational_age not between", value1, value2, "occupationalAge");
            return (Criteria) this;
        }

        public Criteria andOccupationalUnitIsNull() {
            addCriterion("occupational_unit is null");
            return (Criteria) this;
        }

        public Criteria andOccupationalUnitIsNotNull() {
            addCriterion("occupational_unit is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationalUnitEqualTo(String value) {
            addCriterion("occupational_unit =", value, "occupationalUnit");
            return (Criteria) this;
        }

        public Criteria andOccupationalUnitNotEqualTo(String value) {
            addCriterion("occupational_unit <>", value, "occupationalUnit");
            return (Criteria) this;
        }

        public Criteria andOccupationalUnitGreaterThan(String value) {
            addCriterion("occupational_unit >", value, "occupationalUnit");
            return (Criteria) this;
        }

        public Criteria andOccupationalUnitGreaterThanOrEqualTo(String value) {
            addCriterion("occupational_unit >=", value, "occupationalUnit");
            return (Criteria) this;
        }

        public Criteria andOccupationalUnitLessThan(String value) {
            addCriterion("occupational_unit <", value, "occupationalUnit");
            return (Criteria) this;
        }

        public Criteria andOccupationalUnitLessThanOrEqualTo(String value) {
            addCriterion("occupational_unit <=", value, "occupationalUnit");
            return (Criteria) this;
        }

        public Criteria andOccupationalUnitLike(String value) {
            addCriterion("occupational_unit like", value, "occupationalUnit");
            return (Criteria) this;
        }

        public Criteria andOccupationalUnitNotLike(String value) {
            addCriterion("occupational_unit not like", value, "occupationalUnit");
            return (Criteria) this;
        }

        public Criteria andOccupationalUnitIn(List<String> values) {
            addCriterion("occupational_unit in", values, "occupationalUnit");
            return (Criteria) this;
        }

        public Criteria andOccupationalUnitNotIn(List<String> values) {
            addCriterion("occupational_unit not in", values, "occupationalUnit");
            return (Criteria) this;
        }

        public Criteria andOccupationalUnitBetween(String value1, String value2) {
            addCriterion("occupational_unit between", value1, value2, "occupationalUnit");
            return (Criteria) this;
        }

        public Criteria andOccupationalUnitNotBetween(String value1, String value2) {
            addCriterion("occupational_unit not between", value1, value2, "occupationalUnit");
            return (Criteria) this;
        }

        public Criteria andOccupationalTeamIsNull() {
            addCriterion("occupational_team is null");
            return (Criteria) this;
        }

        public Criteria andOccupationalTeamIsNotNull() {
            addCriterion("occupational_team is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationalTeamEqualTo(String value) {
            addCriterion("occupational_team =", value, "occupationalTeam");
            return (Criteria) this;
        }

        public Criteria andOccupationalTeamNotEqualTo(String value) {
            addCriterion("occupational_team <>", value, "occupationalTeam");
            return (Criteria) this;
        }

        public Criteria andOccupationalTeamGreaterThan(String value) {
            addCriterion("occupational_team >", value, "occupationalTeam");
            return (Criteria) this;
        }

        public Criteria andOccupationalTeamGreaterThanOrEqualTo(String value) {
            addCriterion("occupational_team >=", value, "occupationalTeam");
            return (Criteria) this;
        }

        public Criteria andOccupationalTeamLessThan(String value) {
            addCriterion("occupational_team <", value, "occupationalTeam");
            return (Criteria) this;
        }

        public Criteria andOccupationalTeamLessThanOrEqualTo(String value) {
            addCriterion("occupational_team <=", value, "occupationalTeam");
            return (Criteria) this;
        }

        public Criteria andOccupationalTeamLike(String value) {
            addCriterion("occupational_team like", value, "occupationalTeam");
            return (Criteria) this;
        }

        public Criteria andOccupationalTeamNotLike(String value) {
            addCriterion("occupational_team not like", value, "occupationalTeam");
            return (Criteria) this;
        }

        public Criteria andOccupationalTeamIn(List<String> values) {
            addCriterion("occupational_team in", values, "occupationalTeam");
            return (Criteria) this;
        }

        public Criteria andOccupationalTeamNotIn(List<String> values) {
            addCriterion("occupational_team not in", values, "occupationalTeam");
            return (Criteria) this;
        }

        public Criteria andOccupationalTeamBetween(String value1, String value2) {
            addCriterion("occupational_team between", value1, value2, "occupationalTeam");
            return (Criteria) this;
        }

        public Criteria andOccupationalTeamNotBetween(String value1, String value2) {
            addCriterion("occupational_team not between", value1, value2, "occupationalTeam");
            return (Criteria) this;
        }

        public Criteria andOccupationalTeamtypeIsNull() {
            addCriterion("occupational_teamType is null");
            return (Criteria) this;
        }

        public Criteria andOccupationalTeamtypeIsNotNull() {
            addCriterion("occupational_teamType is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationalTeamtypeEqualTo(String value) {
            addCriterion("occupational_teamType =", value, "occupationalTeamtype");
            return (Criteria) this;
        }

        public Criteria andOccupationalTeamtypeNotEqualTo(String value) {
            addCriterion("occupational_teamType <>", value, "occupationalTeamtype");
            return (Criteria) this;
        }

        public Criteria andOccupationalTeamtypeGreaterThan(String value) {
            addCriterion("occupational_teamType >", value, "occupationalTeamtype");
            return (Criteria) this;
        }

        public Criteria andOccupationalTeamtypeGreaterThanOrEqualTo(String value) {
            addCriterion("occupational_teamType >=", value, "occupationalTeamtype");
            return (Criteria) this;
        }

        public Criteria andOccupationalTeamtypeLessThan(String value) {
            addCriterion("occupational_teamType <", value, "occupationalTeamtype");
            return (Criteria) this;
        }

        public Criteria andOccupationalTeamtypeLessThanOrEqualTo(String value) {
            addCriterion("occupational_teamType <=", value, "occupationalTeamtype");
            return (Criteria) this;
        }

        public Criteria andOccupationalTeamtypeLike(String value) {
            addCriterion("occupational_teamType like", value, "occupationalTeamtype");
            return (Criteria) this;
        }

        public Criteria andOccupationalTeamtypeNotLike(String value) {
            addCriterion("occupational_teamType not like", value, "occupationalTeamtype");
            return (Criteria) this;
        }

        public Criteria andOccupationalTeamtypeIn(List<String> values) {
            addCriterion("occupational_teamType in", values, "occupationalTeamtype");
            return (Criteria) this;
        }

        public Criteria andOccupationalTeamtypeNotIn(List<String> values) {
            addCriterion("occupational_teamType not in", values, "occupationalTeamtype");
            return (Criteria) this;
        }

        public Criteria andOccupationalTeamtypeBetween(String value1, String value2) {
            addCriterion("occupational_teamType between", value1, value2, "occupationalTeamtype");
            return (Criteria) this;
        }

        public Criteria andOccupationalTeamtypeNotBetween(String value1, String value2) {
            addCriterion("occupational_teamType not between", value1, value2, "occupationalTeamtype");
            return (Criteria) this;
        }

        public Criteria andOccupationalPostIsNull() {
            addCriterion("occupational_post is null");
            return (Criteria) this;
        }

        public Criteria andOccupationalPostIsNotNull() {
            addCriterion("occupational_post is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationalPostEqualTo(String value) {
            addCriterion("occupational_post =", value, "occupationalPost");
            return (Criteria) this;
        }

        public Criteria andOccupationalPostNotEqualTo(String value) {
            addCriterion("occupational_post <>", value, "occupationalPost");
            return (Criteria) this;
        }

        public Criteria andOccupationalPostGreaterThan(String value) {
            addCriterion("occupational_post >", value, "occupationalPost");
            return (Criteria) this;
        }

        public Criteria andOccupationalPostGreaterThanOrEqualTo(String value) {
            addCriterion("occupational_post >=", value, "occupationalPost");
            return (Criteria) this;
        }

        public Criteria andOccupationalPostLessThan(String value) {
            addCriterion("occupational_post <", value, "occupationalPost");
            return (Criteria) this;
        }

        public Criteria andOccupationalPostLessThanOrEqualTo(String value) {
            addCriterion("occupational_post <=", value, "occupationalPost");
            return (Criteria) this;
        }

        public Criteria andOccupationalPostLike(String value) {
            addCriterion("occupational_post like", value, "occupationalPost");
            return (Criteria) this;
        }

        public Criteria andOccupationalPostNotLike(String value) {
            addCriterion("occupational_post not like", value, "occupationalPost");
            return (Criteria) this;
        }

        public Criteria andOccupationalPostIn(List<String> values) {
            addCriterion("occupational_post in", values, "occupationalPost");
            return (Criteria) this;
        }

        public Criteria andOccupationalPostNotIn(List<String> values) {
            addCriterion("occupational_post not in", values, "occupationalPost");
            return (Criteria) this;
        }

        public Criteria andOccupationalPostBetween(String value1, String value2) {
            addCriterion("occupational_post between", value1, value2, "occupationalPost");
            return (Criteria) this;
        }

        public Criteria andOccupationalPostNotBetween(String value1, String value2) {
            addCriterion("occupational_post not between", value1, value2, "occupationalPost");
            return (Criteria) this;
        }

        public Criteria andOccupationalWorktypeIsNull() {
            addCriterion("occupational_workType is null");
            return (Criteria) this;
        }

        public Criteria andOccupationalWorktypeIsNotNull() {
            addCriterion("occupational_workType is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationalWorktypeEqualTo(String value) {
            addCriterion("occupational_workType =", value, "occupationalWorktype");
            return (Criteria) this;
        }

        public Criteria andOccupationalWorktypeNotEqualTo(String value) {
            addCriterion("occupational_workType <>", value, "occupationalWorktype");
            return (Criteria) this;
        }

        public Criteria andOccupationalWorktypeGreaterThan(String value) {
            addCriterion("occupational_workType >", value, "occupationalWorktype");
            return (Criteria) this;
        }

        public Criteria andOccupationalWorktypeGreaterThanOrEqualTo(String value) {
            addCriterion("occupational_workType >=", value, "occupationalWorktype");
            return (Criteria) this;
        }

        public Criteria andOccupationalWorktypeLessThan(String value) {
            addCriterion("occupational_workType <", value, "occupationalWorktype");
            return (Criteria) this;
        }

        public Criteria andOccupationalWorktypeLessThanOrEqualTo(String value) {
            addCriterion("occupational_workType <=", value, "occupationalWorktype");
            return (Criteria) this;
        }

        public Criteria andOccupationalWorktypeLike(String value) {
            addCriterion("occupational_workType like", value, "occupationalWorktype");
            return (Criteria) this;
        }

        public Criteria andOccupationalWorktypeNotLike(String value) {
            addCriterion("occupational_workType not like", value, "occupationalWorktype");
            return (Criteria) this;
        }

        public Criteria andOccupationalWorktypeIn(List<String> values) {
            addCriterion("occupational_workType in", values, "occupationalWorktype");
            return (Criteria) this;
        }

        public Criteria andOccupationalWorktypeNotIn(List<String> values) {
            addCriterion("occupational_workType not in", values, "occupationalWorktype");
            return (Criteria) this;
        }

        public Criteria andOccupationalWorktypeBetween(String value1, String value2) {
            addCriterion("occupational_workType between", value1, value2, "occupationalWorktype");
            return (Criteria) this;
        }

        public Criteria andOccupationalWorktypeNotBetween(String value1, String value2) {
            addCriterion("occupational_workType not between", value1, value2, "occupationalWorktype");
            return (Criteria) this;
        }

        public Criteria andOccupationalStartworkIsNull() {
            addCriterion("occupational_startWork is null");
            return (Criteria) this;
        }

        public Criteria andOccupationalStartworkIsNotNull() {
            addCriterion("occupational_startWork is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationalStartworkEqualTo(String value) {
            addCriterion("occupational_startWork =", value, "occupationalStartwork");
            return (Criteria) this;
        }

        public Criteria andOccupationalStartworkNotEqualTo(String value) {
            addCriterion("occupational_startWork <>", value, "occupationalStartwork");
            return (Criteria) this;
        }

        public Criteria andOccupationalStartworkGreaterThan(String value) {
            addCriterion("occupational_startWork >", value, "occupationalStartwork");
            return (Criteria) this;
        }

        public Criteria andOccupationalStartworkGreaterThanOrEqualTo(String value) {
            addCriterion("occupational_startWork >=", value, "occupationalStartwork");
            return (Criteria) this;
        }

        public Criteria andOccupationalStartworkLessThan(String value) {
            addCriterion("occupational_startWork <", value, "occupationalStartwork");
            return (Criteria) this;
        }

        public Criteria andOccupationalStartworkLessThanOrEqualTo(String value) {
            addCriterion("occupational_startWork <=", value, "occupationalStartwork");
            return (Criteria) this;
        }

        public Criteria andOccupationalStartworkLike(String value) {
            addCriterion("occupational_startWork like", value, "occupationalStartwork");
            return (Criteria) this;
        }

        public Criteria andOccupationalStartworkNotLike(String value) {
            addCriterion("occupational_startWork not like", value, "occupationalStartwork");
            return (Criteria) this;
        }

        public Criteria andOccupationalStartworkIn(List<String> values) {
            addCriterion("occupational_startWork in", values, "occupationalStartwork");
            return (Criteria) this;
        }

        public Criteria andOccupationalStartworkNotIn(List<String> values) {
            addCriterion("occupational_startWork not in", values, "occupationalStartwork");
            return (Criteria) this;
        }

        public Criteria andOccupationalStartworkBetween(String value1, String value2) {
            addCriterion("occupational_startWork between", value1, value2, "occupationalStartwork");
            return (Criteria) this;
        }

        public Criteria andOccupationalStartworkNotBetween(String value1, String value2) {
            addCriterion("occupational_startWork not between", value1, value2, "occupationalStartwork");
            return (Criteria) this;
        }

        public Criteria andOccupationalTouchtimeIsNull() {
            addCriterion("occupational_touchTime is null");
            return (Criteria) this;
        }

        public Criteria andOccupationalTouchtimeIsNotNull() {
            addCriterion("occupational_touchTime is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationalTouchtimeEqualTo(String value) {
            addCriterion("occupational_touchTime =", value, "occupationalTouchtime");
            return (Criteria) this;
        }

        public Criteria andOccupationalTouchtimeNotEqualTo(String value) {
            addCriterion("occupational_touchTime <>", value, "occupationalTouchtime");
            return (Criteria) this;
        }

        public Criteria andOccupationalTouchtimeGreaterThan(String value) {
            addCriterion("occupational_touchTime >", value, "occupationalTouchtime");
            return (Criteria) this;
        }

        public Criteria andOccupationalTouchtimeGreaterThanOrEqualTo(String value) {
            addCriterion("occupational_touchTime >=", value, "occupationalTouchtime");
            return (Criteria) this;
        }

        public Criteria andOccupationalTouchtimeLessThan(String value) {
            addCriterion("occupational_touchTime <", value, "occupationalTouchtime");
            return (Criteria) this;
        }

        public Criteria andOccupationalTouchtimeLessThanOrEqualTo(String value) {
            addCriterion("occupational_touchTime <=", value, "occupationalTouchtime");
            return (Criteria) this;
        }

        public Criteria andOccupationalTouchtimeLike(String value) {
            addCriterion("occupational_touchTime like", value, "occupationalTouchtime");
            return (Criteria) this;
        }

        public Criteria andOccupationalTouchtimeNotLike(String value) {
            addCriterion("occupational_touchTime not like", value, "occupationalTouchtime");
            return (Criteria) this;
        }

        public Criteria andOccupationalTouchtimeIn(List<String> values) {
            addCriterion("occupational_touchTime in", values, "occupationalTouchtime");
            return (Criteria) this;
        }

        public Criteria andOccupationalTouchtimeNotIn(List<String> values) {
            addCriterion("occupational_touchTime not in", values, "occupationalTouchtime");
            return (Criteria) this;
        }

        public Criteria andOccupationalTouchtimeBetween(String value1, String value2) {
            addCriterion("occupational_touchTime between", value1, value2, "occupationalTouchtime");
            return (Criteria) this;
        }

        public Criteria andOccupationalTouchtimeNotBetween(String value1, String value2) {
            addCriterion("occupational_touchTime not between", value1, value2, "occupationalTouchtime");
            return (Criteria) this;
        }

        public Criteria andOccupationalCategoryIsNull() {
            addCriterion("occupational_category is null");
            return (Criteria) this;
        }

        public Criteria andOccupationalCategoryIsNotNull() {
            addCriterion("occupational_category is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationalCategoryEqualTo(String value) {
            addCriterion("occupational_category =", value, "occupationalCategory");
            return (Criteria) this;
        }

        public Criteria andOccupationalCategoryNotEqualTo(String value) {
            addCriterion("occupational_category <>", value, "occupationalCategory");
            return (Criteria) this;
        }

        public Criteria andOccupationalCategoryGreaterThan(String value) {
            addCriterion("occupational_category >", value, "occupationalCategory");
            return (Criteria) this;
        }

        public Criteria andOccupationalCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("occupational_category >=", value, "occupationalCategory");
            return (Criteria) this;
        }

        public Criteria andOccupationalCategoryLessThan(String value) {
            addCriterion("occupational_category <", value, "occupationalCategory");
            return (Criteria) this;
        }

        public Criteria andOccupationalCategoryLessThanOrEqualTo(String value) {
            addCriterion("occupational_category <=", value, "occupationalCategory");
            return (Criteria) this;
        }

        public Criteria andOccupationalCategoryLike(String value) {
            addCriterion("occupational_category like", value, "occupationalCategory");
            return (Criteria) this;
        }

        public Criteria andOccupationalCategoryNotLike(String value) {
            addCriterion("occupational_category not like", value, "occupationalCategory");
            return (Criteria) this;
        }

        public Criteria andOccupationalCategoryIn(List<String> values) {
            addCriterion("occupational_category in", values, "occupationalCategory");
            return (Criteria) this;
        }

        public Criteria andOccupationalCategoryNotIn(List<String> values) {
            addCriterion("occupational_category not in", values, "occupationalCategory");
            return (Criteria) this;
        }

        public Criteria andOccupationalCategoryBetween(String value1, String value2) {
            addCriterion("occupational_category between", value1, value2, "occupationalCategory");
            return (Criteria) this;
        }

        public Criteria andOccupationalCategoryNotBetween(String value1, String value2) {
            addCriterion("occupational_category not between", value1, value2, "occupationalCategory");
            return (Criteria) this;
        }

        public Criteria andOccupationalSpecialitemIsNull() {
            addCriterion("occupational_specialItem is null");
            return (Criteria) this;
        }

        public Criteria andOccupationalSpecialitemIsNotNull() {
            addCriterion("occupational_specialItem is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationalSpecialitemEqualTo(String value) {
            addCriterion("occupational_specialItem =", value, "occupationalSpecialitem");
            return (Criteria) this;
        }

        public Criteria andOccupationalSpecialitemNotEqualTo(String value) {
            addCriterion("occupational_specialItem <>", value, "occupationalSpecialitem");
            return (Criteria) this;
        }

        public Criteria andOccupationalSpecialitemGreaterThan(String value) {
            addCriterion("occupational_specialItem >", value, "occupationalSpecialitem");
            return (Criteria) this;
        }

        public Criteria andOccupationalSpecialitemGreaterThanOrEqualTo(String value) {
            addCriterion("occupational_specialItem >=", value, "occupationalSpecialitem");
            return (Criteria) this;
        }

        public Criteria andOccupationalSpecialitemLessThan(String value) {
            addCriterion("occupational_specialItem <", value, "occupationalSpecialitem");
            return (Criteria) this;
        }

        public Criteria andOccupationalSpecialitemLessThanOrEqualTo(String value) {
            addCriterion("occupational_specialItem <=", value, "occupationalSpecialitem");
            return (Criteria) this;
        }

        public Criteria andOccupationalSpecialitemLike(String value) {
            addCriterion("occupational_specialItem like", value, "occupationalSpecialitem");
            return (Criteria) this;
        }

        public Criteria andOccupationalSpecialitemNotLike(String value) {
            addCriterion("occupational_specialItem not like", value, "occupationalSpecialitem");
            return (Criteria) this;
        }

        public Criteria andOccupationalSpecialitemIn(List<String> values) {
            addCriterion("occupational_specialItem in", values, "occupationalSpecialitem");
            return (Criteria) this;
        }

        public Criteria andOccupationalSpecialitemNotIn(List<String> values) {
            addCriterion("occupational_specialItem not in", values, "occupationalSpecialitem");
            return (Criteria) this;
        }

        public Criteria andOccupationalSpecialitemBetween(String value1, String value2) {
            addCriterion("occupational_specialItem between", value1, value2, "occupationalSpecialitem");
            return (Criteria) this;
        }

        public Criteria andOccupationalSpecialitemNotBetween(String value1, String value2) {
            addCriterion("occupational_specialItem not between", value1, value2, "occupationalSpecialitem");
            return (Criteria) this;
        }

        public Criteria andOccupationalPhoneIsNull() {
            addCriterion("occupational_phone is null");
            return (Criteria) this;
        }

        public Criteria andOccupationalPhoneIsNotNull() {
            addCriterion("occupational_phone is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationalPhoneEqualTo(String value) {
            addCriterion("occupational_phone =", value, "occupationalPhone");
            return (Criteria) this;
        }

        public Criteria andOccupationalPhoneNotEqualTo(String value) {
            addCriterion("occupational_phone <>", value, "occupationalPhone");
            return (Criteria) this;
        }

        public Criteria andOccupationalPhoneGreaterThan(String value) {
            addCriterion("occupational_phone >", value, "occupationalPhone");
            return (Criteria) this;
        }

        public Criteria andOccupationalPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("occupational_phone >=", value, "occupationalPhone");
            return (Criteria) this;
        }

        public Criteria andOccupationalPhoneLessThan(String value) {
            addCriterion("occupational_phone <", value, "occupationalPhone");
            return (Criteria) this;
        }

        public Criteria andOccupationalPhoneLessThanOrEqualTo(String value) {
            addCriterion("occupational_phone <=", value, "occupationalPhone");
            return (Criteria) this;
        }

        public Criteria andOccupationalPhoneLike(String value) {
            addCriterion("occupational_phone like", value, "occupationalPhone");
            return (Criteria) this;
        }

        public Criteria andOccupationalPhoneNotLike(String value) {
            addCriterion("occupational_phone not like", value, "occupationalPhone");
            return (Criteria) this;
        }

        public Criteria andOccupationalPhoneIn(List<String> values) {
            addCriterion("occupational_phone in", values, "occupationalPhone");
            return (Criteria) this;
        }

        public Criteria andOccupationalPhoneNotIn(List<String> values) {
            addCriterion("occupational_phone not in", values, "occupationalPhone");
            return (Criteria) this;
        }

        public Criteria andOccupationalPhoneBetween(String value1, String value2) {
            addCriterion("occupational_phone between", value1, value2, "occupationalPhone");
            return (Criteria) this;
        }

        public Criteria andOccupationalPhoneNotBetween(String value1, String value2) {
            addCriterion("occupational_phone not between", value1, value2, "occupationalPhone");
            return (Criteria) this;
        }

        public Criteria andOccupationalDossiernumberIsNull() {
            addCriterion("occupational_dossierNumber is null");
            return (Criteria) this;
        }

        public Criteria andOccupationalDossiernumberIsNotNull() {
            addCriterion("occupational_dossierNumber is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationalDossiernumberEqualTo(String value) {
            addCriterion("occupational_dossierNumber =", value, "occupationalDossiernumber");
            return (Criteria) this;
        }

        public Criteria andOccupationalDossiernumberNotEqualTo(String value) {
            addCriterion("occupational_dossierNumber <>", value, "occupationalDossiernumber");
            return (Criteria) this;
        }

        public Criteria andOccupationalDossiernumberGreaterThan(String value) {
            addCriterion("occupational_dossierNumber >", value, "occupationalDossiernumber");
            return (Criteria) this;
        }

        public Criteria andOccupationalDossiernumberGreaterThanOrEqualTo(String value) {
            addCriterion("occupational_dossierNumber >=", value, "occupationalDossiernumber");
            return (Criteria) this;
        }

        public Criteria andOccupationalDossiernumberLessThan(String value) {
            addCriterion("occupational_dossierNumber <", value, "occupationalDossiernumber");
            return (Criteria) this;
        }

        public Criteria andOccupationalDossiernumberLessThanOrEqualTo(String value) {
            addCriterion("occupational_dossierNumber <=", value, "occupationalDossiernumber");
            return (Criteria) this;
        }

        public Criteria andOccupationalDossiernumberLike(String value) {
            addCriterion("occupational_dossierNumber like", value, "occupationalDossiernumber");
            return (Criteria) this;
        }

        public Criteria andOccupationalDossiernumberNotLike(String value) {
            addCriterion("occupational_dossierNumber not like", value, "occupationalDossiernumber");
            return (Criteria) this;
        }

        public Criteria andOccupationalDossiernumberIn(List<String> values) {
            addCriterion("occupational_dossierNumber in", values, "occupationalDossiernumber");
            return (Criteria) this;
        }

        public Criteria andOccupationalDossiernumberNotIn(List<String> values) {
            addCriterion("occupational_dossierNumber not in", values, "occupationalDossiernumber");
            return (Criteria) this;
        }

        public Criteria andOccupationalDossiernumberBetween(String value1, String value2) {
            addCriterion("occupational_dossierNumber between", value1, value2, "occupationalDossiernumber");
            return (Criteria) this;
        }

        public Criteria andOccupationalDossiernumberNotBetween(String value1, String value2) {
            addCriterion("occupational_dossierNumber not between", value1, value2, "occupationalDossiernumber");
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