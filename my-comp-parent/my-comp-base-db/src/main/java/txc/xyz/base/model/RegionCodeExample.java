package txc.xyz.base.model;

import java.util.ArrayList;
import java.util.List;

public class RegionCodeExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public RegionCodeExample() {
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

	/**
	 * region_code null
	 */
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

		public Criteria andRegionIdIsNull() {
			addCriterion("region_id is null");
			return (Criteria) this;
		}

		public Criteria andRegionIdIsNotNull() {
			addCriterion("region_id is not null");
			return (Criteria) this;
		}

		public Criteria andRegionIdEqualTo(Long value) {
			addCriterion("region_id =", value, "regionId");
			return (Criteria) this;
		}

		public Criteria andRegionIdNotEqualTo(Long value) {
			addCriterion("region_id <>", value, "regionId");
			return (Criteria) this;
		}

		public Criteria andRegionIdGreaterThan(Long value) {
			addCriterion("region_id >", value, "regionId");
			return (Criteria) this;
		}

		public Criteria andRegionIdGreaterThanOrEqualTo(Long value) {
			addCriterion("region_id >=", value, "regionId");
			return (Criteria) this;
		}

		public Criteria andRegionIdLessThan(Long value) {
			addCriterion("region_id <", value, "regionId");
			return (Criteria) this;
		}

		public Criteria andRegionIdLessThanOrEqualTo(Long value) {
			addCriterion("region_id <=", value, "regionId");
			return (Criteria) this;
		}

		public Criteria andRegionIdIn(List<Long> values) {
			addCriterion("region_id in", values, "regionId");
			return (Criteria) this;
		}

		public Criteria andRegionIdNotIn(List<Long> values) {
			addCriterion("region_id not in", values, "regionId");
			return (Criteria) this;
		}

		public Criteria andRegionIdBetween(Long value1, Long value2) {
			addCriterion("region_id between", value1, value2, "regionId");
			return (Criteria) this;
		}

		public Criteria andRegionIdNotBetween(Long value1, Long value2) {
			addCriterion("region_id not between", value1, value2, "regionId");
			return (Criteria) this;
		}

		public Criteria andRegionCodeIsNull() {
			addCriterion("region_code is null");
			return (Criteria) this;
		}

		public Criteria andRegionCodeIsNotNull() {
			addCriterion("region_code is not null");
			return (Criteria) this;
		}

		public Criteria andRegionCodeEqualTo(String value) {
			addCriterion("region_code =", value, "regionCode");
			return (Criteria) this;
		}

		public Criteria andRegionCodeNotEqualTo(String value) {
			addCriterion("region_code <>", value, "regionCode");
			return (Criteria) this;
		}

		public Criteria andRegionCodeGreaterThan(String value) {
			addCriterion("region_code >", value, "regionCode");
			return (Criteria) this;
		}

		public Criteria andRegionCodeGreaterThanOrEqualTo(String value) {
			addCriterion("region_code >=", value, "regionCode");
			return (Criteria) this;
		}

		public Criteria andRegionCodeLessThan(String value) {
			addCriterion("region_code <", value, "regionCode");
			return (Criteria) this;
		}

		public Criteria andRegionCodeLessThanOrEqualTo(String value) {
			addCriterion("region_code <=", value, "regionCode");
			return (Criteria) this;
		}

		public Criteria andRegionCodeLike(String value) {
			addCriterion("region_code like", value, "regionCode");
			return (Criteria) this;
		}

		public Criteria andRegionCodeNotLike(String value) {
			addCriterion("region_code not like", value, "regionCode");
			return (Criteria) this;
		}

		public Criteria andRegionCodeIn(List<String> values) {
			addCriterion("region_code in", values, "regionCode");
			return (Criteria) this;
		}

		public Criteria andRegionCodeNotIn(List<String> values) {
			addCriterion("region_code not in", values, "regionCode");
			return (Criteria) this;
		}

		public Criteria andRegionCodeBetween(String value1, String value2) {
			addCriterion("region_code between", value1, value2, "regionCode");
			return (Criteria) this;
		}

		public Criteria andRegionCodeNotBetween(String value1, String value2) {
			addCriterion("region_code not between", value1, value2, "regionCode");
			return (Criteria) this;
		}

		public Criteria andRegionNameIsNull() {
			addCriterion("region_name is null");
			return (Criteria) this;
		}

		public Criteria andRegionNameIsNotNull() {
			addCriterion("region_name is not null");
			return (Criteria) this;
		}

		public Criteria andRegionNameEqualTo(String value) {
			addCriterion("region_name =", value, "regionName");
			return (Criteria) this;
		}

		public Criteria andRegionNameNotEqualTo(String value) {
			addCriterion("region_name <>", value, "regionName");
			return (Criteria) this;
		}

		public Criteria andRegionNameGreaterThan(String value) {
			addCriterion("region_name >", value, "regionName");
			return (Criteria) this;
		}

		public Criteria andRegionNameGreaterThanOrEqualTo(String value) {
			addCriterion("region_name >=", value, "regionName");
			return (Criteria) this;
		}

		public Criteria andRegionNameLessThan(String value) {
			addCriterion("region_name <", value, "regionName");
			return (Criteria) this;
		}

		public Criteria andRegionNameLessThanOrEqualTo(String value) {
			addCriterion("region_name <=", value, "regionName");
			return (Criteria) this;
		}

		public Criteria andRegionNameLike(String value) {
			addCriterion("region_name like", value, "regionName");
			return (Criteria) this;
		}

		public Criteria andRegionNameNotLike(String value) {
			addCriterion("region_name not like", value, "regionName");
			return (Criteria) this;
		}

		public Criteria andRegionNameIn(List<String> values) {
			addCriterion("region_name in", values, "regionName");
			return (Criteria) this;
		}

		public Criteria andRegionNameNotIn(List<String> values) {
			addCriterion("region_name not in", values, "regionName");
			return (Criteria) this;
		}

		public Criteria andRegionNameBetween(String value1, String value2) {
			addCriterion("region_name between", value1, value2, "regionName");
			return (Criteria) this;
		}

		public Criteria andRegionNameNotBetween(String value1, String value2) {
			addCriterion("region_name not between", value1, value2, "regionName");
			return (Criteria) this;
		}

		public Criteria andParentIdIsNull() {
			addCriterion("parent_id is null");
			return (Criteria) this;
		}

		public Criteria andParentIdIsNotNull() {
			addCriterion("parent_id is not null");
			return (Criteria) this;
		}

		public Criteria andParentIdEqualTo(Long value) {
			addCriterion("parent_id =", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdNotEqualTo(Long value) {
			addCriterion("parent_id <>", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdGreaterThan(Long value) {
			addCriterion("parent_id >", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdGreaterThanOrEqualTo(Long value) {
			addCriterion("parent_id >=", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdLessThan(Long value) {
			addCriterion("parent_id <", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdLessThanOrEqualTo(Long value) {
			addCriterion("parent_id <=", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdIn(List<Long> values) {
			addCriterion("parent_id in", values, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdNotIn(List<Long> values) {
			addCriterion("parent_id not in", values, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdBetween(Long value1, Long value2) {
			addCriterion("parent_id between", value1, value2, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdNotBetween(Long value1, Long value2) {
			addCriterion("parent_id not between", value1, value2, "parentId");
			return (Criteria) this;
		}

		public Criteria andRegionLevelIsNull() {
			addCriterion("region_level is null");
			return (Criteria) this;
		}

		public Criteria andRegionLevelIsNotNull() {
			addCriterion("region_level is not null");
			return (Criteria) this;
		}

		public Criteria andRegionLevelEqualTo(Integer value) {
			addCriterion("region_level =", value, "regionLevel");
			return (Criteria) this;
		}

		public Criteria andRegionLevelNotEqualTo(Integer value) {
			addCriterion("region_level <>", value, "regionLevel");
			return (Criteria) this;
		}

		public Criteria andRegionLevelGreaterThan(Integer value) {
			addCriterion("region_level >", value, "regionLevel");
			return (Criteria) this;
		}

		public Criteria andRegionLevelGreaterThanOrEqualTo(Integer value) {
			addCriterion("region_level >=", value, "regionLevel");
			return (Criteria) this;
		}

		public Criteria andRegionLevelLessThan(Integer value) {
			addCriterion("region_level <", value, "regionLevel");
			return (Criteria) this;
		}

		public Criteria andRegionLevelLessThanOrEqualTo(Integer value) {
			addCriterion("region_level <=", value, "regionLevel");
			return (Criteria) this;
		}

		public Criteria andRegionLevelIn(List<Integer> values) {
			addCriterion("region_level in", values, "regionLevel");
			return (Criteria) this;
		}

		public Criteria andRegionLevelNotIn(List<Integer> values) {
			addCriterion("region_level not in", values, "regionLevel");
			return (Criteria) this;
		}

		public Criteria andRegionLevelBetween(Integer value1, Integer value2) {
			addCriterion("region_level between", value1, value2, "regionLevel");
			return (Criteria) this;
		}

		public Criteria andRegionLevelNotBetween(Integer value1, Integer value2) {
			addCriterion("region_level not between", value1, value2, "regionLevel");
			return (Criteria) this;
		}

		public Criteria andRegionOrderIsNull() {
			addCriterion("region_order is null");
			return (Criteria) this;
		}

		public Criteria andRegionOrderIsNotNull() {
			addCriterion("region_order is not null");
			return (Criteria) this;
		}

		public Criteria andRegionOrderEqualTo(Integer value) {
			addCriterion("region_order =", value, "regionOrder");
			return (Criteria) this;
		}

		public Criteria andRegionOrderNotEqualTo(Integer value) {
			addCriterion("region_order <>", value, "regionOrder");
			return (Criteria) this;
		}

		public Criteria andRegionOrderGreaterThan(Integer value) {
			addCriterion("region_order >", value, "regionOrder");
			return (Criteria) this;
		}

		public Criteria andRegionOrderGreaterThanOrEqualTo(Integer value) {
			addCriterion("region_order >=", value, "regionOrder");
			return (Criteria) this;
		}

		public Criteria andRegionOrderLessThan(Integer value) {
			addCriterion("region_order <", value, "regionOrder");
			return (Criteria) this;
		}

		public Criteria andRegionOrderLessThanOrEqualTo(Integer value) {
			addCriterion("region_order <=", value, "regionOrder");
			return (Criteria) this;
		}

		public Criteria andRegionOrderIn(List<Integer> values) {
			addCriterion("region_order in", values, "regionOrder");
			return (Criteria) this;
		}

		public Criteria andRegionOrderNotIn(List<Integer> values) {
			addCriterion("region_order not in", values, "regionOrder");
			return (Criteria) this;
		}

		public Criteria andRegionOrderBetween(Integer value1, Integer value2) {
			addCriterion("region_order between", value1, value2, "regionOrder");
			return (Criteria) this;
		}

		public Criteria andRegionOrderNotBetween(Integer value1, Integer value2) {
			addCriterion("region_order not between", value1, value2, "regionOrder");
			return (Criteria) this;
		}

		public Criteria andRegionNameEnIsNull() {
			addCriterion("region_name_en is null");
			return (Criteria) this;
		}

		public Criteria andRegionNameEnIsNotNull() {
			addCriterion("region_name_en is not null");
			return (Criteria) this;
		}

		public Criteria andRegionNameEnEqualTo(String value) {
			addCriterion("region_name_en =", value, "regionNameEn");
			return (Criteria) this;
		}

		public Criteria andRegionNameEnNotEqualTo(String value) {
			addCriterion("region_name_en <>", value, "regionNameEn");
			return (Criteria) this;
		}

		public Criteria andRegionNameEnGreaterThan(String value) {
			addCriterion("region_name_en >", value, "regionNameEn");
			return (Criteria) this;
		}

		public Criteria andRegionNameEnGreaterThanOrEqualTo(String value) {
			addCriterion("region_name_en >=", value, "regionNameEn");
			return (Criteria) this;
		}

		public Criteria andRegionNameEnLessThan(String value) {
			addCriterion("region_name_en <", value, "regionNameEn");
			return (Criteria) this;
		}

		public Criteria andRegionNameEnLessThanOrEqualTo(String value) {
			addCriterion("region_name_en <=", value, "regionNameEn");
			return (Criteria) this;
		}

		public Criteria andRegionNameEnLike(String value) {
			addCriterion("region_name_en like", value, "regionNameEn");
			return (Criteria) this;
		}

		public Criteria andRegionNameEnNotLike(String value) {
			addCriterion("region_name_en not like", value, "regionNameEn");
			return (Criteria) this;
		}

		public Criteria andRegionNameEnIn(List<String> values) {
			addCriterion("region_name_en in", values, "regionNameEn");
			return (Criteria) this;
		}

		public Criteria andRegionNameEnNotIn(List<String> values) {
			addCriterion("region_name_en not in", values, "regionNameEn");
			return (Criteria) this;
		}

		public Criteria andRegionNameEnBetween(String value1, String value2) {
			addCriterion("region_name_en between", value1, value2, "regionNameEn");
			return (Criteria) this;
		}

		public Criteria andRegionNameEnNotBetween(String value1, String value2) {
			addCriterion("region_name_en not between", value1, value2, "regionNameEn");
			return (Criteria) this;
		}
	}

	/**
	 * region_code
	 *
	 * @mbg.generated do_not_delete_during_merge
	 */
	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	/**
	 * region_code null
	 */
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