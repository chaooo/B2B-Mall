package com.example.mall.entity;

import java.util.ArrayList;
import java.util.List;

public class PmsBrandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsBrandExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andFirst_letterIsNull() {
            addCriterion("first_letter is null");
            return (Criteria) this;
        }

        public Criteria andFirst_letterIsNotNull() {
            addCriterion("first_letter is not null");
            return (Criteria) this;
        }

        public Criteria andFirst_letterEqualTo(String value) {
            addCriterion("first_letter =", value, "first_letter");
            return (Criteria) this;
        }

        public Criteria andFirst_letterNotEqualTo(String value) {
            addCriterion("first_letter <>", value, "first_letter");
            return (Criteria) this;
        }

        public Criteria andFirst_letterGreaterThan(String value) {
            addCriterion("first_letter >", value, "first_letter");
            return (Criteria) this;
        }

        public Criteria andFirst_letterGreaterThanOrEqualTo(String value) {
            addCriterion("first_letter >=", value, "first_letter");
            return (Criteria) this;
        }

        public Criteria andFirst_letterLessThan(String value) {
            addCriterion("first_letter <", value, "first_letter");
            return (Criteria) this;
        }

        public Criteria andFirst_letterLessThanOrEqualTo(String value) {
            addCriterion("first_letter <=", value, "first_letter");
            return (Criteria) this;
        }

        public Criteria andFirst_letterLike(String value) {
            addCriterion("first_letter like", value, "first_letter");
            return (Criteria) this;
        }

        public Criteria andFirst_letterNotLike(String value) {
            addCriterion("first_letter not like", value, "first_letter");
            return (Criteria) this;
        }

        public Criteria andFirst_letterIn(List<String> values) {
            addCriterion("first_letter in", values, "first_letter");
            return (Criteria) this;
        }

        public Criteria andFirst_letterNotIn(List<String> values) {
            addCriterion("first_letter not in", values, "first_letter");
            return (Criteria) this;
        }

        public Criteria andFirst_letterBetween(String value1, String value2) {
            addCriterion("first_letter between", value1, value2, "first_letter");
            return (Criteria) this;
        }

        public Criteria andFirst_letterNotBetween(String value1, String value2) {
            addCriterion("first_letter not between", value1, value2, "first_letter");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andFactory_statusIsNull() {
            addCriterion("factory_status is null");
            return (Criteria) this;
        }

        public Criteria andFactory_statusIsNotNull() {
            addCriterion("factory_status is not null");
            return (Criteria) this;
        }

        public Criteria andFactory_statusEqualTo(Integer value) {
            addCriterion("factory_status =", value, "factory_status");
            return (Criteria) this;
        }

        public Criteria andFactory_statusNotEqualTo(Integer value) {
            addCriterion("factory_status <>", value, "factory_status");
            return (Criteria) this;
        }

        public Criteria andFactory_statusGreaterThan(Integer value) {
            addCriterion("factory_status >", value, "factory_status");
            return (Criteria) this;
        }

        public Criteria andFactory_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("factory_status >=", value, "factory_status");
            return (Criteria) this;
        }

        public Criteria andFactory_statusLessThan(Integer value) {
            addCriterion("factory_status <", value, "factory_status");
            return (Criteria) this;
        }

        public Criteria andFactory_statusLessThanOrEqualTo(Integer value) {
            addCriterion("factory_status <=", value, "factory_status");
            return (Criteria) this;
        }

        public Criteria andFactory_statusIn(List<Integer> values) {
            addCriterion("factory_status in", values, "factory_status");
            return (Criteria) this;
        }

        public Criteria andFactory_statusNotIn(List<Integer> values) {
            addCriterion("factory_status not in", values, "factory_status");
            return (Criteria) this;
        }

        public Criteria andFactory_statusBetween(Integer value1, Integer value2) {
            addCriterion("factory_status between", value1, value2, "factory_status");
            return (Criteria) this;
        }

        public Criteria andFactory_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("factory_status not between", value1, value2, "factory_status");
            return (Criteria) this;
        }

        public Criteria andShow_statusIsNull() {
            addCriterion("show_status is null");
            return (Criteria) this;
        }

        public Criteria andShow_statusIsNotNull() {
            addCriterion("show_status is not null");
            return (Criteria) this;
        }

        public Criteria andShow_statusEqualTo(Integer value) {
            addCriterion("show_status =", value, "show_status");
            return (Criteria) this;
        }

        public Criteria andShow_statusNotEqualTo(Integer value) {
            addCriterion("show_status <>", value, "show_status");
            return (Criteria) this;
        }

        public Criteria andShow_statusGreaterThan(Integer value) {
            addCriterion("show_status >", value, "show_status");
            return (Criteria) this;
        }

        public Criteria andShow_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_status >=", value, "show_status");
            return (Criteria) this;
        }

        public Criteria andShow_statusLessThan(Integer value) {
            addCriterion("show_status <", value, "show_status");
            return (Criteria) this;
        }

        public Criteria andShow_statusLessThanOrEqualTo(Integer value) {
            addCriterion("show_status <=", value, "show_status");
            return (Criteria) this;
        }

        public Criteria andShow_statusIn(List<Integer> values) {
            addCriterion("show_status in", values, "show_status");
            return (Criteria) this;
        }

        public Criteria andShow_statusNotIn(List<Integer> values) {
            addCriterion("show_status not in", values, "show_status");
            return (Criteria) this;
        }

        public Criteria andShow_statusBetween(Integer value1, Integer value2) {
            addCriterion("show_status between", value1, value2, "show_status");
            return (Criteria) this;
        }

        public Criteria andShow_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("show_status not between", value1, value2, "show_status");
            return (Criteria) this;
        }

        public Criteria andProduct_countIsNull() {
            addCriterion("product_count is null");
            return (Criteria) this;
        }

        public Criteria andProduct_countIsNotNull() {
            addCriterion("product_count is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_countEqualTo(Integer value) {
            addCriterion("product_count =", value, "product_count");
            return (Criteria) this;
        }

        public Criteria andProduct_countNotEqualTo(Integer value) {
            addCriterion("product_count <>", value, "product_count");
            return (Criteria) this;
        }

        public Criteria andProduct_countGreaterThan(Integer value) {
            addCriterion("product_count >", value, "product_count");
            return (Criteria) this;
        }

        public Criteria andProduct_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_count >=", value, "product_count");
            return (Criteria) this;
        }

        public Criteria andProduct_countLessThan(Integer value) {
            addCriterion("product_count <", value, "product_count");
            return (Criteria) this;
        }

        public Criteria andProduct_countLessThanOrEqualTo(Integer value) {
            addCriterion("product_count <=", value, "product_count");
            return (Criteria) this;
        }

        public Criteria andProduct_countIn(List<Integer> values) {
            addCriterion("product_count in", values, "product_count");
            return (Criteria) this;
        }

        public Criteria andProduct_countNotIn(List<Integer> values) {
            addCriterion("product_count not in", values, "product_count");
            return (Criteria) this;
        }

        public Criteria andProduct_countBetween(Integer value1, Integer value2) {
            addCriterion("product_count between", value1, value2, "product_count");
            return (Criteria) this;
        }

        public Criteria andProduct_countNotBetween(Integer value1, Integer value2) {
            addCriterion("product_count not between", value1, value2, "product_count");
            return (Criteria) this;
        }

        public Criteria andProduct_comment_countIsNull() {
            addCriterion("product_comment_count is null");
            return (Criteria) this;
        }

        public Criteria andProduct_comment_countIsNotNull() {
            addCriterion("product_comment_count is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_comment_countEqualTo(Integer value) {
            addCriterion("product_comment_count =", value, "product_comment_count");
            return (Criteria) this;
        }

        public Criteria andProduct_comment_countNotEqualTo(Integer value) {
            addCriterion("product_comment_count <>", value, "product_comment_count");
            return (Criteria) this;
        }

        public Criteria andProduct_comment_countGreaterThan(Integer value) {
            addCriterion("product_comment_count >", value, "product_comment_count");
            return (Criteria) this;
        }

        public Criteria andProduct_comment_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_comment_count >=", value, "product_comment_count");
            return (Criteria) this;
        }

        public Criteria andProduct_comment_countLessThan(Integer value) {
            addCriterion("product_comment_count <", value, "product_comment_count");
            return (Criteria) this;
        }

        public Criteria andProduct_comment_countLessThanOrEqualTo(Integer value) {
            addCriterion("product_comment_count <=", value, "product_comment_count");
            return (Criteria) this;
        }

        public Criteria andProduct_comment_countIn(List<Integer> values) {
            addCriterion("product_comment_count in", values, "product_comment_count");
            return (Criteria) this;
        }

        public Criteria andProduct_comment_countNotIn(List<Integer> values) {
            addCriterion("product_comment_count not in", values, "product_comment_count");
            return (Criteria) this;
        }

        public Criteria andProduct_comment_countBetween(Integer value1, Integer value2) {
            addCriterion("product_comment_count between", value1, value2, "product_comment_count");
            return (Criteria) this;
        }

        public Criteria andProduct_comment_countNotBetween(Integer value1, Integer value2) {
            addCriterion("product_comment_count not between", value1, value2, "product_comment_count");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andBig_picIsNull() {
            addCriterion("big_pic is null");
            return (Criteria) this;
        }

        public Criteria andBig_picIsNotNull() {
            addCriterion("big_pic is not null");
            return (Criteria) this;
        }

        public Criteria andBig_picEqualTo(String value) {
            addCriterion("big_pic =", value, "big_pic");
            return (Criteria) this;
        }

        public Criteria andBig_picNotEqualTo(String value) {
            addCriterion("big_pic <>", value, "big_pic");
            return (Criteria) this;
        }

        public Criteria andBig_picGreaterThan(String value) {
            addCriterion("big_pic >", value, "big_pic");
            return (Criteria) this;
        }

        public Criteria andBig_picGreaterThanOrEqualTo(String value) {
            addCriterion("big_pic >=", value, "big_pic");
            return (Criteria) this;
        }

        public Criteria andBig_picLessThan(String value) {
            addCriterion("big_pic <", value, "big_pic");
            return (Criteria) this;
        }

        public Criteria andBig_picLessThanOrEqualTo(String value) {
            addCriterion("big_pic <=", value, "big_pic");
            return (Criteria) this;
        }

        public Criteria andBig_picLike(String value) {
            addCriterion("big_pic like", value, "big_pic");
            return (Criteria) this;
        }

        public Criteria andBig_picNotLike(String value) {
            addCriterion("big_pic not like", value, "big_pic");
            return (Criteria) this;
        }

        public Criteria andBig_picIn(List<String> values) {
            addCriterion("big_pic in", values, "big_pic");
            return (Criteria) this;
        }

        public Criteria andBig_picNotIn(List<String> values) {
            addCriterion("big_pic not in", values, "big_pic");
            return (Criteria) this;
        }

        public Criteria andBig_picBetween(String value1, String value2) {
            addCriterion("big_pic between", value1, value2, "big_pic");
            return (Criteria) this;
        }

        public Criteria andBig_picNotBetween(String value1, String value2) {
            addCriterion("big_pic not between", value1, value2, "big_pic");
            return (Criteria) this;
        }

        public Criteria andBrand_storyIsNull() {
            addCriterion("brand_story is null");
            return (Criteria) this;
        }

        public Criteria andBrand_storyIsNotNull() {
            addCriterion("brand_story is not null");
            return (Criteria) this;
        }

        public Criteria andBrand_storyEqualTo(String value) {
            addCriterion("brand_story =", value, "brand_story");
            return (Criteria) this;
        }

        public Criteria andBrand_storyNotEqualTo(String value) {
            addCriterion("brand_story <>", value, "brand_story");
            return (Criteria) this;
        }

        public Criteria andBrand_storyGreaterThan(String value) {
            addCriterion("brand_story >", value, "brand_story");
            return (Criteria) this;
        }

        public Criteria andBrand_storyGreaterThanOrEqualTo(String value) {
            addCriterion("brand_story >=", value, "brand_story");
            return (Criteria) this;
        }

        public Criteria andBrand_storyLessThan(String value) {
            addCriterion("brand_story <", value, "brand_story");
            return (Criteria) this;
        }

        public Criteria andBrand_storyLessThanOrEqualTo(String value) {
            addCriterion("brand_story <=", value, "brand_story");
            return (Criteria) this;
        }

        public Criteria andBrand_storyLike(String value) {
            addCriterion("brand_story like", value, "brand_story");
            return (Criteria) this;
        }

        public Criteria andBrand_storyNotLike(String value) {
            addCriterion("brand_story not like", value, "brand_story");
            return (Criteria) this;
        }

        public Criteria andBrand_storyIn(List<String> values) {
            addCriterion("brand_story in", values, "brand_story");
            return (Criteria) this;
        }

        public Criteria andBrand_storyNotIn(List<String> values) {
            addCriterion("brand_story not in", values, "brand_story");
            return (Criteria) this;
        }

        public Criteria andBrand_storyBetween(String value1, String value2) {
            addCriterion("brand_story between", value1, value2, "brand_story");
            return (Criteria) this;
        }

        public Criteria andBrand_storyNotBetween(String value1, String value2) {
            addCriterion("brand_story not between", value1, value2, "brand_story");
            return (Criteria) this;
        }
    }

    /**
     */
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