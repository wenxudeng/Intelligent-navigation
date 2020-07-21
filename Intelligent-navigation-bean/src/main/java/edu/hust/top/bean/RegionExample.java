package edu.hust.top.bean;

import java.util.ArrayList;
import java.util.List;

public class RegionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegionExample() {
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

        public Criteria andRegionidIsNull() {
            addCriterion("regionID is null");
            return (Criteria) this;
        }

        public Criteria andRegionidIsNotNull() {
            addCriterion("regionID is not null");
            return (Criteria) this;
        }

        public Criteria andRegionidEqualTo(Integer value) {
            addCriterion("regionID =", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidNotEqualTo(Integer value) {
            addCriterion("regionID <>", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidGreaterThan(Integer value) {
            addCriterion("regionID >", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("regionID >=", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidLessThan(Integer value) {
            addCriterion("regionID <", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidLessThanOrEqualTo(Integer value) {
            addCriterion("regionID <=", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidIn(List<Integer> values) {
            addCriterion("regionID in", values, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidNotIn(List<Integer> values) {
            addCriterion("regionID not in", values, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidBetween(Integer value1, Integer value2) {
            addCriterion("regionID between", value1, value2, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidNotBetween(Integer value1, Integer value2) {
            addCriterion("regionID not between", value1, value2, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionnameIsNull() {
            addCriterion("regionName is null");
            return (Criteria) this;
        }

        public Criteria andRegionnameIsNotNull() {
            addCriterion("regionName is not null");
            return (Criteria) this;
        }

        public Criteria andRegionnameEqualTo(String value) {
            addCriterion("regionName =", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameNotEqualTo(String value) {
            addCriterion("regionName <>", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameGreaterThan(String value) {
            addCriterion("regionName >", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameGreaterThanOrEqualTo(String value) {
            addCriterion("regionName >=", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameLessThan(String value) {
            addCriterion("regionName <", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameLessThanOrEqualTo(String value) {
            addCriterion("regionName <=", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameLike(String value) {
            addCriterion("regionName like", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameNotLike(String value) {
            addCriterion("regionName not like", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameIn(List<String> values) {
            addCriterion("regionName in", values, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameNotIn(List<String> values) {
            addCriterion("regionName not in", values, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameBetween(String value1, String value2) {
            addCriterion("regionName between", value1, value2, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameNotBetween(String value1, String value2) {
            addCriterion("regionName not between", value1, value2, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionlocationIsNull() {
            addCriterion("regionLocation is null");
            return (Criteria) this;
        }

        public Criteria andRegionlocationIsNotNull() {
            addCriterion("regionLocation is not null");
            return (Criteria) this;
        }

        public Criteria andRegionlocationEqualTo(String value) {
            addCriterion("regionLocation =", value, "regionlocation");
            return (Criteria) this;
        }

        public Criteria andRegionlocationNotEqualTo(String value) {
            addCriterion("regionLocation <>", value, "regionlocation");
            return (Criteria) this;
        }

        public Criteria andRegionlocationGreaterThan(String value) {
            addCriterion("regionLocation >", value, "regionlocation");
            return (Criteria) this;
        }

        public Criteria andRegionlocationGreaterThanOrEqualTo(String value) {
            addCriterion("regionLocation >=", value, "regionlocation");
            return (Criteria) this;
        }

        public Criteria andRegionlocationLessThan(String value) {
            addCriterion("regionLocation <", value, "regionlocation");
            return (Criteria) this;
        }

        public Criteria andRegionlocationLessThanOrEqualTo(String value) {
            addCriterion("regionLocation <=", value, "regionlocation");
            return (Criteria) this;
        }

        public Criteria andRegionlocationLike(String value) {
            addCriterion("regionLocation like", value, "regionlocation");
            return (Criteria) this;
        }

        public Criteria andRegionlocationNotLike(String value) {
            addCriterion("regionLocation not like", value, "regionlocation");
            return (Criteria) this;
        }

        public Criteria andRegionlocationIn(List<String> values) {
            addCriterion("regionLocation in", values, "regionlocation");
            return (Criteria) this;
        }

        public Criteria andRegionlocationNotIn(List<String> values) {
            addCriterion("regionLocation not in", values, "regionlocation");
            return (Criteria) this;
        }

        public Criteria andRegionlocationBetween(String value1, String value2) {
            addCriterion("regionLocation between", value1, value2, "regionlocation");
            return (Criteria) this;
        }

        public Criteria andRegionlocationNotBetween(String value1, String value2) {
            addCriterion("regionLocation not between", value1, value2, "regionlocation");
            return (Criteria) this;
        }

        public Criteria andRegionmapIsNull() {
            addCriterion("regionMap is null");
            return (Criteria) this;
        }

        public Criteria andRegionmapIsNotNull() {
            addCriterion("regionMap is not null");
            return (Criteria) this;
        }

        public Criteria andRegionmapEqualTo(String value) {
            addCriterion("regionMap =", value, "regionmap");
            return (Criteria) this;
        }

        public Criteria andRegionmapNotEqualTo(String value) {
            addCriterion("regionMap <>", value, "regionmap");
            return (Criteria) this;
        }

        public Criteria andRegionmapGreaterThan(String value) {
            addCriterion("regionMap >", value, "regionmap");
            return (Criteria) this;
        }

        public Criteria andRegionmapGreaterThanOrEqualTo(String value) {
            addCriterion("regionMap >=", value, "regionmap");
            return (Criteria) this;
        }

        public Criteria andRegionmapLessThan(String value) {
            addCriterion("regionMap <", value, "regionmap");
            return (Criteria) this;
        }

        public Criteria andRegionmapLessThanOrEqualTo(String value) {
            addCriterion("regionMap <=", value, "regionmap");
            return (Criteria) this;
        }

        public Criteria andRegionmapLike(String value) {
            addCriterion("regionMap like", value, "regionmap");
            return (Criteria) this;
        }

        public Criteria andRegionmapNotLike(String value) {
            addCriterion("regionMap not like", value, "regionmap");
            return (Criteria) this;
        }

        public Criteria andRegionmapIn(List<String> values) {
            addCriterion("regionMap in", values, "regionmap");
            return (Criteria) this;
        }

        public Criteria andRegionmapNotIn(List<String> values) {
            addCriterion("regionMap not in", values, "regionmap");
            return (Criteria) this;
        }

        public Criteria andRegionmapBetween(String value1, String value2) {
            addCriterion("regionMap between", value1, value2, "regionmap");
            return (Criteria) this;
        }

        public Criteria andRegionmapNotBetween(String value1, String value2) {
            addCriterion("regionMap not between", value1, value2, "regionmap");
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