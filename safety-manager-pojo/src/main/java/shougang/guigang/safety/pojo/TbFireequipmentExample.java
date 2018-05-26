package shougang.guigang.safety.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbFireequipmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbFireequipmentExample() {
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

        public Criteria andFireIdIsNull() {
            addCriterion("fire_id is null");
            return (Criteria) this;
        }

        public Criteria andFireIdIsNotNull() {
            addCriterion("fire_id is not null");
            return (Criteria) this;
        }

        public Criteria andFireIdEqualTo(String value) {
            addCriterion("fire_id =", value, "fireId");
            return (Criteria) this;
        }

        public Criteria andFireIdNotEqualTo(String value) {
            addCriterion("fire_id <>", value, "fireId");
            return (Criteria) this;
        }

        public Criteria andFireIdGreaterThan(String value) {
            addCriterion("fire_id >", value, "fireId");
            return (Criteria) this;
        }

        public Criteria andFireIdGreaterThanOrEqualTo(String value) {
            addCriterion("fire_id >=", value, "fireId");
            return (Criteria) this;
        }

        public Criteria andFireIdLessThan(String value) {
            addCriterion("fire_id <", value, "fireId");
            return (Criteria) this;
        }

        public Criteria andFireIdLessThanOrEqualTo(String value) {
            addCriterion("fire_id <=", value, "fireId");
            return (Criteria) this;
        }

        public Criteria andFireIdLike(String value) {
            addCriterion("fire_id like", value, "fireId");
            return (Criteria) this;
        }

        public Criteria andFireIdNotLike(String value) {
            addCriterion("fire_id not like", value, "fireId");
            return (Criteria) this;
        }

        public Criteria andFireIdIn(List<String> values) {
            addCriterion("fire_id in", values, "fireId");
            return (Criteria) this;
        }

        public Criteria andFireIdNotIn(List<String> values) {
            addCriterion("fire_id not in", values, "fireId");
            return (Criteria) this;
        }

        public Criteria andFireIdBetween(String value1, String value2) {
            addCriterion("fire_id between", value1, value2, "fireId");
            return (Criteria) this;
        }

        public Criteria andFireIdNotBetween(String value1, String value2) {
            addCriterion("fire_id not between", value1, value2, "fireId");
            return (Criteria) this;
        }

        public Criteria andFireSetIsNull() {
            addCriterion("fire_set is null");
            return (Criteria) this;
        }

        public Criteria andFireSetIsNotNull() {
            addCriterion("fire_set is not null");
            return (Criteria) this;
        }

        public Criteria andFireSetEqualTo(String value) {
            addCriterion("fire_set =", value, "fireSet");
            return (Criteria) this;
        }

        public Criteria andFireSetNotEqualTo(String value) {
            addCriterion("fire_set <>", value, "fireSet");
            return (Criteria) this;
        }

        public Criteria andFireSetGreaterThan(String value) {
            addCriterion("fire_set >", value, "fireSet");
            return (Criteria) this;
        }

        public Criteria andFireSetGreaterThanOrEqualTo(String value) {
            addCriterion("fire_set >=", value, "fireSet");
            return (Criteria) this;
        }

        public Criteria andFireSetLessThan(String value) {
            addCriterion("fire_set <", value, "fireSet");
            return (Criteria) this;
        }

        public Criteria andFireSetLessThanOrEqualTo(String value) {
            addCriterion("fire_set <=", value, "fireSet");
            return (Criteria) this;
        }

        public Criteria andFireSetLike(String value) {
            addCriterion("fire_set like", value, "fireSet");
            return (Criteria) this;
        }

        public Criteria andFireSetNotLike(String value) {
            addCriterion("fire_set not like", value, "fireSet");
            return (Criteria) this;
        }

        public Criteria andFireSetIn(List<String> values) {
            addCriterion("fire_set in", values, "fireSet");
            return (Criteria) this;
        }

        public Criteria andFireSetNotIn(List<String> values) {
            addCriterion("fire_set not in", values, "fireSet");
            return (Criteria) this;
        }

        public Criteria andFireSetBetween(String value1, String value2) {
            addCriterion("fire_set between", value1, value2, "fireSet");
            return (Criteria) this;
        }

        public Criteria andFireSetNotBetween(String value1, String value2) {
            addCriterion("fire_set not between", value1, value2, "fireSet");
            return (Criteria) this;
        }

        public Criteria andFirePositionIsNull() {
            addCriterion("fire_position is null");
            return (Criteria) this;
        }

        public Criteria andFirePositionIsNotNull() {
            addCriterion("fire_position is not null");
            return (Criteria) this;
        }

        public Criteria andFirePositionEqualTo(String value) {
            addCriterion("fire_position =", value, "firePosition");
            return (Criteria) this;
        }

        public Criteria andFirePositionNotEqualTo(String value) {
            addCriterion("fire_position <>", value, "firePosition");
            return (Criteria) this;
        }

        public Criteria andFirePositionGreaterThan(String value) {
            addCriterion("fire_position >", value, "firePosition");
            return (Criteria) this;
        }

        public Criteria andFirePositionGreaterThanOrEqualTo(String value) {
            addCriterion("fire_position >=", value, "firePosition");
            return (Criteria) this;
        }

        public Criteria andFirePositionLessThan(String value) {
            addCriterion("fire_position <", value, "firePosition");
            return (Criteria) this;
        }

        public Criteria andFirePositionLessThanOrEqualTo(String value) {
            addCriterion("fire_position <=", value, "firePosition");
            return (Criteria) this;
        }

        public Criteria andFirePositionLike(String value) {
            addCriterion("fire_position like", value, "firePosition");
            return (Criteria) this;
        }

        public Criteria andFirePositionNotLike(String value) {
            addCriterion("fire_position not like", value, "firePosition");
            return (Criteria) this;
        }

        public Criteria andFirePositionIn(List<String> values) {
            addCriterion("fire_position in", values, "firePosition");
            return (Criteria) this;
        }

        public Criteria andFirePositionNotIn(List<String> values) {
            addCriterion("fire_position not in", values, "firePosition");
            return (Criteria) this;
        }

        public Criteria andFirePositionBetween(String value1, String value2) {
            addCriterion("fire_position between", value1, value2, "firePosition");
            return (Criteria) this;
        }

        public Criteria andFirePositionNotBetween(String value1, String value2) {
            addCriterion("fire_position not between", value1, value2, "firePosition");
            return (Criteria) this;
        }

        public Criteria andFirePowderIsNull() {
            addCriterion("fire_powder is null");
            return (Criteria) this;
        }

        public Criteria andFirePowderIsNotNull() {
            addCriterion("fire_powder is not null");
            return (Criteria) this;
        }

        public Criteria andFirePowderEqualTo(Byte value) {
            addCriterion("fire_powder =", value, "firePowder");
            return (Criteria) this;
        }

        public Criteria andFirePowderNotEqualTo(Byte value) {
            addCriterion("fire_powder <>", value, "firePowder");
            return (Criteria) this;
        }

        public Criteria andFirePowderGreaterThan(Byte value) {
            addCriterion("fire_powder >", value, "firePowder");
            return (Criteria) this;
        }

        public Criteria andFirePowderGreaterThanOrEqualTo(Byte value) {
            addCriterion("fire_powder >=", value, "firePowder");
            return (Criteria) this;
        }

        public Criteria andFirePowderLessThan(Byte value) {
            addCriterion("fire_powder <", value, "firePowder");
            return (Criteria) this;
        }

        public Criteria andFirePowderLessThanOrEqualTo(Byte value) {
            addCriterion("fire_powder <=", value, "firePowder");
            return (Criteria) this;
        }

        public Criteria andFirePowderIn(List<Byte> values) {
            addCriterion("fire_powder in", values, "firePowder");
            return (Criteria) this;
        }

        public Criteria andFirePowderNotIn(List<Byte> values) {
            addCriterion("fire_powder not in", values, "firePowder");
            return (Criteria) this;
        }

        public Criteria andFirePowderBetween(Byte value1, Byte value2) {
            addCriterion("fire_powder between", value1, value2, "firePowder");
            return (Criteria) this;
        }

        public Criteria andFirePowderNotBetween(Byte value1, Byte value2) {
            addCriterion("fire_powder not between", value1, value2, "firePowder");
            return (Criteria) this;
        }

        public Criteria andFireCarbonIsNull() {
            addCriterion("fire_carbon is null");
            return (Criteria) this;
        }

        public Criteria andFireCarbonIsNotNull() {
            addCriterion("fire_carbon is not null");
            return (Criteria) this;
        }

        public Criteria andFireCarbonEqualTo(Byte value) {
            addCriterion("fire_carbon =", value, "fireCarbon");
            return (Criteria) this;
        }

        public Criteria andFireCarbonNotEqualTo(Byte value) {
            addCriterion("fire_carbon <>", value, "fireCarbon");
            return (Criteria) this;
        }

        public Criteria andFireCarbonGreaterThan(Byte value) {
            addCriterion("fire_carbon >", value, "fireCarbon");
            return (Criteria) this;
        }

        public Criteria andFireCarbonGreaterThanOrEqualTo(Byte value) {
            addCriterion("fire_carbon >=", value, "fireCarbon");
            return (Criteria) this;
        }

        public Criteria andFireCarbonLessThan(Byte value) {
            addCriterion("fire_carbon <", value, "fireCarbon");
            return (Criteria) this;
        }

        public Criteria andFireCarbonLessThanOrEqualTo(Byte value) {
            addCriterion("fire_carbon <=", value, "fireCarbon");
            return (Criteria) this;
        }

        public Criteria andFireCarbonIn(List<Byte> values) {
            addCriterion("fire_carbon in", values, "fireCarbon");
            return (Criteria) this;
        }

        public Criteria andFireCarbonNotIn(List<Byte> values) {
            addCriterion("fire_carbon not in", values, "fireCarbon");
            return (Criteria) this;
        }

        public Criteria andFireCarbonBetween(Byte value1, Byte value2) {
            addCriterion("fire_carbon between", value1, value2, "fireCarbon");
            return (Criteria) this;
        }

        public Criteria andFireCarbonNotBetween(Byte value1, Byte value2) {
            addCriterion("fire_carbon not between", value1, value2, "fireCarbon");
            return (Criteria) this;
        }

        public Criteria andFirePowdercarIsNull() {
            addCriterion("fire_powderCar is null");
            return (Criteria) this;
        }

        public Criteria andFirePowdercarIsNotNull() {
            addCriterion("fire_powderCar is not null");
            return (Criteria) this;
        }

        public Criteria andFirePowdercarEqualTo(Byte value) {
            addCriterion("fire_powderCar =", value, "firePowdercar");
            return (Criteria) this;
        }

        public Criteria andFirePowdercarNotEqualTo(Byte value) {
            addCriterion("fire_powderCar <>", value, "firePowdercar");
            return (Criteria) this;
        }

        public Criteria andFirePowdercarGreaterThan(Byte value) {
            addCriterion("fire_powderCar >", value, "firePowdercar");
            return (Criteria) this;
        }

        public Criteria andFirePowdercarGreaterThanOrEqualTo(Byte value) {
            addCriterion("fire_powderCar >=", value, "firePowdercar");
            return (Criteria) this;
        }

        public Criteria andFirePowdercarLessThan(Byte value) {
            addCriterion("fire_powderCar <", value, "firePowdercar");
            return (Criteria) this;
        }

        public Criteria andFirePowdercarLessThanOrEqualTo(Byte value) {
            addCriterion("fire_powderCar <=", value, "firePowdercar");
            return (Criteria) this;
        }

        public Criteria andFirePowdercarIn(List<Byte> values) {
            addCriterion("fire_powderCar in", values, "firePowdercar");
            return (Criteria) this;
        }

        public Criteria andFirePowdercarNotIn(List<Byte> values) {
            addCriterion("fire_powderCar not in", values, "firePowdercar");
            return (Criteria) this;
        }

        public Criteria andFirePowdercarBetween(Byte value1, Byte value2) {
            addCriterion("fire_powderCar between", value1, value2, "firePowdercar");
            return (Criteria) this;
        }

        public Criteria andFirePowdercarNotBetween(Byte value1, Byte value2) {
            addCriterion("fire_powderCar not between", value1, value2, "firePowdercar");
            return (Criteria) this;
        }

        public Criteria andFireHydrantIsNull() {
            addCriterion("fire_hydrant is null");
            return (Criteria) this;
        }

        public Criteria andFireHydrantIsNotNull() {
            addCriterion("fire_hydrant is not null");
            return (Criteria) this;
        }

        public Criteria andFireHydrantEqualTo(Byte value) {
            addCriterion("fire_hydrant =", value, "fireHydrant");
            return (Criteria) this;
        }

        public Criteria andFireHydrantNotEqualTo(Byte value) {
            addCriterion("fire_hydrant <>", value, "fireHydrant");
            return (Criteria) this;
        }

        public Criteria andFireHydrantGreaterThan(Byte value) {
            addCriterion("fire_hydrant >", value, "fireHydrant");
            return (Criteria) this;
        }

        public Criteria andFireHydrantGreaterThanOrEqualTo(Byte value) {
            addCriterion("fire_hydrant >=", value, "fireHydrant");
            return (Criteria) this;
        }

        public Criteria andFireHydrantLessThan(Byte value) {
            addCriterion("fire_hydrant <", value, "fireHydrant");
            return (Criteria) this;
        }

        public Criteria andFireHydrantLessThanOrEqualTo(Byte value) {
            addCriterion("fire_hydrant <=", value, "fireHydrant");
            return (Criteria) this;
        }

        public Criteria andFireHydrantIn(List<Byte> values) {
            addCriterion("fire_hydrant in", values, "fireHydrant");
            return (Criteria) this;
        }

        public Criteria andFireHydrantNotIn(List<Byte> values) {
            addCriterion("fire_hydrant not in", values, "fireHydrant");
            return (Criteria) this;
        }

        public Criteria andFireHydrantBetween(Byte value1, Byte value2) {
            addCriterion("fire_hydrant between", value1, value2, "fireHydrant");
            return (Criteria) this;
        }

        public Criteria andFireHydrantNotBetween(Byte value1, Byte value2) {
            addCriterion("fire_hydrant not between", value1, value2, "fireHydrant");
            return (Criteria) this;
        }

        public Criteria andFireProducedateIsNull() {
            addCriterion("fire_produceDate is null");
            return (Criteria) this;
        }

        public Criteria andFireProducedateIsNotNull() {
            addCriterion("fire_produceDate is not null");
            return (Criteria) this;
        }

        public Criteria andFireProducedateEqualTo(Date value) {
            addCriterionForJDBCDate("fire_produceDate =", value, "fireProducedate");
            return (Criteria) this;
        }

        public Criteria andFireProducedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("fire_produceDate <>", value, "fireProducedate");
            return (Criteria) this;
        }

        public Criteria andFireProducedateGreaterThan(Date value) {
            addCriterionForJDBCDate("fire_produceDate >", value, "fireProducedate");
            return (Criteria) this;
        }

        public Criteria andFireProducedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fire_produceDate >=", value, "fireProducedate");
            return (Criteria) this;
        }

        public Criteria andFireProducedateLessThan(Date value) {
            addCriterionForJDBCDate("fire_produceDate <", value, "fireProducedate");
            return (Criteria) this;
        }

        public Criteria andFireProducedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fire_produceDate <=", value, "fireProducedate");
            return (Criteria) this;
        }

        public Criteria andFireProducedateIn(List<Date> values) {
            addCriterionForJDBCDate("fire_produceDate in", values, "fireProducedate");
            return (Criteria) this;
        }

        public Criteria andFireProducedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("fire_produceDate not in", values, "fireProducedate");
            return (Criteria) this;
        }

        public Criteria andFireProducedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fire_produceDate between", value1, value2, "fireProducedate");
            return (Criteria) this;
        }

        public Criteria andFireProducedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fire_produceDate not between", value1, value2, "fireProducedate");
            return (Criteria) this;
        }

        public Criteria andFireCheckoutdateIsNull() {
            addCriterion("fire_checkoutDate is null");
            return (Criteria) this;
        }

        public Criteria andFireCheckoutdateIsNotNull() {
            addCriterion("fire_checkoutDate is not null");
            return (Criteria) this;
        }

        public Criteria andFireCheckoutdateEqualTo(Date value) {
            addCriterionForJDBCDate("fire_checkoutDate =", value, "fireCheckoutdate");
            return (Criteria) this;
        }

        public Criteria andFireCheckoutdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("fire_checkoutDate <>", value, "fireCheckoutdate");
            return (Criteria) this;
        }

        public Criteria andFireCheckoutdateGreaterThan(Date value) {
            addCriterionForJDBCDate("fire_checkoutDate >", value, "fireCheckoutdate");
            return (Criteria) this;
        }

        public Criteria andFireCheckoutdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fire_checkoutDate >=", value, "fireCheckoutdate");
            return (Criteria) this;
        }

        public Criteria andFireCheckoutdateLessThan(Date value) {
            addCriterionForJDBCDate("fire_checkoutDate <", value, "fireCheckoutdate");
            return (Criteria) this;
        }

        public Criteria andFireCheckoutdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fire_checkoutDate <=", value, "fireCheckoutdate");
            return (Criteria) this;
        }

        public Criteria andFireCheckoutdateIn(List<Date> values) {
            addCriterionForJDBCDate("fire_checkoutDate in", values, "fireCheckoutdate");
            return (Criteria) this;
        }

        public Criteria andFireCheckoutdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("fire_checkoutDate not in", values, "fireCheckoutdate");
            return (Criteria) this;
        }

        public Criteria andFireCheckoutdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fire_checkoutDate between", value1, value2, "fireCheckoutdate");
            return (Criteria) this;
        }

        public Criteria andFireCheckoutdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fire_checkoutDate not between", value1, value2, "fireCheckoutdate");
            return (Criteria) this;
        }

        public Criteria andFireDutyIsNull() {
            addCriterion("fire_duty is null");
            return (Criteria) this;
        }

        public Criteria andFireDutyIsNotNull() {
            addCriterion("fire_duty is not null");
            return (Criteria) this;
        }

        public Criteria andFireDutyEqualTo(String value) {
            addCriterion("fire_duty =", value, "fireDuty");
            return (Criteria) this;
        }

        public Criteria andFireDutyNotEqualTo(String value) {
            addCriterion("fire_duty <>", value, "fireDuty");
            return (Criteria) this;
        }

        public Criteria andFireDutyGreaterThan(String value) {
            addCriterion("fire_duty >", value, "fireDuty");
            return (Criteria) this;
        }

        public Criteria andFireDutyGreaterThanOrEqualTo(String value) {
            addCriterion("fire_duty >=", value, "fireDuty");
            return (Criteria) this;
        }

        public Criteria andFireDutyLessThan(String value) {
            addCriterion("fire_duty <", value, "fireDuty");
            return (Criteria) this;
        }

        public Criteria andFireDutyLessThanOrEqualTo(String value) {
            addCriterion("fire_duty <=", value, "fireDuty");
            return (Criteria) this;
        }

        public Criteria andFireDutyLike(String value) {
            addCriterion("fire_duty like", value, "fireDuty");
            return (Criteria) this;
        }

        public Criteria andFireDutyNotLike(String value) {
            addCriterion("fire_duty not like", value, "fireDuty");
            return (Criteria) this;
        }

        public Criteria andFireDutyIn(List<String> values) {
            addCriterion("fire_duty in", values, "fireDuty");
            return (Criteria) this;
        }

        public Criteria andFireDutyNotIn(List<String> values) {
            addCriterion("fire_duty not in", values, "fireDuty");
            return (Criteria) this;
        }

        public Criteria andFireDutyBetween(String value1, String value2) {
            addCriterion("fire_duty between", value1, value2, "fireDuty");
            return (Criteria) this;
        }

        public Criteria andFireDutyNotBetween(String value1, String value2) {
            addCriterion("fire_duty not between", value1, value2, "fireDuty");
            return (Criteria) this;
        }

        public Criteria andFireUnitIsNull() {
            addCriterion("fire_unit is null");
            return (Criteria) this;
        }

        public Criteria andFireUnitIsNotNull() {
            addCriterion("fire_unit is not null");
            return (Criteria) this;
        }

        public Criteria andFireUnitEqualTo(String value) {
            addCriterion("fire_unit =", value, "fireUnit");
            return (Criteria) this;
        }

        public Criteria andFireUnitNotEqualTo(String value) {
            addCriterion("fire_unit <>", value, "fireUnit");
            return (Criteria) this;
        }

        public Criteria andFireUnitGreaterThan(String value) {
            addCriterion("fire_unit >", value, "fireUnit");
            return (Criteria) this;
        }

        public Criteria andFireUnitGreaterThanOrEqualTo(String value) {
            addCriterion("fire_unit >=", value, "fireUnit");
            return (Criteria) this;
        }

        public Criteria andFireUnitLessThan(String value) {
            addCriterion("fire_unit <", value, "fireUnit");
            return (Criteria) this;
        }

        public Criteria andFireUnitLessThanOrEqualTo(String value) {
            addCriterion("fire_unit <=", value, "fireUnit");
            return (Criteria) this;
        }

        public Criteria andFireUnitLike(String value) {
            addCriterion("fire_unit like", value, "fireUnit");
            return (Criteria) this;
        }

        public Criteria andFireUnitNotLike(String value) {
            addCriterion("fire_unit not like", value, "fireUnit");
            return (Criteria) this;
        }

        public Criteria andFireUnitIn(List<String> values) {
            addCriterion("fire_unit in", values, "fireUnit");
            return (Criteria) this;
        }

        public Criteria andFireUnitNotIn(List<String> values) {
            addCriterion("fire_unit not in", values, "fireUnit");
            return (Criteria) this;
        }

        public Criteria andFireUnitBetween(String value1, String value2) {
            addCriterion("fire_unit between", value1, value2, "fireUnit");
            return (Criteria) this;
        }

        public Criteria andFireUnitNotBetween(String value1, String value2) {
            addCriterion("fire_unit not between", value1, value2, "fireUnit");
            return (Criteria) this;
        }

        public Criteria andFireIsinspectIsNull() {
            addCriterion("fire_isInspect is null");
            return (Criteria) this;
        }

        public Criteria andFireIsinspectIsNotNull() {
            addCriterion("fire_isInspect is not null");
            return (Criteria) this;
        }

        public Criteria andFireIsinspectEqualTo(Byte value) {
            addCriterion("fire_isInspect =", value, "fireIsinspect");
            return (Criteria) this;
        }

        public Criteria andFireIsinspectNotEqualTo(Byte value) {
            addCriterion("fire_isInspect <>", value, "fireIsinspect");
            return (Criteria) this;
        }

        public Criteria andFireIsinspectGreaterThan(Byte value) {
            addCriterion("fire_isInspect >", value, "fireIsinspect");
            return (Criteria) this;
        }

        public Criteria andFireIsinspectGreaterThanOrEqualTo(Byte value) {
            addCriterion("fire_isInspect >=", value, "fireIsinspect");
            return (Criteria) this;
        }

        public Criteria andFireIsinspectLessThan(Byte value) {
            addCriterion("fire_isInspect <", value, "fireIsinspect");
            return (Criteria) this;
        }

        public Criteria andFireIsinspectLessThanOrEqualTo(Byte value) {
            addCriterion("fire_isInspect <=", value, "fireIsinspect");
            return (Criteria) this;
        }

        public Criteria andFireIsinspectIn(List<Byte> values) {
            addCriterion("fire_isInspect in", values, "fireIsinspect");
            return (Criteria) this;
        }

        public Criteria andFireIsinspectNotIn(List<Byte> values) {
            addCriterion("fire_isInspect not in", values, "fireIsinspect");
            return (Criteria) this;
        }

        public Criteria andFireIsinspectBetween(Byte value1, Byte value2) {
            addCriterion("fire_isInspect between", value1, value2, "fireIsinspect");
            return (Criteria) this;
        }

        public Criteria andFireIsinspectNotBetween(Byte value1, Byte value2) {
            addCriterion("fire_isInspect not between", value1, value2, "fireIsinspect");
            return (Criteria) this;
        }

        public Criteria andFireIsintactIsNull() {
            addCriterion("fire_isIntact is null");
            return (Criteria) this;
        }

        public Criteria andFireIsintactIsNotNull() {
            addCriterion("fire_isIntact is not null");
            return (Criteria) this;
        }

        public Criteria andFireIsintactEqualTo(Byte value) {
            addCriterion("fire_isIntact =", value, "fireIsintact");
            return (Criteria) this;
        }

        public Criteria andFireIsintactNotEqualTo(Byte value) {
            addCriterion("fire_isIntact <>", value, "fireIsintact");
            return (Criteria) this;
        }

        public Criteria andFireIsintactGreaterThan(Byte value) {
            addCriterion("fire_isIntact >", value, "fireIsintact");
            return (Criteria) this;
        }

        public Criteria andFireIsintactGreaterThanOrEqualTo(Byte value) {
            addCriterion("fire_isIntact >=", value, "fireIsintact");
            return (Criteria) this;
        }

        public Criteria andFireIsintactLessThan(Byte value) {
            addCriterion("fire_isIntact <", value, "fireIsintact");
            return (Criteria) this;
        }

        public Criteria andFireIsintactLessThanOrEqualTo(Byte value) {
            addCriterion("fire_isIntact <=", value, "fireIsintact");
            return (Criteria) this;
        }

        public Criteria andFireIsintactIn(List<Byte> values) {
            addCriterion("fire_isIntact in", values, "fireIsintact");
            return (Criteria) this;
        }

        public Criteria andFireIsintactNotIn(List<Byte> values) {
            addCriterion("fire_isIntact not in", values, "fireIsintact");
            return (Criteria) this;
        }

        public Criteria andFireIsintactBetween(Byte value1, Byte value2) {
            addCriterion("fire_isIntact between", value1, value2, "fireIsintact");
            return (Criteria) this;
        }

        public Criteria andFireIsintactNotBetween(Byte value1, Byte value2) {
            addCriterion("fire_isIntact not between", value1, value2, "fireIsintact");
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