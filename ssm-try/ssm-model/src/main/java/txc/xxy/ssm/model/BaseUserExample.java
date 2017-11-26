package txc.xxy.ssm.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class BaseUserExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public BaseUserExample() {
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
	 * base_user null
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

		public Criteria andUserIdIsNull() {
			addCriterion("user_id is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("user_id is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(Long value) {
			addCriterion("user_id =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(Long value) {
			addCriterion("user_id <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(Long value) {
			addCriterion("user_id >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
			addCriterion("user_id >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(Long value) {
			addCriterion("user_id <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(Long value) {
			addCriterion("user_id <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<Long> values) {
			addCriterion("user_id in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<Long> values) {
			addCriterion("user_id not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(Long value1, Long value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(Long value1, Long value2) {
			addCriterion("user_id not between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andRealNameIsNull() {
			addCriterion("real_name is null");
			return (Criteria) this;
		}

		public Criteria andRealNameIsNotNull() {
			addCriterion("real_name is not null");
			return (Criteria) this;
		}

		public Criteria andRealNameEqualTo(String value) {
			addCriterion("real_name =", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameNotEqualTo(String value) {
			addCriterion("real_name <>", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameGreaterThan(String value) {
			addCriterion("real_name >", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameGreaterThanOrEqualTo(String value) {
			addCriterion("real_name >=", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameLessThan(String value) {
			addCriterion("real_name <", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameLessThanOrEqualTo(String value) {
			addCriterion("real_name <=", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameLike(String value) {
			addCriterion("real_name like", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameNotLike(String value) {
			addCriterion("real_name not like", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameIn(List<String> values) {
			addCriterion("real_name in", values, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameNotIn(List<String> values) {
			addCriterion("real_name not in", values, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameBetween(String value1, String value2) {
			addCriterion("real_name between", value1, value2, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameNotBetween(String value1, String value2) {
			addCriterion("real_name not between", value1, value2, "realName");
			return (Criteria) this;
		}

		public Criteria andIconImgUrlIsNull() {
			addCriterion("icon_img_url is null");
			return (Criteria) this;
		}

		public Criteria andIconImgUrlIsNotNull() {
			addCriterion("icon_img_url is not null");
			return (Criteria) this;
		}

		public Criteria andIconImgUrlEqualTo(String value) {
			addCriterion("icon_img_url =", value, "iconImgUrl");
			return (Criteria) this;
		}

		public Criteria andIconImgUrlNotEqualTo(String value) {
			addCriterion("icon_img_url <>", value, "iconImgUrl");
			return (Criteria) this;
		}

		public Criteria andIconImgUrlGreaterThan(String value) {
			addCriterion("icon_img_url >", value, "iconImgUrl");
			return (Criteria) this;
		}

		public Criteria andIconImgUrlGreaterThanOrEqualTo(String value) {
			addCriterion("icon_img_url >=", value, "iconImgUrl");
			return (Criteria) this;
		}

		public Criteria andIconImgUrlLessThan(String value) {
			addCriterion("icon_img_url <", value, "iconImgUrl");
			return (Criteria) this;
		}

		public Criteria andIconImgUrlLessThanOrEqualTo(String value) {
			addCriterion("icon_img_url <=", value, "iconImgUrl");
			return (Criteria) this;
		}

		public Criteria andIconImgUrlLike(String value) {
			addCriterion("icon_img_url like", value, "iconImgUrl");
			return (Criteria) this;
		}

		public Criteria andIconImgUrlNotLike(String value) {
			addCriterion("icon_img_url not like", value, "iconImgUrl");
			return (Criteria) this;
		}

		public Criteria andIconImgUrlIn(List<String> values) {
			addCriterion("icon_img_url in", values, "iconImgUrl");
			return (Criteria) this;
		}

		public Criteria andIconImgUrlNotIn(List<String> values) {
			addCriterion("icon_img_url not in", values, "iconImgUrl");
			return (Criteria) this;
		}

		public Criteria andIconImgUrlBetween(String value1, String value2) {
			addCriterion("icon_img_url between", value1, value2, "iconImgUrl");
			return (Criteria) this;
		}

		public Criteria andIconImgUrlNotBetween(String value1, String value2) {
			addCriterion("icon_img_url not between", value1, value2, "iconImgUrl");
			return (Criteria) this;
		}

		public Criteria andUserAccountIsNull() {
			addCriterion("user_account is null");
			return (Criteria) this;
		}

		public Criteria andUserAccountIsNotNull() {
			addCriterion("user_account is not null");
			return (Criteria) this;
		}

		public Criteria andUserAccountEqualTo(String value) {
			addCriterion("user_account =", value, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserAccountNotEqualTo(String value) {
			addCriterion("user_account <>", value, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserAccountGreaterThan(String value) {
			addCriterion("user_account >", value, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserAccountGreaterThanOrEqualTo(String value) {
			addCriterion("user_account >=", value, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserAccountLessThan(String value) {
			addCriterion("user_account <", value, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserAccountLessThanOrEqualTo(String value) {
			addCriterion("user_account <=", value, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserAccountLike(String value) {
			addCriterion("user_account like", value, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserAccountNotLike(String value) {
			addCriterion("user_account not like", value, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserAccountIn(List<String> values) {
			addCriterion("user_account in", values, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserAccountNotIn(List<String> values) {
			addCriterion("user_account not in", values, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserAccountBetween(String value1, String value2) {
			addCriterion("user_account between", value1, value2, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserAccountNotBetween(String value1, String value2) {
			addCriterion("user_account not between", value1, value2, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserPwdIsNull() {
			addCriterion("user_pwd is null");
			return (Criteria) this;
		}

		public Criteria andUserPwdIsNotNull() {
			addCriterion("user_pwd is not null");
			return (Criteria) this;
		}

		public Criteria andUserPwdEqualTo(String value) {
			addCriterion("user_pwd =", value, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdNotEqualTo(String value) {
			addCriterion("user_pwd <>", value, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdGreaterThan(String value) {
			addCriterion("user_pwd >", value, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdGreaterThanOrEqualTo(String value) {
			addCriterion("user_pwd >=", value, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdLessThan(String value) {
			addCriterion("user_pwd <", value, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdLessThanOrEqualTo(String value) {
			addCriterion("user_pwd <=", value, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdLike(String value) {
			addCriterion("user_pwd like", value, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdNotLike(String value) {
			addCriterion("user_pwd not like", value, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdIn(List<String> values) {
			addCriterion("user_pwd in", values, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdNotIn(List<String> values) {
			addCriterion("user_pwd not in", values, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdBetween(String value1, String value2) {
			addCriterion("user_pwd between", value1, value2, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdNotBetween(String value1, String value2) {
			addCriterion("user_pwd not between", value1, value2, "userPwd");
			return (Criteria) this;
		}

		public Criteria andNationCodeIsNull() {
			addCriterion("nation_code is null");
			return (Criteria) this;
		}

		public Criteria andNationCodeIsNotNull() {
			addCriterion("nation_code is not null");
			return (Criteria) this;
		}

		public Criteria andNationCodeEqualTo(String value) {
			addCriterion("nation_code =", value, "nationCode");
			return (Criteria) this;
		}

		public Criteria andNationCodeNotEqualTo(String value) {
			addCriterion("nation_code <>", value, "nationCode");
			return (Criteria) this;
		}

		public Criteria andNationCodeGreaterThan(String value) {
			addCriterion("nation_code >", value, "nationCode");
			return (Criteria) this;
		}

		public Criteria andNationCodeGreaterThanOrEqualTo(String value) {
			addCriterion("nation_code >=", value, "nationCode");
			return (Criteria) this;
		}

		public Criteria andNationCodeLessThan(String value) {
			addCriterion("nation_code <", value, "nationCode");
			return (Criteria) this;
		}

		public Criteria andNationCodeLessThanOrEqualTo(String value) {
			addCriterion("nation_code <=", value, "nationCode");
			return (Criteria) this;
		}

		public Criteria andNationCodeLike(String value) {
			addCriterion("nation_code like", value, "nationCode");
			return (Criteria) this;
		}

		public Criteria andNationCodeNotLike(String value) {
			addCriterion("nation_code not like", value, "nationCode");
			return (Criteria) this;
		}

		public Criteria andNationCodeIn(List<String> values) {
			addCriterion("nation_code in", values, "nationCode");
			return (Criteria) this;
		}

		public Criteria andNationCodeNotIn(List<String> values) {
			addCriterion("nation_code not in", values, "nationCode");
			return (Criteria) this;
		}

		public Criteria andNationCodeBetween(String value1, String value2) {
			addCriterion("nation_code between", value1, value2, "nationCode");
			return (Criteria) this;
		}

		public Criteria andNationCodeNotBetween(String value1, String value2) {
			addCriterion("nation_code not between", value1, value2, "nationCode");
			return (Criteria) this;
		}

		public Criteria andUserMobileIsNull() {
			addCriterion("user_mobile is null");
			return (Criteria) this;
		}

		public Criteria andUserMobileIsNotNull() {
			addCriterion("user_mobile is not null");
			return (Criteria) this;
		}

		public Criteria andUserMobileEqualTo(String value) {
			addCriterion("user_mobile =", value, "userMobile");
			return (Criteria) this;
		}

		public Criteria andUserMobileNotEqualTo(String value) {
			addCriterion("user_mobile <>", value, "userMobile");
			return (Criteria) this;
		}

		public Criteria andUserMobileGreaterThan(String value) {
			addCriterion("user_mobile >", value, "userMobile");
			return (Criteria) this;
		}

		public Criteria andUserMobileGreaterThanOrEqualTo(String value) {
			addCriterion("user_mobile >=", value, "userMobile");
			return (Criteria) this;
		}

		public Criteria andUserMobileLessThan(String value) {
			addCriterion("user_mobile <", value, "userMobile");
			return (Criteria) this;
		}

		public Criteria andUserMobileLessThanOrEqualTo(String value) {
			addCriterion("user_mobile <=", value, "userMobile");
			return (Criteria) this;
		}

		public Criteria andUserMobileLike(String value) {
			addCriterion("user_mobile like", value, "userMobile");
			return (Criteria) this;
		}

		public Criteria andUserMobileNotLike(String value) {
			addCriterion("user_mobile not like", value, "userMobile");
			return (Criteria) this;
		}

		public Criteria andUserMobileIn(List<String> values) {
			addCriterion("user_mobile in", values, "userMobile");
			return (Criteria) this;
		}

		public Criteria andUserMobileNotIn(List<String> values) {
			addCriterion("user_mobile not in", values, "userMobile");
			return (Criteria) this;
		}

		public Criteria andUserMobileBetween(String value1, String value2) {
			addCriterion("user_mobile between", value1, value2, "userMobile");
			return (Criteria) this;
		}

		public Criteria andUserMobileNotBetween(String value1, String value2) {
			addCriterion("user_mobile not between", value1, value2, "userMobile");
			return (Criteria) this;
		}

		public Criteria andOpenIdIsNull() {
			addCriterion("open_id is null");
			return (Criteria) this;
		}

		public Criteria andOpenIdIsNotNull() {
			addCriterion("open_id is not null");
			return (Criteria) this;
		}

		public Criteria andOpenIdEqualTo(String value) {
			addCriterion("open_id =", value, "openId");
			return (Criteria) this;
		}

		public Criteria andOpenIdNotEqualTo(String value) {
			addCriterion("open_id <>", value, "openId");
			return (Criteria) this;
		}

		public Criteria andOpenIdGreaterThan(String value) {
			addCriterion("open_id >", value, "openId");
			return (Criteria) this;
		}

		public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
			addCriterion("open_id >=", value, "openId");
			return (Criteria) this;
		}

		public Criteria andOpenIdLessThan(String value) {
			addCriterion("open_id <", value, "openId");
			return (Criteria) this;
		}

		public Criteria andOpenIdLessThanOrEqualTo(String value) {
			addCriterion("open_id <=", value, "openId");
			return (Criteria) this;
		}

		public Criteria andOpenIdLike(String value) {
			addCriterion("open_id like", value, "openId");
			return (Criteria) this;
		}

		public Criteria andOpenIdNotLike(String value) {
			addCriterion("open_id not like", value, "openId");
			return (Criteria) this;
		}

		public Criteria andOpenIdIn(List<String> values) {
			addCriterion("open_id in", values, "openId");
			return (Criteria) this;
		}

		public Criteria andOpenIdNotIn(List<String> values) {
			addCriterion("open_id not in", values, "openId");
			return (Criteria) this;
		}

		public Criteria andOpenIdBetween(String value1, String value2) {
			addCriterion("open_id between", value1, value2, "openId");
			return (Criteria) this;
		}

		public Criteria andOpenIdNotBetween(String value1, String value2) {
			addCriterion("open_id not between", value1, value2, "openId");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeIsNull() {
			addCriterion("last_login_time is null");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeIsNotNull() {
			addCriterion("last_login_time is not null");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeEqualTo(Timestamp value) {
			addCriterion("last_login_time =", value, "lastLoginTime");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeNotEqualTo(Timestamp value) {
			addCriterion("last_login_time <>", value, "lastLoginTime");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeGreaterThan(Timestamp value) {
			addCriterion("last_login_time >", value, "lastLoginTime");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeGreaterThanOrEqualTo(Timestamp value) {
			addCriterion("last_login_time >=", value, "lastLoginTime");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeLessThan(Timestamp value) {
			addCriterion("last_login_time <", value, "lastLoginTime");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeLessThanOrEqualTo(Timestamp value) {
			addCriterion("last_login_time <=", value, "lastLoginTime");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeIn(List<Timestamp> values) {
			addCriterion("last_login_time in", values, "lastLoginTime");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeNotIn(List<Timestamp> values) {
			addCriterion("last_login_time not in", values, "lastLoginTime");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeBetween(Timestamp value1, Timestamp value2) {
			addCriterion("last_login_time between", value1, value2, "lastLoginTime");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeNotBetween(Timestamp value1, Timestamp value2) {
			addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
			return (Criteria) this;
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
	 * base_user
	 *
	 * @mbg.generated do_not_delete_during_merge
	 */
	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	/**
	 * base_user null
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