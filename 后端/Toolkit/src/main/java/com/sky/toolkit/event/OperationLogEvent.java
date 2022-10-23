package com.sky.toolkit.event;

import com.sky.toolkit.entity.OperationLog;
import org.springframework.context.ApplicationEvent;

/***
 @author sky
 @date 2022/10/23
 @version 1.0
 */
public class OperationLogEvent extends ApplicationEvent {
    public OperationLogEvent(OperationLog operationLog) {
        super(operationLog);
    }
}
