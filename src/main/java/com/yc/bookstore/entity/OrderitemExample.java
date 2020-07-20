package com.yc.bookstore.entity;

import java.util.ArrayList;
import java.util.List;

public class OrderitemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderitemExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBookSourceidIsNull() {
            addCriterion("book_sourceid is null");
            return (Criteria) this;
        }

        public Criteria andBookSourceidIsNotNull() {
            addCriterion("book_sourceid is not null");
            return (Criteria) this;
        }

        public Criteria andBookSourceidEqualTo(Integer value) {
            addCriterion("book_sourceid =", value, "bookSourceid");
            return (Criteria) this;
        }

        public Criteria andBookSourceidNotEqualTo(Integer value) {
            addCriterion("book_sourceid <>", value, "bookSourceid");
            return (Criteria) this;
        }

        public Criteria andBookSourceidGreaterThan(Integer value) {
            addCriterion("book_sourceid >", value, "bookSourceid");
            return (Criteria) this;
        }

        public Criteria andBookSourceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_sourceid >=", value, "bookSourceid");
            return (Criteria) this;
        }

        public Criteria andBookSourceidLessThan(Integer value) {
            addCriterion("book_sourceid <", value, "bookSourceid");
            return (Criteria) this;
        }

        public Criteria andBookSourceidLessThanOrEqualTo(Integer value) {
            addCriterion("book_sourceid <=", value, "bookSourceid");
            return (Criteria) this;
        }

        public Criteria andBookSourceidIn(List<Integer> values) {
            addCriterion("book_sourceid in", values, "bookSourceid");
            return (Criteria) this;
        }

        public Criteria andBookSourceidNotIn(List<Integer> values) {
            addCriterion("book_sourceid not in", values, "bookSourceid");
            return (Criteria) this;
        }

        public Criteria andBookSourceidBetween(Integer value1, Integer value2) {
            addCriterion("book_sourceid between", value1, value2, "bookSourceid");
            return (Criteria) this;
        }

        public Criteria andBookSourceidNotBetween(Integer value1, Integer value2) {
            addCriterion("book_sourceid not between", value1, value2, "bookSourceid");
            return (Criteria) this;
        }

        public Criteria andOrderSourceidIsNull() {
            addCriterion("order_sourceid is null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceidIsNotNull() {
            addCriterion("order_sourceid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceidEqualTo(Integer value) {
            addCriterion("order_sourceid =", value, "orderSourceid");
            return (Criteria) this;
        }

        public Criteria andOrderSourceidNotEqualTo(Integer value) {
            addCriterion("order_sourceid <>", value, "orderSourceid");
            return (Criteria) this;
        }

        public Criteria andOrderSourceidGreaterThan(Integer value) {
            addCriterion("order_sourceid >", value, "orderSourceid");
            return (Criteria) this;
        }

        public Criteria andOrderSourceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_sourceid >=", value, "orderSourceid");
            return (Criteria) this;
        }

        public Criteria andOrderSourceidLessThan(Integer value) {
            addCriterion("order_sourceid <", value, "orderSourceid");
            return (Criteria) this;
        }

        public Criteria andOrderSourceidLessThanOrEqualTo(Integer value) {
            addCriterion("order_sourceid <=", value, "orderSourceid");
            return (Criteria) this;
        }

        public Criteria andOrderSourceidIn(List<Integer> values) {
            addCriterion("order_sourceid in", values, "orderSourceid");
            return (Criteria) this;
        }

        public Criteria andOrderSourceidNotIn(List<Integer> values) {
            addCriterion("order_sourceid not in", values, "orderSourceid");
            return (Criteria) this;
        }

        public Criteria andOrderSourceidBetween(Integer value1, Integer value2) {
            addCriterion("order_sourceid between", value1, value2, "orderSourceid");
            return (Criteria) this;
        }

        public Criteria andOrderSourceidNotBetween(Integer value1, Integer value2) {
            addCriterion("order_sourceid not between", value1, value2, "orderSourceid");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("amount not between", value1, value2, "amount");
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