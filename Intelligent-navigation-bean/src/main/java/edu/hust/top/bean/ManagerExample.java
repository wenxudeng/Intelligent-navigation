package edu.hust.top.bean;

import java.util.ArrayList;
import java.util.List;

public class ManagerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManagerExample() {
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

        public Criteria andNamageridIsNull() {
            addCriterion("namagerID is null");
            return (Criteria) this;
        }

        public Criteria andNamageridIsNotNull() {
            addCriterion("namagerID is not null");
            return (Criteria) this;
        }

        public Criteria andNamageridEqualTo(Integer value) {
            addCriterion("namagerID =", value, "namagerid");
            return (Criteria) this;
        }

        public Criteria andNamageridNotEqualTo(Integer value) {
            addCriterion("namagerID <>", value, "namagerid");
            return (Criteria) this;
        }

        public Criteria andNamageridGreaterThan(Integer value) {
            addCriterion("namagerID >", value, "namagerid");
            return (Criteria) this;
        }

        public Criteria andNamageridGreaterThanOrEqualTo(Integer value) {
            addCriterion("namagerID >=", value, "namagerid");
            return (Criteria) this;
        }

        public Criteria andNamageridLessThan(Integer value) {
            addCriterion("namagerID <", value, "namagerid");
            return (Criteria) this;
        }

        public Criteria andNamageridLessThanOrEqualTo(Integer value) {
            addCriterion("namagerID <=", value, "namagerid");
            return (Criteria) this;
        }

        public Criteria andNamageridIn(List<Integer> values) {
            addCriterion("namagerID in", values, "namagerid");
            return (Criteria) this;
        }

        public Criteria andNamageridNotIn(List<Integer> values) {
            addCriterion("namagerID not in", values, "namagerid");
            return (Criteria) this;
        }

        public Criteria andNamageridBetween(Integer value1, Integer value2) {
            addCriterion("namagerID between", value1, value2, "namagerid");
            return (Criteria) this;
        }

        public Criteria andNamageridNotBetween(Integer value1, Integer value2) {
            addCriterion("namagerID not between", value1, value2, "namagerid");
            return (Criteria) this;
        }

        public Criteria andManagernameIsNull() {
            addCriterion("managerName is null");
            return (Criteria) this;
        }

        public Criteria andManagernameIsNotNull() {
            addCriterion("managerName is not null");
            return (Criteria) this;
        }

        public Criteria andManagernameEqualTo(String value) {
            addCriterion("managerName =", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameNotEqualTo(String value) {
            addCriterion("managerName <>", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameGreaterThan(String value) {
            addCriterion("managerName >", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameGreaterThanOrEqualTo(String value) {
            addCriterion("managerName >=", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameLessThan(String value) {
            addCriterion("managerName <", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameLessThanOrEqualTo(String value) {
            addCriterion("managerName <=", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameLike(String value) {
            addCriterion("managerName like", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameNotLike(String value) {
            addCriterion("managerName not like", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameIn(List<String> values) {
            addCriterion("managerName in", values, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameNotIn(List<String> values) {
            addCriterion("managerName not in", values, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameBetween(String value1, String value2) {
            addCriterion("managerName between", value1, value2, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameNotBetween(String value1, String value2) {
            addCriterion("managerName not between", value1, value2, "managername");
            return (Criteria) this;
        }

        public Criteria andManagerpwdIsNull() {
            addCriterion("managerPwd is null");
            return (Criteria) this;
        }

        public Criteria andManagerpwdIsNotNull() {
            addCriterion("managerPwd is not null");
            return (Criteria) this;
        }

        public Criteria andManagerpwdEqualTo(String value) {
            addCriterion("managerPwd =", value, "managerpwd");
            return (Criteria) this;
        }

        public Criteria andManagerpwdNotEqualTo(String value) {
            addCriterion("managerPwd <>", value, "managerpwd");
            return (Criteria) this;
        }

        public Criteria andManagerpwdGreaterThan(String value) {
            addCriterion("managerPwd >", value, "managerpwd");
            return (Criteria) this;
        }

        public Criteria andManagerpwdGreaterThanOrEqualTo(String value) {
            addCriterion("managerPwd >=", value, "managerpwd");
            return (Criteria) this;
        }

        public Criteria andManagerpwdLessThan(String value) {
            addCriterion("managerPwd <", value, "managerpwd");
            return (Criteria) this;
        }

        public Criteria andManagerpwdLessThanOrEqualTo(String value) {
            addCriterion("managerPwd <=", value, "managerpwd");
            return (Criteria) this;
        }

        public Criteria andManagerpwdLike(String value) {
            addCriterion("managerPwd like", value, "managerpwd");
            return (Criteria) this;
        }

        public Criteria andManagerpwdNotLike(String value) {
            addCriterion("managerPwd not like", value, "managerpwd");
            return (Criteria) this;
        }

        public Criteria andManagerpwdIn(List<String> values) {
            addCriterion("managerPwd in", values, "managerpwd");
            return (Criteria) this;
        }

        public Criteria andManagerpwdNotIn(List<String> values) {
            addCriterion("managerPwd not in", values, "managerpwd");
            return (Criteria) this;
        }

        public Criteria andManagerpwdBetween(String value1, String value2) {
            addCriterion("managerPwd between", value1, value2, "managerpwd");
            return (Criteria) this;
        }

        public Criteria andManagerpwdNotBetween(String value1, String value2) {
            addCriterion("managerPwd not between", value1, value2, "managerpwd");
            return (Criteria) this;
        }

        public Criteria andManegerphoneIsNull() {
            addCriterion("manegerPhone is null");
            return (Criteria) this;
        }

        public Criteria andManegerphoneIsNotNull() {
            addCriterion("manegerPhone is not null");
            return (Criteria) this;
        }

        public Criteria andManegerphoneEqualTo(String value) {
            addCriterion("manegerPhone =", value, "manegerphone");
            return (Criteria) this;
        }

        public Criteria andManegerphoneNotEqualTo(String value) {
            addCriterion("manegerPhone <>", value, "manegerphone");
            return (Criteria) this;
        }

        public Criteria andManegerphoneGreaterThan(String value) {
            addCriterion("manegerPhone >", value, "manegerphone");
            return (Criteria) this;
        }

        public Criteria andManegerphoneGreaterThanOrEqualTo(String value) {
            addCriterion("manegerPhone >=", value, "manegerphone");
            return (Criteria) this;
        }

        public Criteria andManegerphoneLessThan(String value) {
            addCriterion("manegerPhone <", value, "manegerphone");
            return (Criteria) this;
        }

        public Criteria andManegerphoneLessThanOrEqualTo(String value) {
            addCriterion("manegerPhone <=", value, "manegerphone");
            return (Criteria) this;
        }

        public Criteria andManegerphoneLike(String value) {
            addCriterion("manegerPhone like", value, "manegerphone");
            return (Criteria) this;
        }

        public Criteria andManegerphoneNotLike(String value) {
            addCriterion("manegerPhone not like", value, "manegerphone");
            return (Criteria) this;
        }

        public Criteria andManegerphoneIn(List<String> values) {
            addCriterion("manegerPhone in", values, "manegerphone");
            return (Criteria) this;
        }

        public Criteria andManegerphoneNotIn(List<String> values) {
            addCriterion("manegerPhone not in", values, "manegerphone");
            return (Criteria) this;
        }

        public Criteria andManegerphoneBetween(String value1, String value2) {
            addCriterion("manegerPhone between", value1, value2, "manegerphone");
            return (Criteria) this;
        }

        public Criteria andManegerphoneNotBetween(String value1, String value2) {
            addCriterion("manegerPhone not between", value1, value2, "manegerphone");
            return (Criteria) this;
        }

        public Criteria andManageremailIsNull() {
            addCriterion("managerEmail is null");
            return (Criteria) this;
        }

        public Criteria andManageremailIsNotNull() {
            addCriterion("managerEmail is not null");
            return (Criteria) this;
        }

        public Criteria andManageremailEqualTo(String value) {
            addCriterion("managerEmail =", value, "manageremail");
            return (Criteria) this;
        }

        public Criteria andManageremailNotEqualTo(String value) {
            addCriterion("managerEmail <>", value, "manageremail");
            return (Criteria) this;
        }

        public Criteria andManageremailGreaterThan(String value) {
            addCriterion("managerEmail >", value, "manageremail");
            return (Criteria) this;
        }

        public Criteria andManageremailGreaterThanOrEqualTo(String value) {
            addCriterion("managerEmail >=", value, "manageremail");
            return (Criteria) this;
        }

        public Criteria andManageremailLessThan(String value) {
            addCriterion("managerEmail <", value, "manageremail");
            return (Criteria) this;
        }

        public Criteria andManageremailLessThanOrEqualTo(String value) {
            addCriterion("managerEmail <=", value, "manageremail");
            return (Criteria) this;
        }

        public Criteria andManageremailLike(String value) {
            addCriterion("managerEmail like", value, "manageremail");
            return (Criteria) this;
        }

        public Criteria andManageremailNotLike(String value) {
            addCriterion("managerEmail not like", value, "manageremail");
            return (Criteria) this;
        }

        public Criteria andManageremailIn(List<String> values) {
            addCriterion("managerEmail in", values, "manageremail");
            return (Criteria) this;
        }

        public Criteria andManageremailNotIn(List<String> values) {
            addCriterion("managerEmail not in", values, "manageremail");
            return (Criteria) this;
        }

        public Criteria andManageremailBetween(String value1, String value2) {
            addCriterion("managerEmail between", value1, value2, "manageremail");
            return (Criteria) this;
        }

        public Criteria andManageremailNotBetween(String value1, String value2) {
            addCriterion("managerEmail not between", value1, value2, "manageremail");
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