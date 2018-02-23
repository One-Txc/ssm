package txc.xyz.base.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class BaseDeptExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public BaseDeptExample() {
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
	 * base_dept null
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

		public Criteria andDeptIdIsNull() {
			addCriterion("dept_id is null");
			return (Criteria) this;
		}

		public Criteria andDeptIdIsNotNull() {
			addCriterion("dept_id is not null");
			return (Criteria) this;
		}

		public Criteria andDeptIdEqualTo(Long value) {
			addCriterion("dept_id =", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdNotEqualTo(Long value) {
			addCriterion("dept_id <>", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdGreaterThan(Long value) {
			addCriterion("dept_id >", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdGreaterThanOrEqualTo(Long value) {
			addCriterion("dept_id >=", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdLessThan(Long value) {
			addCriterion("dept_id <", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdLessThanOrEqualTo(Long value) {
			addCriterion("dept_id <=", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdIn(List<Long> values) {
			addCriterion("dept_id in", values, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdNotIn(List<Long> values) {
			addCriterion("dept_id not in", values, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdBetween(Long value1, Long value2) {
			addCriterion("dept_id between", value1, value2, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdNotBetween(Long value1, Long value2) {
			addCriterion("dept_id not between", value1, value2, "deptId");
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

		public Criteria andDeptNameIsNull() {
			addCriterion("dept_name is null");
			return (Criteria) this;
		}

		public Criteria andDeptNameIsNotNull() {
			addCriterion("dept_name is not null");
			return (Criteria) this;
		}

		public Criteria andDeptNameEqualTo(String value) {
			addCriterion("dept_name =", value, "deptName");
			return (Criteria) this;
		}

		public Criteria andDeptNameNotEqualTo(String value) {
			addCriterion("dept_name <>", value, "deptName");
			return (Criteria) this;
		}

		public Criteria andDeptNameGreaterThan(String value) {
			addCriterion("dept_name >", value, "deptName");
			return (Criteria) this;
		}

		public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
			addCriterion("dept_name >=", value, "deptName");
			return (Criteria) this;
		}

		public Criteria andDeptNameLessThan(String value) {
			addCriterion("dept_name <", value, "deptName");
			return (Criteria) this;
		}

		public Criteria andDeptNameLessThanOrEqualTo(String value) {
			addCriterion("dept_name <=", value, "deptName");
			return (Criteria) this;
		}

		public Criteria andDeptNameLike(String value) {
			addCriterion("dept_name like", value, "deptName");
			return (Criteria) this;
		}

		public Criteria andDeptNameNotLike(String value) {
			addCriterion("dept_name not like", value, "deptName");
			return (Criteria) this;
		}

		public Criteria andDeptNameIn(List<String> values) {
			addCriterion("dept_name in", values, "deptName");
			return (Criteria) this;
		}

		public Criteria andDeptNameNotIn(List<String> values) {
			addCriterion("dept_name not in", values, "deptName");
			return (Criteria) this;
		}

		public Criteria andDeptNameBetween(String value1, String value2) {
			addCriterion("dept_name between", value1, value2, "deptName");
			return (Criteria) this;
		}

		public Criteria andDeptNameNotBetween(String value1, String value2) {
			addCriterion("dept_name not between", value1, value2, "deptName");
			return (Criteria) this;
		}

		public Criteria andDeptDescIsNull() {
			addCriterion("dept_desc is null");
			return (Criteria) this;
		}

		public Criteria andDeptDescIsNotNull() {
			addCriterion("dept_desc is not null");
			return (Criteria) this;
		}

		public Criteria andDeptDescEqualTo(String value) {
			addCriterion("dept_desc =", value, "deptDesc");
			return (Criteria) this;
		}

		public Criteria andDeptDescNotEqualTo(String value) {
			addCriterion("dept_desc <>", value, "deptDesc");
			return (Criteria) this;
		}

		public Criteria andDeptDescGreaterThan(String value) {
			addCriterion("dept_desc >", value, "deptDesc");
			return (Criteria) this;
		}

		public Criteria andDeptDescGreaterThanOrEqualTo(String value) {
			addCriterion("dept_desc >=", value, "deptDesc");
			return (Criteria) this;
		}

		public Criteria andDeptDescLessThan(String value) {
			addCriterion("dept_desc <", value, "deptDesc");
			return (Criteria) this;
		}

		public Criteria andDeptDescLessThanOrEqualTo(String value) {
			addCriterion("dept_desc <=", value, "deptDesc");
			return (Criteria) this;
		}

		public Criteria andDeptDescLike(String value) {
			addCriterion("dept_desc like", value, "deptDesc");
			return (Criteria) this;
		}

		public Criteria andDeptDescNotLike(String value) {
			addCriterion("dept_desc not like", value, "deptDesc");
			return (Criteria) this;
		}

		public Criteria andDeptDescIn(List<String> values) {
			addCriterion("dept_desc in", values, "deptDesc");
			return (Criteria) this;
		}

		public Criteria andDeptDescNotIn(List<String> values) {
			addCriterion("dept_desc not in", values, "deptDesc");
			return (Criteria) this;
		}

		public Criteria andDeptDescBetween(String value1, String value2) {
			addCriterion("dept_desc between", value1, value2, "deptDesc");
			return (Criteria) this;
		}

		public Criteria andDeptDescNotBetween(String value1, String value2) {
			addCriterion("dept_desc not between", value1, value2, "deptDesc");
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
	 * base_dept
	 *
	 * @mbg.generated do_not_delete_during_merge
	 */
	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	/**
	 * base_dept null
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