package edu.teco.smartlambda.execution;

import java.lang.annotation.*;

/**
 * A annotation marking a function as a lambda function
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
@Documented
public @interface LambdaFunction {
	
}
