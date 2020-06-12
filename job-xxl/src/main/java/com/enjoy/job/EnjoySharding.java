package com.enjoy.job;

import com.enjoy.business.EnjoyBusiness;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import com.xxl.job.core.util.ShardingUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 分片任务
 */
@JobHandler(value="enjoySharding")
@Service
public class EnjoySharding extends IJobHandler {

	@Autowired
	private EnjoyBusiness enjoyBusiness;
	@Value("${server.port}")
	private String port;

	@Override
	public ReturnT<String> execute(String param) throws Exception {
		ShardingUtil.ShardingVO shardingVO = ShardingUtil.getShardingVo();

		int index = shardingVO.getIndex();
		int total = shardingVO.getTotal();

		param=param+"EnjoySharding"+port;

		enjoyBusiness.process(index,total,param);

		return SUCCESS;
	}

}
