package com.enjoy.job;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import org.springframework.beans.factory.annotation.Value;

public class EnjoyGlue extends IJobHandler {

    @Value("${server.port}")
    private String port;

    @Override
    public ReturnT<String> execute(String param) throws Exception {
        System.out.println("EnjoyGlue"+port+"--测试GLUE任务，我已被执行");
        return SUCCESS;
    }

}
