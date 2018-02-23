package txc.xyz.base.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class BaseOrgExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public BaseOrgExample() {
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
	 * base_org null
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

		public Criteria andOrgIdIsNull() {
			addCriterion("org_id is null");
			return (Criteria) this;
		}

		public Criteria andOrgIdIsNotNull() {
			addCriterion("org_id is not null");
			return (Criteria) this;
		}

		public Criteria andOrgIdEqualTo(Long value) {
			addCriterion("org_id =", value, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdNotEqualTo(Long value) {
			addCriterion("org_id <>", value, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdGreaterThan(Long value) {
			addCriterion("org_id >", value, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdGreaterThanOrEqualTo(Long value) {
			addCriterion("org_id >=", value, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdLessThan(Long value) {
			addCriterion("org_id <", value, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdLessThanOrEqualTo(Long value) {
			addCriterion("org_id <=", value, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdIn(List<Long> values) {
			addCriterion("org_id in", values, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdNotIn(List<Long> values) {
			addCriterion("org_id not in", values, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdBetween(Long value1, Long value2) {
			addCriterion("org_id between", value1, value2, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdNotBetween(Long value1, Long value2) {
			addCriterion("org_id not between", value1, value2, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgCodeIsNull() {
			addCriterion("org_code is null");
			return (Criteria) this;
		}

		public Criteria andOrgCodeIsNotNull() {
			addCriterion("org_code is not null");
			return (Criteria) this;
		}

		public Criteria andOrgCodeEqualTo(String value) {
			addCriterion("org_code =", value, "orgCode");
			return (Criteria) this;
		}

		public Criteria andOrgCodeNotEqualTo(String value) {
			addCriterion("org_code <>", value, "orgCode");
			return (Criteria) this;
		}

		public Criteria andOrgCodeGreaterThan(String value) {
			addCriterion("org_code >", value, "orgCode");
			return (Criteria) this;
		}

		public Criteria andOrgCodeGreaterThanOrEqualTo(String value) {
			addCriterion("org_code >=", value, "orgCode");
			return (Criteria) this;
		}

		public Criteria andOrgCodeLessThan(String value) {
			addCriterion("org_code <", value, "orgCode");
			return (Criteria) this;
		}

		public Criteria andOrgCodeLessThanOrEqualTo(String value) {
			addCriterion("org_code <=", value, "orgCode");
			return (Criteria) this;
		}

		public Criteria andOrgCodeLike(String value) {
			addCriterion("org_code like", value, "orgCode");
			return (Criteria) this;
		}

		public Criteria andOrgCodeNotLike(String value) {
			addCriterion("org_code not like", value, "orgCode");
			return (Criteria) this;
		}

		public Criteria andOrgCodeIn(List<String> values) {
			addCriterion("org_code in", values, "orgCode");
			return (Criteria) this;
		}

		public Criteria andOrgCodeNotIn(List<String> values) {
			addCriterion("org_code not in", values, "orgCode");
			return (Criteria) this;
		}

		public Criteria andOrgCodeBetween(String value1, String value2) {
			addCriterion("org_code between", value1, value2, "orgCode");
			return (Criteria) this;
		}

		public Criteria andOrgCodeNotBetween(String value1, String value2) {
			addCriterion("org_code not between", value1, value2, "orgCode");
			return (Criteria) this;
		}

		public Criteria andInnerCodeIsNull() {
			addCriterion("inner_code is null");
			return (Criteria) this;
		}

		public Criteria andInnerCodeIsNotNull() {
			addCriterion("inner_code is not null");
			return (Criteria) this;
		}

		public Criteria andInnerCodeEqualTo(String value) {
			addCriterion("inner_code =", value, "innerCode");
			return (Criteria) this;
		}

		public Criteria andInnerCodeNotEqualTo(String value) {
			addCriterion("inner_code <>", value, "innerCode");
			return (Criteria) this;
		}

		public Criteria andInnerCodeGreaterThan(String value) {
			addCriterion("inner_code >", value, "innerCode");
			return (Criteria) this;
		}

		public Criteria andInnerCodeGreaterThanOrEqualTo(String value) {
			addCriterion("inner_code >=", value, "innerCode");
			return (Criteria) this;
		}

		public Criteria andInnerCodeLessThan(String value) {
			addCriterion("inner_code <", value, "innerCode");
			return (Criteria) this;
		}

		public Criteria andInnerCodeLessThanOrEqualTo(String value) {
			addCriterion("inner_code <=", value, "innerCode");
			return (Criteria) this;
		}

		public Criteria andInnerCodeLike(String value) {
			addCriterion("inner_code like", value, "innerCode");
			return (Criteria) this;
		}

		public Criteria andInnerCodeNotLike(String value) {
			addCriterion("inner_code not like", value, "innerCode");
			return (Criteria) this;
		}

		public Criteria andInnerCodeIn(List<String> values) {
			addCriterion("inner_code in", values, "innerCode");
			return (Criteria) this;
		}

		public Criteria andInnerCodeNotIn(List<String> values) {
			addCriterion("inner_code not in", values, "innerCode");
			return (Criteria) this;
		}

		public Criteria andInnerCodeBetween(String value1, String value2) {
			addCriterion("inner_code between", value1, value2, "innerCode");
			return (Criteria) this;
		}

		public Criteria andInnerCodeNotBetween(String value1, String value2) {
			addCriterion("inner_code not between", value1, value2, "innerCode");
			return (Criteria) this;
		}

		public Criteria andShareFlagIsNull() {
			addCriterion("share_flag is null");
			return (Criteria) this;
		}

		public Criteria andShareFlagIsNotNull() {
			addCriterion("share_flag is not null");
			return (Criteria) this;
		}

		public Criteria andShareFlagEqualTo(String value) {
			addCriterion("share_flag =", value, "shareFlag");
			return (Criteria) this;
		}

		public Criteria andShareFlagNotEqualTo(String value) {
			addCriterion("share_flag <>", value, "shareFlag");
			return (Criteria) this;
		}

		public Criteria andShareFlagGreaterThan(String value) {
			addCriterion("share_flag >", value, "shareFlag");
			return (Criteria) this;
		}

		public Criteria andShareFlagGreaterThanOrEqualTo(String value) {
			addCriterion("share_flag >=", value, "shareFlag");
			return (Criteria) this;
		}

		public Criteria andShareFlagLessThan(String value) {
			addCriterion("share_flag <", value, "shareFlag");
			return (Criteria) this;
		}

		public Criteria andShareFlagLessThanOrEqualTo(String value) {
			addCriterion("share_flag <=", value, "shareFlag");
			return (Criteria) this;
		}

		public Criteria andShareFlagLike(String value) {
			addCriterion("share_flag like", value, "shareFlag");
			return (Criteria) this;
		}

		public Criteria andShareFlagNotLike(String value) {
			addCriterion("share_flag not like", value, "shareFlag");
			return (Criteria) this;
		}

		public Criteria andShareFlagIn(List<String> values) {
			addCriterion("share_flag in", values, "shareFlag");
			return (Criteria) this;
		}

		public Criteria andShareFlagNotIn(List<String> values) {
			addCriterion("share_flag not in", values, "shareFlag");
			return (Criteria) this;
		}

		public Criteria andShareFlagBetween(String value1, String value2) {
			addCriterion("share_flag between", value1, value2, "shareFlag");
			return (Criteria) this;
		}

		public Criteria andShareFlagNotBetween(String value1, String value2) {
			addCriterion("share_flag not between", value1, value2, "shareFlag");
			return (Criteria) this;
		}

		public Criteria andOrgLevelIsNull() {
			addCriterion("org_level is null");
			return (Criteria) this;
		}

		public Criteria andOrgLevelIsNotNull() {
			addCriterion("org_level is not null");
			return (Criteria) this;
		}

		public Criteria andOrgLevelEqualTo(Integer value) {
			addCriterion("org_level =", value, "orgLevel");
			return (Criteria) this;
		}

		public Criteria andOrgLevelNotEqualTo(Integer value) {
			addCriterion("org_level <>", value, "orgLevel");
			return (Criteria) this;
		}

		public Criteria andOrgLevelGreaterThan(Integer value) {
			addCriterion("org_level >", value, "orgLevel");
			return (Criteria) this;
		}

		public Criteria andOrgLevelGreaterThanOrEqualTo(Integer value) {
			addCriterion("org_level >=", value, "orgLevel");
			return (Criteria) this;
		}

		public Criteria andOrgLevelLessThan(Integer value) {
			addCriterion("org_level <", value, "orgLevel");
			return (Criteria) this;
		}

		public Criteria andOrgLevelLessThanOrEqualTo(Integer value) {
			addCriterion("org_level <=", value, "orgLevel");
			return (Criteria) this;
		}

		public Criteria andOrgLevelIn(List<Integer> values) {
			addCriterion("org_level in", values, "orgLevel");
			return (Criteria) this;
		}

		public Criteria andOrgLevelNotIn(List<Integer> values) {
			addCriterion("org_level not in", values, "orgLevel");
			return (Criteria) this;
		}

		public Criteria andOrgLevelBetween(Integer value1, Integer value2) {
			addCriterion("org_level between", value1, value2, "orgLevel");
			return (Criteria) this;
		}

		public Criteria andOrgLevelNotBetween(Integer value1, Integer value2) {
			addCriterion("org_level not between", value1, value2, "orgLevel");
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

		public Criteria andDeptCodeIsNull() {
			addCriterion("dept_code is null");
			return (Criteria) this;
		}

		public Criteria andDeptCodeIsNotNull() {
			addCriterion("dept_code is not null");
			return (Criteria) this;
		}

		public Criteria andDeptCodeEqualTo(String value) {
			addCriterion("dept_code =", value, "deptCode");
			return (Criteria) this;
		}

		public Criteria andDeptCodeNotEqualTo(String value) {
			addCriterion("dept_code <>", value, "deptCode");
			return (Criteria) this;
		}

		public Criteria andDeptCodeGreaterThan(String value) {
			addCriterion("dept_code >", value, "deptCode");
			return (Criteria) this;
		}

		public Criteria andDeptCodeGreaterThanOrEqualTo(String value) {
			addCriterion("dept_code >=", value, "deptCode");
			return (Criteria) this;
		}

		public Criteria andDeptCodeLessThan(String value) {
			addCriterion("dept_code <", value, "deptCode");
			return (Criteria) this;
		}

		public Criteria andDeptCodeLessThanOrEqualTo(String value) {
			addCriterion("dept_code <=", value, "deptCode");
			return (Criteria) this;
		}

		public Criteria andDeptCodeLike(String value) {
			addCriterion("dept_code like", value, "deptCode");
			return (Criteria) this;
		}

		public Criteria andDeptCodeNotLike(String value) {
			addCriterion("dept_code not like", value, "deptCode");
			return (Criteria) this;
		}

		public Criteria andDeptCodeIn(List<String> values) {
			addCriterion("dept_code in", values, "deptCode");
			return (Criteria) this;
		}

		public Criteria andDeptCodeNotIn(List<String> values) {
			addCriterion("dept_code not in", values, "deptCode");
			return (Criteria) this;
		}

		public Criteria andDeptCodeBetween(String value1, String value2) {
			addCriterion("dept_code between", value1, value2, "deptCode");
			return (Criteria) this;
		}

		public Criteria andDeptCodeNotBetween(String value1, String value2) {
			addCriterion("dept_code not between", value1, value2, "deptCode");
			return (Criteria) this;
		}

		public Criteria andManagerUidsIsNull() {
			addCriterion("manager_uids is null");
			return (Criteria) this;
		}

		public Criteria andManagerUidsIsNotNull() {
			addCriterion("manager_uids is not null");
			return (Criteria) this;
		}

		public Criteria andManagerUidsEqualTo(String value) {
			addCriterion("manager_uids =", value, "managerUids");
			return (Criteria) this;
		}

		public Criteria andManagerUidsNotEqualTo(String value) {
			addCriterion("manager_uids <>", value, "managerUids");
			return (Criteria) this;
		}

		public Criteria andManagerUidsGreaterThan(String value) {
			addCriterion("manager_uids >", value, "managerUids");
			return (Criteria) this;
		}

		public Criteria andManagerUidsGreaterThanOrEqualTo(String value) {
			addCriterion("manager_uids >=", value, "managerUids");
			return (Criteria) this;
		}

		public Criteria andManagerUidsLessThan(String value) {
			addCriterion("manager_uids <", value, "managerUids");
			return (Criteria) this;
		}

		public Criteria andManagerUidsLessThanOrEqualTo(String value) {
			addCriterion("manager_uids <=", value, "managerUids");
			return (Criteria) this;
		}

		public Criteria andManagerUidsLike(String value) {
			addCriterion("manager_uids like", value, "managerUids");
			return (Criteria) this;
		}

		public Criteria andManagerUidsNotLike(String value) {
			addCriterion("manager_uids not like", value, "managerUids");
			return (Criteria) this;
		}

		public Criteria andManagerUidsIn(List<String> values) {
			addCriterion("manager_uids in", values, "managerUids");
			return (Criteria) this;
		}

		public Criteria andManagerUidsNotIn(List<String> values) {
			addCriterion("manager_uids not in", values, "managerUids");
			return (Criteria) this;
		}

		public Criteria andManagerUidsBetween(String value1, String value2) {
			addCriterion("manager_uids between", value1, value2, "managerUids");
			return (Criteria) this;
		}

		public Criteria andManagerUidsNotBetween(String value1, String value2) {
			addCriterion("manager_uids not between", value1, value2, "managerUids");
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

		public Criteria andIssuerFlagIsNull() {
			addCriterion("issuer_flag is null");
			return (Criteria) this;
		}

		public Criteria andIssuerFlagIsNotNull() {
			addCriterion("issuer_flag is not null");
			return (Criteria) this;
		}

		public Criteria andIssuerFlagEqualTo(String value) {
			addCriterion("issuer_flag =", value, "issuerFlag");
			return (Criteria) this;
		}

		public Criteria andIssuerFlagNotEqualTo(String value) {
			addCriterion("issuer_flag <>", value, "issuerFlag");
			return (Criteria) this;
		}

		public Criteria andIssuerFlagGreaterThan(String value) {
			addCriterion("issuer_flag >", value, "issuerFlag");
			return (Criteria) this;
		}

		public Criteria andIssuerFlagGreaterThanOrEqualTo(String value) {
			addCriterion("issuer_flag >=", value, "issuerFlag");
			return (Criteria) this;
		}

		public Criteria andIssuerFlagLessThan(String value) {
			addCriterion("issuer_flag <", value, "issuerFlag");
			return (Criteria) this;
		}

		public Criteria andIssuerFlagLessThanOrEqualTo(String value) {
			addCriterion("issuer_flag <=", value, "issuerFlag");
			return (Criteria) this;
		}

		public Criteria andIssuerFlagLike(String value) {
			addCriterion("issuer_flag like", value, "issuerFlag");
			return (Criteria) this;
		}

		public Criteria andIssuerFlagNotLike(String value) {
			addCriterion("issuer_flag not like", value, "issuerFlag");
			return (Criteria) this;
		}

		public Criteria andIssuerFlagIn(List<String> values) {
			addCriterion("issuer_flag in", values, "issuerFlag");
			return (Criteria) this;
		}

		public Criteria andIssuerFlagNotIn(List<String> values) {
			addCriterion("issuer_flag not in", values, "issuerFlag");
			return (Criteria) this;
		}

		public Criteria andIssuerFlagBetween(String value1, String value2) {
			addCriterion("issuer_flag between", value1, value2, "issuerFlag");
			return (Criteria) this;
		}

		public Criteria andIssuerFlagNotBetween(String value1, String value2) {
			addCriterion("issuer_flag not between", value1, value2, "issuerFlag");
			return (Criteria) this;
		}
	}

	/**
	 * base_org
	 *
	 * @mbg.generated do_not_delete_during_merge
	 */
	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	/**
	 * base_org null
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