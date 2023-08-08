package com.sikku.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.sikku.command.User;

public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> cls) {
		// TODO Auto-generated method stub
		return User.class.isAssignableFrom(cls);
	}

	@Override
	public void validate(Object command, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "uname", "uname.required");
		ValidationUtils.rejectIfEmpty(errors, "upwd", "upwd.required");
		ValidationUtils.rejectIfEmpty(errors, "uage", "uage.required");
		ValidationUtils.rejectIfEmpty(errors, "uemail", "uemail.required");
		ValidationUtils.rejectIfEmpty(errors, "umobile", "umobile.required");
		
		User user = (User)command;
		
		if(user.getUage()<10 || user.getUage()>30) {
			errors.reject("uage", "uage.range");
		}

	}

}
