package txc.xxy.ssm.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class SystemMsgExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public SystemMsgExample() {
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
	 * system_msg null
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

		public Criteria andMsgIdIsNull() {
			addCriterion("msg_id is null");
			return (Criteria) this;
		}

		public Criteria andMsgIdIsNotNull() {
			addCriterion("msg_id is not null");
			return (Criteria) this;
		}

		public Criteria andMsgIdEqualTo(String value) {
			addCriterion("msg_id =", value, "msgId");
			return (Criteria) this;
		}

		public Criteria andMsgIdNotEqualTo(String value) {
			addCriterion("msg_id <>", value, "msgId");
			return (Criteria) this;
		}

		public Criteria andMsgIdGreaterThan(String value) {
			addCriterion("msg_id >", value, "msgId");
			return (Criteria) this;
		}

		public Criteria andMsgIdGreaterThanOrEqualTo(String value) {
			addCriterion("msg_id >=", value, "msgId");
			return (Criteria) this;
		}

		public Criteria andMsgIdLessThan(String value) {
			addCriterion("msg_id <", value, "msgId");
			return (Criteria) this;
		}

		public Criteria andMsgIdLessThanOrEqualTo(String value) {
			addCriterion("msg_id <=", value, "msgId");
			return (Criteria) this;
		}

		public Criteria andMsgIdLike(String value) {
			addCriterion("msg_id like", value, "msgId");
			return (Criteria) this;
		}

		public Criteria andMsgIdNotLike(String value) {
			addCriterion("msg_id not like", value, "msgId");
			return (Criteria) this;
		}

		public Criteria andMsgIdIn(List<String> values) {
			addCriterion("msg_id in", values, "msgId");
			return (Criteria) this;
		}

		public Criteria andMsgIdNotIn(List<String> values) {
			addCriterion("msg_id not in", values, "msgId");
			return (Criteria) this;
		}

		public Criteria andMsgIdBetween(String value1, String value2) {
			addCriterion("msg_id between", value1, value2, "msgId");
			return (Criteria) this;
		}

		public Criteria andMsgIdNotBetween(String value1, String value2) {
			addCriterion("msg_id not between", value1, value2, "msgId");
			return (Criteria) this;
		}

		public Criteria andSendUidIsNull() {
			addCriterion("send_uid is null");
			return (Criteria) this;
		}

		public Criteria andSendUidIsNotNull() {
			addCriterion("send_uid is not null");
			return (Criteria) this;
		}

		public Criteria andSendUidEqualTo(String value) {
			addCriterion("send_uid =", value, "sendUid");
			return (Criteria) this;
		}

		public Criteria andSendUidNotEqualTo(String value) {
			addCriterion("send_uid <>", value, "sendUid");
			return (Criteria) this;
		}

		public Criteria andSendUidGreaterThan(String value) {
			addCriterion("send_uid >", value, "sendUid");
			return (Criteria) this;
		}

		public Criteria andSendUidGreaterThanOrEqualTo(String value) {
			addCriterion("send_uid >=", value, "sendUid");
			return (Criteria) this;
		}

		public Criteria andSendUidLessThan(String value) {
			addCriterion("send_uid <", value, "sendUid");
			return (Criteria) this;
		}

		public Criteria andSendUidLessThanOrEqualTo(String value) {
			addCriterion("send_uid <=", value, "sendUid");
			return (Criteria) this;
		}

		public Criteria andSendUidLike(String value) {
			addCriterion("send_uid like", value, "sendUid");
			return (Criteria) this;
		}

		public Criteria andSendUidNotLike(String value) {
			addCriterion("send_uid not like", value, "sendUid");
			return (Criteria) this;
		}

		public Criteria andSendUidIn(List<String> values) {
			addCriterion("send_uid in", values, "sendUid");
			return (Criteria) this;
		}

		public Criteria andSendUidNotIn(List<String> values) {
			addCriterion("send_uid not in", values, "sendUid");
			return (Criteria) this;
		}

		public Criteria andSendUidBetween(String value1, String value2) {
			addCriterion("send_uid between", value1, value2, "sendUid");
			return (Criteria) this;
		}

		public Criteria andSendUidNotBetween(String value1, String value2) {
			addCriterion("send_uid not between", value1, value2, "sendUid");
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

		public Criteria andMsgContentIsNull() {
			addCriterion("msg_content is null");
			return (Criteria) this;
		}

		public Criteria andMsgContentIsNotNull() {
			addCriterion("msg_content is not null");
			return (Criteria) this;
		}

		public Criteria andMsgContentEqualTo(String value) {
			addCriterion("msg_content =", value, "msgContent");
			return (Criteria) this;
		}

		public Criteria andMsgContentNotEqualTo(String value) {
			addCriterion("msg_content <>", value, "msgContent");
			return (Criteria) this;
		}

		public Criteria andMsgContentGreaterThan(String value) {
			addCriterion("msg_content >", value, "msgContent");
			return (Criteria) this;
		}

		public Criteria andMsgContentGreaterThanOrEqualTo(String value) {
			addCriterion("msg_content >=", value, "msgContent");
			return (Criteria) this;
		}

		public Criteria andMsgContentLessThan(String value) {
			addCriterion("msg_content <", value, "msgContent");
			return (Criteria) this;
		}

		public Criteria andMsgContentLessThanOrEqualTo(String value) {
			addCriterion("msg_content <=", value, "msgContent");
			return (Criteria) this;
		}

		public Criteria andMsgContentLike(String value) {
			addCriterion("msg_content like", value, "msgContent");
			return (Criteria) this;
		}

		public Criteria andMsgContentNotLike(String value) {
			addCriterion("msg_content not like", value, "msgContent");
			return (Criteria) this;
		}

		public Criteria andMsgContentIn(List<String> values) {
			addCriterion("msg_content in", values, "msgContent");
			return (Criteria) this;
		}

		public Criteria andMsgContentNotIn(List<String> values) {
			addCriterion("msg_content not in", values, "msgContent");
			return (Criteria) this;
		}

		public Criteria andMsgContentBetween(String value1, String value2) {
			addCriterion("msg_content between", value1, value2, "msgContent");
			return (Criteria) this;
		}

		public Criteria andMsgContentNotBetween(String value1, String value2) {
			addCriterion("msg_content not between", value1, value2, "msgContent");
			return (Criteria) this;
		}

		public Criteria andMsgTypeIsNull() {
			addCriterion("msg_type is null");
			return (Criteria) this;
		}

		public Criteria andMsgTypeIsNotNull() {
			addCriterion("msg_type is not null");
			return (Criteria) this;
		}

		public Criteria andMsgTypeEqualTo(String value) {
			addCriterion("msg_type =", value, "msgType");
			return (Criteria) this;
		}

		public Criteria andMsgTypeNotEqualTo(String value) {
			addCriterion("msg_type <>", value, "msgType");
			return (Criteria) this;
		}

		public Criteria andMsgTypeGreaterThan(String value) {
			addCriterion("msg_type >", value, "msgType");
			return (Criteria) this;
		}

		public Criteria andMsgTypeGreaterThanOrEqualTo(String value) {
			addCriterion("msg_type >=", value, "msgType");
			return (Criteria) this;
		}

		public Criteria andMsgTypeLessThan(String value) {
			addCriterion("msg_type <", value, "msgType");
			return (Criteria) this;
		}

		public Criteria andMsgTypeLessThanOrEqualTo(String value) {
			addCriterion("msg_type <=", value, "msgType");
			return (Criteria) this;
		}

		public Criteria andMsgTypeLike(String value) {
			addCriterion("msg_type like", value, "msgType");
			return (Criteria) this;
		}

		public Criteria andMsgTypeNotLike(String value) {
			addCriterion("msg_type not like", value, "msgType");
			return (Criteria) this;
		}

		public Criteria andMsgTypeIn(List<String> values) {
			addCriterion("msg_type in", values, "msgType");
			return (Criteria) this;
		}

		public Criteria andMsgTypeNotIn(List<String> values) {
			addCriterion("msg_type not in", values, "msgType");
			return (Criteria) this;
		}

		public Criteria andMsgTypeBetween(String value1, String value2) {
			addCriterion("msg_type between", value1, value2, "msgType");
			return (Criteria) this;
		}

		public Criteria andMsgTypeNotBetween(String value1, String value2) {
			addCriterion("msg_type not between", value1, value2, "msgType");
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

		public Criteria andDeptIdIsNull() {
			addCriterion("dept_id is null");
			return (Criteria) this;
		}

		public Criteria andDeptIdIsNotNull() {
			addCriterion("dept_id is not null");
			return (Criteria) this;
		}

		public Criteria andDeptIdEqualTo(String value) {
			addCriterion("dept_id =", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdNotEqualTo(String value) {
			addCriterion("dept_id <>", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdGreaterThan(String value) {
			addCriterion("dept_id >", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdGreaterThanOrEqualTo(String value) {
			addCriterion("dept_id >=", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdLessThan(String value) {
			addCriterion("dept_id <", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdLessThanOrEqualTo(String value) {
			addCriterion("dept_id <=", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdLike(String value) {
			addCriterion("dept_id like", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdNotLike(String value) {
			addCriterion("dept_id not like", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdIn(List<String> values) {
			addCriterion("dept_id in", values, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdNotIn(List<String> values) {
			addCriterion("dept_id not in", values, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdBetween(String value1, String value2) {
			addCriterion("dept_id between", value1, value2, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdNotBetween(String value1, String value2) {
			addCriterion("dept_id not between", value1, value2, "deptId");
			return (Criteria) this;
		}

		public Criteria andMsgContentTxtIsNull() {
			addCriterion("msg_content_txt is null");
			return (Criteria) this;
		}

		public Criteria andMsgContentTxtIsNotNull() {
			addCriterion("msg_content_txt is not null");
			return (Criteria) this;
		}

		public Criteria andMsgContentTxtEqualTo(String value) {
			addCriterion("msg_content_txt =", value, "msgContentTxt");
			return (Criteria) this;
		}

		public Criteria andMsgContentTxtNotEqualTo(String value) {
			addCriterion("msg_content_txt <>", value, "msgContentTxt");
			return (Criteria) this;
		}

		public Criteria andMsgContentTxtGreaterThan(String value) {
			addCriterion("msg_content_txt >", value, "msgContentTxt");
			return (Criteria) this;
		}

		public Criteria andMsgContentTxtGreaterThanOrEqualTo(String value) {
			addCriterion("msg_content_txt >=", value, "msgContentTxt");
			return (Criteria) this;
		}

		public Criteria andMsgContentTxtLessThan(String value) {
			addCriterion("msg_content_txt <", value, "msgContentTxt");
			return (Criteria) this;
		}

		public Criteria andMsgContentTxtLessThanOrEqualTo(String value) {
			addCriterion("msg_content_txt <=", value, "msgContentTxt");
			return (Criteria) this;
		}

		public Criteria andMsgContentTxtLike(String value) {
			addCriterion("msg_content_txt like", value, "msgContentTxt");
			return (Criteria) this;
		}

		public Criteria andMsgContentTxtNotLike(String value) {
			addCriterion("msg_content_txt not like", value, "msgContentTxt");
			return (Criteria) this;
		}

		public Criteria andMsgContentTxtIn(List<String> values) {
			addCriterion("msg_content_txt in", values, "msgContentTxt");
			return (Criteria) this;
		}

		public Criteria andMsgContentTxtNotIn(List<String> values) {
			addCriterion("msg_content_txt not in", values, "msgContentTxt");
			return (Criteria) this;
		}

		public Criteria andMsgContentTxtBetween(String value1, String value2) {
			addCriterion("msg_content_txt between", value1, value2, "msgContentTxt");
			return (Criteria) this;
		}

		public Criteria andMsgContentTxtNotBetween(String value1, String value2) {
			addCriterion("msg_content_txt not between", value1, value2, "msgContentTxt");
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

		public Criteria andOrgIdEqualTo(String value) {
			addCriterion("org_id =", value, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdNotEqualTo(String value) {
			addCriterion("org_id <>", value, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdGreaterThan(String value) {
			addCriterion("org_id >", value, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdGreaterThanOrEqualTo(String value) {
			addCriterion("org_id >=", value, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdLessThan(String value) {
			addCriterion("org_id <", value, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdLessThanOrEqualTo(String value) {
			addCriterion("org_id <=", value, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdLike(String value) {
			addCriterion("org_id like", value, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdNotLike(String value) {
			addCriterion("org_id not like", value, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdIn(List<String> values) {
			addCriterion("org_id in", values, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdNotIn(List<String> values) {
			addCriterion("org_id not in", values, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdBetween(String value1, String value2) {
			addCriterion("org_id between", value1, value2, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdNotBetween(String value1, String value2) {
			addCriterion("org_id not between", value1, value2, "orgId");
			return (Criteria) this;
		}
	}

	/**
	 * system_msg
	 *
	 * @mbg.generated do_not_delete_during_merge
	 */
	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	/**
	 * system_msg null
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