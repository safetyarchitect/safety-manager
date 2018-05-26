package shougang.guigang.safety.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbGasalarmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbGasalarmExample() {
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

        public Criteria andAlarmIdIsNull() {
            addCriterion("alarm_id is null");
            return (Criteria) this;
        }

        public Criteria andAlarmIdIsNotNull() {
            addCriterion("alarm_id is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmIdEqualTo(String value) {
            addCriterion("alarm_id =", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdNotEqualTo(String value) {
            addCriterion("alarm_id <>", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdGreaterThan(String value) {
            addCriterion("alarm_id >", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_id >=", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdLessThan(String value) {
            addCriterion("alarm_id <", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdLessThanOrEqualTo(String value) {
            addCriterion("alarm_id <=", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdLike(String value) {
            addCriterion("alarm_id like", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdNotLike(String value) {
            addCriterion("alarm_id not like", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdIn(List<String> values) {
            addCriterion("alarm_id in", values, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdNotIn(List<String> values) {
            addCriterion("alarm_id not in", values, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdBetween(String value1, String value2) {
            addCriterion("alarm_id between", value1, value2, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdNotBetween(String value1, String value2) {
            addCriterion("alarm_id not between", value1, value2, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmNameIsNull() {
            addCriterion("alarm_name is null");
            return (Criteria) this;
        }

        public Criteria andAlarmNameIsNotNull() {
            addCriterion("alarm_name is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmNameEqualTo(String value) {
            addCriterion("alarm_name =", value, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameNotEqualTo(String value) {
            addCriterion("alarm_name <>", value, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameGreaterThan(String value) {
            addCriterion("alarm_name >", value, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_name >=", value, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameLessThan(String value) {
            addCriterion("alarm_name <", value, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameLessThanOrEqualTo(String value) {
            addCriterion("alarm_name <=", value, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameLike(String value) {
            addCriterion("alarm_name like", value, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameNotLike(String value) {
            addCriterion("alarm_name not like", value, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameIn(List<String> values) {
            addCriterion("alarm_name in", values, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameNotIn(List<String> values) {
            addCriterion("alarm_name not in", values, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameBetween(String value1, String value2) {
            addCriterion("alarm_name between", value1, value2, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameNotBetween(String value1, String value2) {
            addCriterion("alarm_name not between", value1, value2, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeIsNull() {
            addCriterion("alarm_type is null");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeIsNotNull() {
            addCriterion("alarm_type is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeEqualTo(String value) {
            addCriterion("alarm_type =", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeNotEqualTo(String value) {
            addCriterion("alarm_type <>", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeGreaterThan(String value) {
            addCriterion("alarm_type >", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_type >=", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeLessThan(String value) {
            addCriterion("alarm_type <", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeLessThanOrEqualTo(String value) {
            addCriterion("alarm_type <=", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeLike(String value) {
            addCriterion("alarm_type like", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeNotLike(String value) {
            addCriterion("alarm_type not like", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeIn(List<String> values) {
            addCriterion("alarm_type in", values, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeNotIn(List<String> values) {
            addCriterion("alarm_type not in", values, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeBetween(String value1, String value2) {
            addCriterion("alarm_type between", value1, value2, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeNotBetween(String value1, String value2) {
            addCriterion("alarm_type not between", value1, value2, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmNumberIsNull() {
            addCriterion("alarm_number is null");
            return (Criteria) this;
        }

        public Criteria andAlarmNumberIsNotNull() {
            addCriterion("alarm_number is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmNumberEqualTo(String value) {
            addCriterion("alarm_number =", value, "alarmNumber");
            return (Criteria) this;
        }

        public Criteria andAlarmNumberNotEqualTo(String value) {
            addCriterion("alarm_number <>", value, "alarmNumber");
            return (Criteria) this;
        }

        public Criteria andAlarmNumberGreaterThan(String value) {
            addCriterion("alarm_number >", value, "alarmNumber");
            return (Criteria) this;
        }

        public Criteria andAlarmNumberGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_number >=", value, "alarmNumber");
            return (Criteria) this;
        }

        public Criteria andAlarmNumberLessThan(String value) {
            addCriterion("alarm_number <", value, "alarmNumber");
            return (Criteria) this;
        }

        public Criteria andAlarmNumberLessThanOrEqualTo(String value) {
            addCriterion("alarm_number <=", value, "alarmNumber");
            return (Criteria) this;
        }

        public Criteria andAlarmNumberLike(String value) {
            addCriterion("alarm_number like", value, "alarmNumber");
            return (Criteria) this;
        }

        public Criteria andAlarmNumberNotLike(String value) {
            addCriterion("alarm_number not like", value, "alarmNumber");
            return (Criteria) this;
        }

        public Criteria andAlarmNumberIn(List<String> values) {
            addCriterion("alarm_number in", values, "alarmNumber");
            return (Criteria) this;
        }

        public Criteria andAlarmNumberNotIn(List<String> values) {
            addCriterion("alarm_number not in", values, "alarmNumber");
            return (Criteria) this;
        }

        public Criteria andAlarmNumberBetween(String value1, String value2) {
            addCriterion("alarm_number between", value1, value2, "alarmNumber");
            return (Criteria) this;
        }

        public Criteria andAlarmNumberNotBetween(String value1, String value2) {
            addCriterion("alarm_number not between", value1, value2, "alarmNumber");
            return (Criteria) this;
        }

        public Criteria andAlarmSetIsNull() {
            addCriterion("alarm_set is null");
            return (Criteria) this;
        }

        public Criteria andAlarmSetIsNotNull() {
            addCriterion("alarm_set is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmSetEqualTo(String value) {
            addCriterion("alarm_set =", value, "alarmSet");
            return (Criteria) this;
        }

        public Criteria andAlarmSetNotEqualTo(String value) {
            addCriterion("alarm_set <>", value, "alarmSet");
            return (Criteria) this;
        }

        public Criteria andAlarmSetGreaterThan(String value) {
            addCriterion("alarm_set >", value, "alarmSet");
            return (Criteria) this;
        }

        public Criteria andAlarmSetGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_set >=", value, "alarmSet");
            return (Criteria) this;
        }

        public Criteria andAlarmSetLessThan(String value) {
            addCriterion("alarm_set <", value, "alarmSet");
            return (Criteria) this;
        }

        public Criteria andAlarmSetLessThanOrEqualTo(String value) {
            addCriterion("alarm_set <=", value, "alarmSet");
            return (Criteria) this;
        }

        public Criteria andAlarmSetLike(String value) {
            addCriterion("alarm_set like", value, "alarmSet");
            return (Criteria) this;
        }

        public Criteria andAlarmSetNotLike(String value) {
            addCriterion("alarm_set not like", value, "alarmSet");
            return (Criteria) this;
        }

        public Criteria andAlarmSetIn(List<String> values) {
            addCriterion("alarm_set in", values, "alarmSet");
            return (Criteria) this;
        }

        public Criteria andAlarmSetNotIn(List<String> values) {
            addCriterion("alarm_set not in", values, "alarmSet");
            return (Criteria) this;
        }

        public Criteria andAlarmSetBetween(String value1, String value2) {
            addCriterion("alarm_set between", value1, value2, "alarmSet");
            return (Criteria) this;
        }

        public Criteria andAlarmSetNotBetween(String value1, String value2) {
            addCriterion("alarm_set not between", value1, value2, "alarmSet");
            return (Criteria) this;
        }

        public Criteria andAlarmRoomIsNull() {
            addCriterion("alarm_room is null");
            return (Criteria) this;
        }

        public Criteria andAlarmRoomIsNotNull() {
            addCriterion("alarm_room is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmRoomEqualTo(String value) {
            addCriterion("alarm_room =", value, "alarmRoom");
            return (Criteria) this;
        }

        public Criteria andAlarmRoomNotEqualTo(String value) {
            addCriterion("alarm_room <>", value, "alarmRoom");
            return (Criteria) this;
        }

        public Criteria andAlarmRoomGreaterThan(String value) {
            addCriterion("alarm_room >", value, "alarmRoom");
            return (Criteria) this;
        }

        public Criteria andAlarmRoomGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_room >=", value, "alarmRoom");
            return (Criteria) this;
        }

        public Criteria andAlarmRoomLessThan(String value) {
            addCriterion("alarm_room <", value, "alarmRoom");
            return (Criteria) this;
        }

        public Criteria andAlarmRoomLessThanOrEqualTo(String value) {
            addCriterion("alarm_room <=", value, "alarmRoom");
            return (Criteria) this;
        }

        public Criteria andAlarmRoomLike(String value) {
            addCriterion("alarm_room like", value, "alarmRoom");
            return (Criteria) this;
        }

        public Criteria andAlarmRoomNotLike(String value) {
            addCriterion("alarm_room not like", value, "alarmRoom");
            return (Criteria) this;
        }

        public Criteria andAlarmRoomIn(List<String> values) {
            addCriterion("alarm_room in", values, "alarmRoom");
            return (Criteria) this;
        }

        public Criteria andAlarmRoomNotIn(List<String> values) {
            addCriterion("alarm_room not in", values, "alarmRoom");
            return (Criteria) this;
        }

        public Criteria andAlarmRoomBetween(String value1, String value2) {
            addCriterion("alarm_room between", value1, value2, "alarmRoom");
            return (Criteria) this;
        }

        public Criteria andAlarmRoomNotBetween(String value1, String value2) {
            addCriterion("alarm_room not between", value1, value2, "alarmRoom");
            return (Criteria) this;
        }

        public Criteria andAlarmDutyIsNull() {
            addCriterion("alarm_duty is null");
            return (Criteria) this;
        }

        public Criteria andAlarmDutyIsNotNull() {
            addCriterion("alarm_duty is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmDutyEqualTo(String value) {
            addCriterion("alarm_duty =", value, "alarmDuty");
            return (Criteria) this;
        }

        public Criteria andAlarmDutyNotEqualTo(String value) {
            addCriterion("alarm_duty <>", value, "alarmDuty");
            return (Criteria) this;
        }

        public Criteria andAlarmDutyGreaterThan(String value) {
            addCriterion("alarm_duty >", value, "alarmDuty");
            return (Criteria) this;
        }

        public Criteria andAlarmDutyGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_duty >=", value, "alarmDuty");
            return (Criteria) this;
        }

        public Criteria andAlarmDutyLessThan(String value) {
            addCriterion("alarm_duty <", value, "alarmDuty");
            return (Criteria) this;
        }

        public Criteria andAlarmDutyLessThanOrEqualTo(String value) {
            addCriterion("alarm_duty <=", value, "alarmDuty");
            return (Criteria) this;
        }

        public Criteria andAlarmDutyLike(String value) {
            addCriterion("alarm_duty like", value, "alarmDuty");
            return (Criteria) this;
        }

        public Criteria andAlarmDutyNotLike(String value) {
            addCriterion("alarm_duty not like", value, "alarmDuty");
            return (Criteria) this;
        }

        public Criteria andAlarmDutyIn(List<String> values) {
            addCriterion("alarm_duty in", values, "alarmDuty");
            return (Criteria) this;
        }

        public Criteria andAlarmDutyNotIn(List<String> values) {
            addCriterion("alarm_duty not in", values, "alarmDuty");
            return (Criteria) this;
        }

        public Criteria andAlarmDutyBetween(String value1, String value2) {
            addCriterion("alarm_duty between", value1, value2, "alarmDuty");
            return (Criteria) this;
        }

        public Criteria andAlarmDutyNotBetween(String value1, String value2) {
            addCriterion("alarm_duty not between", value1, value2, "alarmDuty");
            return (Criteria) this;
        }

        public Criteria andAlarmTeamIsNull() {
            addCriterion("alarm_team is null");
            return (Criteria) this;
        }

        public Criteria andAlarmTeamIsNotNull() {
            addCriterion("alarm_team is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmTeamEqualTo(String value) {
            addCriterion("alarm_team =", value, "alarmTeam");
            return (Criteria) this;
        }

        public Criteria andAlarmTeamNotEqualTo(String value) {
            addCriterion("alarm_team <>", value, "alarmTeam");
            return (Criteria) this;
        }

        public Criteria andAlarmTeamGreaterThan(String value) {
            addCriterion("alarm_team >", value, "alarmTeam");
            return (Criteria) this;
        }

        public Criteria andAlarmTeamGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_team >=", value, "alarmTeam");
            return (Criteria) this;
        }

        public Criteria andAlarmTeamLessThan(String value) {
            addCriterion("alarm_team <", value, "alarmTeam");
            return (Criteria) this;
        }

        public Criteria andAlarmTeamLessThanOrEqualTo(String value) {
            addCriterion("alarm_team <=", value, "alarmTeam");
            return (Criteria) this;
        }

        public Criteria andAlarmTeamLike(String value) {
            addCriterion("alarm_team like", value, "alarmTeam");
            return (Criteria) this;
        }

        public Criteria andAlarmTeamNotLike(String value) {
            addCriterion("alarm_team not like", value, "alarmTeam");
            return (Criteria) this;
        }

        public Criteria andAlarmTeamIn(List<String> values) {
            addCriterion("alarm_team in", values, "alarmTeam");
            return (Criteria) this;
        }

        public Criteria andAlarmTeamNotIn(List<String> values) {
            addCriterion("alarm_team not in", values, "alarmTeam");
            return (Criteria) this;
        }

        public Criteria andAlarmTeamBetween(String value1, String value2) {
            addCriterion("alarm_team between", value1, value2, "alarmTeam");
            return (Criteria) this;
        }

        public Criteria andAlarmTeamNotBetween(String value1, String value2) {
            addCriterion("alarm_team not between", value1, value2, "alarmTeam");
            return (Criteria) this;
        }

        public Criteria andAlarmDateIsNull() {
            addCriterion("alarm_date is null");
            return (Criteria) this;
        }

        public Criteria andAlarmDateIsNotNull() {
            addCriterion("alarm_date is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmDateEqualTo(Date value) {
            addCriterionForJDBCDate("alarm_date =", value, "alarmDate");
            return (Criteria) this;
        }

        public Criteria andAlarmDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("alarm_date <>", value, "alarmDate");
            return (Criteria) this;
        }

        public Criteria andAlarmDateGreaterThan(Date value) {
            addCriterionForJDBCDate("alarm_date >", value, "alarmDate");
            return (Criteria) this;
        }

        public Criteria andAlarmDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("alarm_date >=", value, "alarmDate");
            return (Criteria) this;
        }

        public Criteria andAlarmDateLessThan(Date value) {
            addCriterionForJDBCDate("alarm_date <", value, "alarmDate");
            return (Criteria) this;
        }

        public Criteria andAlarmDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("alarm_date <=", value, "alarmDate");
            return (Criteria) this;
        }

        public Criteria andAlarmDateIn(List<Date> values) {
            addCriterionForJDBCDate("alarm_date in", values, "alarmDate");
            return (Criteria) this;
        }

        public Criteria andAlarmDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("alarm_date not in", values, "alarmDate");
            return (Criteria) this;
        }

        public Criteria andAlarmDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("alarm_date between", value1, value2, "alarmDate");
            return (Criteria) this;
        }

        public Criteria andAlarmDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("alarm_date not between", value1, value2, "alarmDate");
            return (Criteria) this;
        }

        public Criteria andAlarmIsintactIsNull() {
            addCriterion("alarm_isIntact is null");
            return (Criteria) this;
        }

        public Criteria andAlarmIsintactIsNotNull() {
            addCriterion("alarm_isIntact is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmIsintactEqualTo(Byte value) {
            addCriterion("alarm_isIntact =", value, "alarmIsintact");
            return (Criteria) this;
        }

        public Criteria andAlarmIsintactNotEqualTo(Byte value) {
            addCriterion("alarm_isIntact <>", value, "alarmIsintact");
            return (Criteria) this;
        }

        public Criteria andAlarmIsintactGreaterThan(Byte value) {
            addCriterion("alarm_isIntact >", value, "alarmIsintact");
            return (Criteria) this;
        }

        public Criteria andAlarmIsintactGreaterThanOrEqualTo(Byte value) {
            addCriterion("alarm_isIntact >=", value, "alarmIsintact");
            return (Criteria) this;
        }

        public Criteria andAlarmIsintactLessThan(Byte value) {
            addCriterion("alarm_isIntact <", value, "alarmIsintact");
            return (Criteria) this;
        }

        public Criteria andAlarmIsintactLessThanOrEqualTo(Byte value) {
            addCriterion("alarm_isIntact <=", value, "alarmIsintact");
            return (Criteria) this;
        }

        public Criteria andAlarmIsintactIn(List<Byte> values) {
            addCriterion("alarm_isIntact in", values, "alarmIsintact");
            return (Criteria) this;
        }

        public Criteria andAlarmIsintactNotIn(List<Byte> values) {
            addCriterion("alarm_isIntact not in", values, "alarmIsintact");
            return (Criteria) this;
        }

        public Criteria andAlarmIsintactBetween(Byte value1, Byte value2) {
            addCriterion("alarm_isIntact between", value1, value2, "alarmIsintact");
            return (Criteria) this;
        }

        public Criteria andAlarmIsintactNotBetween(Byte value1, Byte value2) {
            addCriterion("alarm_isIntact not between", value1, value2, "alarmIsintact");
            return (Criteria) this;
        }

        public Criteria andAlarmIschargeIsNull() {
            addCriterion("alarm_isCharge is null");
            return (Criteria) this;
        }

        public Criteria andAlarmIschargeIsNotNull() {
            addCriterion("alarm_isCharge is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmIschargeEqualTo(Byte value) {
            addCriterion("alarm_isCharge =", value, "alarmIscharge");
            return (Criteria) this;
        }

        public Criteria andAlarmIschargeNotEqualTo(Byte value) {
            addCriterion("alarm_isCharge <>", value, "alarmIscharge");
            return (Criteria) this;
        }

        public Criteria andAlarmIschargeGreaterThan(Byte value) {
            addCriterion("alarm_isCharge >", value, "alarmIscharge");
            return (Criteria) this;
        }

        public Criteria andAlarmIschargeGreaterThanOrEqualTo(Byte value) {
            addCriterion("alarm_isCharge >=", value, "alarmIscharge");
            return (Criteria) this;
        }

        public Criteria andAlarmIschargeLessThan(Byte value) {
            addCriterion("alarm_isCharge <", value, "alarmIscharge");
            return (Criteria) this;
        }

        public Criteria andAlarmIschargeLessThanOrEqualTo(Byte value) {
            addCriterion("alarm_isCharge <=", value, "alarmIscharge");
            return (Criteria) this;
        }

        public Criteria andAlarmIschargeIn(List<Byte> values) {
            addCriterion("alarm_isCharge in", values, "alarmIscharge");
            return (Criteria) this;
        }

        public Criteria andAlarmIschargeNotIn(List<Byte> values) {
            addCriterion("alarm_isCharge not in", values, "alarmIscharge");
            return (Criteria) this;
        }

        public Criteria andAlarmIschargeBetween(Byte value1, Byte value2) {
            addCriterion("alarm_isCharge between", value1, value2, "alarmIscharge");
            return (Criteria) this;
        }

        public Criteria andAlarmIschargeNotBetween(Byte value1, Byte value2) {
            addCriterion("alarm_isCharge not between", value1, value2, "alarmIscharge");
            return (Criteria) this;
        }

        public Criteria andAlarmIsborrowIsNull() {
            addCriterion("alarm_isBorrow is null");
            return (Criteria) this;
        }

        public Criteria andAlarmIsborrowIsNotNull() {
            addCriterion("alarm_isBorrow is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmIsborrowEqualTo(Byte value) {
            addCriterion("alarm_isBorrow =", value, "alarmIsborrow");
            return (Criteria) this;
        }

        public Criteria andAlarmIsborrowNotEqualTo(Byte value) {
            addCriterion("alarm_isBorrow <>", value, "alarmIsborrow");
            return (Criteria) this;
        }

        public Criteria andAlarmIsborrowGreaterThan(Byte value) {
            addCriterion("alarm_isBorrow >", value, "alarmIsborrow");
            return (Criteria) this;
        }

        public Criteria andAlarmIsborrowGreaterThanOrEqualTo(Byte value) {
            addCriterion("alarm_isBorrow >=", value, "alarmIsborrow");
            return (Criteria) this;
        }

        public Criteria andAlarmIsborrowLessThan(Byte value) {
            addCriterion("alarm_isBorrow <", value, "alarmIsborrow");
            return (Criteria) this;
        }

        public Criteria andAlarmIsborrowLessThanOrEqualTo(Byte value) {
            addCriterion("alarm_isBorrow <=", value, "alarmIsborrow");
            return (Criteria) this;
        }

        public Criteria andAlarmIsborrowIn(List<Byte> values) {
            addCriterion("alarm_isBorrow in", values, "alarmIsborrow");
            return (Criteria) this;
        }

        public Criteria andAlarmIsborrowNotIn(List<Byte> values) {
            addCriterion("alarm_isBorrow not in", values, "alarmIsborrow");
            return (Criteria) this;
        }

        public Criteria andAlarmIsborrowBetween(Byte value1, Byte value2) {
            addCriterion("alarm_isBorrow between", value1, value2, "alarmIsborrow");
            return (Criteria) this;
        }

        public Criteria andAlarmIsborrowNotBetween(Byte value1, Byte value2) {
            addCriterion("alarm_isBorrow not between", value1, value2, "alarmIsborrow");
            return (Criteria) this;
        }

        public Criteria andAlarmBorrowidIsNull() {
            addCriterion("alarm_borrowId is null");
            return (Criteria) this;
        }

        public Criteria andAlarmBorrowidIsNotNull() {
            addCriterion("alarm_borrowId is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmBorrowidEqualTo(String value) {
            addCriterion("alarm_borrowId =", value, "alarmBorrowid");
            return (Criteria) this;
        }

        public Criteria andAlarmBorrowidNotEqualTo(String value) {
            addCriterion("alarm_borrowId <>", value, "alarmBorrowid");
            return (Criteria) this;
        }

        public Criteria andAlarmBorrowidGreaterThan(String value) {
            addCriterion("alarm_borrowId >", value, "alarmBorrowid");
            return (Criteria) this;
        }

        public Criteria andAlarmBorrowidGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_borrowId >=", value, "alarmBorrowid");
            return (Criteria) this;
        }

        public Criteria andAlarmBorrowidLessThan(String value) {
            addCriterion("alarm_borrowId <", value, "alarmBorrowid");
            return (Criteria) this;
        }

        public Criteria andAlarmBorrowidLessThanOrEqualTo(String value) {
            addCriterion("alarm_borrowId <=", value, "alarmBorrowid");
            return (Criteria) this;
        }

        public Criteria andAlarmBorrowidLike(String value) {
            addCriterion("alarm_borrowId like", value, "alarmBorrowid");
            return (Criteria) this;
        }

        public Criteria andAlarmBorrowidNotLike(String value) {
            addCriterion("alarm_borrowId not like", value, "alarmBorrowid");
            return (Criteria) this;
        }

        public Criteria andAlarmBorrowidIn(List<String> values) {
            addCriterion("alarm_borrowId in", values, "alarmBorrowid");
            return (Criteria) this;
        }

        public Criteria andAlarmBorrowidNotIn(List<String> values) {
            addCriterion("alarm_borrowId not in", values, "alarmBorrowid");
            return (Criteria) this;
        }

        public Criteria andAlarmBorrowidBetween(String value1, String value2) {
            addCriterion("alarm_borrowId between", value1, value2, "alarmBorrowid");
            return (Criteria) this;
        }

        public Criteria andAlarmBorrowidNotBetween(String value1, String value2) {
            addCriterion("alarm_borrowId not between", value1, value2, "alarmBorrowid");
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