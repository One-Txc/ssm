package txc.xxy.ssm.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class BugListExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public BugListExample() {
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
	 * bug_list null
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

		public Criteria andBugIdIsNull() {
			addCriterion("bug_id is null");
			return (Criteria) this;
		}

		public Criteria andBugIdIsNotNull() {
			addCriterion("bug_id is not null");
			return (Criteria) this;
		}

		public Criteria andBugIdEqualTo(String value) {
			addCriterion("bug_id =", value, "bugId");
			return (Criteria) this;
		}

		public Criteria andBugIdNotEqualTo(String value) {
			addCriterion("bug_id <>", value, "bugId");
			return (Criteria) this;
		}

		public Criteria andBugIdGreaterThan(String value) {
			addCriterion("bug_id >", value, "bugId");
			return (Criteria) this;
		}

		public Criteria andBugIdGreaterThanOrEqualTo(String value) {
			addCriterion("bug_id >=", value, "bugId");
			return (Criteria) this;
		}

		public Criteria andBugIdLessThan(String value) {
			addCriterion("bug_id <", value, "bugId");
			return (Criteria) this;
		}

		public Criteria andBugIdLessThanOrEqualTo(String value) {
			addCriterion("bug_id <=", value, "bugId");
			return (Criteria) this;
		}

		public Criteria andBugIdLike(String value) {
			addCriterion("bug_id like", value, "bugId");
			return (Criteria) this;
		}

		public Criteria andBugIdNotLike(String value) {
			addCriterion("bug_id not like", value, "bugId");
			return (Criteria) this;
		}

		public Criteria andBugIdIn(List<String> values) {
			addCriterion("bug_id in", values, "bugId");
			return (Criteria) this;
		}

		public Criteria andBugIdNotIn(List<String> values) {
			addCriterion("bug_id not in", values, "bugId");
			return (Criteria) this;
		}

		public Criteria andBugIdBetween(String value1, String value2) {
			addCriterion("bug_id between", value1, value2, "bugId");
			return (Criteria) this;
		}

		public Criteria andBugIdNotBetween(String value1, String value2) {
			addCriterion("bug_id not between", value1, value2, "bugId");
			return (Criteria) this;
		}

		public Criteria andBugTitleIsNull() {
			addCriterion("bug_title is null");
			return (Criteria) this;
		}

		public Criteria andBugTitleIsNotNull() {
			addCriterion("bug_title is not null");
			return (Criteria) this;
		}

		public Criteria andBugTitleEqualTo(String value) {
			addCriterion("bug_title =", value, "bugTitle");
			return (Criteria) this;
		}

		public Criteria andBugTitleNotEqualTo(String value) {
			addCriterion("bug_title <>", value, "bugTitle");
			return (Criteria) this;
		}

		public Criteria andBugTitleGreaterThan(String value) {
			addCriterion("bug_title >", value, "bugTitle");
			return (Criteria) this;
		}

		public Criteria andBugTitleGreaterThanOrEqualTo(String value) {
			addCriterion("bug_title >=", value, "bugTitle");
			return (Criteria) this;
		}

		public Criteria andBugTitleLessThan(String value) {
			addCriterion("bug_title <", value, "bugTitle");
			return (Criteria) this;
		}

		public Criteria andBugTitleLessThanOrEqualTo(String value) {
			addCriterion("bug_title <=", value, "bugTitle");
			return (Criteria) this;
		}

		public Criteria andBugTitleLike(String value) {
			addCriterion("bug_title like", value, "bugTitle");
			return (Criteria) this;
		}

		public Criteria andBugTitleNotLike(String value) {
			addCriterion("bug_title not like", value, "bugTitle");
			return (Criteria) this;
		}

		public Criteria andBugTitleIn(List<String> values) {
			addCriterion("bug_title in", values, "bugTitle");
			return (Criteria) this;
		}

		public Criteria andBugTitleNotIn(List<String> values) {
			addCriterion("bug_title not in", values, "bugTitle");
			return (Criteria) this;
		}

		public Criteria andBugTitleBetween(String value1, String value2) {
			addCriterion("bug_title between", value1, value2, "bugTitle");
			return (Criteria) this;
		}

		public Criteria andBugTitleNotBetween(String value1, String value2) {
			addCriterion("bug_title not between", value1, value2, "bugTitle");
			return (Criteria) this;
		}

		public Criteria andTypeCodeIsNull() {
			addCriterion("type_code is null");
			return (Criteria) this;
		}

		public Criteria andTypeCodeIsNotNull() {
			addCriterion("type_code is not null");
			return (Criteria) this;
		}

		public Criteria andTypeCodeEqualTo(String value) {
			addCriterion("type_code =", value, "typeCode");
			return (Criteria) this;
		}

		public Criteria andTypeCodeNotEqualTo(String value) {
			addCriterion("type_code <>", value, "typeCode");
			return (Criteria) this;
		}

		public Criteria andTypeCodeGreaterThan(String value) {
			addCriterion("type_code >", value, "typeCode");
			return (Criteria) this;
		}

		public Criteria andTypeCodeGreaterThanOrEqualTo(String value) {
			addCriterion("type_code >=", value, "typeCode");
			return (Criteria) this;
		}

		public Criteria andTypeCodeLessThan(String value) {
			addCriterion("type_code <", value, "typeCode");
			return (Criteria) this;
		}

		public Criteria andTypeCodeLessThanOrEqualTo(String value) {
			addCriterion("type_code <=", value, "typeCode");
			return (Criteria) this;
		}

		public Criteria andTypeCodeLike(String value) {
			addCriterion("type_code like", value, "typeCode");
			return (Criteria) this;
		}

		public Criteria andTypeCodeNotLike(String value) {
			addCriterion("type_code not like", value, "typeCode");
			return (Criteria) this;
		}

		public Criteria andTypeCodeIn(List<String> values) {
			addCriterion("type_code in", values, "typeCode");
			return (Criteria) this;
		}

		public Criteria andTypeCodeNotIn(List<String> values) {
			addCriterion("type_code not in", values, "typeCode");
			return (Criteria) this;
		}

		public Criteria andTypeCodeBetween(String value1, String value2) {
			addCriterion("type_code between", value1, value2, "typeCode");
			return (Criteria) this;
		}

		public Criteria andTypeCodeNotBetween(String value1, String value2) {
			addCriterion("type_code not between", value1, value2, "typeCode");
			return (Criteria) this;
		}

		public Criteria andPriorityCodeIsNull() {
			addCriterion("priority_code is null");
			return (Criteria) this;
		}

		public Criteria andPriorityCodeIsNotNull() {
			addCriterion("priority_code is not null");
			return (Criteria) this;
		}

		public Criteria andPriorityCodeEqualTo(String value) {
			addCriterion("priority_code =", value, "priorityCode");
			return (Criteria) this;
		}

		public Criteria andPriorityCodeNotEqualTo(String value) {
			addCriterion("priority_code <>", value, "priorityCode");
			return (Criteria) this;
		}

		public Criteria andPriorityCodeGreaterThan(String value) {
			addCriterion("priority_code >", value, "priorityCode");
			return (Criteria) this;
		}

		public Criteria andPriorityCodeGreaterThanOrEqualTo(String value) {
			addCriterion("priority_code >=", value, "priorityCode");
			return (Criteria) this;
		}

		public Criteria andPriorityCodeLessThan(String value) {
			addCriterion("priority_code <", value, "priorityCode");
			return (Criteria) this;
		}

		public Criteria andPriorityCodeLessThanOrEqualTo(String value) {
			addCriterion("priority_code <=", value, "priorityCode");
			return (Criteria) this;
		}

		public Criteria andPriorityCodeLike(String value) {
			addCriterion("priority_code like", value, "priorityCode");
			return (Criteria) this;
		}

		public Criteria andPriorityCodeNotLike(String value) {
			addCriterion("priority_code not like", value, "priorityCode");
			return (Criteria) this;
		}

		public Criteria andPriorityCodeIn(List<String> values) {
			addCriterion("priority_code in", values, "priorityCode");
			return (Criteria) this;
		}

		public Criteria andPriorityCodeNotIn(List<String> values) {
			addCriterion("priority_code not in", values, "priorityCode");
			return (Criteria) this;
		}

		public Criteria andPriorityCodeBetween(String value1, String value2) {
			addCriterion("priority_code between", value1, value2, "priorityCode");
			return (Criteria) this;
		}

		public Criteria andPriorityCodeNotBetween(String value1, String value2) {
			addCriterion("priority_code not between", value1, value2, "priorityCode");
			return (Criteria) this;
		}

		public Criteria andErrorLevelIsNull() {
			addCriterion("error_level is null");
			return (Criteria) this;
		}

		public Criteria andErrorLevelIsNotNull() {
			addCriterion("error_level is not null");
			return (Criteria) this;
		}

		public Criteria andErrorLevelEqualTo(String value) {
			addCriterion("error_level =", value, "errorLevel");
			return (Criteria) this;
		}

		public Criteria andErrorLevelNotEqualTo(String value) {
			addCriterion("error_level <>", value, "errorLevel");
			return (Criteria) this;
		}

		public Criteria andErrorLevelGreaterThan(String value) {
			addCriterion("error_level >", value, "errorLevel");
			return (Criteria) this;
		}

		public Criteria andErrorLevelGreaterThanOrEqualTo(String value) {
			addCriterion("error_level >=", value, "errorLevel");
			return (Criteria) this;
		}

		public Criteria andErrorLevelLessThan(String value) {
			addCriterion("error_level <", value, "errorLevel");
			return (Criteria) this;
		}

		public Criteria andErrorLevelLessThanOrEqualTo(String value) {
			addCriterion("error_level <=", value, "errorLevel");
			return (Criteria) this;
		}

		public Criteria andErrorLevelLike(String value) {
			addCriterion("error_level like", value, "errorLevel");
			return (Criteria) this;
		}

		public Criteria andErrorLevelNotLike(String value) {
			addCriterion("error_level not like", value, "errorLevel");
			return (Criteria) this;
		}

		public Criteria andErrorLevelIn(List<String> values) {
			addCriterion("error_level in", values, "errorLevel");
			return (Criteria) this;
		}

		public Criteria andErrorLevelNotIn(List<String> values) {
			addCriterion("error_level not in", values, "errorLevel");
			return (Criteria) this;
		}

		public Criteria andErrorLevelBetween(String value1, String value2) {
			addCriterion("error_level between", value1, value2, "errorLevel");
			return (Criteria) this;
		}

		public Criteria andErrorLevelNotBetween(String value1, String value2) {
			addCriterion("error_level not between", value1, value2, "errorLevel");
			return (Criteria) this;
		}

		public Criteria andBugDescIsNull() {
			addCriterion("bug_desc is null");
			return (Criteria) this;
		}

		public Criteria andBugDescIsNotNull() {
			addCriterion("bug_desc is not null");
			return (Criteria) this;
		}

		public Criteria andBugDescEqualTo(String value) {
			addCriterion("bug_desc =", value, "bugDesc");
			return (Criteria) this;
		}

		public Criteria andBugDescNotEqualTo(String value) {
			addCriterion("bug_desc <>", value, "bugDesc");
			return (Criteria) this;
		}

		public Criteria andBugDescGreaterThan(String value) {
			addCriterion("bug_desc >", value, "bugDesc");
			return (Criteria) this;
		}

		public Criteria andBugDescGreaterThanOrEqualTo(String value) {
			addCriterion("bug_desc >=", value, "bugDesc");
			return (Criteria) this;
		}

		public Criteria andBugDescLessThan(String value) {
			addCriterion("bug_desc <", value, "bugDesc");
			return (Criteria) this;
		}

		public Criteria andBugDescLessThanOrEqualTo(String value) {
			addCriterion("bug_desc <=", value, "bugDesc");
			return (Criteria) this;
		}

		public Criteria andBugDescLike(String value) {
			addCriterion("bug_desc like", value, "bugDesc");
			return (Criteria) this;
		}

		public Criteria andBugDescNotLike(String value) {
			addCriterion("bug_desc not like", value, "bugDesc");
			return (Criteria) this;
		}

		public Criteria andBugDescIn(List<String> values) {
			addCriterion("bug_desc in", values, "bugDesc");
			return (Criteria) this;
		}

		public Criteria andBugDescNotIn(List<String> values) {
			addCriterion("bug_desc not in", values, "bugDesc");
			return (Criteria) this;
		}

		public Criteria andBugDescBetween(String value1, String value2) {
			addCriterion("bug_desc between", value1, value2, "bugDesc");
			return (Criteria) this;
		}

		public Criteria andBugDescNotBetween(String value1, String value2) {
			addCriterion("bug_desc not between", value1, value2, "bugDesc");
			return (Criteria) this;
		}

		public Criteria andAccessoryUrlIsNull() {
			addCriterion("accessory_url is null");
			return (Criteria) this;
		}

		public Criteria andAccessoryUrlIsNotNull() {
			addCriterion("accessory_url is not null");
			return (Criteria) this;
		}

		public Criteria andAccessoryUrlEqualTo(String value) {
			addCriterion("accessory_url =", value, "accessoryUrl");
			return (Criteria) this;
		}

		public Criteria andAccessoryUrlNotEqualTo(String value) {
			addCriterion("accessory_url <>", value, "accessoryUrl");
			return (Criteria) this;
		}

		public Criteria andAccessoryUrlGreaterThan(String value) {
			addCriterion("accessory_url >", value, "accessoryUrl");
			return (Criteria) this;
		}

		public Criteria andAccessoryUrlGreaterThanOrEqualTo(String value) {
			addCriterion("accessory_url >=", value, "accessoryUrl");
			return (Criteria) this;
		}

		public Criteria andAccessoryUrlLessThan(String value) {
			addCriterion("accessory_url <", value, "accessoryUrl");
			return (Criteria) this;
		}

		public Criteria andAccessoryUrlLessThanOrEqualTo(String value) {
			addCriterion("accessory_url <=", value, "accessoryUrl");
			return (Criteria) this;
		}

		public Criteria andAccessoryUrlLike(String value) {
			addCriterion("accessory_url like", value, "accessoryUrl");
			return (Criteria) this;
		}

		public Criteria andAccessoryUrlNotLike(String value) {
			addCriterion("accessory_url not like", value, "accessoryUrl");
			return (Criteria) this;
		}

		public Criteria andAccessoryUrlIn(List<String> values) {
			addCriterion("accessory_url in", values, "accessoryUrl");
			return (Criteria) this;
		}

		public Criteria andAccessoryUrlNotIn(List<String> values) {
			addCriterion("accessory_url not in", values, "accessoryUrl");
			return (Criteria) this;
		}

		public Criteria andAccessoryUrlBetween(String value1, String value2) {
			addCriterion("accessory_url between", value1, value2, "accessoryUrl");
			return (Criteria) this;
		}

		public Criteria andAccessoryUrlNotBetween(String value1, String value2) {
			addCriterion("accessory_url not between", value1, value2, "accessoryUrl");
			return (Criteria) this;
		}

		public Criteria andAccessoryTitleIsNull() {
			addCriterion("accessory_title is null");
			return (Criteria) this;
		}

		public Criteria andAccessoryTitleIsNotNull() {
			addCriterion("accessory_title is not null");
			return (Criteria) this;
		}

		public Criteria andAccessoryTitleEqualTo(String value) {
			addCriterion("accessory_title =", value, "accessoryTitle");
			return (Criteria) this;
		}

		public Criteria andAccessoryTitleNotEqualTo(String value) {
			addCriterion("accessory_title <>", value, "accessoryTitle");
			return (Criteria) this;
		}

		public Criteria andAccessoryTitleGreaterThan(String value) {
			addCriterion("accessory_title >", value, "accessoryTitle");
			return (Criteria) this;
		}

		public Criteria andAccessoryTitleGreaterThanOrEqualTo(String value) {
			addCriterion("accessory_title >=", value, "accessoryTitle");
			return (Criteria) this;
		}

		public Criteria andAccessoryTitleLessThan(String value) {
			addCriterion("accessory_title <", value, "accessoryTitle");
			return (Criteria) this;
		}

		public Criteria andAccessoryTitleLessThanOrEqualTo(String value) {
			addCriterion("accessory_title <=", value, "accessoryTitle");
			return (Criteria) this;
		}

		public Criteria andAccessoryTitleLike(String value) {
			addCriterion("accessory_title like", value, "accessoryTitle");
			return (Criteria) this;
		}

		public Criteria andAccessoryTitleNotLike(String value) {
			addCriterion("accessory_title not like", value, "accessoryTitle");
			return (Criteria) this;
		}

		public Criteria andAccessoryTitleIn(List<String> values) {
			addCriterion("accessory_title in", values, "accessoryTitle");
			return (Criteria) this;
		}

		public Criteria andAccessoryTitleNotIn(List<String> values) {
			addCriterion("accessory_title not in", values, "accessoryTitle");
			return (Criteria) this;
		}

		public Criteria andAccessoryTitleBetween(String value1, String value2) {
			addCriterion("accessory_title between", value1, value2, "accessoryTitle");
			return (Criteria) this;
		}

		public Criteria andAccessoryTitleNotBetween(String value1, String value2) {
			addCriterion("accessory_title not between", value1, value2, "accessoryTitle");
			return (Criteria) this;
		}

		public Criteria andFeedbackIsNull() {
			addCriterion("feedback is null");
			return (Criteria) this;
		}

		public Criteria andFeedbackIsNotNull() {
			addCriterion("feedback is not null");
			return (Criteria) this;
		}

		public Criteria andFeedbackEqualTo(String value) {
			addCriterion("feedback =", value, "feedback");
			return (Criteria) this;
		}

		public Criteria andFeedbackNotEqualTo(String value) {
			addCriterion("feedback <>", value, "feedback");
			return (Criteria) this;
		}

		public Criteria andFeedbackGreaterThan(String value) {
			addCriterion("feedback >", value, "feedback");
			return (Criteria) this;
		}

		public Criteria andFeedbackGreaterThanOrEqualTo(String value) {
			addCriterion("feedback >=", value, "feedback");
			return (Criteria) this;
		}

		public Criteria andFeedbackLessThan(String value) {
			addCriterion("feedback <", value, "feedback");
			return (Criteria) this;
		}

		public Criteria andFeedbackLessThanOrEqualTo(String value) {
			addCriterion("feedback <=", value, "feedback");
			return (Criteria) this;
		}

		public Criteria andFeedbackLike(String value) {
			addCriterion("feedback like", value, "feedback");
			return (Criteria) this;
		}

		public Criteria andFeedbackNotLike(String value) {
			addCriterion("feedback not like", value, "feedback");
			return (Criteria) this;
		}

		public Criteria andFeedbackIn(List<String> values) {
			addCriterion("feedback in", values, "feedback");
			return (Criteria) this;
		}

		public Criteria andFeedbackNotIn(List<String> values) {
			addCriterion("feedback not in", values, "feedback");
			return (Criteria) this;
		}

		public Criteria andFeedbackBetween(String value1, String value2) {
			addCriterion("feedback between", value1, value2, "feedback");
			return (Criteria) this;
		}

		public Criteria andFeedbackNotBetween(String value1, String value2) {
			addCriterion("feedback not between", value1, value2, "feedback");
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

		public Criteria andGroupIdIsNull() {
			addCriterion("group_id is null");
			return (Criteria) this;
		}

		public Criteria andGroupIdIsNotNull() {
			addCriterion("group_id is not null");
			return (Criteria) this;
		}

		public Criteria andGroupIdEqualTo(String value) {
			addCriterion("group_id =", value, "groupId");
			return (Criteria) this;
		}

		public Criteria andGroupIdNotEqualTo(String value) {
			addCriterion("group_id <>", value, "groupId");
			return (Criteria) this;
		}

		public Criteria andGroupIdGreaterThan(String value) {
			addCriterion("group_id >", value, "groupId");
			return (Criteria) this;
		}

		public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
			addCriterion("group_id >=", value, "groupId");
			return (Criteria) this;
		}

		public Criteria andGroupIdLessThan(String value) {
			addCriterion("group_id <", value, "groupId");
			return (Criteria) this;
		}

		public Criteria andGroupIdLessThanOrEqualTo(String value) {
			addCriterion("group_id <=", value, "groupId");
			return (Criteria) this;
		}

		public Criteria andGroupIdLike(String value) {
			addCriterion("group_id like", value, "groupId");
			return (Criteria) this;
		}

		public Criteria andGroupIdNotLike(String value) {
			addCriterion("group_id not like", value, "groupId");
			return (Criteria) this;
		}

		public Criteria andGroupIdIn(List<String> values) {
			addCriterion("group_id in", values, "groupId");
			return (Criteria) this;
		}

		public Criteria andGroupIdNotIn(List<String> values) {
			addCriterion("group_id not in", values, "groupId");
			return (Criteria) this;
		}

		public Criteria andGroupIdBetween(String value1, String value2) {
			addCriterion("group_id between", value1, value2, "groupId");
			return (Criteria) this;
		}

		public Criteria andGroupIdNotBetween(String value1, String value2) {
			addCriterion("group_id not between", value1, value2, "groupId");
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

		public Criteria andCreateUidIsNull() {
			addCriterion("create_uid is null");
			return (Criteria) this;
		}

		public Criteria andCreateUidIsNotNull() {
			addCriterion("create_uid is not null");
			return (Criteria) this;
		}

		public Criteria andCreateUidEqualTo(String value) {
			addCriterion("create_uid =", value, "createUid");
			return (Criteria) this;
		}

		public Criteria andCreateUidNotEqualTo(String value) {
			addCriterion("create_uid <>", value, "createUid");
			return (Criteria) this;
		}

		public Criteria andCreateUidGreaterThan(String value) {
			addCriterion("create_uid >", value, "createUid");
			return (Criteria) this;
		}

		public Criteria andCreateUidGreaterThanOrEqualTo(String value) {
			addCriterion("create_uid >=", value, "createUid");
			return (Criteria) this;
		}

		public Criteria andCreateUidLessThan(String value) {
			addCriterion("create_uid <", value, "createUid");
			return (Criteria) this;
		}

		public Criteria andCreateUidLessThanOrEqualTo(String value) {
			addCriterion("create_uid <=", value, "createUid");
			return (Criteria) this;
		}

		public Criteria andCreateUidLike(String value) {
			addCriterion("create_uid like", value, "createUid");
			return (Criteria) this;
		}

		public Criteria andCreateUidNotLike(String value) {
			addCriterion("create_uid not like", value, "createUid");
			return (Criteria) this;
		}

		public Criteria andCreateUidIn(List<String> values) {
			addCriterion("create_uid in", values, "createUid");
			return (Criteria) this;
		}

		public Criteria andCreateUidNotIn(List<String> values) {
			addCriterion("create_uid not in", values, "createUid");
			return (Criteria) this;
		}

		public Criteria andCreateUidBetween(String value1, String value2) {
			addCriterion("create_uid between", value1, value2, "createUid");
			return (Criteria) this;
		}

		public Criteria andCreateUidNotBetween(String value1, String value2) {
			addCriterion("create_uid not between", value1, value2, "createUid");
			return (Criteria) this;
		}

		public Criteria andUpdateUidIsNull() {
			addCriterion("update_uid is null");
			return (Criteria) this;
		}

		public Criteria andUpdateUidIsNotNull() {
			addCriterion("update_uid is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateUidEqualTo(String value) {
			addCriterion("update_uid =", value, "updateUid");
			return (Criteria) this;
		}

		public Criteria andUpdateUidNotEqualTo(String value) {
			addCriterion("update_uid <>", value, "updateUid");
			return (Criteria) this;
		}

		public Criteria andUpdateUidGreaterThan(String value) {
			addCriterion("update_uid >", value, "updateUid");
			return (Criteria) this;
		}

		public Criteria andUpdateUidGreaterThanOrEqualTo(String value) {
			addCriterion("update_uid >=", value, "updateUid");
			return (Criteria) this;
		}

		public Criteria andUpdateUidLessThan(String value) {
			addCriterion("update_uid <", value, "updateUid");
			return (Criteria) this;
		}

		public Criteria andUpdateUidLessThanOrEqualTo(String value) {
			addCriterion("update_uid <=", value, "updateUid");
			return (Criteria) this;
		}

		public Criteria andUpdateUidLike(String value) {
			addCriterion("update_uid like", value, "updateUid");
			return (Criteria) this;
		}

		public Criteria andUpdateUidNotLike(String value) {
			addCriterion("update_uid not like", value, "updateUid");
			return (Criteria) this;
		}

		public Criteria andUpdateUidIn(List<String> values) {
			addCriterion("update_uid in", values, "updateUid");
			return (Criteria) this;
		}

		public Criteria andUpdateUidNotIn(List<String> values) {
			addCriterion("update_uid not in", values, "updateUid");
			return (Criteria) this;
		}

		public Criteria andUpdateUidBetween(String value1, String value2) {
			addCriterion("update_uid between", value1, value2, "updateUid");
			return (Criteria) this;
		}

		public Criteria andUpdateUidNotBetween(String value1, String value2) {
			addCriterion("update_uid not between", value1, value2, "updateUid");
			return (Criteria) this;
		}
	}

	/**
	 * bug_list
	 *
	 * @mbg.generated do_not_delete_during_merge
	 */
	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	/**
	 * bug_list null
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