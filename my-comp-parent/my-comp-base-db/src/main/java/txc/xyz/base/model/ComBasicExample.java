package txc.xyz.base.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class ComBasicExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public ComBasicExample() {
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
	 * com_basic null
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

		public Criteria andComIdIsNull() {
			addCriterion("com_id is null");
			return (Criteria) this;
		}

		public Criteria andComIdIsNotNull() {
			addCriterion("com_id is not null");
			return (Criteria) this;
		}

		public Criteria andComIdEqualTo(String value) {
			addCriterion("com_id =", value, "comId");
			return (Criteria) this;
		}

		public Criteria andComIdNotEqualTo(String value) {
			addCriterion("com_id <>", value, "comId");
			return (Criteria) this;
		}

		public Criteria andComIdGreaterThan(String value) {
			addCriterion("com_id >", value, "comId");
			return (Criteria) this;
		}

		public Criteria andComIdGreaterThanOrEqualTo(String value) {
			addCriterion("com_id >=", value, "comId");
			return (Criteria) this;
		}

		public Criteria andComIdLessThan(String value) {
			addCriterion("com_id <", value, "comId");
			return (Criteria) this;
		}

		public Criteria andComIdLessThanOrEqualTo(String value) {
			addCriterion("com_id <=", value, "comId");
			return (Criteria) this;
		}

		public Criteria andComIdLike(String value) {
			addCriterion("com_id like", value, "comId");
			return (Criteria) this;
		}

		public Criteria andComIdNotLike(String value) {
			addCriterion("com_id not like", value, "comId");
			return (Criteria) this;
		}

		public Criteria andComIdIn(List<String> values) {
			addCriterion("com_id in", values, "comId");
			return (Criteria) this;
		}

		public Criteria andComIdNotIn(List<String> values) {
			addCriterion("com_id not in", values, "comId");
			return (Criteria) this;
		}

		public Criteria andComIdBetween(String value1, String value2) {
			addCriterion("com_id between", value1, value2, "comId");
			return (Criteria) this;
		}

		public Criteria andComIdNotBetween(String value1, String value2) {
			addCriterion("com_id not between", value1, value2, "comId");
			return (Criteria) this;
		}

		public Criteria andComNameIsNull() {
			addCriterion("com_name is null");
			return (Criteria) this;
		}

		public Criteria andComNameIsNotNull() {
			addCriterion("com_name is not null");
			return (Criteria) this;
		}

		public Criteria andComNameEqualTo(String value) {
			addCriterion("com_name =", value, "comName");
			return (Criteria) this;
		}

		public Criteria andComNameNotEqualTo(String value) {
			addCriterion("com_name <>", value, "comName");
			return (Criteria) this;
		}

		public Criteria andComNameGreaterThan(String value) {
			addCriterion("com_name >", value, "comName");
			return (Criteria) this;
		}

		public Criteria andComNameGreaterThanOrEqualTo(String value) {
			addCriterion("com_name >=", value, "comName");
			return (Criteria) this;
		}

		public Criteria andComNameLessThan(String value) {
			addCriterion("com_name <", value, "comName");
			return (Criteria) this;
		}

		public Criteria andComNameLessThanOrEqualTo(String value) {
			addCriterion("com_name <=", value, "comName");
			return (Criteria) this;
		}

		public Criteria andComNameLike(String value) {
			addCriterion("com_name like", value, "comName");
			return (Criteria) this;
		}

		public Criteria andComNameNotLike(String value) {
			addCriterion("com_name not like", value, "comName");
			return (Criteria) this;
		}

		public Criteria andComNameIn(List<String> values) {
			addCriterion("com_name in", values, "comName");
			return (Criteria) this;
		}

		public Criteria andComNameNotIn(List<String> values) {
			addCriterion("com_name not in", values, "comName");
			return (Criteria) this;
		}

		public Criteria andComNameBetween(String value1, String value2) {
			addCriterion("com_name between", value1, value2, "comName");
			return (Criteria) this;
		}

		public Criteria andComNameNotBetween(String value1, String value2) {
			addCriterion("com_name not between", value1, value2, "comName");
			return (Criteria) this;
		}

		public Criteria andAbbrNameIsNull() {
			addCriterion("abbr_name is null");
			return (Criteria) this;
		}

		public Criteria andAbbrNameIsNotNull() {
			addCriterion("abbr_name is not null");
			return (Criteria) this;
		}

		public Criteria andAbbrNameEqualTo(String value) {
			addCriterion("abbr_name =", value, "abbrName");
			return (Criteria) this;
		}

		public Criteria andAbbrNameNotEqualTo(String value) {
			addCriterion("abbr_name <>", value, "abbrName");
			return (Criteria) this;
		}

		public Criteria andAbbrNameGreaterThan(String value) {
			addCriterion("abbr_name >", value, "abbrName");
			return (Criteria) this;
		}

		public Criteria andAbbrNameGreaterThanOrEqualTo(String value) {
			addCriterion("abbr_name >=", value, "abbrName");
			return (Criteria) this;
		}

		public Criteria andAbbrNameLessThan(String value) {
			addCriterion("abbr_name <", value, "abbrName");
			return (Criteria) this;
		}

		public Criteria andAbbrNameLessThanOrEqualTo(String value) {
			addCriterion("abbr_name <=", value, "abbrName");
			return (Criteria) this;
		}

		public Criteria andAbbrNameLike(String value) {
			addCriterion("abbr_name like", value, "abbrName");
			return (Criteria) this;
		}

		public Criteria andAbbrNameNotLike(String value) {
			addCriterion("abbr_name not like", value, "abbrName");
			return (Criteria) this;
		}

		public Criteria andAbbrNameIn(List<String> values) {
			addCriterion("abbr_name in", values, "abbrName");
			return (Criteria) this;
		}

		public Criteria andAbbrNameNotIn(List<String> values) {
			addCriterion("abbr_name not in", values, "abbrName");
			return (Criteria) this;
		}

		public Criteria andAbbrNameBetween(String value1, String value2) {
			addCriterion("abbr_name between", value1, value2, "abbrName");
			return (Criteria) this;
		}

		public Criteria andAbbrNameNotBetween(String value1, String value2) {
			addCriterion("abbr_name not between", value1, value2, "abbrName");
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

		public Criteria andAddrCodeChnIsNull() {
			addCriterion("addr_code_chn is null");
			return (Criteria) this;
		}

		public Criteria andAddrCodeChnIsNotNull() {
			addCriterion("addr_code_chn is not null");
			return (Criteria) this;
		}

		public Criteria andAddrCodeChnEqualTo(String value) {
			addCriterion("addr_code_chn =", value, "addrCodeChn");
			return (Criteria) this;
		}

		public Criteria andAddrCodeChnNotEqualTo(String value) {
			addCriterion("addr_code_chn <>", value, "addrCodeChn");
			return (Criteria) this;
		}

		public Criteria andAddrCodeChnGreaterThan(String value) {
			addCriterion("addr_code_chn >", value, "addrCodeChn");
			return (Criteria) this;
		}

		public Criteria andAddrCodeChnGreaterThanOrEqualTo(String value) {
			addCriterion("addr_code_chn >=", value, "addrCodeChn");
			return (Criteria) this;
		}

		public Criteria andAddrCodeChnLessThan(String value) {
			addCriterion("addr_code_chn <", value, "addrCodeChn");
			return (Criteria) this;
		}

		public Criteria andAddrCodeChnLessThanOrEqualTo(String value) {
			addCriterion("addr_code_chn <=", value, "addrCodeChn");
			return (Criteria) this;
		}

		public Criteria andAddrCodeChnLike(String value) {
			addCriterion("addr_code_chn like", value, "addrCodeChn");
			return (Criteria) this;
		}

		public Criteria andAddrCodeChnNotLike(String value) {
			addCriterion("addr_code_chn not like", value, "addrCodeChn");
			return (Criteria) this;
		}

		public Criteria andAddrCodeChnIn(List<String> values) {
			addCriterion("addr_code_chn in", values, "addrCodeChn");
			return (Criteria) this;
		}

		public Criteria andAddrCodeChnNotIn(List<String> values) {
			addCriterion("addr_code_chn not in", values, "addrCodeChn");
			return (Criteria) this;
		}

		public Criteria andAddrCodeChnBetween(String value1, String value2) {
			addCriterion("addr_code_chn between", value1, value2, "addrCodeChn");
			return (Criteria) this;
		}

		public Criteria andAddrCodeChnNotBetween(String value1, String value2) {
			addCriterion("addr_code_chn not between", value1, value2, "addrCodeChn");
			return (Criteria) this;
		}

		public Criteria andAddrInfoIsNull() {
			addCriterion("addr_info is null");
			return (Criteria) this;
		}

		public Criteria andAddrInfoIsNotNull() {
			addCriterion("addr_info is not null");
			return (Criteria) this;
		}

		public Criteria andAddrInfoEqualTo(String value) {
			addCriterion("addr_info =", value, "addrInfo");
			return (Criteria) this;
		}

		public Criteria andAddrInfoNotEqualTo(String value) {
			addCriterion("addr_info <>", value, "addrInfo");
			return (Criteria) this;
		}

		public Criteria andAddrInfoGreaterThan(String value) {
			addCriterion("addr_info >", value, "addrInfo");
			return (Criteria) this;
		}

		public Criteria andAddrInfoGreaterThanOrEqualTo(String value) {
			addCriterion("addr_info >=", value, "addrInfo");
			return (Criteria) this;
		}

		public Criteria andAddrInfoLessThan(String value) {
			addCriterion("addr_info <", value, "addrInfo");
			return (Criteria) this;
		}

		public Criteria andAddrInfoLessThanOrEqualTo(String value) {
			addCriterion("addr_info <=", value, "addrInfo");
			return (Criteria) this;
		}

		public Criteria andAddrInfoLike(String value) {
			addCriterion("addr_info like", value, "addrInfo");
			return (Criteria) this;
		}

		public Criteria andAddrInfoNotLike(String value) {
			addCriterion("addr_info not like", value, "addrInfo");
			return (Criteria) this;
		}

		public Criteria andAddrInfoIn(List<String> values) {
			addCriterion("addr_info in", values, "addrInfo");
			return (Criteria) this;
		}

		public Criteria andAddrInfoNotIn(List<String> values) {
			addCriterion("addr_info not in", values, "addrInfo");
			return (Criteria) this;
		}

		public Criteria andAddrInfoBetween(String value1, String value2) {
			addCriterion("addr_info between", value1, value2, "addrInfo");
			return (Criteria) this;
		}

		public Criteria andAddrInfoNotBetween(String value1, String value2) {
			addCriterion("addr_info not between", value1, value2, "addrInfo");
			return (Criteria) this;
		}

		public Criteria andContactPersonIsNull() {
			addCriterion("contact_person is null");
			return (Criteria) this;
		}

		public Criteria andContactPersonIsNotNull() {
			addCriterion("contact_person is not null");
			return (Criteria) this;
		}

		public Criteria andContactPersonEqualTo(String value) {
			addCriterion("contact_person =", value, "contactPerson");
			return (Criteria) this;
		}

		public Criteria andContactPersonNotEqualTo(String value) {
			addCriterion("contact_person <>", value, "contactPerson");
			return (Criteria) this;
		}

		public Criteria andContactPersonGreaterThan(String value) {
			addCriterion("contact_person >", value, "contactPerson");
			return (Criteria) this;
		}

		public Criteria andContactPersonGreaterThanOrEqualTo(String value) {
			addCriterion("contact_person >=", value, "contactPerson");
			return (Criteria) this;
		}

		public Criteria andContactPersonLessThan(String value) {
			addCriterion("contact_person <", value, "contactPerson");
			return (Criteria) this;
		}

		public Criteria andContactPersonLessThanOrEqualTo(String value) {
			addCriterion("contact_person <=", value, "contactPerson");
			return (Criteria) this;
		}

		public Criteria andContactPersonLike(String value) {
			addCriterion("contact_person like", value, "contactPerson");
			return (Criteria) this;
		}

		public Criteria andContactPersonNotLike(String value) {
			addCriterion("contact_person not like", value, "contactPerson");
			return (Criteria) this;
		}

		public Criteria andContactPersonIn(List<String> values) {
			addCriterion("contact_person in", values, "contactPerson");
			return (Criteria) this;
		}

		public Criteria andContactPersonNotIn(List<String> values) {
			addCriterion("contact_person not in", values, "contactPerson");
			return (Criteria) this;
		}

		public Criteria andContactPersonBetween(String value1, String value2) {
			addCriterion("contact_person between", value1, value2, "contactPerson");
			return (Criteria) this;
		}

		public Criteria andContactPersonNotBetween(String value1, String value2) {
			addCriterion("contact_person not between", value1, value2, "contactPerson");
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

		public Criteria andPhoneNoIsNull() {
			addCriterion("phone_no is null");
			return (Criteria) this;
		}

		public Criteria andPhoneNoIsNotNull() {
			addCriterion("phone_no is not null");
			return (Criteria) this;
		}

		public Criteria andPhoneNoEqualTo(String value) {
			addCriterion("phone_no =", value, "phoneNo");
			return (Criteria) this;
		}

		public Criteria andPhoneNoNotEqualTo(String value) {
			addCriterion("phone_no <>", value, "phoneNo");
			return (Criteria) this;
		}

		public Criteria andPhoneNoGreaterThan(String value) {
			addCriterion("phone_no >", value, "phoneNo");
			return (Criteria) this;
		}

		public Criteria andPhoneNoGreaterThanOrEqualTo(String value) {
			addCriterion("phone_no >=", value, "phoneNo");
			return (Criteria) this;
		}

		public Criteria andPhoneNoLessThan(String value) {
			addCriterion("phone_no <", value, "phoneNo");
			return (Criteria) this;
		}

		public Criteria andPhoneNoLessThanOrEqualTo(String value) {
			addCriterion("phone_no <=", value, "phoneNo");
			return (Criteria) this;
		}

		public Criteria andPhoneNoLike(String value) {
			addCriterion("phone_no like", value, "phoneNo");
			return (Criteria) this;
		}

		public Criteria andPhoneNoNotLike(String value) {
			addCriterion("phone_no not like", value, "phoneNo");
			return (Criteria) this;
		}

		public Criteria andPhoneNoIn(List<String> values) {
			addCriterion("phone_no in", values, "phoneNo");
			return (Criteria) this;
		}

		public Criteria andPhoneNoNotIn(List<String> values) {
			addCriterion("phone_no not in", values, "phoneNo");
			return (Criteria) this;
		}

		public Criteria andPhoneNoBetween(String value1, String value2) {
			addCriterion("phone_no between", value1, value2, "phoneNo");
			return (Criteria) this;
		}

		public Criteria andPhoneNoNotBetween(String value1, String value2) {
			addCriterion("phone_no not between", value1, value2, "phoneNo");
			return (Criteria) this;
		}

		public Criteria andFaxIsNull() {
			addCriterion("fax is null");
			return (Criteria) this;
		}

		public Criteria andFaxIsNotNull() {
			addCriterion("fax is not null");
			return (Criteria) this;
		}

		public Criteria andFaxEqualTo(String value) {
			addCriterion("fax =", value, "fax");
			return (Criteria) this;
		}

		public Criteria andFaxNotEqualTo(String value) {
			addCriterion("fax <>", value, "fax");
			return (Criteria) this;
		}

		public Criteria andFaxGreaterThan(String value) {
			addCriterion("fax >", value, "fax");
			return (Criteria) this;
		}

		public Criteria andFaxGreaterThanOrEqualTo(String value) {
			addCriterion("fax >=", value, "fax");
			return (Criteria) this;
		}

		public Criteria andFaxLessThan(String value) {
			addCriterion("fax <", value, "fax");
			return (Criteria) this;
		}

		public Criteria andFaxLessThanOrEqualTo(String value) {
			addCriterion("fax <=", value, "fax");
			return (Criteria) this;
		}

		public Criteria andFaxLike(String value) {
			addCriterion("fax like", value, "fax");
			return (Criteria) this;
		}

		public Criteria andFaxNotLike(String value) {
			addCriterion("fax not like", value, "fax");
			return (Criteria) this;
		}

		public Criteria andFaxIn(List<String> values) {
			addCriterion("fax in", values, "fax");
			return (Criteria) this;
		}

		public Criteria andFaxNotIn(List<String> values) {
			addCriterion("fax not in", values, "fax");
			return (Criteria) this;
		}

		public Criteria andFaxBetween(String value1, String value2) {
			addCriterion("fax between", value1, value2, "fax");
			return (Criteria) this;
		}

		public Criteria andFaxNotBetween(String value1, String value2) {
			addCriterion("fax not between", value1, value2, "fax");
			return (Criteria) this;
		}

		public Criteria andBankNameIsNull() {
			addCriterion("bank_name is null");
			return (Criteria) this;
		}

		public Criteria andBankNameIsNotNull() {
			addCriterion("bank_name is not null");
			return (Criteria) this;
		}

		public Criteria andBankNameEqualTo(String value) {
			addCriterion("bank_name =", value, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNameNotEqualTo(String value) {
			addCriterion("bank_name <>", value, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNameGreaterThan(String value) {
			addCriterion("bank_name >", value, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNameGreaterThanOrEqualTo(String value) {
			addCriterion("bank_name >=", value, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNameLessThan(String value) {
			addCriterion("bank_name <", value, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNameLessThanOrEqualTo(String value) {
			addCriterion("bank_name <=", value, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNameLike(String value) {
			addCriterion("bank_name like", value, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNameNotLike(String value) {
			addCriterion("bank_name not like", value, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNameIn(List<String> values) {
			addCriterion("bank_name in", values, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNameNotIn(List<String> values) {
			addCriterion("bank_name not in", values, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNameBetween(String value1, String value2) {
			addCriterion("bank_name between", value1, value2, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNameNotBetween(String value1, String value2) {
			addCriterion("bank_name not between", value1, value2, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankAccountIsNull() {
			addCriterion("bank_account is null");
			return (Criteria) this;
		}

		public Criteria andBankAccountIsNotNull() {
			addCriterion("bank_account is not null");
			return (Criteria) this;
		}

		public Criteria andBankAccountEqualTo(String value) {
			addCriterion("bank_account =", value, "bankAccount");
			return (Criteria) this;
		}

		public Criteria andBankAccountNotEqualTo(String value) {
			addCriterion("bank_account <>", value, "bankAccount");
			return (Criteria) this;
		}

		public Criteria andBankAccountGreaterThan(String value) {
			addCriterion("bank_account >", value, "bankAccount");
			return (Criteria) this;
		}

		public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
			addCriterion("bank_account >=", value, "bankAccount");
			return (Criteria) this;
		}

		public Criteria andBankAccountLessThan(String value) {
			addCriterion("bank_account <", value, "bankAccount");
			return (Criteria) this;
		}

		public Criteria andBankAccountLessThanOrEqualTo(String value) {
			addCriterion("bank_account <=", value, "bankAccount");
			return (Criteria) this;
		}

		public Criteria andBankAccountLike(String value) {
			addCriterion("bank_account like", value, "bankAccount");
			return (Criteria) this;
		}

		public Criteria andBankAccountNotLike(String value) {
			addCriterion("bank_account not like", value, "bankAccount");
			return (Criteria) this;
		}

		public Criteria andBankAccountIn(List<String> values) {
			addCriterion("bank_account in", values, "bankAccount");
			return (Criteria) this;
		}

		public Criteria andBankAccountNotIn(List<String> values) {
			addCriterion("bank_account not in", values, "bankAccount");
			return (Criteria) this;
		}

		public Criteria andBankAccountBetween(String value1, String value2) {
			addCriterion("bank_account between", value1, value2, "bankAccount");
			return (Criteria) this;
		}

		public Criteria andBankAccountNotBetween(String value1, String value2) {
			addCriterion("bank_account not between", value1, value2, "bankAccount");
			return (Criteria) this;
		}

		public Criteria andTaxNumberIsNull() {
			addCriterion("tax_number is null");
			return (Criteria) this;
		}

		public Criteria andTaxNumberIsNotNull() {
			addCriterion("tax_number is not null");
			return (Criteria) this;
		}

		public Criteria andTaxNumberEqualTo(String value) {
			addCriterion("tax_number =", value, "taxNumber");
			return (Criteria) this;
		}

		public Criteria andTaxNumberNotEqualTo(String value) {
			addCriterion("tax_number <>", value, "taxNumber");
			return (Criteria) this;
		}

		public Criteria andTaxNumberGreaterThan(String value) {
			addCriterion("tax_number >", value, "taxNumber");
			return (Criteria) this;
		}

		public Criteria andTaxNumberGreaterThanOrEqualTo(String value) {
			addCriterion("tax_number >=", value, "taxNumber");
			return (Criteria) this;
		}

		public Criteria andTaxNumberLessThan(String value) {
			addCriterion("tax_number <", value, "taxNumber");
			return (Criteria) this;
		}

		public Criteria andTaxNumberLessThanOrEqualTo(String value) {
			addCriterion("tax_number <=", value, "taxNumber");
			return (Criteria) this;
		}

		public Criteria andTaxNumberLike(String value) {
			addCriterion("tax_number like", value, "taxNumber");
			return (Criteria) this;
		}

		public Criteria andTaxNumberNotLike(String value) {
			addCriterion("tax_number not like", value, "taxNumber");
			return (Criteria) this;
		}

		public Criteria andTaxNumberIn(List<String> values) {
			addCriterion("tax_number in", values, "taxNumber");
			return (Criteria) this;
		}

		public Criteria andTaxNumberNotIn(List<String> values) {
			addCriterion("tax_number not in", values, "taxNumber");
			return (Criteria) this;
		}

		public Criteria andTaxNumberBetween(String value1, String value2) {
			addCriterion("tax_number between", value1, value2, "taxNumber");
			return (Criteria) this;
		}

		public Criteria andTaxNumberNotBetween(String value1, String value2) {
			addCriterion("tax_number not between", value1, value2, "taxNumber");
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

		public Criteria andGpsXIsNull() {
			addCriterion("gps_x is null");
			return (Criteria) this;
		}

		public Criteria andGpsXIsNotNull() {
			addCriterion("gps_x is not null");
			return (Criteria) this;
		}

		public Criteria andGpsXEqualTo(String value) {
			addCriterion("gps_x =", value, "gpsX");
			return (Criteria) this;
		}

		public Criteria andGpsXNotEqualTo(String value) {
			addCriterion("gps_x <>", value, "gpsX");
			return (Criteria) this;
		}

		public Criteria andGpsXGreaterThan(String value) {
			addCriterion("gps_x >", value, "gpsX");
			return (Criteria) this;
		}

		public Criteria andGpsXGreaterThanOrEqualTo(String value) {
			addCriterion("gps_x >=", value, "gpsX");
			return (Criteria) this;
		}

		public Criteria andGpsXLessThan(String value) {
			addCriterion("gps_x <", value, "gpsX");
			return (Criteria) this;
		}

		public Criteria andGpsXLessThanOrEqualTo(String value) {
			addCriterion("gps_x <=", value, "gpsX");
			return (Criteria) this;
		}

		public Criteria andGpsXLike(String value) {
			addCriterion("gps_x like", value, "gpsX");
			return (Criteria) this;
		}

		public Criteria andGpsXNotLike(String value) {
			addCriterion("gps_x not like", value, "gpsX");
			return (Criteria) this;
		}

		public Criteria andGpsXIn(List<String> values) {
			addCriterion("gps_x in", values, "gpsX");
			return (Criteria) this;
		}

		public Criteria andGpsXNotIn(List<String> values) {
			addCriterion("gps_x not in", values, "gpsX");
			return (Criteria) this;
		}

		public Criteria andGpsXBetween(String value1, String value2) {
			addCriterion("gps_x between", value1, value2, "gpsX");
			return (Criteria) this;
		}

		public Criteria andGpsXNotBetween(String value1, String value2) {
			addCriterion("gps_x not between", value1, value2, "gpsX");
			return (Criteria) this;
		}

		public Criteria andGpsYIsNull() {
			addCriterion("gps_y is null");
			return (Criteria) this;
		}

		public Criteria andGpsYIsNotNull() {
			addCriterion("gps_y is not null");
			return (Criteria) this;
		}

		public Criteria andGpsYEqualTo(String value) {
			addCriterion("gps_y =", value, "gpsY");
			return (Criteria) this;
		}

		public Criteria andGpsYNotEqualTo(String value) {
			addCriterion("gps_y <>", value, "gpsY");
			return (Criteria) this;
		}

		public Criteria andGpsYGreaterThan(String value) {
			addCriterion("gps_y >", value, "gpsY");
			return (Criteria) this;
		}

		public Criteria andGpsYGreaterThanOrEqualTo(String value) {
			addCriterion("gps_y >=", value, "gpsY");
			return (Criteria) this;
		}

		public Criteria andGpsYLessThan(String value) {
			addCriterion("gps_y <", value, "gpsY");
			return (Criteria) this;
		}

		public Criteria andGpsYLessThanOrEqualTo(String value) {
			addCriterion("gps_y <=", value, "gpsY");
			return (Criteria) this;
		}

		public Criteria andGpsYLike(String value) {
			addCriterion("gps_y like", value, "gpsY");
			return (Criteria) this;
		}

		public Criteria andGpsYNotLike(String value) {
			addCriterion("gps_y not like", value, "gpsY");
			return (Criteria) this;
		}

		public Criteria andGpsYIn(List<String> values) {
			addCriterion("gps_y in", values, "gpsY");
			return (Criteria) this;
		}

		public Criteria andGpsYNotIn(List<String> values) {
			addCriterion("gps_y not in", values, "gpsY");
			return (Criteria) this;
		}

		public Criteria andGpsYBetween(String value1, String value2) {
			addCriterion("gps_y between", value1, value2, "gpsY");
			return (Criteria) this;
		}

		public Criteria andGpsYNotBetween(String value1, String value2) {
			addCriterion("gps_y not between", value1, value2, "gpsY");
			return (Criteria) this;
		}

		public Criteria andGpsAddrIsNull() {
			addCriterion("gps_addr is null");
			return (Criteria) this;
		}

		public Criteria andGpsAddrIsNotNull() {
			addCriterion("gps_addr is not null");
			return (Criteria) this;
		}

		public Criteria andGpsAddrEqualTo(String value) {
			addCriterion("gps_addr =", value, "gpsAddr");
			return (Criteria) this;
		}

		public Criteria andGpsAddrNotEqualTo(String value) {
			addCriterion("gps_addr <>", value, "gpsAddr");
			return (Criteria) this;
		}

		public Criteria andGpsAddrGreaterThan(String value) {
			addCriterion("gps_addr >", value, "gpsAddr");
			return (Criteria) this;
		}

		public Criteria andGpsAddrGreaterThanOrEqualTo(String value) {
			addCriterion("gps_addr >=", value, "gpsAddr");
			return (Criteria) this;
		}

		public Criteria andGpsAddrLessThan(String value) {
			addCriterion("gps_addr <", value, "gpsAddr");
			return (Criteria) this;
		}

		public Criteria andGpsAddrLessThanOrEqualTo(String value) {
			addCriterion("gps_addr <=", value, "gpsAddr");
			return (Criteria) this;
		}

		public Criteria andGpsAddrLike(String value) {
			addCriterion("gps_addr like", value, "gpsAddr");
			return (Criteria) this;
		}

		public Criteria andGpsAddrNotLike(String value) {
			addCriterion("gps_addr not like", value, "gpsAddr");
			return (Criteria) this;
		}

		public Criteria andGpsAddrIn(List<String> values) {
			addCriterion("gps_addr in", values, "gpsAddr");
			return (Criteria) this;
		}

		public Criteria andGpsAddrNotIn(List<String> values) {
			addCriterion("gps_addr not in", values, "gpsAddr");
			return (Criteria) this;
		}

		public Criteria andGpsAddrBetween(String value1, String value2) {
			addCriterion("gps_addr between", value1, value2, "gpsAddr");
			return (Criteria) this;
		}

		public Criteria andGpsAddrNotBetween(String value1, String value2) {
			addCriterion("gps_addr not between", value1, value2, "gpsAddr");
			return (Criteria) this;
		}
	}

	/**
	 * com_basic
	 *
	 * @mbg.generated do_not_delete_during_merge
	 */
	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	/**
	 * com_basic null
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