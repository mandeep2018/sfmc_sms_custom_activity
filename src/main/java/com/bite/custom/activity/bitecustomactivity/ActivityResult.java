package com.bite.custom.activity.bitecustomactivity;

/*import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor*/
public class ActivityResult {
	
	public ActivityResult() {}
	
	ActivityResult(String param){
		this.branchResult = param;
	}

    private String branchResult;

	public String getBranchResult() {
		return branchResult;
	}

	public void setBranchResult(String branchResult) {
		this.branchResult = branchResult;
	}

}
