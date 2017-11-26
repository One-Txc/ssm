package txc.xxy.ssm.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class FileDetailExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public FileDetailExample() {
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
	 * file_detail null
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

		public Criteria andDocIdIsNull() {
			addCriterion("doc_id is null");
			return (Criteria) this;
		}

		public Criteria andDocIdIsNotNull() {
			addCriterion("doc_id is not null");
			return (Criteria) this;
		}

		public Criteria andDocIdEqualTo(Long value) {
			addCriterion("doc_id =", value, "docId");
			return (Criteria) this;
		}

		public Criteria andDocIdNotEqualTo(Long value) {
			addCriterion("doc_id <>", value, "docId");
			return (Criteria) this;
		}

		public Criteria andDocIdGreaterThan(Long value) {
			addCriterion("doc_id >", value, "docId");
			return (Criteria) this;
		}

		public Criteria andDocIdGreaterThanOrEqualTo(Long value) {
			addCriterion("doc_id >=", value, "docId");
			return (Criteria) this;
		}

		public Criteria andDocIdLessThan(Long value) {
			addCriterion("doc_id <", value, "docId");
			return (Criteria) this;
		}

		public Criteria andDocIdLessThanOrEqualTo(Long value) {
			addCriterion("doc_id <=", value, "docId");
			return (Criteria) this;
		}

		public Criteria andDocIdIn(List<Long> values) {
			addCriterion("doc_id in", values, "docId");
			return (Criteria) this;
		}

		public Criteria andDocIdNotIn(List<Long> values) {
			addCriterion("doc_id not in", values, "docId");
			return (Criteria) this;
		}

		public Criteria andDocIdBetween(Long value1, Long value2) {
			addCriterion("doc_id between", value1, value2, "docId");
			return (Criteria) this;
		}

		public Criteria andDocIdNotBetween(Long value1, Long value2) {
			addCriterion("doc_id not between", value1, value2, "docId");
			return (Criteria) this;
		}

		public Criteria andDocNameIsNull() {
			addCriterion("doc_name is null");
			return (Criteria) this;
		}

		public Criteria andDocNameIsNotNull() {
			addCriterion("doc_name is not null");
			return (Criteria) this;
		}

		public Criteria andDocNameEqualTo(String value) {
			addCriterion("doc_name =", value, "docName");
			return (Criteria) this;
		}

		public Criteria andDocNameNotEqualTo(String value) {
			addCriterion("doc_name <>", value, "docName");
			return (Criteria) this;
		}

		public Criteria andDocNameGreaterThan(String value) {
			addCriterion("doc_name >", value, "docName");
			return (Criteria) this;
		}

		public Criteria andDocNameGreaterThanOrEqualTo(String value) {
			addCriterion("doc_name >=", value, "docName");
			return (Criteria) this;
		}

		public Criteria andDocNameLessThan(String value) {
			addCriterion("doc_name <", value, "docName");
			return (Criteria) this;
		}

		public Criteria andDocNameLessThanOrEqualTo(String value) {
			addCriterion("doc_name <=", value, "docName");
			return (Criteria) this;
		}

		public Criteria andDocNameLike(String value) {
			addCriterion("doc_name like", value, "docName");
			return (Criteria) this;
		}

		public Criteria andDocNameNotLike(String value) {
			addCriterion("doc_name not like", value, "docName");
			return (Criteria) this;
		}

		public Criteria andDocNameIn(List<String> values) {
			addCriterion("doc_name in", values, "docName");
			return (Criteria) this;
		}

		public Criteria andDocNameNotIn(List<String> values) {
			addCriterion("doc_name not in", values, "docName");
			return (Criteria) this;
		}

		public Criteria andDocNameBetween(String value1, String value2) {
			addCriterion("doc_name between", value1, value2, "docName");
			return (Criteria) this;
		}

		public Criteria andDocNameNotBetween(String value1, String value2) {
			addCriterion("doc_name not between", value1, value2, "docName");
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

		public Criteria andDocTypeIsNull() {
			addCriterion("doc_type is null");
			return (Criteria) this;
		}

		public Criteria andDocTypeIsNotNull() {
			addCriterion("doc_type is not null");
			return (Criteria) this;
		}

		public Criteria andDocTypeEqualTo(String value) {
			addCriterion("doc_type =", value, "docType");
			return (Criteria) this;
		}

		public Criteria andDocTypeNotEqualTo(String value) {
			addCriterion("doc_type <>", value, "docType");
			return (Criteria) this;
		}

		public Criteria andDocTypeGreaterThan(String value) {
			addCriterion("doc_type >", value, "docType");
			return (Criteria) this;
		}

		public Criteria andDocTypeGreaterThanOrEqualTo(String value) {
			addCriterion("doc_type >=", value, "docType");
			return (Criteria) this;
		}

		public Criteria andDocTypeLessThan(String value) {
			addCriterion("doc_type <", value, "docType");
			return (Criteria) this;
		}

		public Criteria andDocTypeLessThanOrEqualTo(String value) {
			addCriterion("doc_type <=", value, "docType");
			return (Criteria) this;
		}

		public Criteria andDocTypeLike(String value) {
			addCriterion("doc_type like", value, "docType");
			return (Criteria) this;
		}

		public Criteria andDocTypeNotLike(String value) {
			addCriterion("doc_type not like", value, "docType");
			return (Criteria) this;
		}

		public Criteria andDocTypeIn(List<String> values) {
			addCriterion("doc_type in", values, "docType");
			return (Criteria) this;
		}

		public Criteria andDocTypeNotIn(List<String> values) {
			addCriterion("doc_type not in", values, "docType");
			return (Criteria) this;
		}

		public Criteria andDocTypeBetween(String value1, String value2) {
			addCriterion("doc_type between", value1, value2, "docType");
			return (Criteria) this;
		}

		public Criteria andDocTypeNotBetween(String value1, String value2) {
			addCriterion("doc_type not between", value1, value2, "docType");
			return (Criteria) this;
		}

		public Criteria andDocUrlIsNull() {
			addCriterion("doc_url is null");
			return (Criteria) this;
		}

		public Criteria andDocUrlIsNotNull() {
			addCriterion("doc_url is not null");
			return (Criteria) this;
		}

		public Criteria andDocUrlEqualTo(String value) {
			addCriterion("doc_url =", value, "docUrl");
			return (Criteria) this;
		}

		public Criteria andDocUrlNotEqualTo(String value) {
			addCriterion("doc_url <>", value, "docUrl");
			return (Criteria) this;
		}

		public Criteria andDocUrlGreaterThan(String value) {
			addCriterion("doc_url >", value, "docUrl");
			return (Criteria) this;
		}

		public Criteria andDocUrlGreaterThanOrEqualTo(String value) {
			addCriterion("doc_url >=", value, "docUrl");
			return (Criteria) this;
		}

		public Criteria andDocUrlLessThan(String value) {
			addCriterion("doc_url <", value, "docUrl");
			return (Criteria) this;
		}

		public Criteria andDocUrlLessThanOrEqualTo(String value) {
			addCriterion("doc_url <=", value, "docUrl");
			return (Criteria) this;
		}

		public Criteria andDocUrlLike(String value) {
			addCriterion("doc_url like", value, "docUrl");
			return (Criteria) this;
		}

		public Criteria andDocUrlNotLike(String value) {
			addCriterion("doc_url not like", value, "docUrl");
			return (Criteria) this;
		}

		public Criteria andDocUrlIn(List<String> values) {
			addCriterion("doc_url in", values, "docUrl");
			return (Criteria) this;
		}

		public Criteria andDocUrlNotIn(List<String> values) {
			addCriterion("doc_url not in", values, "docUrl");
			return (Criteria) this;
		}

		public Criteria andDocUrlBetween(String value1, String value2) {
			addCriterion("doc_url between", value1, value2, "docUrl");
			return (Criteria) this;
		}

		public Criteria andDocUrlNotBetween(String value1, String value2) {
			addCriterion("doc_url not between", value1, value2, "docUrl");
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

		public Criteria andCodeUrlIsNull() {
			addCriterion("code_url is null");
			return (Criteria) this;
		}

		public Criteria andCodeUrlIsNotNull() {
			addCriterion("code_url is not null");
			return (Criteria) this;
		}

		public Criteria andCodeUrlEqualTo(String value) {
			addCriterion("code_url =", value, "codeUrl");
			return (Criteria) this;
		}

		public Criteria andCodeUrlNotEqualTo(String value) {
			addCriterion("code_url <>", value, "codeUrl");
			return (Criteria) this;
		}

		public Criteria andCodeUrlGreaterThan(String value) {
			addCriterion("code_url >", value, "codeUrl");
			return (Criteria) this;
		}

		public Criteria andCodeUrlGreaterThanOrEqualTo(String value) {
			addCriterion("code_url >=", value, "codeUrl");
			return (Criteria) this;
		}

		public Criteria andCodeUrlLessThan(String value) {
			addCriterion("code_url <", value, "codeUrl");
			return (Criteria) this;
		}

		public Criteria andCodeUrlLessThanOrEqualTo(String value) {
			addCriterion("code_url <=", value, "codeUrl");
			return (Criteria) this;
		}

		public Criteria andCodeUrlLike(String value) {
			addCriterion("code_url like", value, "codeUrl");
			return (Criteria) this;
		}

		public Criteria andCodeUrlNotLike(String value) {
			addCriterion("code_url not like", value, "codeUrl");
			return (Criteria) this;
		}

		public Criteria andCodeUrlIn(List<String> values) {
			addCriterion("code_url in", values, "codeUrl");
			return (Criteria) this;
		}

		public Criteria andCodeUrlNotIn(List<String> values) {
			addCriterion("code_url not in", values, "codeUrl");
			return (Criteria) this;
		}

		public Criteria andCodeUrlBetween(String value1, String value2) {
			addCriterion("code_url between", value1, value2, "codeUrl");
			return (Criteria) this;
		}

		public Criteria andCodeUrlNotBetween(String value1, String value2) {
			addCriterion("code_url not between", value1, value2, "codeUrl");
			return (Criteria) this;
		}
	}

	/**
	 * file_detail
	 *
	 * @mbg.generated do_not_delete_during_merge
	 */
	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	/**
	 * file_detail null
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