package edu.hust.top.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CheckinRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckinRecordExample() {
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

        public Criteria andCheckinrecordidIsNull() {
            addCriterion("checkinRecordID is null");
            return (Criteria) this;
        }

        public Criteria andCheckinrecordidIsNotNull() {
            addCriterion("checkinRecordID is not null");
            return (Criteria) this;
        }

        public Criteria andCheckinrecordidEqualTo(Integer value) {
            addCriterion("checkinRecordID =", value, "checkinrecordid");
            return (Criteria) this;
        }

        public Criteria andCheckinrecordidNotEqualTo(Integer value) {
            addCriterion("checkinRecordID <>", value, "checkinrecordid");
            return (Criteria) this;
        }

        public Criteria andCheckinrecordidGreaterThan(Integer value) {
            addCriterion("checkinRecordID >", value, "checkinrecordid");
            return (Criteria) this;
        }

        public Criteria andCheckinrecordidGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkinRecordID >=", value, "checkinrecordid");
            return (Criteria) this;
        }

        public Criteria andCheckinrecordidLessThan(Integer value) {
            addCriterion("checkinRecordID <", value, "checkinrecordid");
            return (Criteria) this;
        }

        public Criteria andCheckinrecordidLessThanOrEqualTo(Integer value) {
            addCriterion("checkinRecordID <=", value, "checkinrecordid");
            return (Criteria) this;
        }

        public Criteria andCheckinrecordidIn(List<Integer> values) {
            addCriterion("checkinRecordID in", values, "checkinrecordid");
            return (Criteria) this;
        }

        public Criteria andCheckinrecordidNotIn(List<Integer> values) {
            addCriterion("checkinRecordID not in", values, "checkinrecordid");
            return (Criteria) this;
        }

        public Criteria andCheckinrecordidBetween(Integer value1, Integer value2) {
            addCriterion("checkinRecordID between", value1, value2, "checkinrecordid");
            return (Criteria) this;
        }

        public Criteria andCheckinrecordidNotBetween(Integer value1, Integer value2) {
            addCriterion("checkinRecordID not between", value1, value2, "checkinrecordid");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNull() {
            addCriterion("checkTime is null");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNotNull() {
            addCriterion("checkTime is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimeEqualTo(Date value) {
            addCriterion("checkTime =", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotEqualTo(Date value) {
            addCriterion("checkTime <>", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThan(Date value) {
            addCriterion("checkTime >", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("checkTime >=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThan(Date value) {
            addCriterion("checkTime <", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThanOrEqualTo(Date value) {
            addCriterion("checkTime <=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIn(List<Date> values) {
            addCriterion("checkTime in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotIn(List<Date> values) {
            addCriterion("checkTime not in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeBetween(Date value1, Date value2) {
            addCriterion("checkTime between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotBetween(Date value1, Date value2) {
            addCriterion("checkTime not between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andWorkeridIsNull() {
            addCriterion("workerID is null");
            return (Criteria) this;
        }

        public Criteria andWorkeridIsNotNull() {
            addCriterion("workerID is not null");
            return (Criteria) this;
        }

        public Criteria andWorkeridEqualTo(String value) {
            addCriterion("workerID =", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridNotEqualTo(String value) {
            addCriterion("workerID <>", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridGreaterThan(String value) {
            addCriterion("workerID >", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridGreaterThanOrEqualTo(String value) {
            addCriterion("workerID >=", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridLessThan(String value) {
            addCriterion("workerID <", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridLessThanOrEqualTo(String value) {
            addCriterion("workerID <=", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridLike(String value) {
            addCriterion("workerID like", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridNotLike(String value) {
            addCriterion("workerID not like", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridIn(List<String> values) {
            addCriterion("workerID in", values, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridNotIn(List<String> values) {
            addCriterion("workerID not in", values, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridBetween(String value1, String value2) {
            addCriterion("workerID between", value1, value2, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridNotBetween(String value1, String value2) {
            addCriterion("workerID not between", value1, value2, "workerid");
            return (Criteria) this;
        }

        public Criteria andBuildingidIsNull() {
            addCriterion("buildingID is null");
            return (Criteria) this;
        }

        public Criteria andBuildingidIsNotNull() {
            addCriterion("buildingID is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingidEqualTo(Integer value) {
            addCriterion("buildingID =", value, "buildingid");
            return (Criteria) this;
        }

        public Criteria andBuildingidNotEqualTo(Integer value) {
            addCriterion("buildingID <>", value, "buildingid");
            return (Criteria) this;
        }

        public Criteria andBuildingidGreaterThan(Integer value) {
            addCriterion("buildingID >", value, "buildingid");
            return (Criteria) this;
        }

        public Criteria andBuildingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("buildingID >=", value, "buildingid");
            return (Criteria) this;
        }

        public Criteria andBuildingidLessThan(Integer value) {
            addCriterion("buildingID <", value, "buildingid");
            return (Criteria) this;
        }

        public Criteria andBuildingidLessThanOrEqualTo(Integer value) {
            addCriterion("buildingID <=", value, "buildingid");
            return (Criteria) this;
        }

        public Criteria andBuildingidIn(List<Integer> values) {
            addCriterion("buildingID in", values, "buildingid");
            return (Criteria) this;
        }

        public Criteria andBuildingidNotIn(List<Integer> values) {
            addCriterion("buildingID not in", values, "buildingid");
            return (Criteria) this;
        }

        public Criteria andBuildingidBetween(Integer value1, Integer value2) {
            addCriterion("buildingID between", value1, value2, "buildingid");
            return (Criteria) this;
        }

        public Criteria andBuildingidNotBetween(Integer value1, Integer value2) {
            addCriterion("buildingID not between", value1, value2, "buildingid");
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