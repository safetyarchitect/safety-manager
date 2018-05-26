package shougang.guigang.safety.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbNotificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbNotificationExample() {
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

        public Criteria andNotificationIdIsNull() {
            addCriterion("notification_id is null");
            return (Criteria) this;
        }

        public Criteria andNotificationIdIsNotNull() {
            addCriterion("notification_id is not null");
            return (Criteria) this;
        }

        public Criteria andNotificationIdEqualTo(Short value) {
            addCriterion("notification_id =", value, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdNotEqualTo(Short value) {
            addCriterion("notification_id <>", value, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdGreaterThan(Short value) {
            addCriterion("notification_id >", value, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdGreaterThanOrEqualTo(Short value) {
            addCriterion("notification_id >=", value, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdLessThan(Short value) {
            addCriterion("notification_id <", value, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdLessThanOrEqualTo(Short value) {
            addCriterion("notification_id <=", value, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdIn(List<Short> values) {
            addCriterion("notification_id in", values, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdNotIn(List<Short> values) {
            addCriterion("notification_id not in", values, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdBetween(Short value1, Short value2) {
            addCriterion("notification_id between", value1, value2, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdNotBetween(Short value1, Short value2) {
            addCriterion("notification_id not between", value1, value2, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationTitleIsNull() {
            addCriterion("notification_title is null");
            return (Criteria) this;
        }

        public Criteria andNotificationTitleIsNotNull() {
            addCriterion("notification_title is not null");
            return (Criteria) this;
        }

        public Criteria andNotificationTitleEqualTo(String value) {
            addCriterion("notification_title =", value, "notificationTitle");
            return (Criteria) this;
        }

        public Criteria andNotificationTitleNotEqualTo(String value) {
            addCriterion("notification_title <>", value, "notificationTitle");
            return (Criteria) this;
        }

        public Criteria andNotificationTitleGreaterThan(String value) {
            addCriterion("notification_title >", value, "notificationTitle");
            return (Criteria) this;
        }

        public Criteria andNotificationTitleGreaterThanOrEqualTo(String value) {
            addCriterion("notification_title >=", value, "notificationTitle");
            return (Criteria) this;
        }

        public Criteria andNotificationTitleLessThan(String value) {
            addCriterion("notification_title <", value, "notificationTitle");
            return (Criteria) this;
        }

        public Criteria andNotificationTitleLessThanOrEqualTo(String value) {
            addCriterion("notification_title <=", value, "notificationTitle");
            return (Criteria) this;
        }

        public Criteria andNotificationTitleLike(String value) {
            addCriterion("notification_title like", value, "notificationTitle");
            return (Criteria) this;
        }

        public Criteria andNotificationTitleNotLike(String value) {
            addCriterion("notification_title not like", value, "notificationTitle");
            return (Criteria) this;
        }

        public Criteria andNotificationTitleIn(List<String> values) {
            addCriterion("notification_title in", values, "notificationTitle");
            return (Criteria) this;
        }

        public Criteria andNotificationTitleNotIn(List<String> values) {
            addCriterion("notification_title not in", values, "notificationTitle");
            return (Criteria) this;
        }

        public Criteria andNotificationTitleBetween(String value1, String value2) {
            addCriterion("notification_title between", value1, value2, "notificationTitle");
            return (Criteria) this;
        }

        public Criteria andNotificationTitleNotBetween(String value1, String value2) {
            addCriterion("notification_title not between", value1, value2, "notificationTitle");
            return (Criteria) this;
        }

        public Criteria andNotificationCreatepersonIsNull() {
            addCriterion("notification_createPerson is null");
            return (Criteria) this;
        }

        public Criteria andNotificationCreatepersonIsNotNull() {
            addCriterion("notification_createPerson is not null");
            return (Criteria) this;
        }

        public Criteria andNotificationCreatepersonEqualTo(String value) {
            addCriterion("notification_createPerson =", value, "notificationCreateperson");
            return (Criteria) this;
        }

        public Criteria andNotificationCreatepersonNotEqualTo(String value) {
            addCriterion("notification_createPerson <>", value, "notificationCreateperson");
            return (Criteria) this;
        }

        public Criteria andNotificationCreatepersonGreaterThan(String value) {
            addCriterion("notification_createPerson >", value, "notificationCreateperson");
            return (Criteria) this;
        }

        public Criteria andNotificationCreatepersonGreaterThanOrEqualTo(String value) {
            addCriterion("notification_createPerson >=", value, "notificationCreateperson");
            return (Criteria) this;
        }

        public Criteria andNotificationCreatepersonLessThan(String value) {
            addCriterion("notification_createPerson <", value, "notificationCreateperson");
            return (Criteria) this;
        }

        public Criteria andNotificationCreatepersonLessThanOrEqualTo(String value) {
            addCriterion("notification_createPerson <=", value, "notificationCreateperson");
            return (Criteria) this;
        }

        public Criteria andNotificationCreatepersonLike(String value) {
            addCriterion("notification_createPerson like", value, "notificationCreateperson");
            return (Criteria) this;
        }

        public Criteria andNotificationCreatepersonNotLike(String value) {
            addCriterion("notification_createPerson not like", value, "notificationCreateperson");
            return (Criteria) this;
        }

        public Criteria andNotificationCreatepersonIn(List<String> values) {
            addCriterion("notification_createPerson in", values, "notificationCreateperson");
            return (Criteria) this;
        }

        public Criteria andNotificationCreatepersonNotIn(List<String> values) {
            addCriterion("notification_createPerson not in", values, "notificationCreateperson");
            return (Criteria) this;
        }

        public Criteria andNotificationCreatepersonBetween(String value1, String value2) {
            addCriterion("notification_createPerson between", value1, value2, "notificationCreateperson");
            return (Criteria) this;
        }

        public Criteria andNotificationCreatepersonNotBetween(String value1, String value2) {
            addCriterion("notification_createPerson not between", value1, value2, "notificationCreateperson");
            return (Criteria) this;
        }

        public Criteria andNotificationCreatetimeIsNull() {
            addCriterion("notification_createTime is null");
            return (Criteria) this;
        }

        public Criteria andNotificationCreatetimeIsNotNull() {
            addCriterion("notification_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andNotificationCreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("notification_createTime =", value, "notificationCreatetime");
            return (Criteria) this;
        }

        public Criteria andNotificationCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("notification_createTime <>", value, "notificationCreatetime");
            return (Criteria) this;
        }

        public Criteria andNotificationCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("notification_createTime >", value, "notificationCreatetime");
            return (Criteria) this;
        }

        public Criteria andNotificationCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("notification_createTime >=", value, "notificationCreatetime");
            return (Criteria) this;
        }

        public Criteria andNotificationCreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("notification_createTime <", value, "notificationCreatetime");
            return (Criteria) this;
        }

        public Criteria andNotificationCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("notification_createTime <=", value, "notificationCreatetime");
            return (Criteria) this;
        }

        public Criteria andNotificationCreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("notification_createTime in", values, "notificationCreatetime");
            return (Criteria) this;
        }

        public Criteria andNotificationCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("notification_createTime not in", values, "notificationCreatetime");
            return (Criteria) this;
        }

        public Criteria andNotificationCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("notification_createTime between", value1, value2, "notificationCreatetime");
            return (Criteria) this;
        }

        public Criteria andNotificationCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("notification_createTime not between", value1, value2, "notificationCreatetime");
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