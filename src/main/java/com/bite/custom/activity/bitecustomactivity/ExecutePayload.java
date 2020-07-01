package com.bite.custom.activity.bitecustomactivity;

//import lombok.Data;

import java.util.Map;

//@Data
public class ExecutePayload {

    private String mode;

    private String activityId;

    private String activityObjectID;

    private String definitionInstanceId;

    private String keyValue;

    private Map<String, String>[] outArguments;

    private Map<String, String>[] inArguments;

    private String activityInstanceId;

    private String journeyId;

	/**
	 * @return the mode
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * @param mode the mode to set
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * @return the activityId
	 */
	public String getActivityId() {
		return activityId;
	}

	/**
	 * @param activityId the activityId to set
	 */
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	/**
	 * @return the activityObjectID
	 */
	public String getActivityObjectID() {
		return activityObjectID;
	}

	/**
	 * @param activityObjectID the activityObjectID to set
	 */
	public void setActivityObjectID(String activityObjectID) {
		this.activityObjectID = activityObjectID;
	}

	/**
	 * @return the definitionInstanceId
	 */
	public String getDefinitionInstanceId() {
		return definitionInstanceId;
	}

	/**
	 * @param definitionInstanceId the definitionInstanceId to set
	 */
	public void setDefinitionInstanceId(String definitionInstanceId) {
		this.definitionInstanceId = definitionInstanceId;
	}

	/**
	 * @return the keyValue
	 */
	public String getKeyValue() {
		return keyValue;
	}

	/**
	 * @param keyValue the keyValue to set
	 */
	public void setKeyValue(String keyValue) {
		this.keyValue = keyValue;
	}

	/**
	 * @return the outArguments
	 */
	public Map<String, String>[] getOutArguments() {
		return outArguments;
	}

	/**
	 * @param outArguments the outArguments to set
	 */
	public void setOutArguments(Map<String, String>[] outArguments) {
		this.outArguments = outArguments;
	}

	/**
	 * @return the inArguments
	 */
	public Map<String, String>[] getInArguments() {
		return inArguments;
	}

	/**
	 * @param inArguments the inArguments to set
	 */
	public void setInArguments(Map<String, String>[] inArguments) {
		this.inArguments = inArguments;
	}

	/**
	 * @return the activityInstanceId
	 */
	public String getActivityInstanceId() {
		return activityInstanceId;
	}

	/**
	 * @param activityInstanceId the activityInstanceId to set
	 */
	public void setActivityInstanceId(String activityInstanceId) {
		this.activityInstanceId = activityInstanceId;
	}

	/**
	 * @return the journeyId
	 */
	public String getJourneyId() {
		return journeyId;
	}

	/**
	 * @param journeyId the journeyId to set
	 */
	public void setJourneyId(String journeyId) {
		this.journeyId = journeyId;
	}

    

}
