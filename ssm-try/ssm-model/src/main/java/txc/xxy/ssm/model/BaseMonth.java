package txc.xxy.ssm.model;

import java.io.Serializable;

/**
  * @tableName base_month
  * @Description: 
  * @author Txc
  * @date 2017-04-27
  */
public class BaseMonth implements Serializable {
	private String dateMonth;

	private static final long serialVersionUID = 1L;

	public String getDateMonth() {
		return dateMonth;
	}

	public void setDateMonth(String dateMonth) {
		this.dateMonth = dateMonth == null ? null : dateMonth.trim();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("dateMonth=").append(dateMonth);
		sb.append("]");
		return sb.toString();
	}
}