package txc.xxy.ssm.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HolidayConfigExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public HolidayConfigExample() {
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
	 * holiday_config null
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

		public Criteria andSidIsNull() {
			addCriterion("sid is null");
			return (Criteria) this;
		}

		public Criteria andSidIsNotNull() {
			addCriterion("sid is not null");
			return (Criteria) this;
		}

		public Criteria andSidEqualTo(String value) {
			addCriterion("sid =", value, "sid");
			return (Criteria) this;
		}

		public Criteria andSidNotEqualTo(String value) {
			addCriterion("sid <>", value, "sid");
			return (Criteria) this;
		}

		public Criteria andSidGreaterThan(String value) {
			addCriterion("sid >", value, "sid");
			return (Criteria) this;
		}

		public Criteria andSidGreaterThanOrEqualTo(String value) {
			addCriterion("sid >=", value, "sid");
			return (Criteria) this;
		}

		public Criteria andSidLessThan(String value) {
			addCriterion("sid <", value, "sid");
			return (Criteria) this;
		}

		public Criteria andSidLessThanOrEqualTo(String value) {
			addCriterion("sid <=", value, "sid");
			return (Criteria) this;
		}

		public Criteria andSidLike(String value) {
			addCriterion("sid like", value, "sid");
			return (Criteria) this;
		}

		public Criteria andSidNotLike(String value) {
			addCriterion("sid not like", value, "sid");
			return (Criteria) this;
		}

		public Criteria andSidIn(List<String> values) {
			addCriterion("sid in", values, "sid");
			return (Criteria) this;
		}

		public Criteria andSidNotIn(List<String> values) {
			addCriterion("sid not in", values, "sid");
			return (Criteria) this;
		}

		public Criteria andSidBetween(String value1, String value2) {
			addCriterion("sid between", value1, value2, "sid");
			return (Criteria) this;
		}

		public Criteria andSidNotBetween(String value1, String value2) {
			addCriterion("sid not between", value1, value2, "sid");
			return (Criteria) this;
		}

		public Criteria andStartDateIsNull() {
			addCriterion("start_date is null");
			return (Criteria) this;
		}

		public Criteria andStartDateIsNotNull() {
			addCriterion("start_date is not null");
			return (Criteria) this;
		}

		public Criteria andStartDateEqualTo(Date value) {
			addCriterionForJDBCDate("start_date =", value, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateNotEqualTo(Date value) {
			addCriterionForJDBCDate("start_date <>", value, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateGreaterThan(Date value) {
			addCriterionForJDBCDate("start_date >", value, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("start_date >=", value, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateLessThan(Date value) {
			addCriterionForJDBCDate("start_date <", value, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("start_date <=", value, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateIn(List<Date> values) {
			addCriterionForJDBCDate("start_date in", values, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateNotIn(List<Date> values) {
			addCriterionForJDBCDate("start_date not in", values, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("start_date between", value1, value2, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("start_date not between", value1, value2, "startDate");
			return (Criteria) this;
		}

		public Criteria andEndDateIsNull() {
			addCriterion("end_date is null");
			return (Criteria) this;
		}

		public Criteria andEndDateIsNotNull() {
			addCriterion("end_date is not null");
			return (Criteria) this;
		}

		public Criteria andEndDateEqualTo(Date value) {
			addCriterionForJDBCDate("end_date =", value, "endDate");
			return (Criteria) this;
		}

		public Criteria andEndDateNotEqualTo(Date value) {
			addCriterionForJDBCDate("end_date <>", value, "endDate");
			return (Criteria) this;
		}

		public Criteria andEndDateGreaterThan(Date value) {
			addCriterionForJDBCDate("end_date >", value, "endDate");
			return (Criteria) this;
		}

		public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("end_date >=", value, "endDate");
			return (Criteria) this;
		}

		public Criteria andEndDateLessThan(Date value) {
			addCriterionForJDBCDate("end_date <", value, "endDate");
			return (Criteria) this;
		}

		public Criteria andEndDateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("end_date <=", value, "endDate");
			return (Criteria) this;
		}

		public Criteria andEndDateIn(List<Date> values) {
			addCriterionForJDBCDate("end_date in", values, "endDate");
			return (Criteria) this;
		}

		public Criteria andEndDateNotIn(List<Date> values) {
			addCriterionForJDBCDate("end_date not in", values, "endDate");
			return (Criteria) this;
		}

		public Criteria andEndDateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("end_date between", value1, value2, "endDate");
			return (Criteria) this;
		}

		public Criteria andEndDateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("end_date not between", value1, value2, "endDate");
			return (Criteria) this;
		}

		public Criteria andEffectiveCycleIsNull() {
			addCriterion("effective_cycle is null");
			return (Criteria) this;
		}

		public Criteria andEffectiveCycleIsNotNull() {
			addCriterion("effective_cycle is not null");
			return (Criteria) this;
		}

		public Criteria andEffectiveCycleEqualTo(String value) {
			addCriterion("effective_cycle =", value, "effectiveCycle");
			return (Criteria) this;
		}

		public Criteria andEffectiveCycleNotEqualTo(String value) {
			addCriterion("effective_cycle <>", value, "effectiveCycle");
			return (Criteria) this;
		}

		public Criteria andEffectiveCycleGreaterThan(String value) {
			addCriterion("effective_cycle >", value, "effectiveCycle");
			return (Criteria) this;
		}

		public Criteria andEffectiveCycleGreaterThanOrEqualTo(String value) {
			addCriterion("effective_cycle >=", value, "effectiveCycle");
			return (Criteria) this;
		}

		public Criteria andEffectiveCycleLessThan(String value) {
			addCriterion("effective_cycle <", value, "effectiveCycle");
			return (Criteria) this;
		}

		public Criteria andEffectiveCycleLessThanOrEqualTo(String value) {
			addCriterion("effective_cycle <=", value, "effectiveCycle");
			return (Criteria) this;
		}

		public Criteria andEffectiveCycleLike(String value) {
			addCriterion("effective_cycle like", value, "effectiveCycle");
			return (Criteria) this;
		}

		public Criteria andEffectiveCycleNotLike(String value) {
			addCriterion("effective_cycle not like", value, "effectiveCycle");
			return (Criteria) this;
		}

		public Criteria andEffectiveCycleIn(List<String> values) {
			addCriterion("effective_cycle in", values, "effectiveCycle");
			return (Criteria) this;
		}

		public Criteria andEffectiveCycleNotIn(List<String> values) {
			addCriterion("effective_cycle not in", values, "effectiveCycle");
			return (Criteria) this;
		}

		public Criteria andEffectiveCycleBetween(String value1, String value2) {
			addCriterion("effective_cycle between", value1, value2, "effectiveCycle");
			return (Criteria) this;
		}

		public Criteria andEffectiveCycleNotBetween(String value1, String value2) {
			addCriterion("effective_cycle not between", value1, value2, "effectiveCycle");
			return (Criteria) this;
		}

		public Criteria andOwnerLevelIsNull() {
			addCriterion("owner_level is null");
			return (Criteria) this;
		}

		public Criteria andOwnerLevelIsNotNull() {
			addCriterion("owner_level is not null");
			return (Criteria) this;
		}

		public Criteria andOwnerLevelEqualTo(String value) {
			addCriterion("owner_level =", value, "ownerLevel");
			return (Criteria) this;
		}

		public Criteria andOwnerLevelNotEqualTo(String value) {
			addCriterion("owner_level <>", value, "ownerLevel");
			return (Criteria) this;
		}

		public Criteria andOwnerLevelGreaterThan(String value) {
			addCriterion("owner_level >", value, "ownerLevel");
			return (Criteria) this;
		}

		public Criteria andOwnerLevelGreaterThanOrEqualTo(String value) {
			addCriterion("owner_level >=", value, "ownerLevel");
			return (Criteria) this;
		}

		public Criteria andOwnerLevelLessThan(String value) {
			addCriterion("owner_level <", value, "ownerLevel");
			return (Criteria) this;
		}

		public Criteria andOwnerLevelLessThanOrEqualTo(String value) {
			addCriterion("owner_level <=", value, "ownerLevel");
			return (Criteria) this;
		}

		public Criteria andOwnerLevelLike(String value) {
			addCriterion("owner_level like", value, "ownerLevel");
			return (Criteria) this;
		}

		public Criteria andOwnerLevelNotLike(String value) {
			addCriterion("owner_level not like", value, "ownerLevel");
			return (Criteria) this;
		}

		public Criteria andOwnerLevelIn(List<String> values) {
			addCriterion("owner_level in", values, "ownerLevel");
			return (Criteria) this;
		}

		public Criteria andOwnerLevelNotIn(List<String> values) {
			addCriterion("owner_level not in", values, "ownerLevel");
			return (Criteria) this;
		}

		public Criteria andOwnerLevelBetween(String value1, String value2) {
			addCriterion("owner_level between", value1, value2, "ownerLevel");
			return (Criteria) this;
		}

		public Criteria andOwnerLevelNotBetween(String value1, String value2) {
			addCriterion("owner_level not between", value1, value2, "ownerLevel");
			return (Criteria) this;
		}

		public Criteria andValidFlagIsNull() {
			addCriterion("valid_flag is null");
			return (Criteria) this;
		}

		public Criteria andValidFlagIsNotNull() {
			addCriterion("valid_flag is not null");
			return (Criteria) this;
		}

		public Criteria andValidFlagEqualTo(String value) {
			addCriterion("valid_flag =", value, "validFlag");
			return (Criteria) this;
		}

		public Criteria andValidFlagNotEqualTo(String value) {
			addCriterion("valid_flag <>", value, "validFlag");
			return (Criteria) this;
		}

		public Criteria andValidFlagGreaterThan(String value) {
			addCriterion("valid_flag >", value, "validFlag");
			return (Criteria) this;
		}

		public Criteria andValidFlagGreaterThanOrEqualTo(String value) {
			addCriterion("valid_flag >=", value, "validFlag");
			return (Criteria) this;
		}

		public Criteria andValidFlagLessThan(String value) {
			addCriterion("valid_flag <", value, "validFlag");
			return (Criteria) this;
		}

		public Criteria andValidFlagLessThanOrEqualTo(String value) {
			addCriterion("valid_flag <=", value, "validFlag");
			return (Criteria) this;
		}

		public Criteria andValidFlagLike(String value) {
			addCriterion("valid_flag like", value, "validFlag");
			return (Criteria) this;
		}

		public Criteria andValidFlagNotLike(String value) {
			addCriterion("valid_flag not like", value, "validFlag");
			return (Criteria) this;
		}

		public Criteria andValidFlagIn(List<String> values) {
			addCriterion("valid_flag in", values, "validFlag");
			return (Criteria) this;
		}

		public Criteria andValidFlagNotIn(List<String> values) {
			addCriterion("valid_flag not in", values, "validFlag");
			return (Criteria) this;
		}

		public Criteria andValidFlagBetween(String value1, String value2) {
			addCriterion("valid_flag between", value1, value2, "validFlag");
			return (Criteria) this;
		}

		public Criteria andValidFlagNotBetween(String value1, String value2) {
			addCriterion("valid_flag not between", value1, value2, "validFlag");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNull() {
			addCriterion("create_time is null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNotNull() {
			addCriterion("create_time is not null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeEqualTo(Timestamp value) {
			addCriterion("create_time =", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotEqualTo(Timestamp value) {
			addCriterion("create_time <>", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThan(Timestamp value) {
			addCriterion("create_time >", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThanOrEqualTo(Timestamp value) {
			addCriterion("create_time >=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThan(Timestamp value) {
			addCriterion("create_time <", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThanOrEqualTo(Timestamp value) {
			addCriterion("create_time <=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIn(List<Timestamp> values) {
			addCriterion("create_time in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotIn(List<Timestamp> values) {
			addCriterion("create_time not in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBetween(Timestamp value1, Timestamp value2) {
			addCriterion("create_time between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotBetween(Timestamp value1, Timestamp value2) {
			addCriterion("create_time not between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIsNull() {
			addCriterion("update_time is null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIsNotNull() {
			addCriterion("update_time is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeEqualTo(Timestamp value) {
			addCriterion("update_time =", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotEqualTo(Timestamp value) {
			addCriterion("update_time <>", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThan(Timestamp value) {
			addCriterion("update_time >", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThanOrEqualTo(Timestamp value) {
			addCriterion("update_time >=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThan(Timestamp value) {
			addCriterion("update_time <", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThanOrEqualTo(Timestamp value) {
			addCriterion("update_time <=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIn(List<Timestamp> values) {
			addCriterion("update_time in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotIn(List<Timestamp> values) {
			addCriterion("update_time not in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeBetween(Timestamp value1, Timestamp value2) {
			addCriterion("update_time between", value1, value2, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotBetween(Timestamp value1, Timestamp value2) {
			addCriterion("update_time not between", value1, value2, "updateTime");
			return (Criteria) this;
		}
	}

	/**
	 * holiday_config
	 *
	 * @mbg.generated do_not_delete_during_merge
	 */
	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	/**
	 * holiday_config null
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