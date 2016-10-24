package com.ai.opt.sol.api.apisol;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.sol.api.apisol.param.APISolServicePrdlineRel;
import com.ai.opt.sol.api.apisol.param.APISolServiceDefine;
@Path("/SOLFun")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface ISolServicePrdlineRelSV {
	/**
     * 新建服务产品标签记录
     * 
     * @param APISolServicePrdlineRel
     * @return BaseResponse
     * @throws BusinessException
	 * @throws SystemException
     * @author biancx
     * @ApiDocMethod
     */
	@POST
	@Path("/createSolServicePrdlineRel")
	BaseResponse createSolServicePrdlineRel(APISolServicePrdlineRel srvPrdlineRel) throws BusinessException,SystemException;
	/**
	 * 产品线目录管理服务报表
	 * @param prdlineId
     * @return list<APISolServiceDefine>
     * @throws BusinessException
	 * @throws SystemException
     * @author biancx
     * @ApiDocMethod
	 */
	@POST
	@Path("/manageSolServicePrdlineRel")
	List<APISolServiceDefine> manageSolServicePrdlineRel(String prdlineId) throws BusinessException,SystemException;
	
}
