package txc.xyz.base.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class BaseMenuExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public BaseMenuExample() {
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
	 * base_menu null
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

		public Criteria andMenuIdIsNull() {
			addCriterion("menu_id is null");
			return (Criteria) this;
		}

		public Criteria andMenuIdIsNotNull() {
			addCriterion("menu_id is not null");
			return (Criteria) this;
		}

		public Criteria andMenuIdEqualTo(Long value) {
			addCriterion("menu_id =", value, "menuId");
			return (Criteria) this;
		}

		public Criteria andMenuIdNotEqualTo(Long value) {
			addCriterion("menu_id <>", value, "menuId");
			return (Criteria) this;
		}

		public Criteria andMenuIdGreaterThan(Long value) {
			addCriterion("menu_id >", value, "menuId");
			return (Criteria) this;
		}

		public Criteria andMenuIdGreaterThanOrEqualTo(Long value) {
			addCriterion("menu_id >=", value, "menuId");
			return (Criteria) this;
		}

		public Criteria andMenuIdLessThan(Long value) {
			addCriterion("menu_id <", value, "menuId");
			return (Criteria) this;
		}

		public Criteria andMenuIdLessThanOrEqualTo(Long value) {
			addCriterion("menu_id <=", value, "menuId");
			return (Criteria) this;
		}

		public Criteria andMenuIdIn(List<Long> values) {
			addCriterion("menu_id in", values, "menuId");
			return (Criteria) this;
		}

		public Criteria andMenuIdNotIn(List<Long> values) {
			addCriterion("menu_id not in", values, "menuId");
			return (Criteria) this;
		}

		public Criteria andMenuIdBetween(Long value1, Long value2) {
			addCriterion("menu_id between", value1, value2, "menuId");
			return (Criteria) this;
		}

		public Criteria andMenuIdNotBetween(Long value1, Long value2) {
			addCriterion("menu_id not between", value1, value2, "menuId");
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

		public Criteria andMenuNameIsNull() {
			addCriterion("menu_name is null");
			return (Criteria) this;
		}

		public Criteria andMenuNameIsNotNull() {
			addCriterion("menu_name is not null");
			return (Criteria) this;
		}

		public Criteria andMenuNameEqualTo(String value) {
			addCriterion("menu_name =", value, "menuName");
			return (Criteria) this;
		}

		public Criteria andMenuNameNotEqualTo(String value) {
			addCriterion("menu_name <>", value, "menuName");
			return (Criteria) this;
		}

		public Criteria andMenuNameGreaterThan(String value) {
			addCriterion("menu_name >", value, "menuName");
			return (Criteria) this;
		}

		public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
			addCriterion("menu_name >=", value, "menuName");
			return (Criteria) this;
		}

		public Criteria andMenuNameLessThan(String value) {
			addCriterion("menu_name <", value, "menuName");
			return (Criteria) this;
		}

		public Criteria andMenuNameLessThanOrEqualTo(String value) {
			addCriterion("menu_name <=", value, "menuName");
			return (Criteria) this;
		}

		public Criteria andMenuNameLike(String value) {
			addCriterion("menu_name like", value, "menuName");
			return (Criteria) this;
		}

		public Criteria andMenuNameNotLike(String value) {
			addCriterion("menu_name not like", value, "menuName");
			return (Criteria) this;
		}

		public Criteria andMenuNameIn(List<String> values) {
			addCriterion("menu_name in", values, "menuName");
			return (Criteria) this;
		}

		public Criteria andMenuNameNotIn(List<String> values) {
			addCriterion("menu_name not in", values, "menuName");
			return (Criteria) this;
		}

		public Criteria andMenuNameBetween(String value1, String value2) {
			addCriterion("menu_name between", value1, value2, "menuName");
			return (Criteria) this;
		}

		public Criteria andMenuNameNotBetween(String value1, String value2) {
			addCriterion("menu_name not between", value1, value2, "menuName");
			return (Criteria) this;
		}

		public Criteria andMenuCodeIsNull() {
			addCriterion("menu_code is null");
			return (Criteria) this;
		}

		public Criteria andMenuCodeIsNotNull() {
			addCriterion("menu_code is not null");
			return (Criteria) this;
		}

		public Criteria andMenuCodeEqualTo(String value) {
			addCriterion("menu_code =", value, "menuCode");
			return (Criteria) this;
		}

		public Criteria andMenuCodeNotEqualTo(String value) {
			addCriterion("menu_code <>", value, "menuCode");
			return (Criteria) this;
		}

		public Criteria andMenuCodeGreaterThan(String value) {
			addCriterion("menu_code >", value, "menuCode");
			return (Criteria) this;
		}

		public Criteria andMenuCodeGreaterThanOrEqualTo(String value) {
			addCriterion("menu_code >=", value, "menuCode");
			return (Criteria) this;
		}

		public Criteria andMenuCodeLessThan(String value) {
			addCriterion("menu_code <", value, "menuCode");
			return (Criteria) this;
		}

		public Criteria andMenuCodeLessThanOrEqualTo(String value) {
			addCriterion("menu_code <=", value, "menuCode");
			return (Criteria) this;
		}

		public Criteria andMenuCodeLike(String value) {
			addCriterion("menu_code like", value, "menuCode");
			return (Criteria) this;
		}

		public Criteria andMenuCodeNotLike(String value) {
			addCriterion("menu_code not like", value, "menuCode");
			return (Criteria) this;
		}

		public Criteria andMenuCodeIn(List<String> values) {
			addCriterion("menu_code in", values, "menuCode");
			return (Criteria) this;
		}

		public Criteria andMenuCodeNotIn(List<String> values) {
			addCriterion("menu_code not in", values, "menuCode");
			return (Criteria) this;
		}

		public Criteria andMenuCodeBetween(String value1, String value2) {
			addCriterion("menu_code between", value1, value2, "menuCode");
			return (Criteria) this;
		}

		public Criteria andMenuCodeNotBetween(String value1, String value2) {
			addCriterion("menu_code not between", value1, value2, "menuCode");
			return (Criteria) this;
		}

		public Criteria andMenuDescIsNull() {
			addCriterion("menu_desc is null");
			return (Criteria) this;
		}

		public Criteria andMenuDescIsNotNull() {
			addCriterion("menu_desc is not null");
			return (Criteria) this;
		}

		public Criteria andMenuDescEqualTo(String value) {
			addCriterion("menu_desc =", value, "menuDesc");
			return (Criteria) this;
		}

		public Criteria andMenuDescNotEqualTo(String value) {
			addCriterion("menu_desc <>", value, "menuDesc");
			return (Criteria) this;
		}

		public Criteria andMenuDescGreaterThan(String value) {
			addCriterion("menu_desc >", value, "menuDesc");
			return (Criteria) this;
		}

		public Criteria andMenuDescGreaterThanOrEqualTo(String value) {
			addCriterion("menu_desc >=", value, "menuDesc");
			return (Criteria) this;
		}

		public Criteria andMenuDescLessThan(String value) {
			addCriterion("menu_desc <", value, "menuDesc");
			return (Criteria) this;
		}

		public Criteria andMenuDescLessThanOrEqualTo(String value) {
			addCriterion("menu_desc <=", value, "menuDesc");
			return (Criteria) this;
		}

		public Criteria andMenuDescLike(String value) {
			addCriterion("menu_desc like", value, "menuDesc");
			return (Criteria) this;
		}

		public Criteria andMenuDescNotLike(String value) {
			addCriterion("menu_desc not like", value, "menuDesc");
			return (Criteria) this;
		}

		public Criteria andMenuDescIn(List<String> values) {
			addCriterion("menu_desc in", values, "menuDesc");
			return (Criteria) this;
		}

		public Criteria andMenuDescNotIn(List<String> values) {
			addCriterion("menu_desc not in", values, "menuDesc");
			return (Criteria) this;
		}

		public Criteria andMenuDescBetween(String value1, String value2) {
			addCriterion("menu_desc between", value1, value2, "menuDesc");
			return (Criteria) this;
		}

		public Criteria andMenuDescNotBetween(String value1, String value2) {
			addCriterion("menu_desc not between", value1, value2, "menuDesc");
			return (Criteria) this;
		}

		public Criteria andMenuUrlIsNull() {
			addCriterion("menu_url is null");
			return (Criteria) this;
		}

		public Criteria andMenuUrlIsNotNull() {
			addCriterion("menu_url is not null");
			return (Criteria) this;
		}

		public Criteria andMenuUrlEqualTo(String value) {
			addCriterion("menu_url =", value, "menuUrl");
			return (Criteria) this;
		}

		public Criteria andMenuUrlNotEqualTo(String value) {
			addCriterion("menu_url <>", value, "menuUrl");
			return (Criteria) this;
		}

		public Criteria andMenuUrlGreaterThan(String value) {
			addCriterion("menu_url >", value, "menuUrl");
			return (Criteria) this;
		}

		public Criteria andMenuUrlGreaterThanOrEqualTo(String value) {
			addCriterion("menu_url >=", value, "menuUrl");
			return (Criteria) this;
		}

		public Criteria andMenuUrlLessThan(String value) {
			addCriterion("menu_url <", value, "menuUrl");
			return (Criteria) this;
		}

		public Criteria andMenuUrlLessThanOrEqualTo(String value) {
			addCriterion("menu_url <=", value, "menuUrl");
			return (Criteria) this;
		}

		public Criteria andMenuUrlLike(String value) {
			addCriterion("menu_url like", value, "menuUrl");
			return (Criteria) this;
		}

		public Criteria andMenuUrlNotLike(String value) {
			addCriterion("menu_url not like", value, "menuUrl");
			return (Criteria) this;
		}

		public Criteria andMenuUrlIn(List<String> values) {
			addCriterion("menu_url in", values, "menuUrl");
			return (Criteria) this;
		}

		public Criteria andMenuUrlNotIn(List<String> values) {
			addCriterion("menu_url not in", values, "menuUrl");
			return (Criteria) this;
		}

		public Criteria andMenuUrlBetween(String value1, String value2) {
			addCriterion("menu_url between", value1, value2, "menuUrl");
			return (Criteria) this;
		}

		public Criteria andMenuUrlNotBetween(String value1, String value2) {
			addCriterion("menu_url not between", value1, value2, "menuUrl");
			return (Criteria) this;
		}

		public Criteria andMenuTypeIsNull() {
			addCriterion("menu_type is null");
			return (Criteria) this;
		}

		public Criteria andMenuTypeIsNotNull() {
			addCriterion("menu_type is not null");
			return (Criteria) this;
		}

		public Criteria andMenuTypeEqualTo(String value) {
			addCriterion("menu_type =", value, "menuType");
			return (Criteria) this;
		}

		public Criteria andMenuTypeNotEqualTo(String value) {
			addCriterion("menu_type <>", value, "menuType");
			return (Criteria) this;
		}

		public Criteria andMenuTypeGreaterThan(String value) {
			addCriterion("menu_type >", value, "menuType");
			return (Criteria) this;
		}

		public Criteria andMenuTypeGreaterThanOrEqualTo(String value) {
			addCriterion("menu_type >=", value, "menuType");
			return (Criteria) this;
		}

		public Criteria andMenuTypeLessThan(String value) {
			addCriterion("menu_type <", value, "menuType");
			return (Criteria) this;
		}

		public Criteria andMenuTypeLessThanOrEqualTo(String value) {
			addCriterion("menu_type <=", value, "menuType");
			return (Criteria) this;
		}

		public Criteria andMenuTypeLike(String value) {
			addCriterion("menu_type like", value, "menuType");
			return (Criteria) this;
		}

		public Criteria andMenuTypeNotLike(String value) {
			addCriterion("menu_type not like", value, "menuType");
			return (Criteria) this;
		}

		public Criteria andMenuTypeIn(List<String> values) {
			addCriterion("menu_type in", values, "menuType");
			return (Criteria) this;
		}

		public Criteria andMenuTypeNotIn(List<String> values) {
			addCriterion("menu_type not in", values, "menuType");
			return (Criteria) this;
		}

		public Criteria andMenuTypeBetween(String value1, String value2) {
			addCriterion("menu_type between", value1, value2, "menuType");
			return (Criteria) this;
		}

		public Criteria andMenuTypeNotBetween(String value1, String value2) {
			addCriterion("menu_type not between", value1, value2, "menuType");
			return (Criteria) this;
		}

		public Criteria andMenuLevelIsNull() {
			addCriterion("menu_level is null");
			return (Criteria) this;
		}

		public Criteria andMenuLevelIsNotNull() {
			addCriterion("menu_level is not null");
			return (Criteria) this;
		}

		public Criteria andMenuLevelEqualTo(String value) {
			addCriterion("menu_level =", value, "menuLevel");
			return (Criteria) this;
		}

		public Criteria andMenuLevelNotEqualTo(String value) {
			addCriterion("menu_level <>", value, "menuLevel");
			return (Criteria) this;
		}

		public Criteria andMenuLevelGreaterThan(String value) {
			addCriterion("menu_level >", value, "menuLevel");
			return (Criteria) this;
		}

		public Criteria andMenuLevelGreaterThanOrEqualTo(String value) {
			addCriterion("menu_level >=", value, "menuLevel");
			return (Criteria) this;
		}

		public Criteria andMenuLevelLessThan(String value) {
			addCriterion("menu_level <", value, "menuLevel");
			return (Criteria) this;
		}

		public Criteria andMenuLevelLessThanOrEqualTo(String value) {
			addCriterion("menu_level <=", value, "menuLevel");
			return (Criteria) this;
		}

		public Criteria andMenuLevelLike(String value) {
			addCriterion("menu_level like", value, "menuLevel");
			return (Criteria) this;
		}

		public Criteria andMenuLevelNotLike(String value) {
			addCriterion("menu_level not like", value, "menuLevel");
			return (Criteria) this;
		}

		public Criteria andMenuLevelIn(List<String> values) {
			addCriterion("menu_level in", values, "menuLevel");
			return (Criteria) this;
		}

		public Criteria andMenuLevelNotIn(List<String> values) {
			addCriterion("menu_level not in", values, "menuLevel");
			return (Criteria) this;
		}

		public Criteria andMenuLevelBetween(String value1, String value2) {
			addCriterion("menu_level between", value1, value2, "menuLevel");
			return (Criteria) this;
		}

		public Criteria andMenuLevelNotBetween(String value1, String value2) {
			addCriterion("menu_level not between", value1, value2, "menuLevel");
			return (Criteria) this;
		}

		public Criteria andClientTypeIsNull() {
			addCriterion("client_type is null");
			return (Criteria) this;
		}

		public Criteria andClientTypeIsNotNull() {
			addCriterion("client_type is not null");
			return (Criteria) this;
		}

		public Criteria andClientTypeEqualTo(String value) {
			addCriterion("client_type =", value, "clientType");
			return (Criteria) this;
		}

		public Criteria andClientTypeNotEqualTo(String value) {
			addCriterion("client_type <>", value, "clientType");
			return (Criteria) this;
		}

		public Criteria andClientTypeGreaterThan(String value) {
			addCriterion("client_type >", value, "clientType");
			return (Criteria) this;
		}

		public Criteria andClientTypeGreaterThanOrEqualTo(String value) {
			addCriterion("client_type >=", value, "clientType");
			return (Criteria) this;
		}

		public Criteria andClientTypeLessThan(String value) {
			addCriterion("client_type <", value, "clientType");
			return (Criteria) this;
		}

		public Criteria andClientTypeLessThanOrEqualTo(String value) {
			addCriterion("client_type <=", value, "clientType");
			return (Criteria) this;
		}

		public Criteria andClientTypeLike(String value) {
			addCriterion("client_type like", value, "clientType");
			return (Criteria) this;
		}

		public Criteria andClientTypeNotLike(String value) {
			addCriterion("client_type not like", value, "clientType");
			return (Criteria) this;
		}

		public Criteria andClientTypeIn(List<String> values) {
			addCriterion("client_type in", values, "clientType");
			return (Criteria) this;
		}

		public Criteria andClientTypeNotIn(List<String> values) {
			addCriterion("client_type not in", values, "clientType");
			return (Criteria) this;
		}

		public Criteria andClientTypeBetween(String value1, String value2) {
			addCriterion("client_type between", value1, value2, "clientType");
			return (Criteria) this;
		}

		public Criteria andClientTypeNotBetween(String value1, String value2) {
			addCriterion("client_type not between", value1, value2, "clientType");
			return (Criteria) this;
		}

		public Criteria andIsShowIsNull() {
			addCriterion("is_show is null");
			return (Criteria) this;
		}

		public Criteria andIsShowIsNotNull() {
			addCriterion("is_show is not null");
			return (Criteria) this;
		}

		public Criteria andIsShowEqualTo(String value) {
			addCriterion("is_show =", value, "isShow");
			return (Criteria) this;
		}

		public Criteria andIsShowNotEqualTo(String value) {
			addCriterion("is_show <>", value, "isShow");
			return (Criteria) this;
		}

		public Criteria andIsShowGreaterThan(String value) {
			addCriterion("is_show >", value, "isShow");
			return (Criteria) this;
		}

		public Criteria andIsShowGreaterThanOrEqualTo(String value) {
			addCriterion("is_show >=", value, "isShow");
			return (Criteria) this;
		}

		public Criteria andIsShowLessThan(String value) {
			addCriterion("is_show <", value, "isShow");
			return (Criteria) this;
		}

		public Criteria andIsShowLessThanOrEqualTo(String value) {
			addCriterion("is_show <=", value, "isShow");
			return (Criteria) this;
		}

		public Criteria andIsShowLike(String value) {
			addCriterion("is_show like", value, "isShow");
			return (Criteria) this;
		}

		public Criteria andIsShowNotLike(String value) {
			addCriterion("is_show not like", value, "isShow");
			return (Criteria) this;
		}

		public Criteria andIsShowIn(List<String> values) {
			addCriterion("is_show in", values, "isShow");
			return (Criteria) this;
		}

		public Criteria andIsShowNotIn(List<String> values) {
			addCriterion("is_show not in", values, "isShow");
			return (Criteria) this;
		}

		public Criteria andIsShowBetween(String value1, String value2) {
			addCriterion("is_show between", value1, value2, "isShow");
			return (Criteria) this;
		}

		public Criteria andIsShowNotBetween(String value1, String value2) {
			addCriterion("is_show not between", value1, value2, "isShow");
			return (Criteria) this;
		}

		public Criteria andIsPublicIsNull() {
			addCriterion("is_public is null");
			return (Criteria) this;
		}

		public Criteria andIsPublicIsNotNull() {
			addCriterion("is_public is not null");
			return (Criteria) this;
		}

		public Criteria andIsPublicEqualTo(String value) {
			addCriterion("is_public =", value, "isPublic");
			return (Criteria) this;
		}

		public Criteria andIsPublicNotEqualTo(String value) {
			addCriterion("is_public <>", value, "isPublic");
			return (Criteria) this;
		}

		public Criteria andIsPublicGreaterThan(String value) {
			addCriterion("is_public >", value, "isPublic");
			return (Criteria) this;
		}

		public Criteria andIsPublicGreaterThanOrEqualTo(String value) {
			addCriterion("is_public >=", value, "isPublic");
			return (Criteria) this;
		}

		public Criteria andIsPublicLessThan(String value) {
			addCriterion("is_public <", value, "isPublic");
			return (Criteria) this;
		}

		public Criteria andIsPublicLessThanOrEqualTo(String value) {
			addCriterion("is_public <=", value, "isPublic");
			return (Criteria) this;
		}

		public Criteria andIsPublicLike(String value) {
			addCriterion("is_public like", value, "isPublic");
			return (Criteria) this;
		}

		public Criteria andIsPublicNotLike(String value) {
			addCriterion("is_public not like", value, "isPublic");
			return (Criteria) this;
		}

		public Criteria andIsPublicIn(List<String> values) {
			addCriterion("is_public in", values, "isPublic");
			return (Criteria) this;
		}

		public Criteria andIsPublicNotIn(List<String> values) {
			addCriterion("is_public not in", values, "isPublic");
			return (Criteria) this;
		}

		public Criteria andIsPublicBetween(String value1, String value2) {
			addCriterion("is_public between", value1, value2, "isPublic");
			return (Criteria) this;
		}

		public Criteria andIsPublicNotBetween(String value1, String value2) {
			addCriterion("is_public not between", value1, value2, "isPublic");
			return (Criteria) this;
		}

		public Criteria andIconfontNameIsNull() {
			addCriterion("iconfont_name is null");
			return (Criteria) this;
		}

		public Criteria andIconfontNameIsNotNull() {
			addCriterion("iconfont_name is not null");
			return (Criteria) this;
		}

		public Criteria andIconfontNameEqualTo(String value) {
			addCriterion("iconfont_name =", value, "iconfontName");
			return (Criteria) this;
		}

		public Criteria andIconfontNameNotEqualTo(String value) {
			addCriterion("iconfont_name <>", value, "iconfontName");
			return (Criteria) this;
		}

		public Criteria andIconfontNameGreaterThan(String value) {
			addCriterion("iconfont_name >", value, "iconfontName");
			return (Criteria) this;
		}

		public Criteria andIconfontNameGreaterThanOrEqualTo(String value) {
			addCriterion("iconfont_name >=", value, "iconfontName");
			return (Criteria) this;
		}

		public Criteria andIconfontNameLessThan(String value) {
			addCriterion("iconfont_name <", value, "iconfontName");
			return (Criteria) this;
		}

		public Criteria andIconfontNameLessThanOrEqualTo(String value) {
			addCriterion("iconfont_name <=", value, "iconfontName");
			return (Criteria) this;
		}

		public Criteria andIconfontNameLike(String value) {
			addCriterion("iconfont_name like", value, "iconfontName");
			return (Criteria) this;
		}

		public Criteria andIconfontNameNotLike(String value) {
			addCriterion("iconfont_name not like", value, "iconfontName");
			return (Criteria) this;
		}

		public Criteria andIconfontNameIn(List<String> values) {
			addCriterion("iconfont_name in", values, "iconfontName");
			return (Criteria) this;
		}

		public Criteria andIconfontNameNotIn(List<String> values) {
			addCriterion("iconfont_name not in", values, "iconfontName");
			return (Criteria) this;
		}

		public Criteria andIconfontNameBetween(String value1, String value2) {
			addCriterion("iconfont_name between", value1, value2, "iconfontName");
			return (Criteria) this;
		}

		public Criteria andIconfontNameNotBetween(String value1, String value2) {
			addCriterion("iconfont_name not between", value1, value2, "iconfontName");
			return (Criteria) this;
		}

		public Criteria andClassNameIsNull() {
			addCriterion("class_name is null");
			return (Criteria) this;
		}

		public Criteria andClassNameIsNotNull() {
			addCriterion("class_name is not null");
			return (Criteria) this;
		}

		public Criteria andClassNameEqualTo(String value) {
			addCriterion("class_name =", value, "className");
			return (Criteria) this;
		}

		public Criteria andClassNameNotEqualTo(String value) {
			addCriterion("class_name <>", value, "className");
			return (Criteria) this;
		}

		public Criteria andClassNameGreaterThan(String value) {
			addCriterion("class_name >", value, "className");
			return (Criteria) this;
		}

		public Criteria andClassNameGreaterThanOrEqualTo(String value) {
			addCriterion("class_name >=", value, "className");
			return (Criteria) this;
		}

		public Criteria andClassNameLessThan(String value) {
			addCriterion("class_name <", value, "className");
			return (Criteria) this;
		}

		public Criteria andClassNameLessThanOrEqualTo(String value) {
			addCriterion("class_name <=", value, "className");
			return (Criteria) this;
		}

		public Criteria andClassNameLike(String value) {
			addCriterion("class_name like", value, "className");
			return (Criteria) this;
		}

		public Criteria andClassNameNotLike(String value) {
			addCriterion("class_name not like", value, "className");
			return (Criteria) this;
		}

		public Criteria andClassNameIn(List<String> values) {
			addCriterion("class_name in", values, "className");
			return (Criteria) this;
		}

		public Criteria andClassNameNotIn(List<String> values) {
			addCriterion("class_name not in", values, "className");
			return (Criteria) this;
		}

		public Criteria andClassNameBetween(String value1, String value2) {
			addCriterion("class_name between", value1, value2, "className");
			return (Criteria) this;
		}

		public Criteria andClassNameNotBetween(String value1, String value2) {
			addCriterion("class_name not between", value1, value2, "className");
			return (Criteria) this;
		}

		public Criteria andLayoutCodeIsNull() {
			addCriterion("layout_code is null");
			return (Criteria) this;
		}

		public Criteria andLayoutCodeIsNotNull() {
			addCriterion("layout_code is not null");
			return (Criteria) this;
		}

		public Criteria andLayoutCodeEqualTo(String value) {
			addCriterion("layout_code =", value, "layoutCode");
			return (Criteria) this;
		}

		public Criteria andLayoutCodeNotEqualTo(String value) {
			addCriterion("layout_code <>", value, "layoutCode");
			return (Criteria) this;
		}

		public Criteria andLayoutCodeGreaterThan(String value) {
			addCriterion("layout_code >", value, "layoutCode");
			return (Criteria) this;
		}

		public Criteria andLayoutCodeGreaterThanOrEqualTo(String value) {
			addCriterion("layout_code >=", value, "layoutCode");
			return (Criteria) this;
		}

		public Criteria andLayoutCodeLessThan(String value) {
			addCriterion("layout_code <", value, "layoutCode");
			return (Criteria) this;
		}

		public Criteria andLayoutCodeLessThanOrEqualTo(String value) {
			addCriterion("layout_code <=", value, "layoutCode");
			return (Criteria) this;
		}

		public Criteria andLayoutCodeLike(String value) {
			addCriterion("layout_code like", value, "layoutCode");
			return (Criteria) this;
		}

		public Criteria andLayoutCodeNotLike(String value) {
			addCriterion("layout_code not like", value, "layoutCode");
			return (Criteria) this;
		}

		public Criteria andLayoutCodeIn(List<String> values) {
			addCriterion("layout_code in", values, "layoutCode");
			return (Criteria) this;
		}

		public Criteria andLayoutCodeNotIn(List<String> values) {
			addCriterion("layout_code not in", values, "layoutCode");
			return (Criteria) this;
		}

		public Criteria andLayoutCodeBetween(String value1, String value2) {
			addCriterion("layout_code between", value1, value2, "layoutCode");
			return (Criteria) this;
		}

		public Criteria andLayoutCodeNotBetween(String value1, String value2) {
			addCriterion("layout_code not between", value1, value2, "layoutCode");
			return (Criteria) this;
		}

		public Criteria andOrderNoIsNull() {
			addCriterion("order_no is null");
			return (Criteria) this;
		}

		public Criteria andOrderNoIsNotNull() {
			addCriterion("order_no is not null");
			return (Criteria) this;
		}

		public Criteria andOrderNoEqualTo(Integer value) {
			addCriterion("order_no =", value, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoNotEqualTo(Integer value) {
			addCriterion("order_no <>", value, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoGreaterThan(Integer value) {
			addCriterion("order_no >", value, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoGreaterThanOrEqualTo(Integer value) {
			addCriterion("order_no >=", value, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoLessThan(Integer value) {
			addCriterion("order_no <", value, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoLessThanOrEqualTo(Integer value) {
			addCriterion("order_no <=", value, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoIn(List<Integer> values) {
			addCriterion("order_no in", values, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoNotIn(List<Integer> values) {
			addCriterion("order_no not in", values, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoBetween(Integer value1, Integer value2) {
			addCriterion("order_no between", value1, value2, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoNotBetween(Integer value1, Integer value2) {
			addCriterion("order_no not between", value1, value2, "orderNo");
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

		public Criteria andCreateUidIsNull() {
			addCriterion("create_uid is null");
			return (Criteria) this;
		}

		public Criteria andCreateUidIsNotNull() {
			addCriterion("create_uid is not null");
			return (Criteria) this;
		}

		public Criteria andCreateUidEqualTo(Long value) {
			addCriterion("create_uid =", value, "createUid");
			return (Criteria) this;
		}

		public Criteria andCreateUidNotEqualTo(Long value) {
			addCriterion("create_uid <>", value, "createUid");
			return (Criteria) this;
		}

		public Criteria andCreateUidGreaterThan(Long value) {
			addCriterion("create_uid >", value, "createUid");
			return (Criteria) this;
		}

		public Criteria andCreateUidGreaterThanOrEqualTo(Long value) {
			addCriterion("create_uid >=", value, "createUid");
			return (Criteria) this;
		}

		public Criteria andCreateUidLessThan(Long value) {
			addCriterion("create_uid <", value, "createUid");
			return (Criteria) this;
		}

		public Criteria andCreateUidLessThanOrEqualTo(Long value) {
			addCriterion("create_uid <=", value, "createUid");
			return (Criteria) this;
		}

		public Criteria andCreateUidIn(List<Long> values) {
			addCriterion("create_uid in", values, "createUid");
			return (Criteria) this;
		}

		public Criteria andCreateUidNotIn(List<Long> values) {
			addCriterion("create_uid not in", values, "createUid");
			return (Criteria) this;
		}

		public Criteria andCreateUidBetween(Long value1, Long value2) {
			addCriterion("create_uid between", value1, value2, "createUid");
			return (Criteria) this;
		}

		public Criteria andCreateUidNotBetween(Long value1, Long value2) {
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

		public Criteria andUpdateUidEqualTo(Long value) {
			addCriterion("update_uid =", value, "updateUid");
			return (Criteria) this;
		}

		public Criteria andUpdateUidNotEqualTo(Long value) {
			addCriterion("update_uid <>", value, "updateUid");
			return (Criteria) this;
		}

		public Criteria andUpdateUidGreaterThan(Long value) {
			addCriterion("update_uid >", value, "updateUid");
			return (Criteria) this;
		}

		public Criteria andUpdateUidGreaterThanOrEqualTo(Long value) {
			addCriterion("update_uid >=", value, "updateUid");
			return (Criteria) this;
		}

		public Criteria andUpdateUidLessThan(Long value) {
			addCriterion("update_uid <", value, "updateUid");
			return (Criteria) this;
		}

		public Criteria andUpdateUidLessThanOrEqualTo(Long value) {
			addCriterion("update_uid <=", value, "updateUid");
			return (Criteria) this;
		}

		public Criteria andUpdateUidIn(List<Long> values) {
			addCriterion("update_uid in", values, "updateUid");
			return (Criteria) this;
		}

		public Criteria andUpdateUidNotIn(List<Long> values) {
			addCriterion("update_uid not in", values, "updateUid");
			return (Criteria) this;
		}

		public Criteria andUpdateUidBetween(Long value1, Long value2) {
			addCriterion("update_uid between", value1, value2, "updateUid");
			return (Criteria) this;
		}

		public Criteria andUpdateUidNotBetween(Long value1, Long value2) {
			addCriterion("update_uid not between", value1, value2, "updateUid");
			return (Criteria) this;
		}
	}

	/**
	 * base_menu
	 *
	 * @mbg.generated do_not_delete_during_merge
	 */
	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	/**
	 * base_menu null
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