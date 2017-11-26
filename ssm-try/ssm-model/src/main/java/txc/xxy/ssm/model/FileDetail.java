package txc.xxy.ssm.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
  * @tableName file_detail
  * @Description: 文件清单
  * @author Txc
  * @date 2017-04-27
  */
public class FileDetail implements Serializable {
	private Long docId;		//文档ID

	private String docName;		//文档名称

	private String subjectId;		//关联主体ID

	private String subjectType;		//关联主体类型[0-任务,1-需求,2-工作]

	private String docType;		//文档类型[1:资料文档,2-产出文档]

	private String docUrl;		//文件链接

	private String remark;		//备注

	private String oprUid;		//操作人ID

	private String oprUname;		//操作人姓名

	private Timestamp createTime;		//创建时间

	private String codeUrl;		//源代码路径

	private static final long serialVersionUID = 1L;

	public Long getDocId() {
		return docId;
	}

	public void setDocId(Long docId) {
		this.docId = docId;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName == null ? null : docName.trim();
	}

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId == null ? null : subjectId.trim();
	}

	public String getSubjectType() {
		return subjectType;
	}

	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType == null ? null : subjectType.trim();
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType == null ? null : docType.trim();
	}

	public String getDocUrl() {
		return docUrl;
	}

	public void setDocUrl(String docUrl) {
		this.docUrl = docUrl == null ? null : docUrl.trim();
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}

	public String getOprUid() {
		return oprUid;
	}

	public void setOprUid(String oprUid) {
		this.oprUid = oprUid == null ? null : oprUid.trim();
	}

	public String getOprUname() {
		return oprUname;
	}

	public void setOprUname(String oprUname) {
		this.oprUname = oprUname == null ? null : oprUname.trim();
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getCodeUrl() {
		return codeUrl;
	}

	public void setCodeUrl(String codeUrl) {
		this.codeUrl = codeUrl == null ? null : codeUrl.trim();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("docId=").append(docId);
		sb.append(", docName=").append(docName);
		sb.append(", subjectId=").append(subjectId);
		sb.append(", subjectType=").append(subjectType);
		sb.append(", docType=").append(docType);
		sb.append(", docUrl=").append(docUrl);
		sb.append(", remark=").append(remark);
		sb.append(", oprUid=").append(oprUid);
		sb.append(", oprUname=").append(oprUname);
		sb.append(", createTime=").append(createTime);
		sb.append(", codeUrl=").append(codeUrl);
		sb.append("]");
		return sb.toString();
	}
}