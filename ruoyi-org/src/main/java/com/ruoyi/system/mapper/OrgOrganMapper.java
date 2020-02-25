package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.OrgOrgan;
import java.util.List;

/**
 * 机构管理Mapper接口
 * 
 * @author ruoyi
 * @date 2020-02-01
 */
public interface OrgOrganMapper 
{
    /**
     * 查询机构管理
     * 
     * @param orgGuid 机构管理ID
     * @return 机构管理
     */
    public OrgOrgan selectOrgOrganById(Long orgGuid);

    /**
     * 查询机构管理列表
     * 
     * @param orgOrgan 机构管理
     * @return 机构管理集合
     */
    public List<OrgOrgan> selectOrgOrganList(OrgOrgan orgOrgan);

    /**
     * 新增机构管理
     * 
     * @param orgOrgan 机构管理
     * @return 结果
     */
    public int insertOrgOrgan(OrgOrgan orgOrgan);

    /**
     * 修改机构管理
     * 
     * @param orgOrgan 机构管理
     * @return 结果
     */
    public int updateOrgOrgan(OrgOrgan orgOrgan);

    /**
     * 删除机构管理
     * 
     * @param orgGuid 机构管理ID
     * @return 结果
     */
    public int deleteOrgOrganById(Long orgGuid);

    /**
     * 批量删除机构管理
     * 
     * @param orgGuids 需要删除的数据ID
     * @return 结果
     */
    public int deleteOrgOrganByIds(String[] orgGuids);
}
