package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 客户人员对象 client_user
 * 
 * @author ruoyi
 * @date 2020-02-20
 */
public class ClientUser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 客户人员id */
    private Long clientUserId;

    /** 角色编码 */
    @Excel(name = "角色编码")
    private String roleCode;

    /** 角色名称 */
    @Excel(name = "角色名称")
    private String roleName;

    /** 人员编码 */
    @Excel(name = "人员编码")
    private String userCode;

    /** 人员名称 */
    @Excel(name = "人员名称")
    private String userName;

    /** 客户信息id */
    @Excel(name = "客户信息id")
    private Long msgGuid;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setClientUserId(Long clientUserId) 
    {
        this.clientUserId = clientUserId;
    }

    public Long getClientUserId() 
    {
        return clientUserId;
    }
    public void setRoleCode(String roleCode) 
    {
        this.roleCode = roleCode;
    }

    public String getRoleCode() 
    {
        return roleCode;
    }
    public void setRoleName(String roleName) 
    {
        this.roleName = roleName;
    }

    public String getRoleName() 
    {
        return roleName;
    }
    public void setUserCode(String userCode) 
    {
        this.userCode = userCode;
    }

    public String getUserCode() 
    {
        return userCode;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setMsgGuid(Long msgGuid) 
    {
        this.msgGuid = msgGuid;
    }

    public Long getMsgGuid() 
    {
        return msgGuid;
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
            .append("clientUserId", getClientUserId())
            .append("roleCode", getRoleCode())
            .append("roleName", getRoleName())
            .append("userCode", getUserCode())
            .append("userName", getUserName())
            .append("msgGuid", getMsgGuid())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
