package com.depromeet.streetdrop.domains.common.annotation;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.depromeet.streetdrop.domains.common.validator.LongitudeValidator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target(FIELD)
@Retention(RUNTIME)
@Constraint(validatedBy = LongitudeValidator.class)
public @interface IsLongitude {

    String message() default "Not valid longitude, must be between -180 and 180";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}