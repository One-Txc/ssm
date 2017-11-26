package txc.xxy.ssm.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class WxTemplateRelaExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public WxTemplateRelaExample() {
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
	 * wx_template_rela null
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

		public Criteria andRelaIdIsNull() {
			addCriterion("rela_id is null");
			return (Criteria) this;
		}

		public Criteria andRelaIdIsNotNull() {
			addCriterion("rela_id is not null");
			return (Criteria) this;
		}

		public Criteria andRelaIdEqualTo(Long value) {
			addCriterion("rela_id =", value, "relaId");
			return (Criteria) this;
		}

		public Criteria andRelaIdNotEqualTo(Long value) {
			addCriterion("rela_id <>", value, "relaId");
			return (Criteria) this;
		}

		public Criteria andRelaIdGreaterThan(Long value) {
			addCriterion("rela_id >", value, "relaId");
			return (Criteria) this;
		}

		public Criteria andRelaIdGreaterThanOrEqualTo(Long value) {
			addCriterion("rela_id >=", value, "relaId");
			return (Criteria) this;
		}

		public Criteria andRelaIdLessThan(Long value) {
			addCriterion("rela_id <", value, "relaId");
			return (Criteria) this;
		}

		public Criteria andRelaIdLessThanOrEqualTo(Long value) {
			addCriterion("rela_id <=", value, "relaId");
			return (Criteria) this;
		}

		public Criteria andRelaIdIn(List<Long> values) {
			addCriterion("rela_id in", values, "relaId");
			return (Criteria) this;
		}

		public Criteria andRelaIdNotIn(List<Long> values) {
			addCriterion("rela_id not in", values, "relaId");
			return (Criteria) this;
		}

		public Criteria andRelaIdBetween(Long value1, Long value2) {
			addCriterion("rela_id between", value1, value2, "relaId");
			return (Criteria) this;
		}

		public Criteria andRelaIdNotBetween(Long value1, Long value2) {
			addCriterion("rela_id not between", value1, value2, "relaId");
			return (Criteria) this;
		}

		public Criteria andTemplateCodeIsNull() {
			addCriterion("template_code is null");
			return (Criteria) this;
		}

		public Criteria andTemplateCodeIsNotNull() {
			addCriterion("template_code is not null");
			return (Criteria) this;
		}

		public Criteria andTemplateCodeEqualTo(String value) {
			addCriterion("template_code =", value, "templateCode");
			return (Criteria) this;
		}

		public Criteria andTemplateCodeNotEqualTo(String value) {
			addCriterion("template_code <>", value, "templateCode");
			return (Criteria) this;
		}

		public Criteria andTemplateCodeGreaterThan(String value) {
			addCriterion("template_code >", value, "templateCode");
			return (Criteria) this;
		}

		public Criteria andTemplateCodeGreaterThanOrEqualTo(String value) {
			addCriterion("template_code >=", value, "templateCode");
			return (Criteria) this;
		}

		public Criteria andTemplateCodeLessThan(String value) {
			addCriterion("template_code <", value, "templateCode");
			return (Criteria) this;
		}

		public Criteria andTemplateCodeLessThanOrEqualTo(String value) {
			addCriterion("template_code <=", value, "templateCode");
			return (Criteria) this;
		}

		public Criteria andTemplateCodeLike(String value) {
			addCriterion("template_code like", value, "templateCode");
			return (Criteria) this;
		}

		public Criteria andTemplateCodeNotLike(String value) {
			addCriterion("template_code not like", value, "templateCode");
			return (Criteria) this;
		}

		public Criteria andTemplateCodeIn(List<String> values) {
			addCriterion("template_code in", values, "templateCode");
			return (Criteria) this;
		}

		public Criteria andTemplateCodeNotIn(List<String> values) {
			addCriterion("template_code not in", values, "templateCode");
			return (Criteria) this;
		}

		public Criteria andTemplateCodeBetween(String value1, String value2) {
			addCriterion("template_code between", value1, value2, "templateCode");
			return (Criteria) this;
		}

		public Criteria andTemplateCodeNotBetween(String value1, String value2) {
			addCriterion("template_code not between", value1, value2, "templateCode");
			return (Criteria) this;
		}

		public Criteria andTemplateIdIsNull() {
			addCriterion("template_id is null");
			return (Criteria) this;
		}

		public Criteria andTemplateIdIsNotNull() {
			addCriterion("template_id is not null");
			return (Criteria) this;
		}

		public Criteria andTemplateIdEqualTo(String value) {
			addCriterion("template_id =", value, "templateId");
			return (Criteria) this;
		}

		public Criteria andTemplateIdNotEqualTo(String value) {
			addCriterion("template_id <>", value, "templateId");
			return (Criteria) this;
		}

		public Criteria andTemplateIdGreaterThan(String value) {
			addCriterion("template_id >", value, "templateId");
			return (Criteria) this;
		}

		public Criteria andTemplateIdGreaterThanOrEqualTo(String value) {
			addCriterion("template_id >=", value, "templateId");
			return (Criteria) this;
		}

		public Criteria andTemplateIdLessThan(String value) {
			addCriterion("template_id <", value, "templateId");
			return (Criteria) this;
		}

		public Criteria andTemplateIdLessThanOrEqualTo(String value) {
			addCriterion("template_id <=", value, "templateId");
			return (Criteria) this;
		}

		public Criteria andTemplateIdLike(String value) {
			addCriterion("template_id like", value, "templateId");
			return (Criteria) this;
		}

		public Criteria andTemplateIdNotLike(String value) {
			addCriterion("template_id not like", value, "templateId");
			return (Criteria) this;
		}

		public Criteria andTemplateIdIn(List<String> values) {
			addCriterion("template_id in", values, "templateId");
			return (Criteria) this;
		}

		public Criteria andTemplateIdNotIn(List<String> values) {
			addCriterion("template_id not in", values, "templateId");
			return (Criteria) this;
		}

		public Criteria andTemplateIdBetween(String value1, String value2) {
			addCriterion("template_id between", value1, value2, "templateId");
			return (Criteria) this;
		}

		public Criteria andTemplateIdNotBetween(String value1, String value2) {
			addCriterion("template_id not between", value1, value2, "templateId");
			return (Criteria) this;
		}

		public Criteria andAppIdIsNull() {
			addCriterion("app_id is null");
			return (Criteria) this;
		}

		public Criteria andAppIdIsNotNull() {
			addCriterion("app_id is not null");
			return (Criteria) this;
		}

		public Criteria andAppIdEqualTo(String value) {
			addCriterion("app_id =", value, "appId");
			return (Criteria) this;
		}

		public Criteria andAppIdNotEqualTo(String value) {
			addCriterion("app_id <>", value, "appId");
			return (Criteria) this;
		}

		public Criteria andAppIdGreaterThan(String value) {
			addCriterion("app_id >", value, "appId");
			return (Criteria) this;
		}

		public Criteria andAppIdGreaterThanOrEqualTo(String value) {
			addCriterion("app_id >=", value, "appId");
			return (Criteria) this;
		}

		public Criteria andAppIdLessThan(String value) {
			addCriterion("app_id <", value, "appId");
			return (Criteria) this;
		}

		public Criteria andAppIdLessThanOrEqualTo(String value) {
			addCriterion("app_id <=", value, "appId");
			return (Criteria) this;
		}

		public Criteria andAppIdLike(String value) {
			addCriterion("app_id like", value, "appId");
			return (Criteria) this;
		}

		public Criteria andAppIdNotLike(String value) {
			addCriterion("app_id not like", value, "appId");
			return (Criteria) this;
		}

		public Criteria andAppIdIn(List<String> values) {
			addCriterion("app_id in", values, "appId");
			return (Criteria) this;
		}

		public Criteria andAppIdNotIn(List<String> values) {
			addCriterion("app_id not in", values, "appId");
			return (Criteria) this;
		}

		public Criteria andAppIdBetween(String value1, String value2) {
			addCriterion("app_id between", value1, value2, "appId");
			return (Criteria) this;
		}

		public Criteria andAppIdNotBetween(String value1, String value2) {
			addCriterion("app_id not between", value1, value2, "appId");
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

		public Criteria andStatusIsNull() {
			addCriterion("status is null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("status is not null");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(String value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(String value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(String value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(String value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(String value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(String value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLike(String value) {
			addCriterion("status like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotLike(String value) {
			addCriterion("status not like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<String> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<String> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(String value1, String value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(String value1, String value2) {
			addCriterion("status not between", value1, value2, "status");
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
	 * wx_template_rela
	 *
	 * @mbg.generated do_not_delete_during_merge
	 */
	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	/**
	 * wx_template_rela null
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