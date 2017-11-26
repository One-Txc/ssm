package txc.xxy.ssm.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class TaskInfoExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public TaskInfoExample() {
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
	 * task_info null
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

		public Criteria andTaskNoIsNull() {
			addCriterion("task_no is null");
			return (Criteria) this;
		}

		public Criteria andTaskNoIsNotNull() {
			addCriterion("task_no is not null");
			return (Criteria) this;
		}

		public Criteria andTaskNoEqualTo(String value) {
			addCriterion("task_no =", value, "taskNo");
			return (Criteria) this;
		}

		public Criteria andTaskNoNotEqualTo(String value) {
			addCriterion("task_no <>", value, "taskNo");
			return (Criteria) this;
		}

		public Criteria andTaskNoGreaterThan(String value) {
			addCriterion("task_no >", value, "taskNo");
			return (Criteria) this;
		}

		public Criteria andTaskNoGreaterThanOrEqualTo(String value) {
			addCriterion("task_no >=", value, "taskNo");
			return (Criteria) this;
		}

		public Criteria andTaskNoLessThan(String value) {
			addCriterion("task_no <", value, "taskNo");
			return (Criteria) this;
		}

		public Criteria andTaskNoLessThanOrEqualTo(String value) {
			addCriterion("task_no <=", value, "taskNo");
			return (Criteria) this;
		}

		public Criteria andTaskNoLike(String value) {
			addCriterion("task_no like", value, "taskNo");
			return (Criteria) this;
		}

		public Criteria andTaskNoNotLike(String value) {
			addCriterion("task_no not like", value, "taskNo");
			return (Criteria) this;
		}

		public Criteria andTaskNoIn(List<String> values) {
			addCriterion("task_no in", values, "taskNo");
			return (Criteria) this;
		}

		public Criteria andTaskNoNotIn(List<String> values) {
			addCriterion("task_no not in", values, "taskNo");
			return (Criteria) this;
		}

		public Criteria andTaskNoBetween(String value1, String value2) {
			addCriterion("task_no between", value1, value2, "taskNo");
			return (Criteria) this;
		}

		public Criteria andTaskNoNotBetween(String value1, String value2) {
			addCriterion("task_no not between", value1, value2, "taskNo");
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

		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("name is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("name >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("name >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("name <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("name <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("name in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("name not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("name between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("name not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andSourceTypeIsNull() {
			addCriterion("source_type is null");
			return (Criteria) this;
		}

		public Criteria andSourceTypeIsNotNull() {
			addCriterion("source_type is not null");
			return (Criteria) this;
		}

		public Criteria andSourceTypeEqualTo(String value) {
			addCriterion("source_type =", value, "sourceType");
			return (Criteria) this;
		}

		public Criteria andSourceTypeNotEqualTo(String value) {
			addCriterion("source_type <>", value, "sourceType");
			return (Criteria) this;
		}

		public Criteria andSourceTypeGreaterThan(String value) {
			addCriterion("source_type >", value, "sourceType");
			return (Criteria) this;
		}

		public Criteria andSourceTypeGreaterThanOrEqualTo(String value) {
			addCriterion("source_type >=", value, "sourceType");
			return (Criteria) this;
		}

		public Criteria andSourceTypeLessThan(String value) {
			addCriterion("source_type <", value, "sourceType");
			return (Criteria) this;
		}

		public Criteria andSourceTypeLessThanOrEqualTo(String value) {
			addCriterion("source_type <=", value, "sourceType");
			return (Criteria) this;
		}

		public Criteria andSourceTypeLike(String value) {
			addCriterion("source_type like", value, "sourceType");
			return (Criteria) this;
		}

		public Criteria andSourceTypeNotLike(String value) {
			addCriterion("source_type not like", value, "sourceType");
			return (Criteria) this;
		}

		public Criteria andSourceTypeIn(List<String> values) {
			addCriterion("source_type in", values, "sourceType");
			return (Criteria) this;
		}

		public Criteria andSourceTypeNotIn(List<String> values) {
			addCriterion("source_type not in", values, "sourceType");
			return (Criteria) this;
		}

		public Criteria andSourceTypeBetween(String value1, String value2) {
			addCriterion("source_type between", value1, value2, "sourceType");
			return (Criteria) this;
		}

		public Criteria andSourceTypeNotBetween(String value1, String value2) {
			addCriterion("source_type not between", value1, value2, "sourceType");
			return (Criteria) this;
		}

		public Criteria andCateTypeIsNull() {
			addCriterion("cate_type is null");
			return (Criteria) this;
		}

		public Criteria andCateTypeIsNotNull() {
			addCriterion("cate_type is not null");
			return (Criteria) this;
		}

		public Criteria andCateTypeEqualTo(String value) {
			addCriterion("cate_type =", value, "cateType");
			return (Criteria) this;
		}

		public Criteria andCateTypeNotEqualTo(String value) {
			addCriterion("cate_type <>", value, "cateType");
			return (Criteria) this;
		}

		public Criteria andCateTypeGreaterThan(String value) {
			addCriterion("cate_type >", value, "cateType");
			return (Criteria) this;
		}

		public Criteria andCateTypeGreaterThanOrEqualTo(String value) {
			addCriterion("cate_type >=", value, "cateType");
			return (Criteria) this;
		}

		public Criteria andCateTypeLessThan(String value) {
			addCriterion("cate_type <", value, "cateType");
			return (Criteria) this;
		}

		public Criteria andCateTypeLessThanOrEqualTo(String value) {
			addCriterion("cate_type <=", value, "cateType");
			return (Criteria) this;
		}

		public Criteria andCateTypeLike(String value) {
			addCriterion("cate_type like", value, "cateType");
			return (Criteria) this;
		}

		public Criteria andCateTypeNotLike(String value) {
			addCriterion("cate_type not like", value, "cateType");
			return (Criteria) this;
		}

		public Criteria andCateTypeIn(List<String> values) {
			addCriterion("cate_type in", values, "cateType");
			return (Criteria) this;
		}

		public Criteria andCateTypeNotIn(List<String> values) {
			addCriterion("cate_type not in", values, "cateType");
			return (Criteria) this;
		}

		public Criteria andCateTypeBetween(String value1, String value2) {
			addCriterion("cate_type between", value1, value2, "cateType");
			return (Criteria) this;
		}

		public Criteria andCateTypeNotBetween(String value1, String value2) {
			addCriterion("cate_type not between", value1, value2, "cateType");
			return (Criteria) this;
		}

		public Criteria andPrincipalUidIsNull() {
			addCriterion("principal_uid is null");
			return (Criteria) this;
		}

		public Criteria andPrincipalUidIsNotNull() {
			addCriterion("principal_uid is not null");
			return (Criteria) this;
		}

		public Criteria andPrincipalUidEqualTo(String value) {
			addCriterion("principal_uid =", value, "principalUid");
			return (Criteria) this;
		}

		public Criteria andPrincipalUidNotEqualTo(String value) {
			addCriterion("principal_uid <>", value, "principalUid");
			return (Criteria) this;
		}

		public Criteria andPrincipalUidGreaterThan(String value) {
			addCriterion("principal_uid >", value, "principalUid");
			return (Criteria) this;
		}

		public Criteria andPrincipalUidGreaterThanOrEqualTo(String value) {
			addCriterion("principal_uid >=", value, "principalUid");
			return (Criteria) this;
		}

		public Criteria andPrincipalUidLessThan(String value) {
			addCriterion("principal_uid <", value, "principalUid");
			return (Criteria) this;
		}

		public Criteria andPrincipalUidLessThanOrEqualTo(String value) {
			addCriterion("principal_uid <=", value, "principalUid");
			return (Criteria) this;
		}

		public Criteria andPrincipalUidLike(String value) {
			addCriterion("principal_uid like", value, "principalUid");
			return (Criteria) this;
		}

		public Criteria andPrincipalUidNotLike(String value) {
			addCriterion("principal_uid not like", value, "principalUid");
			return (Criteria) this;
		}

		public Criteria andPrincipalUidIn(List<String> values) {
			addCriterion("principal_uid in", values, "principalUid");
			return (Criteria) this;
		}

		public Criteria andPrincipalUidNotIn(List<String> values) {
			addCriterion("principal_uid not in", values, "principalUid");
			return (Criteria) this;
		}

		public Criteria andPrincipalUidBetween(String value1, String value2) {
			addCriterion("principal_uid between", value1, value2, "principalUid");
			return (Criteria) this;
		}

		public Criteria andPrincipalUidNotBetween(String value1, String value2) {
			addCriterion("principal_uid not between", value1, value2, "principalUid");
			return (Criteria) this;
		}

		public Criteria andExpectWorkloadIsNull() {
			addCriterion("expect_workload is null");
			return (Criteria) this;
		}

		public Criteria andExpectWorkloadIsNotNull() {
			addCriterion("expect_workload is not null");
			return (Criteria) this;
		}

		public Criteria andExpectWorkloadEqualTo(Double value) {
			addCriterion("expect_workload =", value, "expectWorkload");
			return (Criteria) this;
		}

		public Criteria andExpectWorkloadNotEqualTo(Double value) {
			addCriterion("expect_workload <>", value, "expectWorkload");
			return (Criteria) this;
		}

		public Criteria andExpectWorkloadGreaterThan(Double value) {
			addCriterion("expect_workload >", value, "expectWorkload");
			return (Criteria) this;
		}

		public Criteria andExpectWorkloadGreaterThanOrEqualTo(Double value) {
			addCriterion("expect_workload >=", value, "expectWorkload");
			return (Criteria) this;
		}

		public Criteria andExpectWorkloadLessThan(Double value) {
			addCriterion("expect_workload <", value, "expectWorkload");
			return (Criteria) this;
		}

		public Criteria andExpectWorkloadLessThanOrEqualTo(Double value) {
			addCriterion("expect_workload <=", value, "expectWorkload");
			return (Criteria) this;
		}

		public Criteria andExpectWorkloadIn(List<Double> values) {
			addCriterion("expect_workload in", values, "expectWorkload");
			return (Criteria) this;
		}

		public Criteria andExpectWorkloadNotIn(List<Double> values) {
			addCriterion("expect_workload not in", values, "expectWorkload");
			return (Criteria) this;
		}

		public Criteria andExpectWorkloadBetween(Double value1, Double value2) {
			addCriterion("expect_workload between", value1, value2, "expectWorkload");
			return (Criteria) this;
		}

		public Criteria andExpectWorkloadNotBetween(Double value1, Double value2) {
			addCriterion("expect_workload not between", value1, value2, "expectWorkload");
			return (Criteria) this;
		}

		public Criteria andRealWorkloadIsNull() {
			addCriterion("real_workload is null");
			return (Criteria) this;
		}

		public Criteria andRealWorkloadIsNotNull() {
			addCriterion("real_workload is not null");
			return (Criteria) this;
		}

		public Criteria andRealWorkloadEqualTo(Double value) {
			addCriterion("real_workload =", value, "realWorkload");
			return (Criteria) this;
		}

		public Criteria andRealWorkloadNotEqualTo(Double value) {
			addCriterion("real_workload <>", value, "realWorkload");
			return (Criteria) this;
		}

		public Criteria andRealWorkloadGreaterThan(Double value) {
			addCriterion("real_workload >", value, "realWorkload");
			return (Criteria) this;
		}

		public Criteria andRealWorkloadGreaterThanOrEqualTo(Double value) {
			addCriterion("real_workload >=", value, "realWorkload");
			return (Criteria) this;
		}

		public Criteria andRealWorkloadLessThan(Double value) {
			addCriterion("real_workload <", value, "realWorkload");
			return (Criteria) this;
		}

		public Criteria andRealWorkloadLessThanOrEqualTo(Double value) {
			addCriterion("real_workload <=", value, "realWorkload");
			return (Criteria) this;
		}

		public Criteria andRealWorkloadIn(List<Double> values) {
			addCriterion("real_workload in", values, "realWorkload");
			return (Criteria) this;
		}

		public Criteria andRealWorkloadNotIn(List<Double> values) {
			addCriterion("real_workload not in", values, "realWorkload");
			return (Criteria) this;
		}

		public Criteria andRealWorkloadBetween(Double value1, Double value2) {
			addCriterion("real_workload between", value1, value2, "realWorkload");
			return (Criteria) this;
		}

		public Criteria andRealWorkloadNotBetween(Double value1, Double value2) {
			addCriterion("real_workload not between", value1, value2, "realWorkload");
			return (Criteria) this;
		}

		public Criteria andCustomRealWorkloadIsNull() {
			addCriterion("custom_real_workload is null");
			return (Criteria) this;
		}

		public Criteria andCustomRealWorkloadIsNotNull() {
			addCriterion("custom_real_workload is not null");
			return (Criteria) this;
		}

		public Criteria andCustomRealWorkloadEqualTo(Double value) {
			addCriterion("custom_real_workload =", value, "customRealWorkload");
			return (Criteria) this;
		}

		public Criteria andCustomRealWorkloadNotEqualTo(Double value) {
			addCriterion("custom_real_workload <>", value, "customRealWorkload");
			return (Criteria) this;
		}

		public Criteria andCustomRealWorkloadGreaterThan(Double value) {
			addCriterion("custom_real_workload >", value, "customRealWorkload");
			return (Criteria) this;
		}

		public Criteria andCustomRealWorkloadGreaterThanOrEqualTo(Double value) {
			addCriterion("custom_real_workload >=", value, "customRealWorkload");
			return (Criteria) this;
		}

		public Criteria andCustomRealWorkloadLessThan(Double value) {
			addCriterion("custom_real_workload <", value, "customRealWorkload");
			return (Criteria) this;
		}

		public Criteria andCustomRealWorkloadLessThanOrEqualTo(Double value) {
			addCriterion("custom_real_workload <=", value, "customRealWorkload");
			return (Criteria) this;
		}

		public Criteria andCustomRealWorkloadIn(List<Double> values) {
			addCriterion("custom_real_workload in", values, "customRealWorkload");
			return (Criteria) this;
		}

		public Criteria andCustomRealWorkloadNotIn(List<Double> values) {
			addCriterion("custom_real_workload not in", values, "customRealWorkload");
			return (Criteria) this;
		}

		public Criteria andCustomRealWorkloadBetween(Double value1, Double value2) {
			addCriterion("custom_real_workload between", value1, value2, "customRealWorkload");
			return (Criteria) this;
		}

		public Criteria andCustomRealWorkloadNotBetween(Double value1, Double value2) {
			addCriterion("custom_real_workload not between", value1, value2, "customRealWorkload");
			return (Criteria) this;
		}

		public Criteria andPlanStartTimeIsNull() {
			addCriterion("plan_start_time is null");
			return (Criteria) this;
		}

		public Criteria andPlanStartTimeIsNotNull() {
			addCriterion("plan_start_time is not null");
			return (Criteria) this;
		}

		public Criteria andPlanStartTimeEqualTo(Timestamp value) {
			addCriterion("plan_start_time =", value, "planStartTime");
			return (Criteria) this;
		}

		public Criteria andPlanStartTimeNotEqualTo(Timestamp value) {
			addCriterion("plan_start_time <>", value, "planStartTime");
			return (Criteria) this;
		}

		public Criteria andPlanStartTimeGreaterThan(Timestamp value) {
			addCriterion("plan_start_time >", value, "planStartTime");
			return (Criteria) this;
		}

		public Criteria andPlanStartTimeGreaterThanOrEqualTo(Timestamp value) {
			addCriterion("plan_start_time >=", value, "planStartTime");
			return (Criteria) this;
		}

		public Criteria andPlanStartTimeLessThan(Timestamp value) {
			addCriterion("plan_start_time <", value, "planStartTime");
			return (Criteria) this;
		}

		public Criteria andPlanStartTimeLessThanOrEqualTo(Timestamp value) {
			addCriterion("plan_start_time <=", value, "planStartTime");
			return (Criteria) this;
		}

		public Criteria andPlanStartTimeIn(List<Timestamp> values) {
			addCriterion("plan_start_time in", values, "planStartTime");
			return (Criteria) this;
		}

		public Criteria andPlanStartTimeNotIn(List<Timestamp> values) {
			addCriterion("plan_start_time not in", values, "planStartTime");
			return (Criteria) this;
		}

		public Criteria andPlanStartTimeBetween(Timestamp value1, Timestamp value2) {
			addCriterion("plan_start_time between", value1, value2, "planStartTime");
			return (Criteria) this;
		}

		public Criteria andPlanStartTimeNotBetween(Timestamp value1, Timestamp value2) {
			addCriterion("plan_start_time not between", value1, value2, "planStartTime");
			return (Criteria) this;
		}

		public Criteria andPlanStopTimeIsNull() {
			addCriterion("plan_stop_time is null");
			return (Criteria) this;
		}

		public Criteria andPlanStopTimeIsNotNull() {
			addCriterion("plan_stop_time is not null");
			return (Criteria) this;
		}

		public Criteria andPlanStopTimeEqualTo(Timestamp value) {
			addCriterion("plan_stop_time =", value, "planStopTime");
			return (Criteria) this;
		}

		public Criteria andPlanStopTimeNotEqualTo(Timestamp value) {
			addCriterion("plan_stop_time <>", value, "planStopTime");
			return (Criteria) this;
		}

		public Criteria andPlanStopTimeGreaterThan(Timestamp value) {
			addCriterion("plan_stop_time >", value, "planStopTime");
			return (Criteria) this;
		}

		public Criteria andPlanStopTimeGreaterThanOrEqualTo(Timestamp value) {
			addCriterion("plan_stop_time >=", value, "planStopTime");
			return (Criteria) this;
		}

		public Criteria andPlanStopTimeLessThan(Timestamp value) {
			addCriterion("plan_stop_time <", value, "planStopTime");
			return (Criteria) this;
		}

		public Criteria andPlanStopTimeLessThanOrEqualTo(Timestamp value) {
			addCriterion("plan_stop_time <=", value, "planStopTime");
			return (Criteria) this;
		}

		public Criteria andPlanStopTimeIn(List<Timestamp> values) {
			addCriterion("plan_stop_time in", values, "planStopTime");
			return (Criteria) this;
		}

		public Criteria andPlanStopTimeNotIn(List<Timestamp> values) {
			addCriterion("plan_stop_time not in", values, "planStopTime");
			return (Criteria) this;
		}

		public Criteria andPlanStopTimeBetween(Timestamp value1, Timestamp value2) {
			addCriterion("plan_stop_time between", value1, value2, "planStopTime");
			return (Criteria) this;
		}

		public Criteria andPlanStopTimeNotBetween(Timestamp value1, Timestamp value2) {
			addCriterion("plan_stop_time not between", value1, value2, "planStopTime");
			return (Criteria) this;
		}

		public Criteria andRealStartTimeIsNull() {
			addCriterion("real_start_time is null");
			return (Criteria) this;
		}

		public Criteria andRealStartTimeIsNotNull() {
			addCriterion("real_start_time is not null");
			return (Criteria) this;
		}

		public Criteria andRealStartTimeEqualTo(Timestamp value) {
			addCriterion("real_start_time =", value, "realStartTime");
			return (Criteria) this;
		}

		public Criteria andRealStartTimeNotEqualTo(Timestamp value) {
			addCriterion("real_start_time <>", value, "realStartTime");
			return (Criteria) this;
		}

		public Criteria andRealStartTimeGreaterThan(Timestamp value) {
			addCriterion("real_start_time >", value, "realStartTime");
			return (Criteria) this;
		}

		public Criteria andRealStartTimeGreaterThanOrEqualTo(Timestamp value) {
			addCriterion("real_start_time >=", value, "realStartTime");
			return (Criteria) this;
		}

		public Criteria andRealStartTimeLessThan(Timestamp value) {
			addCriterion("real_start_time <", value, "realStartTime");
			return (Criteria) this;
		}

		public Criteria andRealStartTimeLessThanOrEqualTo(Timestamp value) {
			addCriterion("real_start_time <=", value, "realStartTime");
			return (Criteria) this;
		}

		public Criteria andRealStartTimeIn(List<Timestamp> values) {
			addCriterion("real_start_time in", values, "realStartTime");
			return (Criteria) this;
		}

		public Criteria andRealStartTimeNotIn(List<Timestamp> values) {
			addCriterion("real_start_time not in", values, "realStartTime");
			return (Criteria) this;
		}

		public Criteria andRealStartTimeBetween(Timestamp value1, Timestamp value2) {
			addCriterion("real_start_time between", value1, value2, "realStartTime");
			return (Criteria) this;
		}

		public Criteria andRealStartTimeNotBetween(Timestamp value1, Timestamp value2) {
			addCriterion("real_start_time not between", value1, value2, "realStartTime");
			return (Criteria) this;
		}

		public Criteria andRealStopTimeIsNull() {
			addCriterion("real_stop_time is null");
			return (Criteria) this;
		}

		public Criteria andRealStopTimeIsNotNull() {
			addCriterion("real_stop_time is not null");
			return (Criteria) this;
		}

		public Criteria andRealStopTimeEqualTo(Timestamp value) {
			addCriterion("real_stop_time =", value, "realStopTime");
			return (Criteria) this;
		}

		public Criteria andRealStopTimeNotEqualTo(Timestamp value) {
			addCriterion("real_stop_time <>", value, "realStopTime");
			return (Criteria) this;
		}

		public Criteria andRealStopTimeGreaterThan(Timestamp value) {
			addCriterion("real_stop_time >", value, "realStopTime");
			return (Criteria) this;
		}

		public Criteria andRealStopTimeGreaterThanOrEqualTo(Timestamp value) {
			addCriterion("real_stop_time >=", value, "realStopTime");
			return (Criteria) this;
		}

		public Criteria andRealStopTimeLessThan(Timestamp value) {
			addCriterion("real_stop_time <", value, "realStopTime");
			return (Criteria) this;
		}

		public Criteria andRealStopTimeLessThanOrEqualTo(Timestamp value) {
			addCriterion("real_stop_time <=", value, "realStopTime");
			return (Criteria) this;
		}

		public Criteria andRealStopTimeIn(List<Timestamp> values) {
			addCriterion("real_stop_time in", values, "realStopTime");
			return (Criteria) this;
		}

		public Criteria andRealStopTimeNotIn(List<Timestamp> values) {
			addCriterion("real_stop_time not in", values, "realStopTime");
			return (Criteria) this;
		}

		public Criteria andRealStopTimeBetween(Timestamp value1, Timestamp value2) {
			addCriterion("real_stop_time between", value1, value2, "realStopTime");
			return (Criteria) this;
		}

		public Criteria andRealStopTimeNotBetween(Timestamp value1, Timestamp value2) {
			addCriterion("real_stop_time not between", value1, value2, "realStopTime");
			return (Criteria) this;
		}

		public Criteria andStatusCodeIsNull() {
			addCriterion("status_code is null");
			return (Criteria) this;
		}

		public Criteria andStatusCodeIsNotNull() {
			addCriterion("status_code is not null");
			return (Criteria) this;
		}

		public Criteria andStatusCodeEqualTo(String value) {
			addCriterion("status_code =", value, "statusCode");
			return (Criteria) this;
		}

		public Criteria andStatusCodeNotEqualTo(String value) {
			addCriterion("status_code <>", value, "statusCode");
			return (Criteria) this;
		}

		public Criteria andStatusCodeGreaterThan(String value) {
			addCriterion("status_code >", value, "statusCode");
			return (Criteria) this;
		}

		public Criteria andStatusCodeGreaterThanOrEqualTo(String value) {
			addCriterion("status_code >=", value, "statusCode");
			return (Criteria) this;
		}

		public Criteria andStatusCodeLessThan(String value) {
			addCriterion("status_code <", value, "statusCode");
			return (Criteria) this;
		}

		public Criteria andStatusCodeLessThanOrEqualTo(String value) {
			addCriterion("status_code <=", value, "statusCode");
			return (Criteria) this;
		}

		public Criteria andStatusCodeLike(String value) {
			addCriterion("status_code like", value, "statusCode");
			return (Criteria) this;
		}

		public Criteria andStatusCodeNotLike(String value) {
			addCriterion("status_code not like", value, "statusCode");
			return (Criteria) this;
		}

		public Criteria andStatusCodeIn(List<String> values) {
			addCriterion("status_code in", values, "statusCode");
			return (Criteria) this;
		}

		public Criteria andStatusCodeNotIn(List<String> values) {
			addCriterion("status_code not in", values, "statusCode");
			return (Criteria) this;
		}

		public Criteria andStatusCodeBetween(String value1, String value2) {
			addCriterion("status_code between", value1, value2, "statusCode");
			return (Criteria) this;
		}

		public Criteria andStatusCodeNotBetween(String value1, String value2) {
			addCriterion("status_code not between", value1, value2, "statusCode");
			return (Criteria) this;
		}

		public Criteria andSuspendStateIsNull() {
			addCriterion("suspend_state is null");
			return (Criteria) this;
		}

		public Criteria andSuspendStateIsNotNull() {
			addCriterion("suspend_state is not null");
			return (Criteria) this;
		}

		public Criteria andSuspendStateEqualTo(String value) {
			addCriterion("suspend_state =", value, "suspendState");
			return (Criteria) this;
		}

		public Criteria andSuspendStateNotEqualTo(String value) {
			addCriterion("suspend_state <>", value, "suspendState");
			return (Criteria) this;
		}

		public Criteria andSuspendStateGreaterThan(String value) {
			addCriterion("suspend_state >", value, "suspendState");
			return (Criteria) this;
		}

		public Criteria andSuspendStateGreaterThanOrEqualTo(String value) {
			addCriterion("suspend_state >=", value, "suspendState");
			return (Criteria) this;
		}

		public Criteria andSuspendStateLessThan(String value) {
			addCriterion("suspend_state <", value, "suspendState");
			return (Criteria) this;
		}

		public Criteria andSuspendStateLessThanOrEqualTo(String value) {
			addCriterion("suspend_state <=", value, "suspendState");
			return (Criteria) this;
		}

		public Criteria andSuspendStateLike(String value) {
			addCriterion("suspend_state like", value, "suspendState");
			return (Criteria) this;
		}

		public Criteria andSuspendStateNotLike(String value) {
			addCriterion("suspend_state not like", value, "suspendState");
			return (Criteria) this;
		}

		public Criteria andSuspendStateIn(List<String> values) {
			addCriterion("suspend_state in", values, "suspendState");
			return (Criteria) this;
		}

		public Criteria andSuspendStateNotIn(List<String> values) {
			addCriterion("suspend_state not in", values, "suspendState");
			return (Criteria) this;
		}

		public Criteria andSuspendStateBetween(String value1, String value2) {
			addCriterion("suspend_state between", value1, value2, "suspendState");
			return (Criteria) this;
		}

		public Criteria andSuspendStateNotBetween(String value1, String value2) {
			addCriterion("suspend_state not between", value1, value2, "suspendState");
			return (Criteria) this;
		}

		public Criteria andCreateUserIdIsNull() {
			addCriterion("create_user_id is null");
			return (Criteria) this;
		}

		public Criteria andCreateUserIdIsNotNull() {
			addCriterion("create_user_id is not null");
			return (Criteria) this;
		}

		public Criteria andCreateUserIdEqualTo(String value) {
			addCriterion("create_user_id =", value, "createUserId");
			return (Criteria) this;
		}

		public Criteria andCreateUserIdNotEqualTo(String value) {
			addCriterion("create_user_id <>", value, "createUserId");
			return (Criteria) this;
		}

		public Criteria andCreateUserIdGreaterThan(String value) {
			addCriterion("create_user_id >", value, "createUserId");
			return (Criteria) this;
		}

		public Criteria andCreateUserIdGreaterThanOrEqualTo(String value) {
			addCriterion("create_user_id >=", value, "createUserId");
			return (Criteria) this;
		}

		public Criteria andCreateUserIdLessThan(String value) {
			addCriterion("create_user_id <", value, "createUserId");
			return (Criteria) this;
		}

		public Criteria andCreateUserIdLessThanOrEqualTo(String value) {
			addCriterion("create_user_id <=", value, "createUserId");
			return (Criteria) this;
		}

		public Criteria andCreateUserIdLike(String value) {
			addCriterion("create_user_id like", value, "createUserId");
			return (Criteria) this;
		}

		public Criteria andCreateUserIdNotLike(String value) {
			addCriterion("create_user_id not like", value, "createUserId");
			return (Criteria) this;
		}

		public Criteria andCreateUserIdIn(List<String> values) {
			addCriterion("create_user_id in", values, "createUserId");
			return (Criteria) this;
		}

		public Criteria andCreateUserIdNotIn(List<String> values) {
			addCriterion("create_user_id not in", values, "createUserId");
			return (Criteria) this;
		}

		public Criteria andCreateUserIdBetween(String value1, String value2) {
			addCriterion("create_user_id between", value1, value2, "createUserId");
			return (Criteria) this;
		}

		public Criteria andCreateUserIdNotBetween(String value1, String value2) {
			addCriterion("create_user_id not between", value1, value2, "createUserId");
			return (Criteria) this;
		}

		public Criteria andPreTaskIdIsNull() {
			addCriterion("pre_task_id is null");
			return (Criteria) this;
		}

		public Criteria andPreTaskIdIsNotNull() {
			addCriterion("pre_task_id is not null");
			return (Criteria) this;
		}

		public Criteria andPreTaskIdEqualTo(String value) {
			addCriterion("pre_task_id =", value, "preTaskId");
			return (Criteria) this;
		}

		public Criteria andPreTaskIdNotEqualTo(String value) {
			addCriterion("pre_task_id <>", value, "preTaskId");
			return (Criteria) this;
		}

		public Criteria andPreTaskIdGreaterThan(String value) {
			addCriterion("pre_task_id >", value, "preTaskId");
			return (Criteria) this;
		}

		public Criteria andPreTaskIdGreaterThanOrEqualTo(String value) {
			addCriterion("pre_task_id >=", value, "preTaskId");
			return (Criteria) this;
		}

		public Criteria andPreTaskIdLessThan(String value) {
			addCriterion("pre_task_id <", value, "preTaskId");
			return (Criteria) this;
		}

		public Criteria andPreTaskIdLessThanOrEqualTo(String value) {
			addCriterion("pre_task_id <=", value, "preTaskId");
			return (Criteria) this;
		}

		public Criteria andPreTaskIdLike(String value) {
			addCriterion("pre_task_id like", value, "preTaskId");
			return (Criteria) this;
		}

		public Criteria andPreTaskIdNotLike(String value) {
			addCriterion("pre_task_id not like", value, "preTaskId");
			return (Criteria) this;
		}

		public Criteria andPreTaskIdIn(List<String> values) {
			addCriterion("pre_task_id in", values, "preTaskId");
			return (Criteria) this;
		}

		public Criteria andPreTaskIdNotIn(List<String> values) {
			addCriterion("pre_task_id not in", values, "preTaskId");
			return (Criteria) this;
		}

		public Criteria andPreTaskIdBetween(String value1, String value2) {
			addCriterion("pre_task_id between", value1, value2, "preTaskId");
			return (Criteria) this;
		}

		public Criteria andPreTaskIdNotBetween(String value1, String value2) {
			addCriterion("pre_task_id not between", value1, value2, "preTaskId");
			return (Criteria) this;
		}

		public Criteria andTimeTotalIsNull() {
			addCriterion("time_total is null");
			return (Criteria) this;
		}

		public Criteria andTimeTotalIsNotNull() {
			addCriterion("time_total is not null");
			return (Criteria) this;
		}

		public Criteria andTimeTotalEqualTo(Integer value) {
			addCriterion("time_total =", value, "timeTotal");
			return (Criteria) this;
		}

		public Criteria andTimeTotalNotEqualTo(Integer value) {
			addCriterion("time_total <>", value, "timeTotal");
			return (Criteria) this;
		}

		public Criteria andTimeTotalGreaterThan(Integer value) {
			addCriterion("time_total >", value, "timeTotal");
			return (Criteria) this;
		}

		public Criteria andTimeTotalGreaterThanOrEqualTo(Integer value) {
			addCriterion("time_total >=", value, "timeTotal");
			return (Criteria) this;
		}

		public Criteria andTimeTotalLessThan(Integer value) {
			addCriterion("time_total <", value, "timeTotal");
			return (Criteria) this;
		}

		public Criteria andTimeTotalLessThanOrEqualTo(Integer value) {
			addCriterion("time_total <=", value, "timeTotal");
			return (Criteria) this;
		}

		public Criteria andTimeTotalIn(List<Integer> values) {
			addCriterion("time_total in", values, "timeTotal");
			return (Criteria) this;
		}

		public Criteria andTimeTotalNotIn(List<Integer> values) {
			addCriterion("time_total not in", values, "timeTotal");
			return (Criteria) this;
		}

		public Criteria andTimeTotalBetween(Integer value1, Integer value2) {
			addCriterion("time_total between", value1, value2, "timeTotal");
			return (Criteria) this;
		}

		public Criteria andTimeTotalNotBetween(Integer value1, Integer value2) {
			addCriterion("time_total not between", value1, value2, "timeTotal");
			return (Criteria) this;
		}

		public Criteria andDescriptionIsNull() {
			addCriterion("description is null");
			return (Criteria) this;
		}

		public Criteria andDescriptionIsNotNull() {
			addCriterion("description is not null");
			return (Criteria) this;
		}

		public Criteria andDescriptionEqualTo(String value) {
			addCriterion("description =", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotEqualTo(String value) {
			addCriterion("description <>", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionGreaterThan(String value) {
			addCriterion("description >", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
			addCriterion("description >=", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLessThan(String value) {
			addCriterion("description <", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLessThanOrEqualTo(String value) {
			addCriterion("description <=", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLike(String value) {
			addCriterion("description like", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotLike(String value) {
			addCriterion("description not like", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionIn(List<String> values) {
			addCriterion("description in", values, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotIn(List<String> values) {
			addCriterion("description not in", values, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionBetween(String value1, String value2) {
			addCriterion("description between", value1, value2, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotBetween(String value1, String value2) {
			addCriterion("description not between", value1, value2, "description");
			return (Criteria) this;
		}

		public Criteria andTaskRequireIsNull() {
			addCriterion("task_require is null");
			return (Criteria) this;
		}

		public Criteria andTaskRequireIsNotNull() {
			addCriterion("task_require is not null");
			return (Criteria) this;
		}

		public Criteria andTaskRequireEqualTo(String value) {
			addCriterion("task_require =", value, "taskRequire");
			return (Criteria) this;
		}

		public Criteria andTaskRequireNotEqualTo(String value) {
			addCriterion("task_require <>", value, "taskRequire");
			return (Criteria) this;
		}

		public Criteria andTaskRequireGreaterThan(String value) {
			addCriterion("task_require >", value, "taskRequire");
			return (Criteria) this;
		}

		public Criteria andTaskRequireGreaterThanOrEqualTo(String value) {
			addCriterion("task_require >=", value, "taskRequire");
			return (Criteria) this;
		}

		public Criteria andTaskRequireLessThan(String value) {
			addCriterion("task_require <", value, "taskRequire");
			return (Criteria) this;
		}

		public Criteria andTaskRequireLessThanOrEqualTo(String value) {
			addCriterion("task_require <=", value, "taskRequire");
			return (Criteria) this;
		}

		public Criteria andTaskRequireLike(String value) {
			addCriterion("task_require like", value, "taskRequire");
			return (Criteria) this;
		}

		public Criteria andTaskRequireNotLike(String value) {
			addCriterion("task_require not like", value, "taskRequire");
			return (Criteria) this;
		}

		public Criteria andTaskRequireIn(List<String> values) {
			addCriterion("task_require in", values, "taskRequire");
			return (Criteria) this;
		}

		public Criteria andTaskRequireNotIn(List<String> values) {
			addCriterion("task_require not in", values, "taskRequire");
			return (Criteria) this;
		}

		public Criteria andTaskRequireBetween(String value1, String value2) {
			addCriterion("task_require between", value1, value2, "taskRequire");
			return (Criteria) this;
		}

		public Criteria andTaskRequireNotBetween(String value1, String value2) {
			addCriterion("task_require not between", value1, value2, "taskRequire");
			return (Criteria) this;
		}

		public Criteria andSlaCodeIsNull() {
			addCriterion("sla_code is null");
			return (Criteria) this;
		}

		public Criteria andSlaCodeIsNotNull() {
			addCriterion("sla_code is not null");
			return (Criteria) this;
		}

		public Criteria andSlaCodeEqualTo(String value) {
			addCriterion("sla_code =", value, "slaCode");
			return (Criteria) this;
		}

		public Criteria andSlaCodeNotEqualTo(String value) {
			addCriterion("sla_code <>", value, "slaCode");
			return (Criteria) this;
		}

		public Criteria andSlaCodeGreaterThan(String value) {
			addCriterion("sla_code >", value, "slaCode");
			return (Criteria) this;
		}

		public Criteria andSlaCodeGreaterThanOrEqualTo(String value) {
			addCriterion("sla_code >=", value, "slaCode");
			return (Criteria) this;
		}

		public Criteria andSlaCodeLessThan(String value) {
			addCriterion("sla_code <", value, "slaCode");
			return (Criteria) this;
		}

		public Criteria andSlaCodeLessThanOrEqualTo(String value) {
			addCriterion("sla_code <=", value, "slaCode");
			return (Criteria) this;
		}

		public Criteria andSlaCodeLike(String value) {
			addCriterion("sla_code like", value, "slaCode");
			return (Criteria) this;
		}

		public Criteria andSlaCodeNotLike(String value) {
			addCriterion("sla_code not like", value, "slaCode");
			return (Criteria) this;
		}

		public Criteria andSlaCodeIn(List<String> values) {
			addCriterion("sla_code in", values, "slaCode");
			return (Criteria) this;
		}

		public Criteria andSlaCodeNotIn(List<String> values) {
			addCriterion("sla_code not in", values, "slaCode");
			return (Criteria) this;
		}

		public Criteria andSlaCodeBetween(String value1, String value2) {
			addCriterion("sla_code between", value1, value2, "slaCode");
			return (Criteria) this;
		}

		public Criteria andSlaCodeNotBetween(String value1, String value2) {
			addCriterion("sla_code not between", value1, value2, "slaCode");
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

		public Criteria andLastBugGroupIsNull() {
			addCriterion("last_bug_group is null");
			return (Criteria) this;
		}

		public Criteria andLastBugGroupIsNotNull() {
			addCriterion("last_bug_group is not null");
			return (Criteria) this;
		}

		public Criteria andLastBugGroupEqualTo(String value) {
			addCriterion("last_bug_group =", value, "lastBugGroup");
			return (Criteria) this;
		}

		public Criteria andLastBugGroupNotEqualTo(String value) {
			addCriterion("last_bug_group <>", value, "lastBugGroup");
			return (Criteria) this;
		}

		public Criteria andLastBugGroupGreaterThan(String value) {
			addCriterion("last_bug_group >", value, "lastBugGroup");
			return (Criteria) this;
		}

		public Criteria andLastBugGroupGreaterThanOrEqualTo(String value) {
			addCriterion("last_bug_group >=", value, "lastBugGroup");
			return (Criteria) this;
		}

		public Criteria andLastBugGroupLessThan(String value) {
			addCriterion("last_bug_group <", value, "lastBugGroup");
			return (Criteria) this;
		}

		public Criteria andLastBugGroupLessThanOrEqualTo(String value) {
			addCriterion("last_bug_group <=", value, "lastBugGroup");
			return (Criteria) this;
		}

		public Criteria andLastBugGroupLike(String value) {
			addCriterion("last_bug_group like", value, "lastBugGroup");
			return (Criteria) this;
		}

		public Criteria andLastBugGroupNotLike(String value) {
			addCriterion("last_bug_group not like", value, "lastBugGroup");
			return (Criteria) this;
		}

		public Criteria andLastBugGroupIn(List<String> values) {
			addCriterion("last_bug_group in", values, "lastBugGroup");
			return (Criteria) this;
		}

		public Criteria andLastBugGroupNotIn(List<String> values) {
			addCriterion("last_bug_group not in", values, "lastBugGroup");
			return (Criteria) this;
		}

		public Criteria andLastBugGroupBetween(String value1, String value2) {
			addCriterion("last_bug_group between", value1, value2, "lastBugGroup");
			return (Criteria) this;
		}

		public Criteria andLastBugGroupNotBetween(String value1, String value2) {
			addCriterion("last_bug_group not between", value1, value2, "lastBugGroup");
			return (Criteria) this;
		}

		public Criteria andOprUidIsNull() {
			addCriterion("opr_uid is null");
			return (Criteria) this;
		}

		public Criteria andOprUidIsNotNull() {
			addCriterion("opr_uid is not null");
			return (Criteria) this;
		}

		public Criteria andOprUidEqualTo(String value) {
			addCriterion("opr_uid =", value, "oprUid");
			return (Criteria) this;
		}

		public Criteria andOprUidNotEqualTo(String value) {
			addCriterion("opr_uid <>", value, "oprUid");
			return (Criteria) this;
		}

		public Criteria andOprUidGreaterThan(String value) {
			addCriterion("opr_uid >", value, "oprUid");
			return (Criteria) this;
		}

		public Criteria andOprUidGreaterThanOrEqualTo(String value) {
			addCriterion("opr_uid >=", value, "oprUid");
			return (Criteria) this;
		}

		public Criteria andOprUidLessThan(String value) {
			addCriterion("opr_uid <", value, "oprUid");
			return (Criteria) this;
		}

		public Criteria andOprUidLessThanOrEqualTo(String value) {
			addCriterion("opr_uid <=", value, "oprUid");
			return (Criteria) this;
		}

		public Criteria andOprUidLike(String value) {
			addCriterion("opr_uid like", value, "oprUid");
			return (Criteria) this;
		}

		public Criteria andOprUidNotLike(String value) {
			addCriterion("opr_uid not like", value, "oprUid");
			return (Criteria) this;
		}

		public Criteria andOprUidIn(List<String> values) {
			addCriterion("opr_uid in", values, "oprUid");
			return (Criteria) this;
		}

		public Criteria andOprUidNotIn(List<String> values) {
			addCriterion("opr_uid not in", values, "oprUid");
			return (Criteria) this;
		}

		public Criteria andOprUidBetween(String value1, String value2) {
			addCriterion("opr_uid between", value1, value2, "oprUid");
			return (Criteria) this;
		}

		public Criteria andOprUidNotBetween(String value1, String value2) {
			addCriterion("opr_uid not between", value1, value2, "oprUid");
			return (Criteria) this;
		}

		public Criteria andOprUnameIsNull() {
			addCriterion("opr_uname is null");
			return (Criteria) this;
		}

		public Criteria andOprUnameIsNotNull() {
			addCriterion("opr_uname is not null");
			return (Criteria) this;
		}

		public Criteria andOprUnameEqualTo(String value) {
			addCriterion("opr_uname =", value, "oprUname");
			return (Criteria) this;
		}

		public Criteria andOprUnameNotEqualTo(String value) {
			addCriterion("opr_uname <>", value, "oprUname");
			return (Criteria) this;
		}

		public Criteria andOprUnameGreaterThan(String value) {
			addCriterion("opr_uname >", value, "oprUname");
			return (Criteria) this;
		}

		public Criteria andOprUnameGreaterThanOrEqualTo(String value) {
			addCriterion("opr_uname >=", value, "oprUname");
			return (Criteria) this;
		}

		public Criteria andOprUnameLessThan(String value) {
			addCriterion("opr_uname <", value, "oprUname");
			return (Criteria) this;
		}

		public Criteria andOprUnameLessThanOrEqualTo(String value) {
			addCriterion("opr_uname <=", value, "oprUname");
			return (Criteria) this;
		}

		public Criteria andOprUnameLike(String value) {
			addCriterion("opr_uname like", value, "oprUname");
			return (Criteria) this;
		}

		public Criteria andOprUnameNotLike(String value) {
			addCriterion("opr_uname not like", value, "oprUname");
			return (Criteria) this;
		}

		public Criteria andOprUnameIn(List<String> values) {
			addCriterion("opr_uname in", values, "oprUname");
			return (Criteria) this;
		}

		public Criteria andOprUnameNotIn(List<String> values) {
			addCriterion("opr_uname not in", values, "oprUname");
			return (Criteria) this;
		}

		public Criteria andOprUnameBetween(String value1, String value2) {
			addCriterion("opr_uname between", value1, value2, "oprUname");
			return (Criteria) this;
		}

		public Criteria andOprUnameNotBetween(String value1, String value2) {
			addCriterion("opr_uname not between", value1, value2, "oprUname");
			return (Criteria) this;
		}

		public Criteria andLastSubmitTimeIsNull() {
			addCriterion("last_submit_time is null");
			return (Criteria) this;
		}

		public Criteria andLastSubmitTimeIsNotNull() {
			addCriterion("last_submit_time is not null");
			return (Criteria) this;
		}

		public Criteria andLastSubmitTimeEqualTo(Timestamp value) {
			addCriterion("last_submit_time =", value, "lastSubmitTime");
			return (Criteria) this;
		}

		public Criteria andLastSubmitTimeNotEqualTo(Timestamp value) {
			addCriterion("last_submit_time <>", value, "lastSubmitTime");
			return (Criteria) this;
		}

		public Criteria andLastSubmitTimeGreaterThan(Timestamp value) {
			addCriterion("last_submit_time >", value, "lastSubmitTime");
			return (Criteria) this;
		}

		public Criteria andLastSubmitTimeGreaterThanOrEqualTo(Timestamp value) {
			addCriterion("last_submit_time >=", value, "lastSubmitTime");
			return (Criteria) this;
		}

		public Criteria andLastSubmitTimeLessThan(Timestamp value) {
			addCriterion("last_submit_time <", value, "lastSubmitTime");
			return (Criteria) this;
		}

		public Criteria andLastSubmitTimeLessThanOrEqualTo(Timestamp value) {
			addCriterion("last_submit_time <=", value, "lastSubmitTime");
			return (Criteria) this;
		}

		public Criteria andLastSubmitTimeIn(List<Timestamp> values) {
			addCriterion("last_submit_time in", values, "lastSubmitTime");
			return (Criteria) this;
		}

		public Criteria andLastSubmitTimeNotIn(List<Timestamp> values) {
			addCriterion("last_submit_time not in", values, "lastSubmitTime");
			return (Criteria) this;
		}

		public Criteria andLastSubmitTimeBetween(Timestamp value1, Timestamp value2) {
			addCriterion("last_submit_time between", value1, value2, "lastSubmitTime");
			return (Criteria) this;
		}

		public Criteria andLastSubmitTimeNotBetween(Timestamp value1, Timestamp value2) {
			addCriterion("last_submit_time not between", value1, value2, "lastSubmitTime");
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

		public Criteria andFinishDescriptionIsNull() {
			addCriterion("finish_description is null");
			return (Criteria) this;
		}

		public Criteria andFinishDescriptionIsNotNull() {
			addCriterion("finish_description is not null");
			return (Criteria) this;
		}

		public Criteria andFinishDescriptionEqualTo(String value) {
			addCriterion("finish_description =", value, "finishDescription");
			return (Criteria) this;
		}

		public Criteria andFinishDescriptionNotEqualTo(String value) {
			addCriterion("finish_description <>", value, "finishDescription");
			return (Criteria) this;
		}

		public Criteria andFinishDescriptionGreaterThan(String value) {
			addCriterion("finish_description >", value, "finishDescription");
			return (Criteria) this;
		}

		public Criteria andFinishDescriptionGreaterThanOrEqualTo(String value) {
			addCriterion("finish_description >=", value, "finishDescription");
			return (Criteria) this;
		}

		public Criteria andFinishDescriptionLessThan(String value) {
			addCriterion("finish_description <", value, "finishDescription");
			return (Criteria) this;
		}

		public Criteria andFinishDescriptionLessThanOrEqualTo(String value) {
			addCriterion("finish_description <=", value, "finishDescription");
			return (Criteria) this;
		}

		public Criteria andFinishDescriptionLike(String value) {
			addCriterion("finish_description like", value, "finishDescription");
			return (Criteria) this;
		}

		public Criteria andFinishDescriptionNotLike(String value) {
			addCriterion("finish_description not like", value, "finishDescription");
			return (Criteria) this;
		}

		public Criteria andFinishDescriptionIn(List<String> values) {
			addCriterion("finish_description in", values, "finishDescription");
			return (Criteria) this;
		}

		public Criteria andFinishDescriptionNotIn(List<String> values) {
			addCriterion("finish_description not in", values, "finishDescription");
			return (Criteria) this;
		}

		public Criteria andFinishDescriptionBetween(String value1, String value2) {
			addCriterion("finish_description between", value1, value2, "finishDescription");
			return (Criteria) this;
		}

		public Criteria andFinishDescriptionNotBetween(String value1, String value2) {
			addCriterion("finish_description not between", value1, value2, "finishDescription");
			return (Criteria) this;
		}
	}

	/**
	 * task_info
	 *
	 * @mbg.generated do_not_delete_during_merge
	 */
	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	/**
	 * task_info null
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