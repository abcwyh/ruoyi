package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ClientUserMapper;
import com.ruoyi.system.domain.ClientUser;
import com.ruoyi.system.service.IClientUserService;
import com.ruoyi.common.core.text.Convert;

/**
 * 客户人员Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-20
 */
@Service
public class ClientUserServiceImpl implements IClientUserService 
{
    @Autowired
    private ClientUserMapper clientUserMapper;

    /**
     * 查询客户人员
     * 
     * @param clientUserId 客户人员ID
     * @return 客户人员
     */
    @Override
    public ClientUser selectClientUserById(Long clientUserId)
    {
        return clientUserMapper.selectClientUserById(clientUserId);
    }

    /**
     * 查询客户人员列表
     * 
     * @param clientUser 客户人员
     * @return 客户人员
     */
    @Override
    public List<ClientUser> selectClientUserList(ClientUser clientUser)
    {
        return clientUserMapper.selectClientUserList(clientUser);
    }

    /**
     * 新增客户人员
     * 
     * @param clientUser 客户人员
     * @return 结果
     */
    @Override
    public int insertClientUser(ClientUser clientUser)
    {
        clientUser.setCreateTime(DateUtils.getNowDate());
        return clientUserMapper.insertClientUser(clientUser);
    }

    /**
     * 修改客户人员
     * 
     * @param clientUser 客户人员
     * @return 结果
     */
    @Override
    public int updateClientUser(ClientUser clientUser)
    {
        clientUser.setUpdateTime(DateUtils.getNowDate());
        return clientUserMapper.updateClientUser(clientUser);
    }

    /**
     * 删除客户人员对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteClientUserByIds(String ids)
    {
        return clientUserMapper.deleteClientUserByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除客户人员信息
     * 
     * @param clientUserId 客户人员ID
     * @return 结果
     */
    @Override
    public int deleteClientUserById(Long clientUserId)
    {
        return clientUserMapper.deleteClientUserById(clientUserId);
    }
}
