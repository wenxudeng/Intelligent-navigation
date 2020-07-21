package edu.hust.top.bean;

import java.util.ArrayList;
import java.util.List;

public class IndoorMapExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IndoorMapExample() {
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

        public Criteria andIndoormapidIsNull() {
            addCriterion("IndoorMapID is null");
            return (Criteria) this;
        }

        public Criteria andIndoormapidIsNotNull() {
            addCriterion("IndoorMapID is not null");
            return (Criteria) this;
        }

        public Criteria andIndoormapidEqualTo(Integer value) {
            addCriterion("IndoorMapID =", value, "indoormapid");
            return (Criteria) this;
        }

        public Criteria andIndoormapidNotEqualTo(Integer value) {
            addCriterion("IndoorMapID <>", value, "indoormapid");
            return (Criteria) this;
        }

        public Criteria andIndoormapidGreaterThan(Integer value) {
            addCriterion("IndoorMapID >", value, "indoormapid");
            return (Criteria) this;
        }

        public Criteria andIndoormapidGreaterThanOrEqualTo(Integer value) {
            addCriterion("IndoorMapID >=", value, "indoormapid");
            return (Criteria) this;
        }

        public Criteria andIndoormapidLessThan(Integer value) {
            addCriterion("IndoorMapID <", value, "indoormapid");
            return (Criteria) this;
        }

        public Criteria andIndoormapidLessThanOrEqualTo(Integer value) {
            addCriterion("IndoorMapID <=", value, "indoormapid");
            return (Criteria) this;
        }

        public Criteria andIndoormapidIn(List<Integer> values) {
            addCriterion("IndoorMapID in", values, "indoormapid");
            return (Criteria) this;
        }

        public Criteria andIndoormapidNotIn(List<Integer> values) {
            addCriterion("IndoorMapID not in", values, "indoormapid");
            return (Criteria) this;
        }

        public Criteria andIndoormapidBetween(Integer value1, Integer value2) {
            addCriterion("IndoorMapID between", value1, value2, "indoormapid");
            return (Criteria) this;
        }

        public Criteria andIndoormapidNotBetween(Integer value1, Integer value2) {
            addCriterion("IndoorMapID not between", value1, value2, "indoormapid");
            return (Criteria) this;
        }

        public Criteria andFloorIsNull() {
            addCriterion("floor is null");
            return (Criteria) this;
        }

        public Criteria andFloorIsNotNull() {
            addCriterion("floor is not null");
            return (Criteria) this;
        }

        public Criteria andFloorEqualTo(Integer value) {
            addCriterion("floor =", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotEqualTo(Integer value) {
            addCriterion("floor <>", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThan(Integer value) {
            addCriterion("floor >", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("floor >=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThan(Integer value) {
            addCriterion("floor <", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThanOrEqualTo(Integer value) {
            addCriterion("floor <=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorIn(List<Integer> values) {
            addCriterion("floor in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotIn(List<Integer> values) {
            addCriterion("floor not in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorBetween(Integer value1, Integer value2) {
            addCriterion("floor between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("floor not between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andSvgpathIsNull() {
            addCriterion("svgPath is null");
            return (Criteria) this;
        }

        public Criteria andSvgpathIsNotNull() {
            addCriterion("svgPath is not null");
            return (Criteria) this;
        }

        public Criteria andSvgpathEqualTo(String value) {
            addCriterion("svgPath =", value, "svgpath");
            return (Criteria) this;
        }

        public Criteria andSvgpathNotEqualTo(String value) {
            addCriterion("svgPath <>", value, "svgpath");
            return (Criteria) this;
        }

        public Criteria andSvgpathGreaterThan(String value) {
            addCriterion("svgPath >", value, "svgpath");
            return (Criteria) this;
        }

        public Criteria andSvgpathGreaterThanOrEqualTo(String value) {
            addCriterion("svgPath >=", value, "svgpath");
            return (Criteria) this;
        }

        public Criteria andSvgpathLessThan(String value) {
            addCriterion("svgPath <", value, "svgpath");
            return (Criteria) this;
        }

        public Criteria andSvgpathLessThanOrEqualTo(String value) {
            addCriterion("svgPath <=", value, "svgpath");
            return (Criteria) this;
        }

        public Criteria andSvgpathLike(String value) {
            addCriterion("svgPath like", value, "svgpath");
            return (Criteria) this;
        }

        public Criteria andSvgpathNotLike(String value) {
            addCriterion("svgPath not like", value, "svgpath");
            return (Criteria) this;
        }

        public Criteria andSvgpathIn(List<String> values) {
            addCriterion("svgPath in", values, "svgpath");
            return (Criteria) this;
        }

        public Criteria andSvgpathNotIn(List<String> values) {
            addCriterion("svgPath not in", values, "svgpath");
            return (Criteria) this;
        }

        public Criteria andSvgpathBetween(String value1, String value2) {
            addCriterion("svgPath between", value1, value2, "svgpath");
            return (Criteria) this;
        }

        public Criteria andSvgpathNotBetween(String value1, String value2) {
            addCriterion("svgPath not between", value1, value2, "svgpath");
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