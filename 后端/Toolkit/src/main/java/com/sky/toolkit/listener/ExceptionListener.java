package com.sky.toolkit.listener;

import com.sky.toolkit.entity.ExceptionLog;
import com.sky.toolkit.entity.OperationLog;
import com.sky.toolkit.event.ExceptionLogEvent;
import com.sky.toolkit.event.OperationLogEvent;
import com.sky.toolkit.mapper.ExceptionLogMapper;
import com.sky.toolkit.mapper.OperationLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/***
 @author 蔡联发
 @date 2022/10/23
 @version 1.0
 */
@Component
public class ExceptionListener{
    @Autowired
    private OperationLogMapper operationLogMapper;

    @Autowired
    private ExceptionLogMapper exceptionLogMapper;

    @Async
    @EventListener(OperationLogEvent.class)
    public void saveOperationLog(OperationLogEvent operationLogEvent) {
        operationLogMapper.insert((OperationLog) operationLogEvent.getSource());
    }

    @Async
    @EventListener(ExceptionLogEvent.class)
    public void saveExceptionLog(ExceptionLogEvent exceptionLogEvent) {
        exceptionLogMapper.insert((ExceptionLog) exceptionLogEvent.getSource());
    }
}
