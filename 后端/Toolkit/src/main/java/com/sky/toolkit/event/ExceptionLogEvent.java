package com.sky.toolkit.event;

import com.sky.toolkit.entity.ExceptionLog;
import org.springframework.context.ApplicationEvent;

/***
 @author 蔡联发
 @date 2022/10/23
 @version 1.0
 */
public class ExceptionLogEvent extends ApplicationEvent {
    public ExceptionLogEvent(ExceptionLog exceptionLog) {
        super(exceptionLog);
    }
}
