package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.OrgOrganMapper;
import com.ruoyi.system.domain.OrgOrgan;
import com.ruoyi.system.service.IOrgOrganService;
import com.ruoyi.common.core.text.Convert;

/**
 * 机构管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-01
 */
@Service
public class OrgOrganServiceImpl implements IOrgOrganService 
{
    @Autowired
    private OrgOrganMapper orgOrganMapper;

    /**
     * 查询机构管理
     * 
     * @param orgGuid 机构管理ID
     * @return 机构管理
     */
    @Override
    public OrgOrgan selectOrgOrganById(Long orgGuid)
    {
        return orgOrganMapper.selectOrgOrganById(orgGuid);
    }

    /**
     * 查询机构管理列表
     * 
     * @param orgOrgan 机构管理
     * @return 机构管理
     */
    @Override
    public List<OrgOrgan> selectOrgOrganList(OrgOrgan orgOrgan)
    {
        return orgOrganMapper.selectOrgOrganList(orgOrgan);
    }

    /**
     * 新增机构管理
     * 
     * @param orgOrgan 机构管理
     * @return 结果
     */
    @Override
    public int insertOrgOrgan(OrgOrgan orgOrgan)
    {
        orgOrgan.setCreateTime(DateUtils.getNowDate());
        return orgOrganMapper.insertOrgOrgan(orgOrgan);
    }

    /**
     * 修改机构管理
     * 
     * @param orgOrgan 机构管理
     * @return 结果
     */
    @Override
    public int updateOrgOrgan(OrgOrgan orgOrgan)
    {
        orgOrgan.setUpdateTime(DateUtils.getNowDate());
        return orgOrganMapper.updateOrgOrgan(orgOrgan);
    }

    /**
     * 删除机构管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteOrgOrganByIds(String ids)
    {
        return orgOrganMapper.deleteOrgOrganByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除机构管理信息
     * 
     * @param orgGuid 机构管理ID
     * @return 结果
     */
    @Override
    public int deleteOrgOrganById(Long orgGuid)
    {
        return orgOrganMapper.deleteOrgOrganById(orgGuid);
    }
}
