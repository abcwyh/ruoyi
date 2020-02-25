package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ClientMsgMapper;
import com.ruoyi.system.domain.ClientMsg;
import com.ruoyi.system.service.IClientMsgService;
import com.ruoyi.common.core.text.Convert;

/**
 * 客户信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-03
 */
@Service
public class ClientMsgServiceImpl implements IClientMsgService 
{
    @Autowired
    private ClientMsgMapper clientMsgMapper;

    /**
     * 查询客户信息
     * 
     * @param msgGuid 客户信息ID
     * @return 客户信息
     */
    @Override
    public ClientMsg selectClientMsgById(Long msgGuid)
    {
        return clientMsgMapper.selectClientMsgById(msgGuid);
    }

    /**
     * 查询客户信息列表
     * 
     * @param clientMsg 客户信息
     * @return 客户信息
     */
    @Override
    public List<ClientMsg> selectClientMsgList(ClientMsg clientMsg)
    {
        return clientMsgMapper.selectClientMsgList(clientMsg);
    }

    /**
     * 新增客户信息
     * 
     * @param clientMsg 客户信息
     * @return 结果
     */
    @Override
    public int insertClientMsg(ClientMsg clientMsg)
    {
        clientMsg.setCreateTime(DateUtils.getNowDate());
        return clientMsgMapper.insertClientMsg(clientMsg);
    }

    /**
     * 修改客户信息
     * 
     * @param clientMsg 客户信息
     * @return 结果
     */
    @Override
    public int updateClientMsg(ClientMsg clientMsg)
    {
        clientMsg.setUpdateTime(DateUtils.getNowDate());
        return clientMsgMapper.updateClientMsg(clientMsg);
    }

    /**
     * 删除客户信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteClientMsgByIds(String ids)
    {
        return clientMsgMapper.deleteClientMsgByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除客户信息信息
     * 
     * @param msgGuid 客户信息ID
     * @return 结果
     */
    @Override
    public int deleteClientMsgById(Long msgGuid)
    {
        return clientMsgMapper.deleteClientMsgById(msgGuid);
    }
}
