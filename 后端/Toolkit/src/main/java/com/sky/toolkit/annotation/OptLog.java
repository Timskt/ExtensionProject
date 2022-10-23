package com.sky.toolkit.annotation;

import java.lang.annotation.*;

/***
 @author sky
 @date 2022/10/23
 @version 1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OptLog {

    String optType() default "";
}
