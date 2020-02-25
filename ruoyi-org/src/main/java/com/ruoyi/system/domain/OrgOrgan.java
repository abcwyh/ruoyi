package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 机构管理对象 org_organ
 * 
 * @author ruoyi
 * @date 2020-02-01
 */
public class OrgOrgan extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 机构id */
    private Long orgGuid;

    /** 机构名称 */
    @Excel(name = "机构名称")
    private String orgName;

    /** 机构编码 */
    @Excel(name = "机构编码")
    private String orgCode;

    /** 机构地址 */
    @Excel(name = "机构地址")
    private String orgAddress;

    /** 机构电话 */
    @Excel(name = "机构电话")
    private String orgPhone;

    /** 机构管理人名称 */
    @Excel(name = "机构管理人名称")
    private String orgUserName;

    /** 机构管理人电话 */
    @Excel(name = "机构管理人电话")
    private String orgUserPhone;

    /** 机构管理人邮箱 */
    @Excel(name = "机构管理人邮箱")
    private String orgUserEmail;

    /** 0正常 1停用 */
    @Excel(name = "0正常 1停用")
    private String status;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setOrgGuid(Long orgGuid) 
    {
        this.orgGuid = orgGuid;
    }

    public Long getOrgGuid() 
    {
        return orgGuid;
    }
    public void setOrgName(String orgName) 
    {
        this.orgName = orgName;
    }

    public String getOrgName() 
    {
        return orgName;
    }
    public void setOrgCode(String orgCode) 
    {
        this.orgCode = orgCode;
    }

    public String getOrgCode() 
    {
        return orgCode;
    }
    public void setOrgAddress(String orgAddress) 
    {
        this.orgAddress = orgAddress;
    }

    public String getOrgAddress() 
    {
        return orgAddress;
    }
    public void setOrgPhone(String orgPhone) 
    {
        this.orgPhone = orgPhone;
    }

    public String getOrgPhone() 
    {
        return orgPhone;
    }
    public void setOrgUserName(String orgUserName) 
    {
        this.orgUserName = orgUserName;
    }

    public String getOrgUserName() 
    {
        return orgUserName;
    }
    public void setOrgUserPhone(String orgUserPhone) 
    {
        this.orgUserPhone = orgUserPhone;
    }

    public String getOrgUserPhone() 
    {
        return orgUserPhone;
    }
    public void setOrgUserEmail(String orgUserEmail) 
    {
        this.orgUserEmail = orgUserEmail;
    }

    public String getOrgUserEmail() 
    {
        return orgUserEmail;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("orgGuid", getOrgGuid())
            .append("orgName", getOrgName())
            .append("orgCode", getOrgCode())
            .append("orgAddress", getOrgAddress())
            .append("orgPhone", getOrgPhone())
            .append("orgUserName", getOrgUserName())
            .append("orgUserPhone", getOrgUserPhone())
            .append("orgUserEmail", getOrgUserEmail())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("status", getStatus())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
