package edu.hust.top.bean;

import java.util.ArrayList;
import java.util.List;

public class WorkerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkerExample() {
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

        public Criteria andWorkernameIsNull() {
            addCriterion("workerName is null");
            return (Criteria) this;
        }

        public Criteria andWorkernameIsNotNull() {
            addCriterion("workerName is not null");
            return (Criteria) this;
        }

        public Criteria andWorkernameEqualTo(String value) {
            addCriterion("workerName =", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameNotEqualTo(String value) {
            addCriterion("workerName <>", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameGreaterThan(String value) {
            addCriterion("workerName >", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameGreaterThanOrEqualTo(String value) {
            addCriterion("workerName >=", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameLessThan(String value) {
            addCriterion("workerName <", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameLessThanOrEqualTo(String value) {
            addCriterion("workerName <=", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameLike(String value) {
            addCriterion("workerName like", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameNotLike(String value) {
            addCriterion("workerName not like", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameIn(List<String> values) {
            addCriterion("workerName in", values, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameNotIn(List<String> values) {
            addCriterion("workerName not in", values, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameBetween(String value1, String value2) {
            addCriterion("workerName between", value1, value2, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameNotBetween(String value1, String value2) {
            addCriterion("workerName not between", value1, value2, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernumIsNull() {
            addCriterion("workerNum is null");
            return (Criteria) this;
        }

        public Criteria andWorkernumIsNotNull() {
            addCriterion("workerNum is not null");
            return (Criteria) this;
        }

        public Criteria andWorkernumEqualTo(String value) {
            addCriterion("workerNum =", value, "workernum");
            return (Criteria) this;
        }

        public Criteria andWorkernumNotEqualTo(String value) {
            addCriterion("workerNum <>", value, "workernum");
            return (Criteria) this;
        }

        public Criteria andWorkernumGreaterThan(String value) {
            addCriterion("workerNum >", value, "workernum");
            return (Criteria) this;
        }

        public Criteria andWorkernumGreaterThanOrEqualTo(String value) {
            addCriterion("workerNum >=", value, "workernum");
            return (Criteria) this;
        }

        public Criteria andWorkernumLessThan(String value) {
            addCriterion("workerNum <", value, "workernum");
            return (Criteria) this;
        }

        public Criteria andWorkernumLessThanOrEqualTo(String value) {
            addCriterion("workerNum <=", value, "workernum");
            return (Criteria) this;
        }

        public Criteria andWorkernumLike(String value) {
            addCriterion("workerNum like", value, "workernum");
            return (Criteria) this;
        }

        public Criteria andWorkernumNotLike(String value) {
            addCriterion("workerNum not like", value, "workernum");
            return (Criteria) this;
        }

        public Criteria andWorkernumIn(List<String> values) {
            addCriterion("workerNum in", values, "workernum");
            return (Criteria) this;
        }

        public Criteria andWorkernumNotIn(List<String> values) {
            addCriterion("workerNum not in", values, "workernum");
            return (Criteria) this;
        }

        public Criteria andWorkernumBetween(String value1, String value2) {
            addCriterion("workerNum between", value1, value2, "workernum");
            return (Criteria) this;
        }

        public Criteria andWorkernumNotBetween(String value1, String value2) {
            addCriterion("workerNum not between", value1, value2, "workernum");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("salt not between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andPhonenumIsNull() {
            addCriterion("phoneNum is null");
            return (Criteria) this;
        }

        public Criteria andPhonenumIsNotNull() {
            addCriterion("phoneNum is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenumEqualTo(String value) {
            addCriterion("phoneNum =", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotEqualTo(String value) {
            addCriterion("phoneNum <>", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumGreaterThan(String value) {
            addCriterion("phoneNum >", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumGreaterThanOrEqualTo(String value) {
            addCriterion("phoneNum >=", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLessThan(String value) {
            addCriterion("phoneNum <", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLessThanOrEqualTo(String value) {
            addCriterion("phoneNum <=", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLike(String value) {
            addCriterion("phoneNum like", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotLike(String value) {
            addCriterion("phoneNum not like", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumIn(List<String> values) {
            addCriterion("phoneNum in", values, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotIn(List<String> values) {
            addCriterion("phoneNum not in", values, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumBetween(String value1, String value2) {
            addCriterion("phoneNum between", value1, value2, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotBetween(String value1, String value2) {
            addCriterion("phoneNum not between", value1, value2, "phonenum");
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