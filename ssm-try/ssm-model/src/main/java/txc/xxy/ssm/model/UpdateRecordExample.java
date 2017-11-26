package txc.xxy.ssm.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class UpdateRecordExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public UpdateRecordExample() {
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
	 * update_record null
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

		public Criteria andSubjectIdIsNull() {
			addCriterion("subject_id is null");
			return (Criteria) this;
		}

		public Criteria andSubjectIdIsNotNull() {
			addCriterion("subject_id is not null");
			return (Criteria) this;
		}

		public Criteria andSubjectIdEqualTo(String value) {
			addCriterion("subject_id =", value, "subjectId");
			return (Criteria) this;
		}

		public Criteria andSubjectIdNotEqualTo(String value) {
			addCriterion("subject_id <>", value, "subjectId");
			return (Criteria) this;
		}

		public Criteria andSubjectIdGreaterThan(String value) {
			addCriterion("subject_id >", value, "subjectId");
			return (Criteria) this;
		}

		public Criteria andSubjectIdGreaterThanOrEqualTo(String value) {
			addCriterion("subject_id >=", value, "subjectId");
			return (Criteria) this;
		}

		public Criteria andSubjectIdLessThan(String value) {
			addCriterion("subject_id <", value, "subjectId");
			return (Criteria) this;
		}

		public Criteria andSubjectIdLessThanOrEqualTo(String value) {
			addCriterion("subject_id <=", value, "subjectId");
			return (Criteria) this;
		}

		public Criteria andSubjectIdLike(String value) {
			addCriterion("subject_id like", value, "subjectId");
			return (Criteria) this;
		}

		public Criteria andSubjectIdNotLike(String value) {
			addCriterion("subject_id not like", value, "subjectId");
			return (Criteria) this;
		}

		public Criteria andSubjectIdIn(List<String> values) {
			addCriterion("subject_id in", values, "subjectId");
			return (Criteria) this;
		}

		public Criteria andSubjectIdNotIn(List<String> values) {
			addCriterion("subject_id not in", values, "subjectId");
			return (Criteria) this;
		}

		public Criteria andSubjectIdBetween(String value1, String value2) {
			addCriterion("subject_id between", value1, value2, "subjectId");
			return (Criteria) this;
		}

		public Criteria andSubjectIdNotBetween(String value1, String value2) {
			addCriterion("subject_id not between", value1, value2, "subjectId");
			return (Criteria) this;
		}

		public Criteria andSubjectTypeIsNull() {
			addCriterion("subject_type is null");
			return (Criteria) this;
		}

		public Criteria andSubjectTypeIsNotNull() {
			addCriterion("subject_type is not null");
			return (Criteria) this;
		}

		public Criteria andSubjectTypeEqualTo(String value) {
			addCriterion("subject_type =", value, "subjectType");
			return (Criteria) this;
		}

		public Criteria andSubjectTypeNotEqualTo(String value) {
			addCriterion("subject_type <>", value, "subjectType");
			return (Criteria) this;
		}

		public Criteria andSubjectTypeGreaterThan(String value) {
			addCriterion("subject_type >", value, "subjectType");
			return (Criteria) this;
		}

		public Criteria andSubjectTypeGreaterThanOrEqualTo(String value) {
			addCriterion("subject_type >=", value, "subjectType");
			return (Criteria) this;
		}

		public Criteria andSubjectTypeLessThan(String value) {
			addCriterion("subject_type <", value, "subjectType");
			return (Criteria) this;
		}

		public Criteria andSubjectTypeLessThanOrEqualTo(String value) {
			addCriterion("subject_type <=", value, "subjectType");
			return (Criteria) this;
		}

		public Criteria andSubjectTypeLike(String value) {
			addCriterion("subject_type like", value, "subjectType");
			return (Criteria) this;
		}

		public Criteria andSubjectTypeNotLike(String value) {
			addCriterion("subject_type not like", value, "subjectType");
			return (Criteria) this;
		}

		public Criteria andSubjectTypeIn(List<String> values) {
			addCriterion("subject_type in", values, "subjectType");
			return (Criteria) this;
		}

		public Criteria andSubjectTypeNotIn(List<String> values) {
			addCriterion("subject_type not in", values, "subjectType");
			return (Criteria) this;
		}

		public Criteria andSubjectTypeBetween(String value1, String value2) {
			addCriterion("subject_type between", value1, value2, "subjectType");
			return (Criteria) this;
		}

		public Criteria andSubjectTypeNotBetween(String value1, String value2) {
			addCriterion("subject_type not between", value1, value2, "subjectType");
			return (Criteria) this;
		}

		public Criteria andNodeStatusCodeIsNull() {
			addCriterion("node_status_code is null");
			return (Criteria) this;
		}

		public Criteria andNodeStatusCodeIsNotNull() {
			addCriterion("node_status_code is not null");
			return (Criteria) this;
		}

		public Criteria andNodeStatusCodeEqualTo(String value) {
			addCriterion("node_status_code =", value, "nodeStatusCode");
			return (Criteria) this;
		}

		public Criteria andNodeStatusCodeNotEqualTo(String value) {
			addCriterion("node_status_code <>", value, "nodeStatusCode");
			return (Criteria) this;
		}

		public Criteria andNodeStatusCodeGreaterThan(String value) {
			addCriterion("node_status_code >", value, "nodeStatusCode");
			return (Criteria) this;
		}

		public Criteria andNodeStatusCodeGreaterThanOrEqualTo(String value) {
			addCriterion("node_status_code >=", value, "nodeStatusCode");
			return (Criteria) this;
		}

		public Criteria andNodeStatusCodeLessThan(String value) {
			addCriterion("node_status_code <", value, "nodeStatusCode");
			return (Criteria) this;
		}

		public Criteria andNodeStatusCodeLessThanOrEqualTo(String value) {
			addCriterion("node_status_code <=", value, "nodeStatusCode");
			return (Criteria) this;
		}

		public Criteria andNodeStatusCodeLike(String value) {
			addCriterion("node_status_code like", value, "nodeStatusCode");
			return (Criteria) this;
		}

		public Criteria andNodeStatusCodeNotLike(String value) {
			addCriterion("node_status_code not like", value, "nodeStatusCode");
			return (Criteria) this;
		}

		public Criteria andNodeStatusCodeIn(List<String> values) {
			addCriterion("node_status_code in", values, "nodeStatusCode");
			return (Criteria) this;
		}

		public Criteria andNodeStatusCodeNotIn(List<String> values) {
			addCriterion("node_status_code not in", values, "nodeStatusCode");
			return (Criteria) this;
		}

		public Criteria andNodeStatusCodeBetween(String value1, String value2) {
			addCriterion("node_status_code between", value1, value2, "nodeStatusCode");
			return (Criteria) this;
		}

		public Criteria andNodeStatusCodeNotBetween(String value1, String value2) {
			addCriterion("node_status_code not between", value1, value2, "nodeStatusCode");
			return (Criteria) this;
		}

		public Criteria andNodeSuspendStateIsNull() {
			addCriterion("node_suspend_state is null");
			return (Criteria) this;
		}

		public Criteria andNodeSuspendStateIsNotNull() {
			addCriterion("node_suspend_state is not null");
			return (Criteria) this;
		}

		public Criteria andNodeSuspendStateEqualTo(String value) {
			addCriterion("node_suspend_state =", value, "nodeSuspendState");
			return (Criteria) this;
		}

		public Criteria andNodeSuspendStateNotEqualTo(String value) {
			addCriterion("node_suspend_state <>", value, "nodeSuspendState");
			return (Criteria) this;
		}

		public Criteria andNodeSuspendStateGreaterThan(String value) {
			addCriterion("node_suspend_state >", value, "nodeSuspendState");
			return (Criteria) this;
		}

		public Criteria andNodeSuspendStateGreaterThanOrEqualTo(String value) {
			addCriterion("node_suspend_state >=", value, "nodeSuspendState");
			return (Criteria) this;
		}

		public Criteria andNodeSuspendStateLessThan(String value) {
			addCriterion("node_suspend_state <", value, "nodeSuspendState");
			return (Criteria) this;
		}

		public Criteria andNodeSuspendStateLessThanOrEqualTo(String value) {
			addCriterion("node_suspend_state <=", value, "nodeSuspendState");
			return (Criteria) this;
		}

		public Criteria andNodeSuspendStateLike(String value) {
			addCriterion("node_suspend_state like", value, "nodeSuspendState");
			return (Criteria) this;
		}

		public Criteria andNodeSuspendStateNotLike(String value) {
			addCriterion("node_suspend_state not like", value, "nodeSuspendState");
			return (Criteria) this;
		}

		public Criteria andNodeSuspendStateIn(List<String> values) {
			addCriterion("node_suspend_state in", values, "nodeSuspendState");
			return (Criteria) this;
		}

		public Criteria andNodeSuspendStateNotIn(List<String> values) {
			addCriterion("node_suspend_state not in", values, "nodeSuspendState");
			return (Criteria) this;
		}

		public Criteria andNodeSuspendStateBetween(String value1, String value2) {
			addCriterion("node_suspend_state between", value1, value2, "nodeSuspendState");
			return (Criteria) this;
		}

		public Criteria andNodeSuspendStateNotBetween(String value1, String value2) {
			addCriterion("node_suspend_state not between", value1, value2, "nodeSuspendState");
			return (Criteria) this;
		}

		public Criteria andRemarkIsNull() {
			addCriterion("remark is null");
			return (Criteria) this;
		}

		public Criteria andRemarkIsNotNull() {
			addCriterion("remark is not null");
			return (Criteria) this;
		}

		public Criteria andRemarkEqualTo(String value) {
			addCriterion("remark =", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotEqualTo(String value) {
			addCriterion("remark <>", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkGreaterThan(String value) {
			addCriterion("remark >", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkGreaterThanOrEqualTo(String value) {
			addCriterion("remark >=", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkLessThan(String value) {
			addCriterion("remark <", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkLessThanOrEqualTo(String value) {
			addCriterion("remark <=", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkLike(String value) {
			addCriterion("remark like", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotLike(String value) {
			addCriterion("remark not like", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkIn(List<String> values) {
			addCriterion("remark in", values, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotIn(List<String> values) {
			addCriterion("remark not in", values, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkBetween(String value1, String value2) {
			addCriterion("remark between", value1, value2, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotBetween(String value1, String value2) {
			addCriterion("remark not between", value1, value2, "remark");
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

		public Criteria andUserIdIsNull() {
			addCriterion("user_id is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("user_id is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(String value) {
			addCriterion("user_id =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(String value) {
			addCriterion("user_id <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(String value) {
			addCriterion("user_id >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(String value) {
			addCriterion("user_id >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(String value) {
			addCriterion("user_id <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(String value) {
			addCriterion("user_id <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLike(String value) {
			addCriterion("user_id like", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotLike(String value) {
			addCriterion("user_id not like", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<String> values) {
			addCriterion("user_id in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<String> values) {
			addCriterion("user_id not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(String value1, String value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(String value1, String value2) {
			addCriterion("user_id not between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserNameIsNull() {
			addCriterion("user_name is null");
			return (Criteria) this;
		}

		public Criteria andUserNameIsNotNull() {
			addCriterion("user_name is not null");
			return (Criteria) this;
		}

		public Criteria andUserNameEqualTo(String value) {
			addCriterion("user_name =", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotEqualTo(String value) {
			addCriterion("user_name <>", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameGreaterThan(String value) {
			addCriterion("user_name >", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameGreaterThanOrEqualTo(String value) {
			addCriterion("user_name >=", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameLessThan(String value) {
			addCriterion("user_name <", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameLessThanOrEqualTo(String value) {
			addCriterion("user_name <=", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameLike(String value) {
			addCriterion("user_name like", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotLike(String value) {
			addCriterion("user_name not like", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameIn(List<String> values) {
			addCriterion("user_name in", values, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotIn(List<String> values) {
			addCriterion("user_name not in", values, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameBetween(String value1, String value2) {
			addCriterion("user_name between", value1, value2, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotBetween(String value1, String value2) {
			addCriterion("user_name not between", value1, value2, "userName");
			return (Criteria) this;
		}
	}

	/**
	 * update_record
	 *
	 * @mbg.generated do_not_delete_during_merge
	 */
	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	/**
	 * update_record null
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