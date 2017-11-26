package txc.xxy.ssm.model;

import java.util.ArrayList;
import java.util.List;

public class IntroducerInfoExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public IntroducerInfoExample() {
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
	 * introducer_info null
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

		public Criteria andIntroducerUidIsNull() {
			addCriterion("introducer_uid is null");
			return (Criteria) this;
		}

		public Criteria andIntroducerUidIsNotNull() {
			addCriterion("introducer_uid is not null");
			return (Criteria) this;
		}

		public Criteria andIntroducerUidEqualTo(String value) {
			addCriterion("introducer_uid =", value, "introducerUid");
			return (Criteria) this;
		}

		public Criteria andIntroducerUidNotEqualTo(String value) {
			addCriterion("introducer_uid <>", value, "introducerUid");
			return (Criteria) this;
		}

		public Criteria andIntroducerUidGreaterThan(String value) {
			addCriterion("introducer_uid >", value, "introducerUid");
			return (Criteria) this;
		}

		public Criteria andIntroducerUidGreaterThanOrEqualTo(String value) {
			addCriterion("introducer_uid >=", value, "introducerUid");
			return (Criteria) this;
		}

		public Criteria andIntroducerUidLessThan(String value) {
			addCriterion("introducer_uid <", value, "introducerUid");
			return (Criteria) this;
		}

		public Criteria andIntroducerUidLessThanOrEqualTo(String value) {
			addCriterion("introducer_uid <=", value, "introducerUid");
			return (Criteria) this;
		}

		public Criteria andIntroducerUidLike(String value) {
			addCriterion("introducer_uid like", value, "introducerUid");
			return (Criteria) this;
		}

		public Criteria andIntroducerUidNotLike(String value) {
			addCriterion("introducer_uid not like", value, "introducerUid");
			return (Criteria) this;
		}

		public Criteria andIntroducerUidIn(List<String> values) {
			addCriterion("introducer_uid in", values, "introducerUid");
			return (Criteria) this;
		}

		public Criteria andIntroducerUidNotIn(List<String> values) {
			addCriterion("introducer_uid not in", values, "introducerUid");
			return (Criteria) this;
		}

		public Criteria andIntroducerUidBetween(String value1, String value2) {
			addCriterion("introducer_uid between", value1, value2, "introducerUid");
			return (Criteria) this;
		}

		public Criteria andIntroducerUidNotBetween(String value1, String value2) {
			addCriterion("introducer_uid not between", value1, value2, "introducerUid");
			return (Criteria) this;
		}

		public Criteria andIntroducerNameIsNull() {
			addCriterion("introducer_name is null");
			return (Criteria) this;
		}

		public Criteria andIntroducerNameIsNotNull() {
			addCriterion("introducer_name is not null");
			return (Criteria) this;
		}

		public Criteria andIntroducerNameEqualTo(String value) {
			addCriterion("introducer_name =", value, "introducerName");
			return (Criteria) this;
		}

		public Criteria andIntroducerNameNotEqualTo(String value) {
			addCriterion("introducer_name <>", value, "introducerName");
			return (Criteria) this;
		}

		public Criteria andIntroducerNameGreaterThan(String value) {
			addCriterion("introducer_name >", value, "introducerName");
			return (Criteria) this;
		}

		public Criteria andIntroducerNameGreaterThanOrEqualTo(String value) {
			addCriterion("introducer_name >=", value, "introducerName");
			return (Criteria) this;
		}

		public Criteria andIntroducerNameLessThan(String value) {
			addCriterion("introducer_name <", value, "introducerName");
			return (Criteria) this;
		}

		public Criteria andIntroducerNameLessThanOrEqualTo(String value) {
			addCriterion("introducer_name <=", value, "introducerName");
			return (Criteria) this;
		}

		public Criteria andIntroducerNameLike(String value) {
			addCriterion("introducer_name like", value, "introducerName");
			return (Criteria) this;
		}

		public Criteria andIntroducerNameNotLike(String value) {
			addCriterion("introducer_name not like", value, "introducerName");
			return (Criteria) this;
		}

		public Criteria andIntroducerNameIn(List<String> values) {
			addCriterion("introducer_name in", values, "introducerName");
			return (Criteria) this;
		}

		public Criteria andIntroducerNameNotIn(List<String> values) {
			addCriterion("introducer_name not in", values, "introducerName");
			return (Criteria) this;
		}

		public Criteria andIntroducerNameBetween(String value1, String value2) {
			addCriterion("introducer_name between", value1, value2, "introducerName");
			return (Criteria) this;
		}

		public Criteria andIntroducerNameNotBetween(String value1, String value2) {
			addCriterion("introducer_name not between", value1, value2, "introducerName");
			return (Criteria) this;
		}

		public Criteria andTelIsNull() {
			addCriterion("tel is null");
			return (Criteria) this;
		}

		public Criteria andTelIsNotNull() {
			addCriterion("tel is not null");
			return (Criteria) this;
		}

		public Criteria andTelEqualTo(String value) {
			addCriterion("tel =", value, "tel");
			return (Criteria) this;
		}

		public Criteria andTelNotEqualTo(String value) {
			addCriterion("tel <>", value, "tel");
			return (Criteria) this;
		}

		public Criteria andTelGreaterThan(String value) {
			addCriterion("tel >", value, "tel");
			return (Criteria) this;
		}

		public Criteria andTelGreaterThanOrEqualTo(String value) {
			addCriterion("tel >=", value, "tel");
			return (Criteria) this;
		}

		public Criteria andTelLessThan(String value) {
			addCriterion("tel <", value, "tel");
			return (Criteria) this;
		}

		public Criteria andTelLessThanOrEqualTo(String value) {
			addCriterion("tel <=", value, "tel");
			return (Criteria) this;
		}

		public Criteria andTelLike(String value) {
			addCriterion("tel like", value, "tel");
			return (Criteria) this;
		}

		public Criteria andTelNotLike(String value) {
			addCriterion("tel not like", value, "tel");
			return (Criteria) this;
		}

		public Criteria andTelIn(List<String> values) {
			addCriterion("tel in", values, "tel");
			return (Criteria) this;
		}

		public Criteria andTelNotIn(List<String> values) {
			addCriterion("tel not in", values, "tel");
			return (Criteria) this;
		}

		public Criteria andTelBetween(String value1, String value2) {
			addCriterion("tel between", value1, value2, "tel");
			return (Criteria) this;
		}

		public Criteria andTelNotBetween(String value1, String value2) {
			addCriterion("tel not between", value1, value2, "tel");
			return (Criteria) this;
		}

		public Criteria andMobileNoIsNull() {
			addCriterion("mobile_no is null");
			return (Criteria) this;
		}

		public Criteria andMobileNoIsNotNull() {
			addCriterion("mobile_no is not null");
			return (Criteria) this;
		}

		public Criteria andMobileNoEqualTo(String value) {
			addCriterion("mobile_no =", value, "mobileNo");
			return (Criteria) this;
		}

		public Criteria andMobileNoNotEqualTo(String value) {
			addCriterion("mobile_no <>", value, "mobileNo");
			return (Criteria) this;
		}

		public Criteria andMobileNoGreaterThan(String value) {
			addCriterion("mobile_no >", value, "mobileNo");
			return (Criteria) this;
		}

		public Criteria andMobileNoGreaterThanOrEqualTo(String value) {
			addCriterion("mobile_no >=", value, "mobileNo");
			return (Criteria) this;
		}

		public Criteria andMobileNoLessThan(String value) {
			addCriterion("mobile_no <", value, "mobileNo");
			return (Criteria) this;
		}

		public Criteria andMobileNoLessThanOrEqualTo(String value) {
			addCriterion("mobile_no <=", value, "mobileNo");
			return (Criteria) this;
		}

		public Criteria andMobileNoLike(String value) {
			addCriterion("mobile_no like", value, "mobileNo");
			return (Criteria) this;
		}

		public Criteria andMobileNoNotLike(String value) {
			addCriterion("mobile_no not like", value, "mobileNo");
			return (Criteria) this;
		}

		public Criteria andMobileNoIn(List<String> values) {
			addCriterion("mobile_no in", values, "mobileNo");
			return (Criteria) this;
		}

		public Criteria andMobileNoNotIn(List<String> values) {
			addCriterion("mobile_no not in", values, "mobileNo");
			return (Criteria) this;
		}

		public Criteria andMobileNoBetween(String value1, String value2) {
			addCriterion("mobile_no between", value1, value2, "mobileNo");
			return (Criteria) this;
		}

		public Criteria andMobileNoNotBetween(String value1, String value2) {
			addCriterion("mobile_no not between", value1, value2, "mobileNo");
			return (Criteria) this;
		}

		public Criteria andWxNoIsNull() {
			addCriterion("wx_no is null");
			return (Criteria) this;
		}

		public Criteria andWxNoIsNotNull() {
			addCriterion("wx_no is not null");
			return (Criteria) this;
		}

		public Criteria andWxNoEqualTo(String value) {
			addCriterion("wx_no =", value, "wxNo");
			return (Criteria) this;
		}

		public Criteria andWxNoNotEqualTo(String value) {
			addCriterion("wx_no <>", value, "wxNo");
			return (Criteria) this;
		}

		public Criteria andWxNoGreaterThan(String value) {
			addCriterion("wx_no >", value, "wxNo");
			return (Criteria) this;
		}

		public Criteria andWxNoGreaterThanOrEqualTo(String value) {
			addCriterion("wx_no >=", value, "wxNo");
			return (Criteria) this;
		}

		public Criteria andWxNoLessThan(String value) {
			addCriterion("wx_no <", value, "wxNo");
			return (Criteria) this;
		}

		public Criteria andWxNoLessThanOrEqualTo(String value) {
			addCriterion("wx_no <=", value, "wxNo");
			return (Criteria) this;
		}

		public Criteria andWxNoLike(String value) {
			addCriterion("wx_no like", value, "wxNo");
			return (Criteria) this;
		}

		public Criteria andWxNoNotLike(String value) {
			addCriterion("wx_no not like", value, "wxNo");
			return (Criteria) this;
		}

		public Criteria andWxNoIn(List<String> values) {
			addCriterion("wx_no in", values, "wxNo");
			return (Criteria) this;
		}

		public Criteria andWxNoNotIn(List<String> values) {
			addCriterion("wx_no not in", values, "wxNo");
			return (Criteria) this;
		}

		public Criteria andWxNoBetween(String value1, String value2) {
			addCriterion("wx_no between", value1, value2, "wxNo");
			return (Criteria) this;
		}

		public Criteria andWxNoNotBetween(String value1, String value2) {
			addCriterion("wx_no not between", value1, value2, "wxNo");
			return (Criteria) this;
		}

		public Criteria andEmailIsNull() {
			addCriterion("email is null");
			return (Criteria) this;
		}

		public Criteria andEmailIsNotNull() {
			addCriterion("email is not null");
			return (Criteria) this;
		}

		public Criteria andEmailEqualTo(String value) {
			addCriterion("email =", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotEqualTo(String value) {
			addCriterion("email <>", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThan(String value) {
			addCriterion("email >", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThanOrEqualTo(String value) {
			addCriterion("email >=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThan(String value) {
			addCriterion("email <", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThanOrEqualTo(String value) {
			addCriterion("email <=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLike(String value) {
			addCriterion("email like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotLike(String value) {
			addCriterion("email not like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailIn(List<String> values) {
			addCriterion("email in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotIn(List<String> values) {
			addCriterion("email not in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailBetween(String value1, String value2) {
			addCriterion("email between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotBetween(String value1, String value2) {
			addCriterion("email not between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andBusinessAreaIsNull() {
			addCriterion("business_area is null");
			return (Criteria) this;
		}

		public Criteria andBusinessAreaIsNotNull() {
			addCriterion("business_area is not null");
			return (Criteria) this;
		}

		public Criteria andBusinessAreaEqualTo(String value) {
			addCriterion("business_area =", value, "businessArea");
			return (Criteria) this;
		}

		public Criteria andBusinessAreaNotEqualTo(String value) {
			addCriterion("business_area <>", value, "businessArea");
			return (Criteria) this;
		}

		public Criteria andBusinessAreaGreaterThan(String value) {
			addCriterion("business_area >", value, "businessArea");
			return (Criteria) this;
		}

		public Criteria andBusinessAreaGreaterThanOrEqualTo(String value) {
			addCriterion("business_area >=", value, "businessArea");
			return (Criteria) this;
		}

		public Criteria andBusinessAreaLessThan(String value) {
			addCriterion("business_area <", value, "businessArea");
			return (Criteria) this;
		}

		public Criteria andBusinessAreaLessThanOrEqualTo(String value) {
			addCriterion("business_area <=", value, "businessArea");
			return (Criteria) this;
		}

		public Criteria andBusinessAreaLike(String value) {
			addCriterion("business_area like", value, "businessArea");
			return (Criteria) this;
		}

		public Criteria andBusinessAreaNotLike(String value) {
			addCriterion("business_area not like", value, "businessArea");
			return (Criteria) this;
		}

		public Criteria andBusinessAreaIn(List<String> values) {
			addCriterion("business_area in", values, "businessArea");
			return (Criteria) this;
		}

		public Criteria andBusinessAreaNotIn(List<String> values) {
			addCriterion("business_area not in", values, "businessArea");
			return (Criteria) this;
		}

		public Criteria andBusinessAreaBetween(String value1, String value2) {
			addCriterion("business_area between", value1, value2, "businessArea");
			return (Criteria) this;
		}

		public Criteria andBusinessAreaNotBetween(String value1, String value2) {
			addCriterion("business_area not between", value1, value2, "businessArea");
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

		public Criteria andAddrCodeIsNull() {
			addCriterion("addr_code is null");
			return (Criteria) this;
		}

		public Criteria andAddrCodeIsNotNull() {
			addCriterion("addr_code is not null");
			return (Criteria) this;
		}

		public Criteria andAddrCodeEqualTo(String value) {
			addCriterion("addr_code =", value, "addrCode");
			return (Criteria) this;
		}

		public Criteria andAddrCodeNotEqualTo(String value) {
			addCriterion("addr_code <>", value, "addrCode");
			return (Criteria) this;
		}

		public Criteria andAddrCodeGreaterThan(String value) {
			addCriterion("addr_code >", value, "addrCode");
			return (Criteria) this;
		}

		public Criteria andAddrCodeGreaterThanOrEqualTo(String value) {
			addCriterion("addr_code >=", value, "addrCode");
			return (Criteria) this;
		}

		public Criteria andAddrCodeLessThan(String value) {
			addCriterion("addr_code <", value, "addrCode");
			return (Criteria) this;
		}

		public Criteria andAddrCodeLessThanOrEqualTo(String value) {
			addCriterion("addr_code <=", value, "addrCode");
			return (Criteria) this;
		}

		public Criteria andAddrCodeLike(String value) {
			addCriterion("addr_code like", value, "addrCode");
			return (Criteria) this;
		}

		public Criteria andAddrCodeNotLike(String value) {
			addCriterion("addr_code not like", value, "addrCode");
			return (Criteria) this;
		}

		public Criteria andAddrCodeIn(List<String> values) {
			addCriterion("addr_code in", values, "addrCode");
			return (Criteria) this;
		}

		public Criteria andAddrCodeNotIn(List<String> values) {
			addCriterion("addr_code not in", values, "addrCode");
			return (Criteria) this;
		}

		public Criteria andAddrCodeBetween(String value1, String value2) {
			addCriterion("addr_code between", value1, value2, "addrCode");
			return (Criteria) this;
		}

		public Criteria andAddrCodeNotBetween(String value1, String value2) {
			addCriterion("addr_code not between", value1, value2, "addrCode");
			return (Criteria) this;
		}

		public Criteria andAddrChnIsNull() {
			addCriterion("addr_chn is null");
			return (Criteria) this;
		}

		public Criteria andAddrChnIsNotNull() {
			addCriterion("addr_chn is not null");
			return (Criteria) this;
		}

		public Criteria andAddrChnEqualTo(String value) {
			addCriterion("addr_chn =", value, "addrChn");
			return (Criteria) this;
		}

		public Criteria andAddrChnNotEqualTo(String value) {
			addCriterion("addr_chn <>", value, "addrChn");
			return (Criteria) this;
		}

		public Criteria andAddrChnGreaterThan(String value) {
			addCriterion("addr_chn >", value, "addrChn");
			return (Criteria) this;
		}

		public Criteria andAddrChnGreaterThanOrEqualTo(String value) {
			addCriterion("addr_chn >=", value, "addrChn");
			return (Criteria) this;
		}

		public Criteria andAddrChnLessThan(String value) {
			addCriterion("addr_chn <", value, "addrChn");
			return (Criteria) this;
		}

		public Criteria andAddrChnLessThanOrEqualTo(String value) {
			addCriterion("addr_chn <=", value, "addrChn");
			return (Criteria) this;
		}

		public Criteria andAddrChnLike(String value) {
			addCriterion("addr_chn like", value, "addrChn");
			return (Criteria) this;
		}

		public Criteria andAddrChnNotLike(String value) {
			addCriterion("addr_chn not like", value, "addrChn");
			return (Criteria) this;
		}

		public Criteria andAddrChnIn(List<String> values) {
			addCriterion("addr_chn in", values, "addrChn");
			return (Criteria) this;
		}

		public Criteria andAddrChnNotIn(List<String> values) {
			addCriterion("addr_chn not in", values, "addrChn");
			return (Criteria) this;
		}

		public Criteria andAddrChnBetween(String value1, String value2) {
			addCriterion("addr_chn between", value1, value2, "addrChn");
			return (Criteria) this;
		}

		public Criteria andAddrChnNotBetween(String value1, String value2) {
			addCriterion("addr_chn not between", value1, value2, "addrChn");
			return (Criteria) this;
		}
	}

	/**
	 * introducer_info
	 *
	 * @mbg.generated do_not_delete_during_merge
	 */
	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	/**
	 * introducer_info null
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