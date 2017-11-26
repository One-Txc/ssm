package txc.xxy.ssm.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class WorkExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public WorkExample() {
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
	 * work null
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

		public Criteria andWorkIdIsNull() {
			addCriterion("work_id is null");
			return (Criteria) this;
		}

		public Criteria andWorkIdIsNotNull() {
			addCriterion("work_id is not null");
			return (Criteria) this;
		}

		public Criteria andWorkIdEqualTo(String value) {
			addCriterion("work_id =", value, "workId");
			return (Criteria) this;
		}

		public Criteria andWorkIdNotEqualTo(String value) {
			addCriterion("work_id <>", value, "workId");
			return (Criteria) this;
		}

		public Criteria andWorkIdGreaterThan(String value) {
			addCriterion("work_id >", value, "workId");
			return (Criteria) this;
		}

		public Criteria andWorkIdGreaterThanOrEqualTo(String value) {
			addCriterion("work_id >=", value, "workId");
			return (Criteria) this;
		}

		public Criteria andWorkIdLessThan(String value) {
			addCriterion("work_id <", value, "workId");
			return (Criteria) this;
		}

		public Criteria andWorkIdLessThanOrEqualTo(String value) {
			addCriterion("work_id <=", value, "workId");
			return (Criteria) this;
		}

		public Criteria andWorkIdLike(String value) {
			addCriterion("work_id like", value, "workId");
			return (Criteria) this;
		}

		public Criteria andWorkIdNotLike(String value) {
			addCriterion("work_id not like", value, "workId");
			return (Criteria) this;
		}

		public Criteria andWorkIdIn(List<String> values) {
			addCriterion("work_id in", values, "workId");
			return (Criteria) this;
		}

		public Criteria andWorkIdNotIn(List<String> values) {
			addCriterion("work_id not in", values, "workId");
			return (Criteria) this;
		}

		public Criteria andWorkIdBetween(String value1, String value2) {
			addCriterion("work_id between", value1, value2, "workId");
			return (Criteria) this;
		}

		public Criteria andWorkIdNotBetween(String value1, String value2) {
			addCriterion("work_id not between", value1, value2, "workId");
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

		public Criteria andTitleIsNull() {
			addCriterion("title is null");
			return (Criteria) this;
		}

		public Criteria andTitleIsNotNull() {
			addCriterion("title is not null");
			return (Criteria) this;
		}

		public Criteria andTitleEqualTo(String value) {
			addCriterion("title =", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotEqualTo(String value) {
			addCriterion("title <>", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThan(String value) {
			addCriterion("title >", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThanOrEqualTo(String value) {
			addCriterion("title >=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLessThan(String value) {
			addCriterion("title <", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLessThanOrEqualTo(String value) {
			addCriterion("title <=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLike(String value) {
			addCriterion("title like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotLike(String value) {
			addCriterion("title not like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleIn(List<String> values) {
			addCriterion("title in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotIn(List<String> values) {
			addCriterion("title not in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleBetween(String value1, String value2) {
			addCriterion("title between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotBetween(String value1, String value2) {
			addCriterion("title not between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andWorkPercentIsNull() {
			addCriterion("work_percent is null");
			return (Criteria) this;
		}

		public Criteria andWorkPercentIsNotNull() {
			addCriterion("work_percent is not null");
			return (Criteria) this;
		}

		public Criteria andWorkPercentEqualTo(String value) {
			addCriterion("work_percent =", value, "workPercent");
			return (Criteria) this;
		}

		public Criteria andWorkPercentNotEqualTo(String value) {
			addCriterion("work_percent <>", value, "workPercent");
			return (Criteria) this;
		}

		public Criteria andWorkPercentGreaterThan(String value) {
			addCriterion("work_percent >", value, "workPercent");
			return (Criteria) this;
		}

		public Criteria andWorkPercentGreaterThanOrEqualTo(String value) {
			addCriterion("work_percent >=", value, "workPercent");
			return (Criteria) this;
		}

		public Criteria andWorkPercentLessThan(String value) {
			addCriterion("work_percent <", value, "workPercent");
			return (Criteria) this;
		}

		public Criteria andWorkPercentLessThanOrEqualTo(String value) {
			addCriterion("work_percent <=", value, "workPercent");
			return (Criteria) this;
		}

		public Criteria andWorkPercentLike(String value) {
			addCriterion("work_percent like", value, "workPercent");
			return (Criteria) this;
		}

		public Criteria andWorkPercentNotLike(String value) {
			addCriterion("work_percent not like", value, "workPercent");
			return (Criteria) this;
		}

		public Criteria andWorkPercentIn(List<String> values) {
			addCriterion("work_percent in", values, "workPercent");
			return (Criteria) this;
		}

		public Criteria andWorkPercentNotIn(List<String> values) {
			addCriterion("work_percent not in", values, "workPercent");
			return (Criteria) this;
		}

		public Criteria andWorkPercentBetween(String value1, String value2) {
			addCriterion("work_percent between", value1, value2, "workPercent");
			return (Criteria) this;
		}

		public Criteria andWorkPercentNotBetween(String value1, String value2) {
			addCriterion("work_percent not between", value1, value2, "workPercent");
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

		public Criteria andRequireIsNull() {
			addCriterion("require is null");
			return (Criteria) this;
		}

		public Criteria andRequireIsNotNull() {
			addCriterion("require is not null");
			return (Criteria) this;
		}

		public Criteria andRequireEqualTo(String value) {
			addCriterion("require =", value, "require");
			return (Criteria) this;
		}

		public Criteria andRequireNotEqualTo(String value) {
			addCriterion("require <>", value, "require");
			return (Criteria) this;
		}

		public Criteria andRequireGreaterThan(String value) {
			addCriterion("require >", value, "require");
			return (Criteria) this;
		}

		public Criteria andRequireGreaterThanOrEqualTo(String value) {
			addCriterion("require >=", value, "require");
			return (Criteria) this;
		}

		public Criteria andRequireLessThan(String value) {
			addCriterion("require <", value, "require");
			return (Criteria) this;
		}

		public Criteria andRequireLessThanOrEqualTo(String value) {
			addCriterion("require <=", value, "require");
			return (Criteria) this;
		}

		public Criteria andRequireLike(String value) {
			addCriterion("require like", value, "require");
			return (Criteria) this;
		}

		public Criteria andRequireNotLike(String value) {
			addCriterion("require not like", value, "require");
			return (Criteria) this;
		}

		public Criteria andRequireIn(List<String> values) {
			addCriterion("require in", values, "require");
			return (Criteria) this;
		}

		public Criteria andRequireNotIn(List<String> values) {
			addCriterion("require not in", values, "require");
			return (Criteria) this;
		}

		public Criteria andRequireBetween(String value1, String value2) {
			addCriterion("require between", value1, value2, "require");
			return (Criteria) this;
		}

		public Criteria andRequireNotBetween(String value1, String value2) {
			addCriterion("require not between", value1, value2, "require");
			return (Criteria) this;
		}

		public Criteria andContentIsNull() {
			addCriterion("content is null");
			return (Criteria) this;
		}

		public Criteria andContentIsNotNull() {
			addCriterion("content is not null");
			return (Criteria) this;
		}

		public Criteria andContentEqualTo(String value) {
			addCriterion("content =", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotEqualTo(String value) {
			addCriterion("content <>", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentGreaterThan(String value) {
			addCriterion("content >", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentGreaterThanOrEqualTo(String value) {
			addCriterion("content >=", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentLessThan(String value) {
			addCriterion("content <", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentLessThanOrEqualTo(String value) {
			addCriterion("content <=", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentLike(String value) {
			addCriterion("content like", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotLike(String value) {
			addCriterion("content not like", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentIn(List<String> values) {
			addCriterion("content in", values, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotIn(List<String> values) {
			addCriterion("content not in", values, "content");
			return (Criteria) this;
		}

		public Criteria andContentBetween(String value1, String value2) {
			addCriterion("content between", value1, value2, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotBetween(String value1, String value2) {
			addCriterion("content not between", value1, value2, "content");
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

		public Criteria andCreateUnameIsNull() {
			addCriterion("create_uname is null");
			return (Criteria) this;
		}

		public Criteria andCreateUnameIsNotNull() {
			addCriterion("create_uname is not null");
			return (Criteria) this;
		}

		public Criteria andCreateUnameEqualTo(String value) {
			addCriterion("create_uname =", value, "createUname");
			return (Criteria) this;
		}

		public Criteria andCreateUnameNotEqualTo(String value) {
			addCriterion("create_uname <>", value, "createUname");
			return (Criteria) this;
		}

		public Criteria andCreateUnameGreaterThan(String value) {
			addCriterion("create_uname >", value, "createUname");
			return (Criteria) this;
		}

		public Criteria andCreateUnameGreaterThanOrEqualTo(String value) {
			addCriterion("create_uname >=", value, "createUname");
			return (Criteria) this;
		}

		public Criteria andCreateUnameLessThan(String value) {
			addCriterion("create_uname <", value, "createUname");
			return (Criteria) this;
		}

		public Criteria andCreateUnameLessThanOrEqualTo(String value) {
			addCriterion("create_uname <=", value, "createUname");
			return (Criteria) this;
		}

		public Criteria andCreateUnameLike(String value) {
			addCriterion("create_uname like", value, "createUname");
			return (Criteria) this;
		}

		public Criteria andCreateUnameNotLike(String value) {
			addCriterion("create_uname not like", value, "createUname");
			return (Criteria) this;
		}

		public Criteria andCreateUnameIn(List<String> values) {
			addCriterion("create_uname in", values, "createUname");
			return (Criteria) this;
		}

		public Criteria andCreateUnameNotIn(List<String> values) {
			addCriterion("create_uname not in", values, "createUname");
			return (Criteria) this;
		}

		public Criteria andCreateUnameBetween(String value1, String value2) {
			addCriterion("create_uname between", value1, value2, "createUname");
			return (Criteria) this;
		}

		public Criteria andCreateUnameNotBetween(String value1, String value2) {
			addCriterion("create_uname not between", value1, value2, "createUname");
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

		public Criteria andStartTimeIsNull() {
			addCriterion("start_time is null");
			return (Criteria) this;
		}

		public Criteria andStartTimeIsNotNull() {
			addCriterion("start_time is not null");
			return (Criteria) this;
		}

		public Criteria andStartTimeEqualTo(Timestamp value) {
			addCriterion("start_time =", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeNotEqualTo(Timestamp value) {
			addCriterion("start_time <>", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeGreaterThan(Timestamp value) {
			addCriterion("start_time >", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeGreaterThanOrEqualTo(Timestamp value) {
			addCriterion("start_time >=", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeLessThan(Timestamp value) {
			addCriterion("start_time <", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeLessThanOrEqualTo(Timestamp value) {
			addCriterion("start_time <=", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeIn(List<Timestamp> values) {
			addCriterion("start_time in", values, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeNotIn(List<Timestamp> values) {
			addCriterion("start_time not in", values, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeBetween(Timestamp value1, Timestamp value2) {
			addCriterion("start_time between", value1, value2, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeNotBetween(Timestamp value1, Timestamp value2) {
			addCriterion("start_time not between", value1, value2, "startTime");
			return (Criteria) this;
		}

		public Criteria andFinishTimeIsNull() {
			addCriterion("finish_time is null");
			return (Criteria) this;
		}

		public Criteria andFinishTimeIsNotNull() {
			addCriterion("finish_time is not null");
			return (Criteria) this;
		}

		public Criteria andFinishTimeEqualTo(Timestamp value) {
			addCriterion("finish_time =", value, "finishTime");
			return (Criteria) this;
		}

		public Criteria andFinishTimeNotEqualTo(Timestamp value) {
			addCriterion("finish_time <>", value, "finishTime");
			return (Criteria) this;
		}

		public Criteria andFinishTimeGreaterThan(Timestamp value) {
			addCriterion("finish_time >", value, "finishTime");
			return (Criteria) this;
		}

		public Criteria andFinishTimeGreaterThanOrEqualTo(Timestamp value) {
			addCriterion("finish_time >=", value, "finishTime");
			return (Criteria) this;
		}

		public Criteria andFinishTimeLessThan(Timestamp value) {
			addCriterion("finish_time <", value, "finishTime");
			return (Criteria) this;
		}

		public Criteria andFinishTimeLessThanOrEqualTo(Timestamp value) {
			addCriterion("finish_time <=", value, "finishTime");
			return (Criteria) this;
		}

		public Criteria andFinishTimeIn(List<Timestamp> values) {
			addCriterion("finish_time in", values, "finishTime");
			return (Criteria) this;
		}

		public Criteria andFinishTimeNotIn(List<Timestamp> values) {
			addCriterion("finish_time not in", values, "finishTime");
			return (Criteria) this;
		}

		public Criteria andFinishTimeBetween(Timestamp value1, Timestamp value2) {
			addCriterion("finish_time between", value1, value2, "finishTime");
			return (Criteria) this;
		}

		public Criteria andFinishTimeNotBetween(Timestamp value1, Timestamp value2) {
			addCriterion("finish_time not between", value1, value2, "finishTime");
			return (Criteria) this;
		}

		public Criteria andSubmitTimeIsNull() {
			addCriterion("submit_time is null");
			return (Criteria) this;
		}

		public Criteria andSubmitTimeIsNotNull() {
			addCriterion("submit_time is not null");
			return (Criteria) this;
		}

		public Criteria andSubmitTimeEqualTo(Timestamp value) {
			addCriterion("submit_time =", value, "submitTime");
			return (Criteria) this;
		}

		public Criteria andSubmitTimeNotEqualTo(Timestamp value) {
			addCriterion("submit_time <>", value, "submitTime");
			return (Criteria) this;
		}

		public Criteria andSubmitTimeGreaterThan(Timestamp value) {
			addCriterion("submit_time >", value, "submitTime");
			return (Criteria) this;
		}

		public Criteria andSubmitTimeGreaterThanOrEqualTo(Timestamp value) {
			addCriterion("submit_time >=", value, "submitTime");
			return (Criteria) this;
		}

		public Criteria andSubmitTimeLessThan(Timestamp value) {
			addCriterion("submit_time <", value, "submitTime");
			return (Criteria) this;
		}

		public Criteria andSubmitTimeLessThanOrEqualTo(Timestamp value) {
			addCriterion("submit_time <=", value, "submitTime");
			return (Criteria) this;
		}

		public Criteria andSubmitTimeIn(List<Timestamp> values) {
			addCriterion("submit_time in", values, "submitTime");
			return (Criteria) this;
		}

		public Criteria andSubmitTimeNotIn(List<Timestamp> values) {
			addCriterion("submit_time not in", values, "submitTime");
			return (Criteria) this;
		}

		public Criteria andSubmitTimeBetween(Timestamp value1, Timestamp value2) {
			addCriterion("submit_time between", value1, value2, "submitTime");
			return (Criteria) this;
		}

		public Criteria andSubmitTimeNotBetween(Timestamp value1, Timestamp value2) {
			addCriterion("submit_time not between", value1, value2, "submitTime");
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
	 * work
	 *
	 * @mbg.generated do_not_delete_during_merge
	 */
	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	/**
	 * work null
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