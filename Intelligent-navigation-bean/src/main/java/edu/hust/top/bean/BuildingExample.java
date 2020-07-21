package edu.hust.top.bean;

import java.util.ArrayList;
import java.util.List;

public class BuildingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuildingExample() {
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

        public Criteria andBuildinglocationIsNull() {
            addCriterion("buildingLocation is null");
            return (Criteria) this;
        }

        public Criteria andBuildinglocationIsNotNull() {
            addCriterion("buildingLocation is not null");
            return (Criteria) this;
        }

        public Criteria andBuildinglocationEqualTo(String value) {
            addCriterion("buildingLocation =", value, "buildinglocation");
            return (Criteria) this;
        }

        public Criteria andBuildinglocationNotEqualTo(String value) {
            addCriterion("buildingLocation <>", value, "buildinglocation");
            return (Criteria) this;
        }

        public Criteria andBuildinglocationGreaterThan(String value) {
            addCriterion("buildingLocation >", value, "buildinglocation");
            return (Criteria) this;
        }

        public Criteria andBuildinglocationGreaterThanOrEqualTo(String value) {
            addCriterion("buildingLocation >=", value, "buildinglocation");
            return (Criteria) this;
        }

        public Criteria andBuildinglocationLessThan(String value) {
            addCriterion("buildingLocation <", value, "buildinglocation");
            return (Criteria) this;
        }

        public Criteria andBuildinglocationLessThanOrEqualTo(String value) {
            addCriterion("buildingLocation <=", value, "buildinglocation");
            return (Criteria) this;
        }

        public Criteria andBuildinglocationLike(String value) {
            addCriterion("buildingLocation like", value, "buildinglocation");
            return (Criteria) this;
        }

        public Criteria andBuildinglocationNotLike(String value) {
            addCriterion("buildingLocation not like", value, "buildinglocation");
            return (Criteria) this;
        }

        public Criteria andBuildinglocationIn(List<String> values) {
            addCriterion("buildingLocation in", values, "buildinglocation");
            return (Criteria) this;
        }

        public Criteria andBuildinglocationNotIn(List<String> values) {
            addCriterion("buildingLocation not in", values, "buildinglocation");
            return (Criteria) this;
        }

        public Criteria andBuildinglocationBetween(String value1, String value2) {
            addCriterion("buildingLocation between", value1, value2, "buildinglocation");
            return (Criteria) this;
        }

        public Criteria andBuildinglocationNotBetween(String value1, String value2) {
            addCriterion("buildingLocation not between", value1, value2, "buildinglocation");
            return (Criteria) this;
        }

        public Criteria andBuildingnameIsNull() {
            addCriterion("buildingName is null");
            return (Criteria) this;
        }

        public Criteria andBuildingnameIsNotNull() {
            addCriterion("buildingName is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingnameEqualTo(String value) {
            addCriterion("buildingName =", value, "buildingname");
            return (Criteria) this;
        }

        public Criteria andBuildingnameNotEqualTo(String value) {
            addCriterion("buildingName <>", value, "buildingname");
            return (Criteria) this;
        }

        public Criteria andBuildingnameGreaterThan(String value) {
            addCriterion("buildingName >", value, "buildingname");
            return (Criteria) this;
        }

        public Criteria andBuildingnameGreaterThanOrEqualTo(String value) {
            addCriterion("buildingName >=", value, "buildingname");
            return (Criteria) this;
        }

        public Criteria andBuildingnameLessThan(String value) {
            addCriterion("buildingName <", value, "buildingname");
            return (Criteria) this;
        }

        public Criteria andBuildingnameLessThanOrEqualTo(String value) {
            addCriterion("buildingName <=", value, "buildingname");
            return (Criteria) this;
        }

        public Criteria andBuildingnameLike(String value) {
            addCriterion("buildingName like", value, "buildingname");
            return (Criteria) this;
        }

        public Criteria andBuildingnameNotLike(String value) {
            addCriterion("buildingName not like", value, "buildingname");
            return (Criteria) this;
        }

        public Criteria andBuildingnameIn(List<String> values) {
            addCriterion("buildingName in", values, "buildingname");
            return (Criteria) this;
        }

        public Criteria andBuildingnameNotIn(List<String> values) {
            addCriterion("buildingName not in", values, "buildingname");
            return (Criteria) this;
        }

        public Criteria andBuildingnameBetween(String value1, String value2) {
            addCriterion("buildingName between", value1, value2, "buildingname");
            return (Criteria) this;
        }

        public Criteria andBuildingnameNotBetween(String value1, String value2) {
            addCriterion("buildingName not between", value1, value2, "buildingname");
            return (Criteria) this;
        }

        public Criteria andLongtitudeIsNull() {
            addCriterion("longtitude is null");
            return (Criteria) this;
        }

        public Criteria andLongtitudeIsNotNull() {
            addCriterion("longtitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongtitudeEqualTo(Double value) {
            addCriterion("longtitude =", value, "longtitude");
            return (Criteria) this;
        }

        public Criteria andLongtitudeNotEqualTo(Double value) {
            addCriterion("longtitude <>", value, "longtitude");
            return (Criteria) this;
        }

        public Criteria andLongtitudeGreaterThan(Double value) {
            addCriterion("longtitude >", value, "longtitude");
            return (Criteria) this;
        }

        public Criteria andLongtitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("longtitude >=", value, "longtitude");
            return (Criteria) this;
        }

        public Criteria andLongtitudeLessThan(Double value) {
            addCriterion("longtitude <", value, "longtitude");
            return (Criteria) this;
        }

        public Criteria andLongtitudeLessThanOrEqualTo(Double value) {
            addCriterion("longtitude <=", value, "longtitude");
            return (Criteria) this;
        }

        public Criteria andLongtitudeIn(List<Double> values) {
            addCriterion("longtitude in", values, "longtitude");
            return (Criteria) this;
        }

        public Criteria andLongtitudeNotIn(List<Double> values) {
            addCriterion("longtitude not in", values, "longtitude");
            return (Criteria) this;
        }

        public Criteria andLongtitudeBetween(Double value1, Double value2) {
            addCriterion("longtitude between", value1, value2, "longtitude");
            return (Criteria) this;
        }

        public Criteria andLongtitudeNotBetween(Double value1, Double value2) {
            addCriterion("longtitude not between", value1, value2, "longtitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(Double value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(Double value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(Double value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(Double value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<Double> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<Double> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(Double value1, Double value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Integer value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Integer value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Integer value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Integer value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Integer value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Integer> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Integer> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Integer value1, Integer value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
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