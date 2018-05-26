package shougang.guigang.safety.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbJointinspectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbJointinspectionExample() {
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

        public Criteria andInspectionIdIsNull() {
            addCriterion("inspection_id is null");
            return (Criteria) this;
        }

        public Criteria andInspectionIdIsNotNull() {
            addCriterion("inspection_id is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionIdEqualTo(String value) {
            addCriterion("inspection_id =", value, "inspectionId");
            return (Criteria) this;
        }

        public Criteria andInspectionIdNotEqualTo(String value) {
            addCriterion("inspection_id <>", value, "inspectionId");
            return (Criteria) this;
        }

        public Criteria andInspectionIdGreaterThan(String value) {
            addCriterion("inspection_id >", value, "inspectionId");
            return (Criteria) this;
        }

        public Criteria andInspectionIdGreaterThanOrEqualTo(String value) {
            addCriterion("inspection_id >=", value, "inspectionId");
            return (Criteria) this;
        }

        public Criteria andInspectionIdLessThan(String value) {
            addCriterion("inspection_id <", value, "inspectionId");
            return (Criteria) this;
        }

        public Criteria andInspectionIdLessThanOrEqualTo(String value) {
            addCriterion("inspection_id <=", value, "inspectionId");
            return (Criteria) this;
        }

        public Criteria andInspectionIdLike(String value) {
            addCriterion("inspection_id like", value, "inspectionId");
            return (Criteria) this;
        }

        public Criteria andInspectionIdNotLike(String value) {
            addCriterion("inspection_id not like", value, "inspectionId");
            return (Criteria) this;
        }

        public Criteria andInspectionIdIn(List<String> values) {
            addCriterion("inspection_id in", values, "inspectionId");
            return (Criteria) this;
        }

        public Criteria andInspectionIdNotIn(List<String> values) {
            addCriterion("inspection_id not in", values, "inspectionId");
            return (Criteria) this;
        }

        public Criteria andInspectionIdBetween(String value1, String value2) {
            addCriterion("inspection_id between", value1, value2, "inspectionId");
            return (Criteria) this;
        }

        public Criteria andInspectionIdNotBetween(String value1, String value2) {
            addCriterion("inspection_id not between", value1, value2, "inspectionId");
            return (Criteria) this;
        }

        public Criteria andInspectionDateIsNull() {
            addCriterion("inspection_date is null");
            return (Criteria) this;
        }

        public Criteria andInspectionDateIsNotNull() {
            addCriterion("inspection_date is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionDateEqualTo(Date value) {
            addCriterionForJDBCDate("inspection_date =", value, "inspectionDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("inspection_date <>", value, "inspectionDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDateGreaterThan(Date value) {
            addCriterionForJDBCDate("inspection_date >", value, "inspectionDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("inspection_date >=", value, "inspectionDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDateLessThan(Date value) {
            addCriterionForJDBCDate("inspection_date <", value, "inspectionDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("inspection_date <=", value, "inspectionDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDateIn(List<Date> values) {
            addCriterionForJDBCDate("inspection_date in", values, "inspectionDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("inspection_date not in", values, "inspectionDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("inspection_date between", value1, value2, "inspectionDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("inspection_date not between", value1, value2, "inspectionDate");
            return (Criteria) this;
        }

        public Criteria andInspectionSetIsNull() {
            addCriterion("inspection_set is null");
            return (Criteria) this;
        }

        public Criteria andInspectionSetIsNotNull() {
            addCriterion("inspection_set is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionSetEqualTo(String value) {
            addCriterion("inspection_set =", value, "inspectionSet");
            return (Criteria) this;
        }

        public Criteria andInspectionSetNotEqualTo(String value) {
            addCriterion("inspection_set <>", value, "inspectionSet");
            return (Criteria) this;
        }

        public Criteria andInspectionSetGreaterThan(String value) {
            addCriterion("inspection_set >", value, "inspectionSet");
            return (Criteria) this;
        }

        public Criteria andInspectionSetGreaterThanOrEqualTo(String value) {
            addCriterion("inspection_set >=", value, "inspectionSet");
            return (Criteria) this;
        }

        public Criteria andInspectionSetLessThan(String value) {
            addCriterion("inspection_set <", value, "inspectionSet");
            return (Criteria) this;
        }

        public Criteria andInspectionSetLessThanOrEqualTo(String value) {
            addCriterion("inspection_set <=", value, "inspectionSet");
            return (Criteria) this;
        }

        public Criteria andInspectionSetLike(String value) {
            addCriterion("inspection_set like", value, "inspectionSet");
            return (Criteria) this;
        }

        public Criteria andInspectionSetNotLike(String value) {
            addCriterion("inspection_set not like", value, "inspectionSet");
            return (Criteria) this;
        }

        public Criteria andInspectionSetIn(List<String> values) {
            addCriterion("inspection_set in", values, "inspectionSet");
            return (Criteria) this;
        }

        public Criteria andInspectionSetNotIn(List<String> values) {
            addCriterion("inspection_set not in", values, "inspectionSet");
            return (Criteria) this;
        }

        public Criteria andInspectionSetBetween(String value1, String value2) {
            addCriterion("inspection_set between", value1, value2, "inspectionSet");
            return (Criteria) this;
        }

        public Criteria andInspectionSetNotBetween(String value1, String value2) {
            addCriterion("inspection_set not between", value1, value2, "inspectionSet");
            return (Criteria) this;
        }

        public Criteria andInspectionDutyIsNull() {
            addCriterion("inspection_duty is null");
            return (Criteria) this;
        }

        public Criteria andInspectionDutyIsNotNull() {
            addCriterion("inspection_duty is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionDutyEqualTo(String value) {
            addCriterion("inspection_duty =", value, "inspectionDuty");
            return (Criteria) this;
        }

        public Criteria andInspectionDutyNotEqualTo(String value) {
            addCriterion("inspection_duty <>", value, "inspectionDuty");
            return (Criteria) this;
        }

        public Criteria andInspectionDutyGreaterThan(String value) {
            addCriterion("inspection_duty >", value, "inspectionDuty");
            return (Criteria) this;
        }

        public Criteria andInspectionDutyGreaterThanOrEqualTo(String value) {
            addCriterion("inspection_duty >=", value, "inspectionDuty");
            return (Criteria) this;
        }

        public Criteria andInspectionDutyLessThan(String value) {
            addCriterion("inspection_duty <", value, "inspectionDuty");
            return (Criteria) this;
        }

        public Criteria andInspectionDutyLessThanOrEqualTo(String value) {
            addCriterion("inspection_duty <=", value, "inspectionDuty");
            return (Criteria) this;
        }

        public Criteria andInspectionDutyLike(String value) {
            addCriterion("inspection_duty like", value, "inspectionDuty");
            return (Criteria) this;
        }

        public Criteria andInspectionDutyNotLike(String value) {
            addCriterion("inspection_duty not like", value, "inspectionDuty");
            return (Criteria) this;
        }

        public Criteria andInspectionDutyIn(List<String> values) {
            addCriterion("inspection_duty in", values, "inspectionDuty");
            return (Criteria) this;
        }

        public Criteria andInspectionDutyNotIn(List<String> values) {
            addCriterion("inspection_duty not in", values, "inspectionDuty");
            return (Criteria) this;
        }

        public Criteria andInspectionDutyBetween(String value1, String value2) {
            addCriterion("inspection_duty between", value1, value2, "inspectionDuty");
            return (Criteria) this;
        }

        public Criteria andInspectionDutyNotBetween(String value1, String value2) {
            addCriterion("inspection_duty not between", value1, value2, "inspectionDuty");
            return (Criteria) this;
        }

        public Criteria andInspectionEnddateIsNull() {
            addCriterion("inspection_endDate is null");
            return (Criteria) this;
        }

        public Criteria andInspectionEnddateIsNotNull() {
            addCriterion("inspection_endDate is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionEnddateEqualTo(Date value) {
            addCriterionForJDBCDate("inspection_endDate =", value, "inspectionEnddate");
            return (Criteria) this;
        }

        public Criteria andInspectionEnddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("inspection_endDate <>", value, "inspectionEnddate");
            return (Criteria) this;
        }

        public Criteria andInspectionEnddateGreaterThan(Date value) {
            addCriterionForJDBCDate("inspection_endDate >", value, "inspectionEnddate");
            return (Criteria) this;
        }

        public Criteria andInspectionEnddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("inspection_endDate >=", value, "inspectionEnddate");
            return (Criteria) this;
        }

        public Criteria andInspectionEnddateLessThan(Date value) {
            addCriterionForJDBCDate("inspection_endDate <", value, "inspectionEnddate");
            return (Criteria) this;
        }

        public Criteria andInspectionEnddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("inspection_endDate <=", value, "inspectionEnddate");
            return (Criteria) this;
        }

        public Criteria andInspectionEnddateIn(List<Date> values) {
            addCriterionForJDBCDate("inspection_endDate in", values, "inspectionEnddate");
            return (Criteria) this;
        }

        public Criteria andInspectionEnddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("inspection_endDate not in", values, "inspectionEnddate");
            return (Criteria) this;
        }

        public Criteria andInspectionEnddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("inspection_endDate between", value1, value2, "inspectionEnddate");
            return (Criteria) this;
        }

        public Criteria andInspectionEnddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("inspection_endDate not between", value1, value2, "inspectionEnddate");
            return (Criteria) this;
        }

        public Criteria andInspectionResultIsNull() {
            addCriterion("inspection_result is null");
            return (Criteria) this;
        }

        public Criteria andInspectionResultIsNotNull() {
            addCriterion("inspection_result is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionResultEqualTo(String value) {
            addCriterion("inspection_result =", value, "inspectionResult");
            return (Criteria) this;
        }

        public Criteria andInspectionResultNotEqualTo(String value) {
            addCriterion("inspection_result <>", value, "inspectionResult");
            return (Criteria) this;
        }

        public Criteria andInspectionResultGreaterThan(String value) {
            addCriterion("inspection_result >", value, "inspectionResult");
            return (Criteria) this;
        }

        public Criteria andInspectionResultGreaterThanOrEqualTo(String value) {
            addCriterion("inspection_result >=", value, "inspectionResult");
            return (Criteria) this;
        }

        public Criteria andInspectionResultLessThan(String value) {
            addCriterion("inspection_result <", value, "inspectionResult");
            return (Criteria) this;
        }

        public Criteria andInspectionResultLessThanOrEqualTo(String value) {
            addCriterion("inspection_result <=", value, "inspectionResult");
            return (Criteria) this;
        }

        public Criteria andInspectionResultLike(String value) {
            addCriterion("inspection_result like", value, "inspectionResult");
            return (Criteria) this;
        }

        public Criteria andInspectionResultNotLike(String value) {
            addCriterion("inspection_result not like", value, "inspectionResult");
            return (Criteria) this;
        }

        public Criteria andInspectionResultIn(List<String> values) {
            addCriterion("inspection_result in", values, "inspectionResult");
            return (Criteria) this;
        }

        public Criteria andInspectionResultNotIn(List<String> values) {
            addCriterion("inspection_result not in", values, "inspectionResult");
            return (Criteria) this;
        }

        public Criteria andInspectionResultBetween(String value1, String value2) {
            addCriterion("inspection_result between", value1, value2, "inspectionResult");
            return (Criteria) this;
        }

        public Criteria andInspectionResultNotBetween(String value1, String value2) {
            addCriterion("inspection_result not between", value1, value2, "inspectionResult");
            return (Criteria) this;
        }

        public Criteria andInspectionReviewpersonIsNull() {
            addCriterion("inspection_reviewPerson is null");
            return (Criteria) this;
        }

        public Criteria andInspectionReviewpersonIsNotNull() {
            addCriterion("inspection_reviewPerson is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionReviewpersonEqualTo(String value) {
            addCriterion("inspection_reviewPerson =", value, "inspectionReviewperson");
            return (Criteria) this;
        }

        public Criteria andInspectionReviewpersonNotEqualTo(String value) {
            addCriterion("inspection_reviewPerson <>", value, "inspectionReviewperson");
            return (Criteria) this;
        }

        public Criteria andInspectionReviewpersonGreaterThan(String value) {
            addCriterion("inspection_reviewPerson >", value, "inspectionReviewperson");
            return (Criteria) this;
        }

        public Criteria andInspectionReviewpersonGreaterThanOrEqualTo(String value) {
            addCriterion("inspection_reviewPerson >=", value, "inspectionReviewperson");
            return (Criteria) this;
        }

        public Criteria andInspectionReviewpersonLessThan(String value) {
            addCriterion("inspection_reviewPerson <", value, "inspectionReviewperson");
            return (Criteria) this;
        }

        public Criteria andInspectionReviewpersonLessThanOrEqualTo(String value) {
            addCriterion("inspection_reviewPerson <=", value, "inspectionReviewperson");
            return (Criteria) this;
        }

        public Criteria andInspectionReviewpersonLike(String value) {
            addCriterion("inspection_reviewPerson like", value, "inspectionReviewperson");
            return (Criteria) this;
        }

        public Criteria andInspectionReviewpersonNotLike(String value) {
            addCriterion("inspection_reviewPerson not like", value, "inspectionReviewperson");
            return (Criteria) this;
        }

        public Criteria andInspectionReviewpersonIn(List<String> values) {
            addCriterion("inspection_reviewPerson in", values, "inspectionReviewperson");
            return (Criteria) this;
        }

        public Criteria andInspectionReviewpersonNotIn(List<String> values) {
            addCriterion("inspection_reviewPerson not in", values, "inspectionReviewperson");
            return (Criteria) this;
        }

        public Criteria andInspectionReviewpersonBetween(String value1, String value2) {
            addCriterion("inspection_reviewPerson between", value1, value2, "inspectionReviewperson");
            return (Criteria) this;
        }

        public Criteria andInspectionReviewpersonNotBetween(String value1, String value2) {
            addCriterion("inspection_reviewPerson not between", value1, value2, "inspectionReviewperson");
            return (Criteria) this;
        }

        public Criteria andInsepctionReviewresultIsNull() {
            addCriterion("insepction_reviewResult is null");
            return (Criteria) this;
        }

        public Criteria andInsepctionReviewresultIsNotNull() {
            addCriterion("insepction_reviewResult is not null");
            return (Criteria) this;
        }

        public Criteria andInsepctionReviewresultEqualTo(String value) {
            addCriterion("insepction_reviewResult =", value, "insepctionReviewresult");
            return (Criteria) this;
        }

        public Criteria andInsepctionReviewresultNotEqualTo(String value) {
            addCriterion("insepction_reviewResult <>", value, "insepctionReviewresult");
            return (Criteria) this;
        }

        public Criteria andInsepctionReviewresultGreaterThan(String value) {
            addCriterion("insepction_reviewResult >", value, "insepctionReviewresult");
            return (Criteria) this;
        }

        public Criteria andInsepctionReviewresultGreaterThanOrEqualTo(String value) {
            addCriterion("insepction_reviewResult >=", value, "insepctionReviewresult");
            return (Criteria) this;
        }

        public Criteria andInsepctionReviewresultLessThan(String value) {
            addCriterion("insepction_reviewResult <", value, "insepctionReviewresult");
            return (Criteria) this;
        }

        public Criteria andInsepctionReviewresultLessThanOrEqualTo(String value) {
            addCriterion("insepction_reviewResult <=", value, "insepctionReviewresult");
            return (Criteria) this;
        }

        public Criteria andInsepctionReviewresultLike(String value) {
            addCriterion("insepction_reviewResult like", value, "insepctionReviewresult");
            return (Criteria) this;
        }

        public Criteria andInsepctionReviewresultNotLike(String value) {
            addCriterion("insepction_reviewResult not like", value, "insepctionReviewresult");
            return (Criteria) this;
        }

        public Criteria andInsepctionReviewresultIn(List<String> values) {
            addCriterion("insepction_reviewResult in", values, "insepctionReviewresult");
            return (Criteria) this;
        }

        public Criteria andInsepctionReviewresultNotIn(List<String> values) {
            addCriterion("insepction_reviewResult not in", values, "insepctionReviewresult");
            return (Criteria) this;
        }

        public Criteria andInsepctionReviewresultBetween(String value1, String value2) {
            addCriterion("insepction_reviewResult between", value1, value2, "insepctionReviewresult");
            return (Criteria) this;
        }

        public Criteria andInsepctionReviewresultNotBetween(String value1, String value2) {
            addCriterion("insepction_reviewResult not between", value1, value2, "insepctionReviewresult");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
        
        public Criteria andInspectionConditionEqualTo(String inspectionSet , String inspectionResult , String inspectionDuty) {
		    
        	if (inspectionSet != "" && inspectionSet != null) {
		    	addCriterion("inspection_set =", inspectionSet, "inspectionSet");
			}
		    
		    if (inspectionResult != "" && inspectionResult != null) {
		    	addCriterion("inspection_result =", inspectionResult, "inspectionResult");
		    }
		    
		    
		    if (inspectionDuty != "" && inspectionDuty != null) {
		    	 addCriterion("inspection_duty =", inspectionDuty, "inspectionDuty");
		    }
	
		    return (Criteria)this;
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