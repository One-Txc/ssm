package txc.xxy.ssm.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class MalfunctionExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public MalfunctionExample() {
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
	 * malfunction null
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

		public Criteria andMalfNoIsNull() {
			addCriterion("malf_no is null");
			return (Criteria) this;
		}

		public Criteria andMalfNoIsNotNull() {
			addCriterion("malf_no is not null");
			return (Criteria) this;
		}

		public Criteria andMalfNoEqualTo(String value) {
			addCriterion("malf_no =", value, "malfNo");
			return (Criteria) this;
		}

		public Criteria andMalfNoNotEqualTo(String value) {
			addCriterion("malf_no <>", value, "malfNo");
			return (Criteria) this;
		}

		public Criteria andMalfNoGreaterThan(String value) {
			addCriterion("malf_no >", value, "malfNo");
			return (Criteria) this;
		}

		public Criteria andMalfNoGreaterThanOrEqualTo(String value) {
			addCriterion("malf_no >=", value, "malfNo");
			return (Criteria) this;
		}

		public Criteria andMalfNoLessThan(String value) {
			addCriterion("malf_no <", value, "malfNo");
			return (Criteria) this;
		}

		public Criteria andMalfNoLessThanOrEqualTo(String value) {
			addCriterion("malf_no <=", value, "malfNo");
			return (Criteria) this;
		}

		public Criteria andMalfNoLike(String value) {
			addCriterion("malf_no like", value, "malfNo");
			return (Criteria) this;
		}

		public Criteria andMalfNoNotLike(String value) {
			addCriterion("malf_no not like", value, "malfNo");
			return (Criteria) this;
		}

		public Criteria andMalfNoIn(List<String> values) {
			addCriterion("malf_no in", values, "malfNo");
			return (Criteria) this;
		}

		public Criteria andMalfNoNotIn(List<String> values) {
			addCriterion("malf_no not in", values, "malfNo");
			return (Criteria) this;
		}

		public Criteria andMalfNoBetween(String value1, String value2) {
			addCriterion("malf_no between", value1, value2, "malfNo");
			return (Criteria) this;
		}

		public Criteria andMalfNoNotBetween(String value1, String value2) {
			addCriterion("malf_no not between", value1, value2, "malfNo");
			return (Criteria) this;
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

		public Criteria andTicketNoIsNull() {
			addCriterion("ticket_no is null");
			return (Criteria) this;
		}

		public Criteria andTicketNoIsNotNull() {
			addCriterion("ticket_no is not null");
			return (Criteria) this;
		}

		public Criteria andTicketNoEqualTo(String value) {
			addCriterion("ticket_no =", value, "ticketNo");
			return (Criteria) this;
		}

		public Criteria andTicketNoNotEqualTo(String value) {
			addCriterion("ticket_no <>", value, "ticketNo");
			return (Criteria) this;
		}

		public Criteria andTicketNoGreaterThan(String value) {
			addCriterion("ticket_no >", value, "ticketNo");
			return (Criteria) this;
		}

		public Criteria andTicketNoGreaterThanOrEqualTo(String value) {
			addCriterion("ticket_no >=", value, "ticketNo");
			return (Criteria) this;
		}

		public Criteria andTicketNoLessThan(String value) {
			addCriterion("ticket_no <", value, "ticketNo");
			return (Criteria) this;
		}

		public Criteria andTicketNoLessThanOrEqualTo(String value) {
			addCriterion("ticket_no <=", value, "ticketNo");
			return (Criteria) this;
		}

		public Criteria andTicketNoLike(String value) {
			addCriterion("ticket_no like", value, "ticketNo");
			return (Criteria) this;
		}

		public Criteria andTicketNoNotLike(String value) {
			addCriterion("ticket_no not like", value, "ticketNo");
			return (Criteria) this;
		}

		public Criteria andTicketNoIn(List<String> values) {
			addCriterion("ticket_no in", values, "ticketNo");
			return (Criteria) this;
		}

		public Criteria andTicketNoNotIn(List<String> values) {
			addCriterion("ticket_no not in", values, "ticketNo");
			return (Criteria) this;
		}

		public Criteria andTicketNoBetween(String value1, String value2) {
			addCriterion("ticket_no between", value1, value2, "ticketNo");
			return (Criteria) this;
		}

		public Criteria andTicketNoNotBetween(String value1, String value2) {
			addCriterion("ticket_no not between", value1, value2, "ticketNo");
			return (Criteria) this;
		}

		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("name is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("name >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("name >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("name <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("name <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("name in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("name not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("name between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("name not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andSourceTypeIsNull() {
			addCriterion("source_type is null");
			return (Criteria) this;
		}

		public Criteria andSourceTypeIsNotNull() {
			addCriterion("source_type is not null");
			return (Criteria) this;
		}

		public Criteria andSourceTypeEqualTo(String value) {
			addCriterion("source_type =", value, "sourceType");
			return (Criteria) this;
		}

		public Criteria andSourceTypeNotEqualTo(String value) {
			addCriterion("source_type <>", value, "sourceType");
			return (Criteria) this;
		}

		public Criteria andSourceTypeGreaterThan(String value) {
			addCriterion("source_type >", value, "sourceType");
			return (Criteria) this;
		}

		public Criteria andSourceTypeGreaterThanOrEqualTo(String value) {
			addCriterion("source_type >=", value, "sourceType");
			return (Criteria) this;
		}

		public Criteria andSourceTypeLessThan(String value) {
			addCriterion("source_type <", value, "sourceType");
			return (Criteria) this;
		}

		public Criteria andSourceTypeLessThanOrEqualTo(String value) {
			addCriterion("source_type <=", value, "sourceType");
			return (Criteria) this;
		}

		public Criteria andSourceTypeLike(String value) {
			addCriterion("source_type like", value, "sourceType");
			return (Criteria) this;
		}

		public Criteria andSourceTypeNotLike(String value) {
			addCriterion("source_type not like", value, "sourceType");
			return (Criteria) this;
		}

		public Criteria andSourceTypeIn(List<String> values) {
			addCriterion("source_type in", values, "sourceType");
			return (Criteria) this;
		}

		public Criteria andSourceTypeNotIn(List<String> values) {
			addCriterion("source_type not in", values, "sourceType");
			return (Criteria) this;
		}

		public Criteria andSourceTypeBetween(String value1, String value2) {
			addCriterion("source_type between", value1, value2, "sourceType");
			return (Criteria) this;
		}

		public Criteria andSourceTypeNotBetween(String value1, String value2) {
			addCriterion("source_type not between", value1, value2, "sourceType");
			return (Criteria) this;
		}

		public Criteria andCateTypeIsNull() {
			addCriterion("cate_type is null");
			return (Criteria) this;
		}

		public Criteria andCateTypeIsNotNull() {
			addCriterion("cate_type is not null");
			return (Criteria) this;
		}

		public Criteria andCateTypeEqualTo(String value) {
			addCriterion("cate_type =", value, "cateType");
			return (Criteria) this;
		}

		public Criteria andCateTypeNotEqualTo(String value) {
			addCriterion("cate_type <>", value, "cateType");
			return (Criteria) this;
		}

		public Criteria andCateTypeGreaterThan(String value) {
			addCriterion("cate_type >", value, "cateType");
			return (Criteria) this;
		}

		public Criteria andCateTypeGreaterThanOrEqualTo(String value) {
			addCriterion("cate_type >=", value, "cateType");
			return (Criteria) this;
		}

		public Criteria andCateTypeLessThan(String value) {
			addCriterion("cate_type <", value, "cateType");
			return (Criteria) this;
		}

		public Criteria andCateTypeLessThanOrEqualTo(String value) {
			addCriterion("cate_type <=", value, "cateType");
			return (Criteria) this;
		}

		public Criteria andCateTypeLike(String value) {
			addCriterion("cate_type like", value, "cateType");
			return (Criteria) this;
		}

		public Criteria andCateTypeNotLike(String value) {
			addCriterion("cate_type not like", value, "cateType");
			return (Criteria) this;
		}

		public Criteria andCateTypeIn(List<String> values) {
			addCriterion("cate_type in", values, "cateType");
			return (Criteria) this;
		}

		public Criteria andCateTypeNotIn(List<String> values) {
			addCriterion("cate_type not in", values, "cateType");
			return (Criteria) this;
		}

		public Criteria andCateTypeBetween(String value1, String value2) {
			addCriterion("cate_type between", value1, value2, "cateType");
			return (Criteria) this;
		}

		public Criteria andCateTypeNotBetween(String value1, String value2) {
			addCriterion("cate_type not between", value1, value2, "cateType");
			return (Criteria) this;
		}

		public Criteria andSolveTypeIsNull() {
			addCriterion("solve_type is null");
			return (Criteria) this;
		}

		public Criteria andSolveTypeIsNotNull() {
			addCriterion("solve_type is not null");
			return (Criteria) this;
		}

		public Criteria andSolveTypeEqualTo(String value) {
			addCriterion("solve_type =", value, "solveType");
			return (Criteria) this;
		}

		public Criteria andSolveTypeNotEqualTo(String value) {
			addCriterion("solve_type <>", value, "solveType");
			return (Criteria) this;
		}

		public Criteria andSolveTypeGreaterThan(String value) {
			addCriterion("solve_type >", value, "solveType");
			return (Criteria) this;
		}

		public Criteria andSolveTypeGreaterThanOrEqualTo(String value) {
			addCriterion("solve_type >=", value, "solveType");
			return (Criteria) this;
		}

		public Criteria andSolveTypeLessThan(String value) {
			addCriterion("solve_type <", value, "solveType");
			return (Criteria) this;
		}

		public Criteria andSolveTypeLessThanOrEqualTo(String value) {
			addCriterion("solve_type <=", value, "solveType");
			return (Criteria) this;
		}

		public Criteria andSolveTypeLike(String value) {
			addCriterion("solve_type like", value, "solveType");
			return (Criteria) this;
		}

		public Criteria andSolveTypeNotLike(String value) {
			addCriterion("solve_type not like", value, "solveType");
			return (Criteria) this;
		}

		public Criteria andSolveTypeIn(List<String> values) {
			addCriterion("solve_type in", values, "solveType");
			return (Criteria) this;
		}

		public Criteria andSolveTypeNotIn(List<String> values) {
			addCriterion("solve_type not in", values, "solveType");
			return (Criteria) this;
		}

		public Criteria andSolveTypeBetween(String value1, String value2) {
			addCriterion("solve_type between", value1, value2, "solveType");
			return (Criteria) this;
		}

		public Criteria andSolveTypeNotBetween(String value1, String value2) {
			addCriterion("solve_type not between", value1, value2, "solveType");
			return (Criteria) this;
		}

		public Criteria andSolveSourceIsNull() {
			addCriterion("solve_source is null");
			return (Criteria) this;
		}

		public Criteria andSolveSourceIsNotNull() {
			addCriterion("solve_source is not null");
			return (Criteria) this;
		}

		public Criteria andSolveSourceEqualTo(String value) {
			addCriterion("solve_source =", value, "solveSource");
			return (Criteria) this;
		}

		public Criteria andSolveSourceNotEqualTo(String value) {
			addCriterion("solve_source <>", value, "solveSource");
			return (Criteria) this;
		}

		public Criteria andSolveSourceGreaterThan(String value) {
			addCriterion("solve_source >", value, "solveSource");
			return (Criteria) this;
		}

		public Criteria andSolveSourceGreaterThanOrEqualTo(String value) {
			addCriterion("solve_source >=", value, "solveSource");
			return (Criteria) this;
		}

		public Criteria andSolveSourceLessThan(String value) {
			addCriterion("solve_source <", value, "solveSource");
			return (Criteria) this;
		}

		public Criteria andSolveSourceLessThanOrEqualTo(String value) {
			addCriterion("solve_source <=", value, "solveSource");
			return (Criteria) this;
		}

		public Criteria andSolveSourceLike(String value) {
			addCriterion("solve_source like", value, "solveSource");
			return (Criteria) this;
		}

		public Criteria andSolveSourceNotLike(String value) {
			addCriterion("solve_source not like", value, "solveSource");
			return (Criteria) this;
		}

		public Criteria andSolveSourceIn(List<String> values) {
			addCriterion("solve_source in", values, "solveSource");
			return (Criteria) this;
		}

		public Criteria andSolveSourceNotIn(List<String> values) {
			addCriterion("solve_source not in", values, "solveSource");
			return (Criteria) this;
		}

		public Criteria andSolveSourceBetween(String value1, String value2) {
			addCriterion("solve_source between", value1, value2, "solveSource");
			return (Criteria) this;
		}

		public Criteria andSolveSourceNotBetween(String value1, String value2) {
			addCriterion("solve_source not between", value1, value2, "solveSource");
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

		public Criteria andExpectWorkloadIsNull() {
			addCriterion("expect_workload is null");
			return (Criteria) this;
		}

		public Criteria andExpectWorkloadIsNotNull() {
			addCriterion("expect_workload is not null");
			return (Criteria) this;
		}

		public Criteria andExpectWorkloadEqualTo(Double value) {
			addCriterion("expect_workload =", value, "expectWorkload");
			return (Criteria) this;
		}

		public Criteria andExpectWorkloadNotEqualTo(Double value) {
			addCriterion("expect_workload <>", value, "expectWorkload");
			return (Criteria) this;
		}

		public Criteria andExpectWorkloadGreaterThan(Double value) {
			addCriterion("expect_workload >", value, "expectWorkload");
			return (Criteria) this;
		}

		public Criteria andExpectWorkloadGreaterThanOrEqualTo(Double value) {
			addCriterion("expect_workload >=", value, "expectWorkload");
			return (Criteria) this;
		}

		public Criteria andExpectWorkloadLessThan(Double value) {
			addCriterion("expect_workload <", value, "expectWorkload");
			return (Criteria) this;
		}

		public Criteria andExpectWorkloadLessThanOrEqualTo(Double value) {
			addCriterion("expect_workload <=", value, "expectWorkload");
			return (Criteria) this;
		}

		public Criteria andExpectWorkloadIn(List<Double> values) {
			addCriterion("expect_workload in", values, "expectWorkload");
			return (Criteria) this;
		}

		public Criteria andExpectWorkloadNotIn(List<Double> values) {
			addCriterion("expect_workload not in", values, "expectWorkload");
			return (Criteria) this;
		}

		public Criteria andExpectWorkloadBetween(Double value1, Double value2) {
			addCriterion("expect_workload between", value1, value2, "expectWorkload");
			return (Criteria) this;
		}

		public Criteria andExpectWorkloadNotBetween(Double value1, Double value2) {
			addCriterion("expect_workload not between", value1, value2, "expectWorkload");
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

		public Criteria andCustomRealWorkloadIsNull() {
			addCriterion("custom_real_workload is null");
			return (Criteria) this;
		}

		public Criteria andCustomRealWorkloadIsNotNull() {
			addCriterion("custom_real_workload is not null");
			return (Criteria) this;
		}

		public Criteria andCustomRealWorkloadEqualTo(Double value) {
			addCriterion("custom_real_workload =", value, "customRealWorkload");
			return (Criteria) this;
		}

		public Criteria andCustomRealWorkloadNotEqualTo(Double value) {
			addCriterion("custom_real_workload <>", value, "customRealWorkload");
			return (Criteria) this;
		}

		public Criteria andCustomRealWorkloadGreaterThan(Double value) {
			addCriterion("custom_real_workload >", value, "customRealWorkload");
			return (Criteria) this;
		}

		public Criteria andCustomRealWorkloadGreaterThanOrEqualTo(Double value) {
			addCriterion("custom_real_workload >=", value, "customRealWorkload");
			return (Criteria) this;
		}

		public Criteria andCustomRealWorkloadLessThan(Double value) {
			addCriterion("custom_real_workload <", value, "customRealWorkload");
			return (Criteria) this;
		}

		public Criteria andCustomRealWorkloadLessThanOrEqualTo(Double value) {
			addCriterion("custom_real_workload <=", value, "customRealWorkload");
			return (Criteria) this;
		}

		public Criteria andCustomRealWorkloadIn(List<Double> values) {
			addCriterion("custom_real_workload in", values, "customRealWorkload");
			return (Criteria) this;
		}

		public Criteria andCustomRealWorkloadNotIn(List<Double> values) {
			addCriterion("custom_real_workload not in", values, "customRealWorkload");
			return (Criteria) this;
		}

		public Criteria andCustomRealWorkloadBetween(Double value1, Double value2) {
			addCriterion("custom_real_workload between", value1, value2, "customRealWorkload");
			return (Criteria) this;
		}

		public Criteria andCustomRealWorkloadNotBetween(Double value1, Double value2) {
			addCriterion("custom_real_workload not between", value1, value2, "customRealWorkload");
			return (Criteria) this;
		}

		public Criteria andPlanStartTimeIsNull() {
			addCriterion("plan_start_time is null");
			return (Criteria) this;
		}

		public Criteria andPlanStartTimeIsNotNull() {
			addCriterion("plan_start_time is not null");
			return (Criteria) this;
		}

		public Criteria andPlanStartTimeEqualTo(Timestamp value) {
			addCriterion("plan_start_time =", value, "planStartTime");
			return (Criteria) this;
		}

		public Criteria andPlanStartTimeNotEqualTo(Timestamp value) {
			addCriterion("plan_start_time <>", value, "planStartTime");
			return (Criteria) this;
		}

		public Criteria andPlanStartTimeGreaterThan(Timestamp value) {
			addCriterion("plan_start_time >", value, "planStartTime");
			return (Criteria) this;
		}

		public Criteria andPlanStartTimeGreaterThanOrEqualTo(Timestamp value) {
			addCriterion("plan_start_time >=", value, "planStartTime");
			return (Criteria) this;
		}

		public Criteria andPlanStartTimeLessThan(Timestamp value) {
			addCriterion("plan_start_time <", value, "planStartTime");
			return (Criteria) this;
		}

		public Criteria andPlanStartTimeLessThanOrEqualTo(Timestamp value) {
			addCriterion("plan_start_time <=", value, "planStartTime");
			return (Criteria) this;
		}

		public Criteria andPlanStartTimeIn(List<Timestamp> values) {
			addCriterion("plan_start_time in", values, "planStartTime");
			return (Criteria) this;
		}

		public Criteria andPlanStartTimeNotIn(List<Timestamp> values) {
			addCriterion("plan_start_time not in", values, "planStartTime");
			return (Criteria) this;
		}

		public Criteria andPlanStartTimeBetween(Timestamp value1, Timestamp value2) {
			addCriterion("plan_start_time between", value1, value2, "planStartTime");
			return (Criteria) this;
		}

		public Criteria andPlanStartTimeNotBetween(Timestamp value1, Timestamp value2) {
			addCriterion("plan_start_time not between", value1, value2, "planStartTime");
			return (Criteria) this;
		}

		public Criteria andPlanStopTimeIsNull() {
			addCriterion("plan_stop_time is null");
			return (Criteria) this;
		}

		public Criteria andPlanStopTimeIsNotNull() {
			addCriterion("plan_stop_time is not null");
			return (Criteria) this;
		}

		public Criteria andPlanStopTimeEqualTo(Timestamp value) {
			addCriterion("plan_stop_time =", value, "planStopTime");
			return (Criteria) this;
		}

		public Criteria andPlanStopTimeNotEqualTo(Timestamp value) {
			addCriterion("plan_stop_time <>", value, "planStopTime");
			return (Criteria) this;
		}

		public Criteria andPlanStopTimeGreaterThan(Timestamp value) {
			addCriterion("plan_stop_time >", value, "planStopTime");
			return (Criteria) this;
		}

		public Criteria andPlanStopTimeGreaterThanOrEqualTo(Timestamp value) {
			addCriterion("plan_stop_time >=", value, "planStopTime");
			return (Criteria) this;
		}

		public Criteria andPlanStopTimeLessThan(Timestamp value) {
			addCriterion("plan_stop_time <", value, "planStopTime");
			return (Criteria) this;
		}

		public Criteria andPlanStopTimeLessThanOrEqualTo(Timestamp value) {
			addCriterion("plan_stop_time <=", value, "planStopTime");
			return (Criteria) this;
		}

		public Criteria andPlanStopTimeIn(List<Timestamp> values) {
			addCriterion("plan_stop_time in", values, "planStopTime");
			return (Criteria) this;
		}

		public Criteria andPlanStopTimeNotIn(List<Timestamp> values) {
			addCriterion("plan_stop_time not in", values, "planStopTime");
			return (Criteria) this;
		}

		public Criteria andPlanStopTimeBetween(Timestamp value1, Timestamp value2) {
			addCriterion("plan_stop_time between", value1, value2, "planStopTime");
			return (Criteria) this;
		}

		public Criteria andPlanStopTimeNotBetween(Timestamp value1, Timestamp value2) {
			addCriterion("plan_stop_time not between", value1, value2, "planStopTime");
			return (Criteria) this;
		}

		public Criteria andRealStartTimeIsNull() {
			addCriterion("real_start_time is null");
			return (Criteria) this;
		}

		public Criteria andRealStartTimeIsNotNull() {
			addCriterion("real_start_time is not null");
			return (Criteria) this;
		}

		public Criteria andRealStartTimeEqualTo(Timestamp value) {
			addCriterion("real_start_time =", value, "realStartTime");
			return (Criteria) this;
		}

		public Criteria andRealStartTimeNotEqualTo(Timestamp value) {
			addCriterion("real_start_time <>", value, "realStartTime");
			return (Criteria) this;
		}

		public Criteria andRealStartTimeGreaterThan(Timestamp value) {
			addCriterion("real_start_time >", value, "realStartTime");
			return (Criteria) this;
		}

		public Criteria andRealStartTimeGreaterThanOrEqualTo(Timestamp value) {
			addCriterion("real_start_time >=", value, "realStartTime");
			return (Criteria) this;
		}

		public Criteria andRealStartTimeLessThan(Timestamp value) {
			addCriterion("real_start_time <", value, "realStartTime");
			return (Criteria) this;
		}

		public Criteria andRealStartTimeLessThanOrEqualTo(Timestamp value) {
			addCriterion("real_start_time <=", value, "realStartTime");
			return (Criteria) this;
		}

		public Criteria andRealStartTimeIn(List<Timestamp> values) {
			addCriterion("real_start_time in", values, "realStartTime");
			return (Criteria) this;
		}

		public Criteria andRealStartTimeNotIn(List<Timestamp> values) {
			addCriterion("real_start_time not in", values, "realStartTime");
			return (Criteria) this;
		}

		public Criteria andRealStartTimeBetween(Timestamp value1, Timestamp value2) {
			addCriterion("real_start_time between", value1, value2, "realStartTime");
			return (Criteria) this;
		}

		public Criteria andRealStartTimeNotBetween(Timestamp value1, Timestamp value2) {
			addCriterion("real_start_time not between", value1, value2, "realStartTime");
			return (Criteria) this;
		}

		public Criteria andRealStopTimeIsNull() {
			addCriterion("real_stop_time is null");
			return (Criteria) this;
		}

		public Criteria andRealStopTimeIsNotNull() {
			addCriterion("real_stop_time is not null");
			return (Criteria) this;
		}

		public Criteria andRealStopTimeEqualTo(Timestamp value) {
			addCriterion("real_stop_time =", value, "realStopTime");
			return (Criteria) this;
		}

		public Criteria andRealStopTimeNotEqualTo(Timestamp value) {
			addCriterion("real_stop_time <>", value, "realStopTime");
			return (Criteria) this;
		}

		public Criteria andRealStopTimeGreaterThan(Timestamp value) {
			addCriterion("real_stop_time >", value, "realStopTime");
			return (Criteria) this;
		}

		public Criteria andRealStopTimeGreaterThanOrEqualTo(Timestamp value) {
			addCriterion("real_stop_time >=", value, "realStopTime");
			return (Criteria) this;
		}

		public Criteria andRealStopTimeLessThan(Timestamp value) {
			addCriterion("real_stop_time <", value, "realStopTime");
			return (Criteria) this;
		}

		public Criteria andRealStopTimeLessThanOrEqualTo(Timestamp value) {
			addCriterion("real_stop_time <=", value, "realStopTime");
			return (Criteria) this;
		}

		public Criteria andRealStopTimeIn(List<Timestamp> values) {
			addCriterion("real_stop_time in", values, "realStopTime");
			return (Criteria) this;
		}

		public Criteria andRealStopTimeNotIn(List<Timestamp> values) {
			addCriterion("real_stop_time not in", values, "realStopTime");
			return (Criteria) this;
		}

		public Criteria andRealStopTimeBetween(Timestamp value1, Timestamp value2) {
			addCriterion("real_stop_time between", value1, value2, "realStopTime");
			return (Criteria) this;
		}

		public Criteria andRealStopTimeNotBetween(Timestamp value1, Timestamp value2) {
			addCriterion("real_stop_time not between", value1, value2, "realStopTime");
			return (Criteria) this;
		}

		public Criteria andDescriptionIsNull() {
			addCriterion("description is null");
			return (Criteria) this;
		}

		public Criteria andDescriptionIsNotNull() {
			addCriterion("description is not null");
			return (Criteria) this;
		}

		public Criteria andDescriptionEqualTo(String value) {
			addCriterion("description =", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotEqualTo(String value) {
			addCriterion("description <>", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionGreaterThan(String value) {
			addCriterion("description >", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
			addCriterion("description >=", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLessThan(String value) {
			addCriterion("description <", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLessThanOrEqualTo(String value) {
			addCriterion("description <=", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLike(String value) {
			addCriterion("description like", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotLike(String value) {
			addCriterion("description not like", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionIn(List<String> values) {
			addCriterion("description in", values, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotIn(List<String> values) {
			addCriterion("description not in", values, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionBetween(String value1, String value2) {
			addCriterion("description between", value1, value2, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotBetween(String value1, String value2) {
			addCriterion("description not between", value1, value2, "description");
			return (Criteria) this;
		}

		public Criteria andOsNameIsNull() {
			addCriterion("os_name is null");
			return (Criteria) this;
		}

		public Criteria andOsNameIsNotNull() {
			addCriterion("os_name is not null");
			return (Criteria) this;
		}

		public Criteria andOsNameEqualTo(String value) {
			addCriterion("os_name =", value, "osName");
			return (Criteria) this;
		}

		public Criteria andOsNameNotEqualTo(String value) {
			addCriterion("os_name <>", value, "osName");
			return (Criteria) this;
		}

		public Criteria andOsNameGreaterThan(String value) {
			addCriterion("os_name >", value, "osName");
			return (Criteria) this;
		}

		public Criteria andOsNameGreaterThanOrEqualTo(String value) {
			addCriterion("os_name >=", value, "osName");
			return (Criteria) this;
		}

		public Criteria andOsNameLessThan(String value) {
			addCriterion("os_name <", value, "osName");
			return (Criteria) this;
		}

		public Criteria andOsNameLessThanOrEqualTo(String value) {
			addCriterion("os_name <=", value, "osName");
			return (Criteria) this;
		}

		public Criteria andOsNameLike(String value) {
			addCriterion("os_name like", value, "osName");
			return (Criteria) this;
		}

		public Criteria andOsNameNotLike(String value) {
			addCriterion("os_name not like", value, "osName");
			return (Criteria) this;
		}

		public Criteria andOsNameIn(List<String> values) {
			addCriterion("os_name in", values, "osName");
			return (Criteria) this;
		}

		public Criteria andOsNameNotIn(List<String> values) {
			addCriterion("os_name not in", values, "osName");
			return (Criteria) this;
		}

		public Criteria andOsNameBetween(String value1, String value2) {
			addCriterion("os_name between", value1, value2, "osName");
			return (Criteria) this;
		}

		public Criteria andOsNameNotBetween(String value1, String value2) {
			addCriterion("os_name not between", value1, value2, "osName");
			return (Criteria) this;
		}

		public Criteria andOsModuleCodeIsNull() {
			addCriterion("os_module_code is null");
			return (Criteria) this;
		}

		public Criteria andOsModuleCodeIsNotNull() {
			addCriterion("os_module_code is not null");
			return (Criteria) this;
		}

		public Criteria andOsModuleCodeEqualTo(String value) {
			addCriterion("os_module_code =", value, "osModuleCode");
			return (Criteria) this;
		}

		public Criteria andOsModuleCodeNotEqualTo(String value) {
			addCriterion("os_module_code <>", value, "osModuleCode");
			return (Criteria) this;
		}

		public Criteria andOsModuleCodeGreaterThan(String value) {
			addCriterion("os_module_code >", value, "osModuleCode");
			return (Criteria) this;
		}

		public Criteria andOsModuleCodeGreaterThanOrEqualTo(String value) {
			addCriterion("os_module_code >=", value, "osModuleCode");
			return (Criteria) this;
		}

		public Criteria andOsModuleCodeLessThan(String value) {
			addCriterion("os_module_code <", value, "osModuleCode");
			return (Criteria) this;
		}

		public Criteria andOsModuleCodeLessThanOrEqualTo(String value) {
			addCriterion("os_module_code <=", value, "osModuleCode");
			return (Criteria) this;
		}

		public Criteria andOsModuleCodeLike(String value) {
			addCriterion("os_module_code like", value, "osModuleCode");
			return (Criteria) this;
		}

		public Criteria andOsModuleCodeNotLike(String value) {
			addCriterion("os_module_code not like", value, "osModuleCode");
			return (Criteria) this;
		}

		public Criteria andOsModuleCodeIn(List<String> values) {
			addCriterion("os_module_code in", values, "osModuleCode");
			return (Criteria) this;
		}

		public Criteria andOsModuleCodeNotIn(List<String> values) {
			addCriterion("os_module_code not in", values, "osModuleCode");
			return (Criteria) this;
		}

		public Criteria andOsModuleCodeBetween(String value1, String value2) {
			addCriterion("os_module_code between", value1, value2, "osModuleCode");
			return (Criteria) this;
		}

		public Criteria andOsModuleCodeNotBetween(String value1, String value2) {
			addCriterion("os_module_code not between", value1, value2, "osModuleCode");
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

		public Criteria andPriorityCodeIsNull() {
			addCriterion("priority_code is null");
			return (Criteria) this;
		}

		public Criteria andPriorityCodeIsNotNull() {
			addCriterion("priority_code is not null");
			return (Criteria) this;
		}

		public Criteria andPriorityCodeEqualTo(String value) {
			addCriterion("priority_code =", value, "priorityCode");
			return (Criteria) this;
		}

		public Criteria andPriorityCodeNotEqualTo(String value) {
			addCriterion("priority_code <>", value, "priorityCode");
			return (Criteria) this;
		}

		public Criteria andPriorityCodeGreaterThan(String value) {
			addCriterion("priority_code >", value, "priorityCode");
			return (Criteria) this;
		}

		public Criteria andPriorityCodeGreaterThanOrEqualTo(String value) {
			addCriterion("priority_code >=", value, "priorityCode");
			return (Criteria) this;
		}

		public Criteria andPriorityCodeLessThan(String value) {
			addCriterion("priority_code <", value, "priorityCode");
			return (Criteria) this;
		}

		public Criteria andPriorityCodeLessThanOrEqualTo(String value) {
			addCriterion("priority_code <=", value, "priorityCode");
			return (Criteria) this;
		}

		public Criteria andPriorityCodeLike(String value) {
			addCriterion("priority_code like", value, "priorityCode");
			return (Criteria) this;
		}

		public Criteria andPriorityCodeNotLike(String value) {
			addCriterion("priority_code not like", value, "priorityCode");
			return (Criteria) this;
		}

		public Criteria andPriorityCodeIn(List<String> values) {
			addCriterion("priority_code in", values, "priorityCode");
			return (Criteria) this;
		}

		public Criteria andPriorityCodeNotIn(List<String> values) {
			addCriterion("priority_code not in", values, "priorityCode");
			return (Criteria) this;
		}

		public Criteria andPriorityCodeBetween(String value1, String value2) {
			addCriterion("priority_code between", value1, value2, "priorityCode");
			return (Criteria) this;
		}

		public Criteria andPriorityCodeNotBetween(String value1, String value2) {
			addCriterion("priority_code not between", value1, value2, "priorityCode");
			return (Criteria) this;
		}

		public Criteria andStatusCodeIsNull() {
			addCriterion("status_code is null");
			return (Criteria) this;
		}

		public Criteria andStatusCodeIsNotNull() {
			addCriterion("status_code is not null");
			return (Criteria) this;
		}

		public Criteria andStatusCodeEqualTo(String value) {
			addCriterion("status_code =", value, "statusCode");
			return (Criteria) this;
		}

		public Criteria andStatusCodeNotEqualTo(String value) {
			addCriterion("status_code <>", value, "statusCode");
			return (Criteria) this;
		}

		public Criteria andStatusCodeGreaterThan(String value) {
			addCriterion("status_code >", value, "statusCode");
			return (Criteria) this;
		}

		public Criteria andStatusCodeGreaterThanOrEqualTo(String value) {
			addCriterion("status_code >=", value, "statusCode");
			return (Criteria) this;
		}

		public Criteria andStatusCodeLessThan(String value) {
			addCriterion("status_code <", value, "statusCode");
			return (Criteria) this;
		}

		public Criteria andStatusCodeLessThanOrEqualTo(String value) {
			addCriterion("status_code <=", value, "statusCode");
			return (Criteria) this;
		}

		public Criteria andStatusCodeLike(String value) {
			addCriterion("status_code like", value, "statusCode");
			return (Criteria) this;
		}

		public Criteria andStatusCodeNotLike(String value) {
			addCriterion("status_code not like", value, "statusCode");
			return (Criteria) this;
		}

		public Criteria andStatusCodeIn(List<String> values) {
			addCriterion("status_code in", values, "statusCode");
			return (Criteria) this;
		}

		public Criteria andStatusCodeNotIn(List<String> values) {
			addCriterion("status_code not in", values, "statusCode");
			return (Criteria) this;
		}

		public Criteria andStatusCodeBetween(String value1, String value2) {
			addCriterion("status_code between", value1, value2, "statusCode");
			return (Criteria) this;
		}

		public Criteria andStatusCodeNotBetween(String value1, String value2) {
			addCriterion("status_code not between", value1, value2, "statusCode");
			return (Criteria) this;
		}

		public Criteria andLastBugGroupIsNull() {
			addCriterion("last_bug_group is null");
			return (Criteria) this;
		}

		public Criteria andLastBugGroupIsNotNull() {
			addCriterion("last_bug_group is not null");
			return (Criteria) this;
		}

		public Criteria andLastBugGroupEqualTo(String value) {
			addCriterion("last_bug_group =", value, "lastBugGroup");
			return (Criteria) this;
		}

		public Criteria andLastBugGroupNotEqualTo(String value) {
			addCriterion("last_bug_group <>", value, "lastBugGroup");
			return (Criteria) this;
		}

		public Criteria andLastBugGroupGreaterThan(String value) {
			addCriterion("last_bug_group >", value, "lastBugGroup");
			return (Criteria) this;
		}

		public Criteria andLastBugGroupGreaterThanOrEqualTo(String value) {
			addCriterion("last_bug_group >=", value, "lastBugGroup");
			return (Criteria) this;
		}

		public Criteria andLastBugGroupLessThan(String value) {
			addCriterion("last_bug_group <", value, "lastBugGroup");
			return (Criteria) this;
		}

		public Criteria andLastBugGroupLessThanOrEqualTo(String value) {
			addCriterion("last_bug_group <=", value, "lastBugGroup");
			return (Criteria) this;
		}

		public Criteria andLastBugGroupLike(String value) {
			addCriterion("last_bug_group like", value, "lastBugGroup");
			return (Criteria) this;
		}

		public Criteria andLastBugGroupNotLike(String value) {
			addCriterion("last_bug_group not like", value, "lastBugGroup");
			return (Criteria) this;
		}

		public Criteria andLastBugGroupIn(List<String> values) {
			addCriterion("last_bug_group in", values, "lastBugGroup");
			return (Criteria) this;
		}

		public Criteria andLastBugGroupNotIn(List<String> values) {
			addCriterion("last_bug_group not in", values, "lastBugGroup");
			return (Criteria) this;
		}

		public Criteria andLastBugGroupBetween(String value1, String value2) {
			addCriterion("last_bug_group between", value1, value2, "lastBugGroup");
			return (Criteria) this;
		}

		public Criteria andLastBugGroupNotBetween(String value1, String value2) {
			addCriterion("last_bug_group not between", value1, value2, "lastBugGroup");
			return (Criteria) this;
		}

		public Criteria andIssueTimeIsNull() {
			addCriterion("issue_time is null");
			return (Criteria) this;
		}

		public Criteria andIssueTimeIsNotNull() {
			addCriterion("issue_time is not null");
			return (Criteria) this;
		}

		public Criteria andIssueTimeEqualTo(Timestamp value) {
			addCriterion("issue_time =", value, "issueTime");
			return (Criteria) this;
		}

		public Criteria andIssueTimeNotEqualTo(Timestamp value) {
			addCriterion("issue_time <>", value, "issueTime");
			return (Criteria) this;
		}

		public Criteria andIssueTimeGreaterThan(Timestamp value) {
			addCriterion("issue_time >", value, "issueTime");
			return (Criteria) this;
		}

		public Criteria andIssueTimeGreaterThanOrEqualTo(Timestamp value) {
			addCriterion("issue_time >=", value, "issueTime");
			return (Criteria) this;
		}

		public Criteria andIssueTimeLessThan(Timestamp value) {
			addCriterion("issue_time <", value, "issueTime");
			return (Criteria) this;
		}

		public Criteria andIssueTimeLessThanOrEqualTo(Timestamp value) {
			addCriterion("issue_time <=", value, "issueTime");
			return (Criteria) this;
		}

		public Criteria andIssueTimeIn(List<Timestamp> values) {
			addCriterion("issue_time in", values, "issueTime");
			return (Criteria) this;
		}

		public Criteria andIssueTimeNotIn(List<Timestamp> values) {
			addCriterion("issue_time not in", values, "issueTime");
			return (Criteria) this;
		}

		public Criteria andIssueTimeBetween(Timestamp value1, Timestamp value2) {
			addCriterion("issue_time between", value1, value2, "issueTime");
			return (Criteria) this;
		}

		public Criteria andIssueTimeNotBetween(Timestamp value1, Timestamp value2) {
			addCriterion("issue_time not between", value1, value2, "issueTime");
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

		public Criteria andUpdateUidIsNull() {
			addCriterion("update_uid is null");
			return (Criteria) this;
		}

		public Criteria andUpdateUidIsNotNull() {
			addCriterion("update_uid is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateUidEqualTo(String value) {
			addCriterion("update_uid =", value, "updateUid");
			return (Criteria) this;
		}

		public Criteria andUpdateUidNotEqualTo(String value) {
			addCriterion("update_uid <>", value, "updateUid");
			return (Criteria) this;
		}

		public Criteria andUpdateUidGreaterThan(String value) {
			addCriterion("update_uid >", value, "updateUid");
			return (Criteria) this;
		}

		public Criteria andUpdateUidGreaterThanOrEqualTo(String value) {
			addCriterion("update_uid >=", value, "updateUid");
			return (Criteria) this;
		}

		public Criteria andUpdateUidLessThan(String value) {
			addCriterion("update_uid <", value, "updateUid");
			return (Criteria) this;
		}

		public Criteria andUpdateUidLessThanOrEqualTo(String value) {
			addCriterion("update_uid <=", value, "updateUid");
			return (Criteria) this;
		}

		public Criteria andUpdateUidLike(String value) {
			addCriterion("update_uid like", value, "updateUid");
			return (Criteria) this;
		}

		public Criteria andUpdateUidNotLike(String value) {
			addCriterion("update_uid not like", value, "updateUid");
			return (Criteria) this;
		}

		public Criteria andUpdateUidIn(List<String> values) {
			addCriterion("update_uid in", values, "updateUid");
			return (Criteria) this;
		}

		public Criteria andUpdateUidNotIn(List<String> values) {
			addCriterion("update_uid not in", values, "updateUid");
			return (Criteria) this;
		}

		public Criteria andUpdateUidBetween(String value1, String value2) {
			addCriterion("update_uid between", value1, value2, "updateUid");
			return (Criteria) this;
		}

		public Criteria andUpdateUidNotBetween(String value1, String value2) {
			addCriterion("update_uid not between", value1, value2, "updateUid");
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
	 * malfunction
	 *
	 * @mbg.generated do_not_delete_during_merge
	 */
	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	/**
	 * malfunction null
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