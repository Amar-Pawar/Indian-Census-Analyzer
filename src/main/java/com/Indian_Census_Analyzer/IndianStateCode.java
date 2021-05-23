package com.Indian_Census_Analyzer;
import com.opencsv.bean.CsvBindByName;

public class IndianStateCode {
	
	@CsvBindByName(column = "StateName", required = true)
	public String stateName;
	
	@CsvBindByName(column = "StateCode", required = true)
	public String stateCode;
	
	
	public IndianStateCode(String stateName, String stateCode) {
		super();
		this.stateName = stateName;
		this.stateCode = stateCode;
	}

	@Override
	public String toString() {
		return "IndianStateCodeCSV [state=" + stateName + ", stateCode=" + stateCode + "]";
	}
}