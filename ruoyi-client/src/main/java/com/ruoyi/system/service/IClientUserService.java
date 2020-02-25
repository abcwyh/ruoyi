package com.ruoyi.system.service;

import com.ruoyi.system.domain.ClientUser;
import java.util.List;

/**
 * 客户人员Service接口
 * 
 * @author ruoyi
 * @date 2020-02-20
 */
public interface IClientUserService 
{
    /**
     * 查询客户人员
     * 
     * @param clientUserId 客户人员ID
     * @return 客户人员
     */
    public ClientUser selectClientUserById(Long clientUserId);

    /**
     * 查询客户人员列表
     * 
     * @param clientUser 客户人员
     * @return 客户人员集合
     */
    public List<ClientUser> selectClientUserList(ClientUser clientUser);

    /**
     * 新增客户人员
     * 
     * @param clientUser 客户人员
     * @return 结果
     */
    public int insertClientUser(ClientUser clientUser);

    /**
     * 修改客户人员
     * 
     * @param clientUser 客户人员
     * @return 结果
     */
    public int updateClientUser(ClientUser clientUser);

    /**
     * 批量删除客户人员
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteClientUserByIds(String ids);

    /**
     * 删除客户人员信息
     * 
     * @param clientUserId 客户人员ID
     * @return 结果
     */
    public int deleteClientUserById(Long clientUserId);
}
