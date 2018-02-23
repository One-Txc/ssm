package txc.xyz.base.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class WxBaseConfigExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public WxBaseConfigExample() {
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
	 * wx_base_config null
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

		public Criteria andSysIdIsNull() {
			addCriterion("sys_id is null");
			return (Criteria) this;
		}

		public Criteria andSysIdIsNotNull() {
			addCriterion("sys_id is not null");
			return (Criteria) this;
		}

		public Criteria andSysIdEqualTo(Long value) {
			addCriterion("sys_id =", value, "sysId");
			return (Criteria) this;
		}

		public Criteria andSysIdNotEqualTo(Long value) {
			addCriterion("sys_id <>", value, "sysId");
			return (Criteria) this;
		}

		public Criteria andSysIdGreaterThan(Long value) {
			addCriterion("sys_id >", value, "sysId");
			return (Criteria) this;
		}

		public Criteria andSysIdGreaterThanOrEqualTo(Long value) {
			addCriterion("sys_id >=", value, "sysId");
			return (Criteria) this;
		}

		public Criteria andSysIdLessThan(Long value) {
			addCriterion("sys_id <", value, "sysId");
			return (Criteria) this;
		}

		public Criteria andSysIdLessThanOrEqualTo(Long value) {
			addCriterion("sys_id <=", value, "sysId");
			return (Criteria) this;
		}

		public Criteria andSysIdIn(List<Long> values) {
			addCriterion("sys_id in", values, "sysId");
			return (Criteria) this;
		}

		public Criteria andSysIdNotIn(List<Long> values) {
			addCriterion("sys_id not in", values, "sysId");
			return (Criteria) this;
		}

		public Criteria andSysIdBetween(Long value1, Long value2) {
			addCriterion("sys_id between", value1, value2, "sysId");
			return (Criteria) this;
		}

		public Criteria andSysIdNotBetween(Long value1, Long value2) {
			addCriterion("sys_id not between", value1, value2, "sysId");
			return (Criteria) this;
		}

		public Criteria andSysNameIsNull() {
			addCriterion("sys_name is null");
			return (Criteria) this;
		}

		public Criteria andSysNameIsNotNull() {
			addCriterion("sys_name is not null");
			return (Criteria) this;
		}

		public Criteria andSysNameEqualTo(String value) {
			addCriterion("sys_name =", value, "sysName");
			return (Criteria) this;
		}

		public Criteria andSysNameNotEqualTo(String value) {
			addCriterion("sys_name <>", value, "sysName");
			return (Criteria) this;
		}

		public Criteria andSysNameGreaterThan(String value) {
			addCriterion("sys_name >", value, "sysName");
			return (Criteria) this;
		}

		public Criteria andSysNameGreaterThanOrEqualTo(String value) {
			addCriterion("sys_name >=", value, "sysName");
			return (Criteria) this;
		}

		public Criteria andSysNameLessThan(String value) {
			addCriterion("sys_name <", value, "sysName");
			return (Criteria) this;
		}

		public Criteria andSysNameLessThanOrEqualTo(String value) {
			addCriterion("sys_name <=", value, "sysName");
			return (Criteria) this;
		}

		public Criteria andSysNameLike(String value) {
			addCriterion("sys_name like", value, "sysName");
			return (Criteria) this;
		}

		public Criteria andSysNameNotLike(String value) {
			addCriterion("sys_name not like", value, "sysName");
			return (Criteria) this;
		}

		public Criteria andSysNameIn(List<String> values) {
			addCriterion("sys_name in", values, "sysName");
			return (Criteria) this;
		}

		public Criteria andSysNameNotIn(List<String> values) {
			addCriterion("sys_name not in", values, "sysName");
			return (Criteria) this;
		}

		public Criteria andSysNameBetween(String value1, String value2) {
			addCriterion("sys_name between", value1, value2, "sysName");
			return (Criteria) this;
		}

		public Criteria andSysNameNotBetween(String value1, String value2) {
			addCriterion("sys_name not between", value1, value2, "sysName");
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

		public Criteria andAppSecretIsNull() {
			addCriterion("app_secret is null");
			return (Criteria) this;
		}

		public Criteria andAppSecretIsNotNull() {
			addCriterion("app_secret is not null");
			return (Criteria) this;
		}

		public Criteria andAppSecretEqualTo(String value) {
			addCriterion("app_secret =", value, "appSecret");
			return (Criteria) this;
		}

		public Criteria andAppSecretNotEqualTo(String value) {
			addCriterion("app_secret <>", value, "appSecret");
			return (Criteria) this;
		}

		public Criteria andAppSecretGreaterThan(String value) {
			addCriterion("app_secret >", value, "appSecret");
			return (Criteria) this;
		}

		public Criteria andAppSecretGreaterThanOrEqualTo(String value) {
			addCriterion("app_secret >=", value, "appSecret");
			return (Criteria) this;
		}

		public Criteria andAppSecretLessThan(String value) {
			addCriterion("app_secret <", value, "appSecret");
			return (Criteria) this;
		}

		public Criteria andAppSecretLessThanOrEqualTo(String value) {
			addCriterion("app_secret <=", value, "appSecret");
			return (Criteria) this;
		}

		public Criteria andAppSecretLike(String value) {
			addCriterion("app_secret like", value, "appSecret");
			return (Criteria) this;
		}

		public Criteria andAppSecretNotLike(String value) {
			addCriterion("app_secret not like", value, "appSecret");
			return (Criteria) this;
		}

		public Criteria andAppSecretIn(List<String> values) {
			addCriterion("app_secret in", values, "appSecret");
			return (Criteria) this;
		}

		public Criteria andAppSecretNotIn(List<String> values) {
			addCriterion("app_secret not in", values, "appSecret");
			return (Criteria) this;
		}

		public Criteria andAppSecretBetween(String value1, String value2) {
			addCriterion("app_secret between", value1, value2, "appSecret");
			return (Criteria) this;
		}

		public Criteria andAppSecretNotBetween(String value1, String value2) {
			addCriterion("app_secret not between", value1, value2, "appSecret");
			return (Criteria) this;
		}

		public Criteria andOriginalIdIsNull() {
			addCriterion("original_id is null");
			return (Criteria) this;
		}

		public Criteria andOriginalIdIsNotNull() {
			addCriterion("original_id is not null");
			return (Criteria) this;
		}

		public Criteria andOriginalIdEqualTo(String value) {
			addCriterion("original_id =", value, "originalId");
			return (Criteria) this;
		}

		public Criteria andOriginalIdNotEqualTo(String value) {
			addCriterion("original_id <>", value, "originalId");
			return (Criteria) this;
		}

		public Criteria andOriginalIdGreaterThan(String value) {
			addCriterion("original_id >", value, "originalId");
			return (Criteria) this;
		}

		public Criteria andOriginalIdGreaterThanOrEqualTo(String value) {
			addCriterion("original_id >=", value, "originalId");
			return (Criteria) this;
		}

		public Criteria andOriginalIdLessThan(String value) {
			addCriterion("original_id <", value, "originalId");
			return (Criteria) this;
		}

		public Criteria andOriginalIdLessThanOrEqualTo(String value) {
			addCriterion("original_id <=", value, "originalId");
			return (Criteria) this;
		}

		public Criteria andOriginalIdLike(String value) {
			addCriterion("original_id like", value, "originalId");
			return (Criteria) this;
		}

		public Criteria andOriginalIdNotLike(String value) {
			addCriterion("original_id not like", value, "originalId");
			return (Criteria) this;
		}

		public Criteria andOriginalIdIn(List<String> values) {
			addCriterion("original_id in", values, "originalId");
			return (Criteria) this;
		}

		public Criteria andOriginalIdNotIn(List<String> values) {
			addCriterion("original_id not in", values, "originalId");
			return (Criteria) this;
		}

		public Criteria andOriginalIdBetween(String value1, String value2) {
			addCriterion("original_id between", value1, value2, "originalId");
			return (Criteria) this;
		}

		public Criteria andOriginalIdNotBetween(String value1, String value2) {
			addCriterion("original_id not between", value1, value2, "originalId");
			return (Criteria) this;
		}

		public Criteria andMerchantNoIsNull() {
			addCriterion("merchant_no is null");
			return (Criteria) this;
		}

		public Criteria andMerchantNoIsNotNull() {
			addCriterion("merchant_no is not null");
			return (Criteria) this;
		}

		public Criteria andMerchantNoEqualTo(String value) {
			addCriterion("merchant_no =", value, "merchantNo");
			return (Criteria) this;
		}

		public Criteria andMerchantNoNotEqualTo(String value) {
			addCriterion("merchant_no <>", value, "merchantNo");
			return (Criteria) this;
		}

		public Criteria andMerchantNoGreaterThan(String value) {
			addCriterion("merchant_no >", value, "merchantNo");
			return (Criteria) this;
		}

		public Criteria andMerchantNoGreaterThanOrEqualTo(String value) {
			addCriterion("merchant_no >=", value, "merchantNo");
			return (Criteria) this;
		}

		public Criteria andMerchantNoLessThan(String value) {
			addCriterion("merchant_no <", value, "merchantNo");
			return (Criteria) this;
		}

		public Criteria andMerchantNoLessThanOrEqualTo(String value) {
			addCriterion("merchant_no <=", value, "merchantNo");
			return (Criteria) this;
		}

		public Criteria andMerchantNoLike(String value) {
			addCriterion("merchant_no like", value, "merchantNo");
			return (Criteria) this;
		}

		public Criteria andMerchantNoNotLike(String value) {
			addCriterion("merchant_no not like", value, "merchantNo");
			return (Criteria) this;
		}

		public Criteria andMerchantNoIn(List<String> values) {
			addCriterion("merchant_no in", values, "merchantNo");
			return (Criteria) this;
		}

		public Criteria andMerchantNoNotIn(List<String> values) {
			addCriterion("merchant_no not in", values, "merchantNo");
			return (Criteria) this;
		}

		public Criteria andMerchantNoBetween(String value1, String value2) {
			addCriterion("merchant_no between", value1, value2, "merchantNo");
			return (Criteria) this;
		}

		public Criteria andMerchantNoNotBetween(String value1, String value2) {
			addCriterion("merchant_no not between", value1, value2, "merchantNo");
			return (Criteria) this;
		}

		public Criteria andMerchantKeyIsNull() {
			addCriterion("merchant_key is null");
			return (Criteria) this;
		}

		public Criteria andMerchantKeyIsNotNull() {
			addCriterion("merchant_key is not null");
			return (Criteria) this;
		}

		public Criteria andMerchantKeyEqualTo(String value) {
			addCriterion("merchant_key =", value, "merchantKey");
			return (Criteria) this;
		}

		public Criteria andMerchantKeyNotEqualTo(String value) {
			addCriterion("merchant_key <>", value, "merchantKey");
			return (Criteria) this;
		}

		public Criteria andMerchantKeyGreaterThan(String value) {
			addCriterion("merchant_key >", value, "merchantKey");
			return (Criteria) this;
		}

		public Criteria andMerchantKeyGreaterThanOrEqualTo(String value) {
			addCriterion("merchant_key >=", value, "merchantKey");
			return (Criteria) this;
		}

		public Criteria andMerchantKeyLessThan(String value) {
			addCriterion("merchant_key <", value, "merchantKey");
			return (Criteria) this;
		}

		public Criteria andMerchantKeyLessThanOrEqualTo(String value) {
			addCriterion("merchant_key <=", value, "merchantKey");
			return (Criteria) this;
		}

		public Criteria andMerchantKeyLike(String value) {
			addCriterion("merchant_key like", value, "merchantKey");
			return (Criteria) this;
		}

		public Criteria andMerchantKeyNotLike(String value) {
			addCriterion("merchant_key not like", value, "merchantKey");
			return (Criteria) this;
		}

		public Criteria andMerchantKeyIn(List<String> values) {
			addCriterion("merchant_key in", values, "merchantKey");
			return (Criteria) this;
		}

		public Criteria andMerchantKeyNotIn(List<String> values) {
			addCriterion("merchant_key not in", values, "merchantKey");
			return (Criteria) this;
		}

		public Criteria andMerchantKeyBetween(String value1, String value2) {
			addCriterion("merchant_key between", value1, value2, "merchantKey");
			return (Criteria) this;
		}

		public Criteria andMerchantKeyNotBetween(String value1, String value2) {
			addCriterion("merchant_key not between", value1, value2, "merchantKey");
			return (Criteria) this;
		}

		public Criteria andCallbackUrlIsNull() {
			addCriterion("callback_url is null");
			return (Criteria) this;
		}

		public Criteria andCallbackUrlIsNotNull() {
			addCriterion("callback_url is not null");
			return (Criteria) this;
		}

		public Criteria andCallbackUrlEqualTo(String value) {
			addCriterion("callback_url =", value, "callbackUrl");
			return (Criteria) this;
		}

		public Criteria andCallbackUrlNotEqualTo(String value) {
			addCriterion("callback_url <>", value, "callbackUrl");
			return (Criteria) this;
		}

		public Criteria andCallbackUrlGreaterThan(String value) {
			addCriterion("callback_url >", value, "callbackUrl");
			return (Criteria) this;
		}

		public Criteria andCallbackUrlGreaterThanOrEqualTo(String value) {
			addCriterion("callback_url >=", value, "callbackUrl");
			return (Criteria) this;
		}

		public Criteria andCallbackUrlLessThan(String value) {
			addCriterion("callback_url <", value, "callbackUrl");
			return (Criteria) this;
		}

		public Criteria andCallbackUrlLessThanOrEqualTo(String value) {
			addCriterion("callback_url <=", value, "callbackUrl");
			return (Criteria) this;
		}

		public Criteria andCallbackUrlLike(String value) {
			addCriterion("callback_url like", value, "callbackUrl");
			return (Criteria) this;
		}

		public Criteria andCallbackUrlNotLike(String value) {
			addCriterion("callback_url not like", value, "callbackUrl");
			return (Criteria) this;
		}

		public Criteria andCallbackUrlIn(List<String> values) {
			addCriterion("callback_url in", values, "callbackUrl");
			return (Criteria) this;
		}

		public Criteria andCallbackUrlNotIn(List<String> values) {
			addCriterion("callback_url not in", values, "callbackUrl");
			return (Criteria) this;
		}

		public Criteria andCallbackUrlBetween(String value1, String value2) {
			addCriterion("callback_url between", value1, value2, "callbackUrl");
			return (Criteria) this;
		}

		public Criteria andCallbackUrlNotBetween(String value1, String value2) {
			addCriterion("callback_url not between", value1, value2, "callbackUrl");
			return (Criteria) this;
		}

		public Criteria andQrcodeUrlIsNull() {
			addCriterion("qrcode_url is null");
			return (Criteria) this;
		}

		public Criteria andQrcodeUrlIsNotNull() {
			addCriterion("qrcode_url is not null");
			return (Criteria) this;
		}

		public Criteria andQrcodeUrlEqualTo(String value) {
			addCriterion("qrcode_url =", value, "qrcodeUrl");
			return (Criteria) this;
		}

		public Criteria andQrcodeUrlNotEqualTo(String value) {
			addCriterion("qrcode_url <>", value, "qrcodeUrl");
			return (Criteria) this;
		}

		public Criteria andQrcodeUrlGreaterThan(String value) {
			addCriterion("qrcode_url >", value, "qrcodeUrl");
			return (Criteria) this;
		}

		public Criteria andQrcodeUrlGreaterThanOrEqualTo(String value) {
			addCriterion("qrcode_url >=", value, "qrcodeUrl");
			return (Criteria) this;
		}

		public Criteria andQrcodeUrlLessThan(String value) {
			addCriterion("qrcode_url <", value, "qrcodeUrl");
			return (Criteria) this;
		}

		public Criteria andQrcodeUrlLessThanOrEqualTo(String value) {
			addCriterion("qrcode_url <=", value, "qrcodeUrl");
			return (Criteria) this;
		}

		public Criteria andQrcodeUrlLike(String value) {
			addCriterion("qrcode_url like", value, "qrcodeUrl");
			return (Criteria) this;
		}

		public Criteria andQrcodeUrlNotLike(String value) {
			addCriterion("qrcode_url not like", value, "qrcodeUrl");
			return (Criteria) this;
		}

		public Criteria andQrcodeUrlIn(List<String> values) {
			addCriterion("qrcode_url in", values, "qrcodeUrl");
			return (Criteria) this;
		}

		public Criteria andQrcodeUrlNotIn(List<String> values) {
			addCriterion("qrcode_url not in", values, "qrcodeUrl");
			return (Criteria) this;
		}

		public Criteria andQrcodeUrlBetween(String value1, String value2) {
			addCriterion("qrcode_url between", value1, value2, "qrcodeUrl");
			return (Criteria) this;
		}

		public Criteria andQrcodeUrlNotBetween(String value1, String value2) {
			addCriterion("qrcode_url not between", value1, value2, "qrcodeUrl");
			return (Criteria) this;
		}

		public Criteria andServiceMobileIsNull() {
			addCriterion("service_mobile is null");
			return (Criteria) this;
		}

		public Criteria andServiceMobileIsNotNull() {
			addCriterion("service_mobile is not null");
			return (Criteria) this;
		}

		public Criteria andServiceMobileEqualTo(String value) {
			addCriterion("service_mobile =", value, "serviceMobile");
			return (Criteria) this;
		}

		public Criteria andServiceMobileNotEqualTo(String value) {
			addCriterion("service_mobile <>", value, "serviceMobile");
			return (Criteria) this;
		}

		public Criteria andServiceMobileGreaterThan(String value) {
			addCriterion("service_mobile >", value, "serviceMobile");
			return (Criteria) this;
		}

		public Criteria andServiceMobileGreaterThanOrEqualTo(String value) {
			addCriterion("service_mobile >=", value, "serviceMobile");
			return (Criteria) this;
		}

		public Criteria andServiceMobileLessThan(String value) {
			addCriterion("service_mobile <", value, "serviceMobile");
			return (Criteria) this;
		}

		public Criteria andServiceMobileLessThanOrEqualTo(String value) {
			addCriterion("service_mobile <=", value, "serviceMobile");
			return (Criteria) this;
		}

		public Criteria andServiceMobileLike(String value) {
			addCriterion("service_mobile like", value, "serviceMobile");
			return (Criteria) this;
		}

		public Criteria andServiceMobileNotLike(String value) {
			addCriterion("service_mobile not like", value, "serviceMobile");
			return (Criteria) this;
		}

		public Criteria andServiceMobileIn(List<String> values) {
			addCriterion("service_mobile in", values, "serviceMobile");
			return (Criteria) this;
		}

		public Criteria andServiceMobileNotIn(List<String> values) {
			addCriterion("service_mobile not in", values, "serviceMobile");
			return (Criteria) this;
		}

		public Criteria andServiceMobileBetween(String value1, String value2) {
			addCriterion("service_mobile between", value1, value2, "serviceMobile");
			return (Criteria) this;
		}

		public Criteria andServiceMobileNotBetween(String value1, String value2) {
			addCriterion("service_mobile not between", value1, value2, "serviceMobile");
			return (Criteria) this;
		}

		public Criteria andWxTypeIsNull() {
			addCriterion("wx_type is null");
			return (Criteria) this;
		}

		public Criteria andWxTypeIsNotNull() {
			addCriterion("wx_type is not null");
			return (Criteria) this;
		}

		public Criteria andWxTypeEqualTo(String value) {
			addCriterion("wx_type =", value, "wxType");
			return (Criteria) this;
		}

		public Criteria andWxTypeNotEqualTo(String value) {
			addCriterion("wx_type <>", value, "wxType");
			return (Criteria) this;
		}

		public Criteria andWxTypeGreaterThan(String value) {
			addCriterion("wx_type >", value, "wxType");
			return (Criteria) this;
		}

		public Criteria andWxTypeGreaterThanOrEqualTo(String value) {
			addCriterion("wx_type >=", value, "wxType");
			return (Criteria) this;
		}

		public Criteria andWxTypeLessThan(String value) {
			addCriterion("wx_type <", value, "wxType");
			return (Criteria) this;
		}

		public Criteria andWxTypeLessThanOrEqualTo(String value) {
			addCriterion("wx_type <=", value, "wxType");
			return (Criteria) this;
		}

		public Criteria andWxTypeLike(String value) {
			addCriterion("wx_type like", value, "wxType");
			return (Criteria) this;
		}

		public Criteria andWxTypeNotLike(String value) {
			addCriterion("wx_type not like", value, "wxType");
			return (Criteria) this;
		}

		public Criteria andWxTypeIn(List<String> values) {
			addCriterion("wx_type in", values, "wxType");
			return (Criteria) this;
		}

		public Criteria andWxTypeNotIn(List<String> values) {
			addCriterion("wx_type not in", values, "wxType");
			return (Criteria) this;
		}

		public Criteria andWxTypeBetween(String value1, String value2) {
			addCriterion("wx_type between", value1, value2, "wxType");
			return (Criteria) this;
		}

		public Criteria andWxTypeNotBetween(String value1, String value2) {
			addCriterion("wx_type not between", value1, value2, "wxType");
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

		public Criteria andServiceStatusIsNull() {
			addCriterion("service_status is null");
			return (Criteria) this;
		}

		public Criteria andServiceStatusIsNotNull() {
			addCriterion("service_status is not null");
			return (Criteria) this;
		}

		public Criteria andServiceStatusEqualTo(String value) {
			addCriterion("service_status =", value, "serviceStatus");
			return (Criteria) this;
		}

		public Criteria andServiceStatusNotEqualTo(String value) {
			addCriterion("service_status <>", value, "serviceStatus");
			return (Criteria) this;
		}

		public Criteria andServiceStatusGreaterThan(String value) {
			addCriterion("service_status >", value, "serviceStatus");
			return (Criteria) this;
		}

		public Criteria andServiceStatusGreaterThanOrEqualTo(String value) {
			addCriterion("service_status >=", value, "serviceStatus");
			return (Criteria) this;
		}

		public Criteria andServiceStatusLessThan(String value) {
			addCriterion("service_status <", value, "serviceStatus");
			return (Criteria) this;
		}

		public Criteria andServiceStatusLessThanOrEqualTo(String value) {
			addCriterion("service_status <=", value, "serviceStatus");
			return (Criteria) this;
		}

		public Criteria andServiceStatusLike(String value) {
			addCriterion("service_status like", value, "serviceStatus");
			return (Criteria) this;
		}

		public Criteria andServiceStatusNotLike(String value) {
			addCriterion("service_status not like", value, "serviceStatus");
			return (Criteria) this;
		}

		public Criteria andServiceStatusIn(List<String> values) {
			addCriterion("service_status in", values, "serviceStatus");
			return (Criteria) this;
		}

		public Criteria andServiceStatusNotIn(List<String> values) {
			addCriterion("service_status not in", values, "serviceStatus");
			return (Criteria) this;
		}

		public Criteria andServiceStatusBetween(String value1, String value2) {
			addCriterion("service_status between", value1, value2, "serviceStatus");
			return (Criteria) this;
		}

		public Criteria andServiceStatusNotBetween(String value1, String value2) {
			addCriterion("service_status not between", value1, value2, "serviceStatus");
			return (Criteria) this;
		}

		public Criteria andTokenIsNull() {
			addCriterion("token is null");
			return (Criteria) this;
		}

		public Criteria andTokenIsNotNull() {
			addCriterion("token is not null");
			return (Criteria) this;
		}

		public Criteria andTokenEqualTo(String value) {
			addCriterion("token =", value, "token");
			return (Criteria) this;
		}

		public Criteria andTokenNotEqualTo(String value) {
			addCriterion("token <>", value, "token");
			return (Criteria) this;
		}

		public Criteria andTokenGreaterThan(String value) {
			addCriterion("token >", value, "token");
			return (Criteria) this;
		}

		public Criteria andTokenGreaterThanOrEqualTo(String value) {
			addCriterion("token >=", value, "token");
			return (Criteria) this;
		}

		public Criteria andTokenLessThan(String value) {
			addCriterion("token <", value, "token");
			return (Criteria) this;
		}

		public Criteria andTokenLessThanOrEqualTo(String value) {
			addCriterion("token <=", value, "token");
			return (Criteria) this;
		}

		public Criteria andTokenLike(String value) {
			addCriterion("token like", value, "token");
			return (Criteria) this;
		}

		public Criteria andTokenNotLike(String value) {
			addCriterion("token not like", value, "token");
			return (Criteria) this;
		}

		public Criteria andTokenIn(List<String> values) {
			addCriterion("token in", values, "token");
			return (Criteria) this;
		}

		public Criteria andTokenNotIn(List<String> values) {
			addCriterion("token not in", values, "token");
			return (Criteria) this;
		}

		public Criteria andTokenBetween(String value1, String value2) {
			addCriterion("token between", value1, value2, "token");
			return (Criteria) this;
		}

		public Criteria andTokenNotBetween(String value1, String value2) {
			addCriterion("token not between", value1, value2, "token");
			return (Criteria) this;
		}

		public Criteria andValidatePayMoneyIsNull() {
			addCriterion("validate_pay_money is null");
			return (Criteria) this;
		}

		public Criteria andValidatePayMoneyIsNotNull() {
			addCriterion("validate_pay_money is not null");
			return (Criteria) this;
		}

		public Criteria andValidatePayMoneyEqualTo(String value) {
			addCriterion("validate_pay_money =", value, "validatePayMoney");
			return (Criteria) this;
		}

		public Criteria andValidatePayMoneyNotEqualTo(String value) {
			addCriterion("validate_pay_money <>", value, "validatePayMoney");
			return (Criteria) this;
		}

		public Criteria andValidatePayMoneyGreaterThan(String value) {
			addCriterion("validate_pay_money >", value, "validatePayMoney");
			return (Criteria) this;
		}

		public Criteria andValidatePayMoneyGreaterThanOrEqualTo(String value) {
			addCriterion("validate_pay_money >=", value, "validatePayMoney");
			return (Criteria) this;
		}

		public Criteria andValidatePayMoneyLessThan(String value) {
			addCriterion("validate_pay_money <", value, "validatePayMoney");
			return (Criteria) this;
		}

		public Criteria andValidatePayMoneyLessThanOrEqualTo(String value) {
			addCriterion("validate_pay_money <=", value, "validatePayMoney");
			return (Criteria) this;
		}

		public Criteria andValidatePayMoneyLike(String value) {
			addCriterion("validate_pay_money like", value, "validatePayMoney");
			return (Criteria) this;
		}

		public Criteria andValidatePayMoneyNotLike(String value) {
			addCriterion("validate_pay_money not like", value, "validatePayMoney");
			return (Criteria) this;
		}

		public Criteria andValidatePayMoneyIn(List<String> values) {
			addCriterion("validate_pay_money in", values, "validatePayMoney");
			return (Criteria) this;
		}

		public Criteria andValidatePayMoneyNotIn(List<String> values) {
			addCriterion("validate_pay_money not in", values, "validatePayMoney");
			return (Criteria) this;
		}

		public Criteria andValidatePayMoneyBetween(String value1, String value2) {
			addCriterion("validate_pay_money between", value1, value2, "validatePayMoney");
			return (Criteria) this;
		}

		public Criteria andValidatePayMoneyNotBetween(String value1, String value2) {
			addCriterion("validate_pay_money not between", value1, value2, "validatePayMoney");
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
	 * wx_base_config
	 *
	 * @mbg.generated do_not_delete_during_merge
	 */
	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	/**
	 * wx_base_config null
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