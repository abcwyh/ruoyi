package com.ruoyi.system.service;

import com.ruoyi.system.domain.ClientMsg;
import java.util.List;

/**
 * 客户信息Service接口
 * 
 * @author ruoyi
 * @date 2020-02-03
 */
public interface IClientMsgService 
{
    /**
     * 查询客户信息
     * 
     * @param msgGuid 客户信息ID
     * @return 客户信息
     */
    public ClientMsg selectClientMsgById(Long msgGuid);

    /**
     * 查询客户信息列表
     * 
     * @param clientMsg 客户信息
     * @return 客户信息集合
     */
    public List<ClientMsg> selectClientMsgList(ClientMsg clientMsg);

    /**
     * 新增客户信息
     * 
     * @param clientMsg 客户信息
     * @return 结果
     */
    public int insertClientMsg(ClientMsg clientMsg);

    /**
     * 修改客户信息
     * 
     * @param clientMsg 客户信息
     * @return 结果
     */
    public int updateClientMsg(ClientMsg clientMsg);

    /**
     * 批量删除客户信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteClientMsgByIds(String ids);

    /**
     * 删除客户信息信息
     * 
     * @param msgGuid 客户信息ID
     * @return 结果
     */
    public int deleteClientMsgById(Long msgGuid);
}
