/**
 * 
 */
package com.Ape.validator;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Miao Xu
 *
 */
public class ValidationResult {

	private boolean hasErrors = false;
	
	private  Map<String, String> errorMsgMap = new HashMap<>();

	public boolean isHasErrors() {

		return hasErrors;
	}

	public void setHasErrors(boolean hasErrors) {

		this.hasErrors = hasErrors;
	}

	public Map<String, String> getErrorMsgMap() {

		return errorMsgMap;
	}

	public void setErrorMsgMap(Map<String, String> errorMsgMap) {

		this.errorMsgMap = errorMsgMap;
	}
	
	public String getErrorMsg() {
		
		return StringUtils.join(errorMsgMap.values().toArray(), ",");
	}
	
}
