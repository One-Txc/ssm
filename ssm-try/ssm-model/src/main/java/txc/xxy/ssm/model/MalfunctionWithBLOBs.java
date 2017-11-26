package txc.xxy.ssm.model;

import java.io.Serializable;

/**
  * @tableName malfunction
  * @Description: 故障表
  * @author Txc
  * @date 2017-04-27
  */
public class MalfunctionWithBLOBs extends Malfunction implements Serializable {
	private String causeAnalysis;		//故障原因分析-故障原因分析

	private String solveDesc;		//解决方法

	private String notes;		//注意事项

	private static final long serialVersionUID = 1L;

	public String getCauseAnalysis() {
		return causeAnalysis;
	}

	public void setCauseAnalysis(String causeAnalysis) {
		this.causeAnalysis = causeAnalysis == null ? null : causeAnalysis.trim();
	}

	public String getSolveDesc() {
		return solveDesc;
	}

	public void setSolveDesc(String solveDesc) {
		this.solveDesc = solveDesc == null ? null : solveDesc.trim();
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes == null ? null : notes.trim();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("causeAnalysis=").append(causeAnalysis);
		sb.append(", solveDesc=").append(solveDesc);
		sb.append(", notes=").append(notes);
		sb.append("]");
		return sb.toString();
	}
}