/**
 * 
 */
package com.Ape.validator;


import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author Miao Xu
 *
 */
@Component
public class ValidatorImplement implements InitializingBean{

	private Validator validator;
	
	public ValidationResult validate(Object bean) {
		
		ValidationResult result = new ValidationResult();
		Set<ConstraintViolation<Object>> constraintViolationSet = validator.validate(bean);
		if(constraintViolationSet.size() > 0)
		{
			result.setHasErrors(true);
			constraintViolationSet.forEach(constraintViolation->{
				String errorMsg = constraintViolation.getMessage();
				String propertyName = constraintViolation.getPropertyPath().toString();
				result.getErrorMsgMap().put(propertyName, errorMsg);
			});
		}
		return result;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {

		this.validator = Validation.buildDefaultValidatorFactory().getValidator();
		
	}
}
