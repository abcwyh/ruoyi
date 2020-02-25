package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 客户信息对象 client_msg
 * 
 * @author ruoyi
 * @date 2020-02-03
 */
public class ClientMsg extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 客户信息id */
    private Long msgGuid;

    /** 客户编码 */
    @Excel(name = "客户编码")
    private String msgCode;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String msgName;

    /** 开业日期 */
    @Excel(name = "开业日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 行业类型 */
    @Excel(name = "行业类型")
    private String industryType;

    /** 登记小类 */
    @Excel(name = "登记小类")
    private String enrollBig;

    /** 登记大类 */
    @Excel(name = "登记大类")
    private String enrollSmall;

    /** 所属机关 */
    @Excel(name = "所属机关")
    private String theirOffice;

    /** 联系人 */
    @Excel(name = "联系人")
    private String linkman;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String phone;

    /** 邮箱 */
    @Excel(name = "邮箱")
    private String email;

    /** 地址 */
    @Excel(name = "地址")
    private String address;

    /** 来源大类 */
    @Excel(name = "来源大类")
    private String sourceBig;

    /** 来源小类 */
    @Excel(name = "来源小类")
    private String sourceSmall;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    /** 0正常 1停用 */
    @Excel(name = "0正常 1停用")
    private String status;

    /** 机构id */
    @Excel(name = "机构id")
    private String orgGuid;

    /** 机构编码 */
    @Excel(name = "机构编码")
    private String orgCode;

    public void setMsgGuid(Long msgGuid) 
    {
        this.msgGuid = msgGuid;
    }

    public Long getMsgGuid() 
    {
        return msgGuid;
    }
    public void setMsgCode(String msgCode) 
    {
        this.msgCode = msgCode;
    }

    public String getMsgCode() 
    {
        return msgCode;
    }
    public void setMsgName(String msgName) 
    {
        this.msgName = msgName;
    }

    public String getMsgName() 
    {
        return msgName;
    }
    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }

    public Date getStartTime() 
    {
        return startTime;
    }
    public void setIndustryType(String industryType) 
    {
        this.industryType = industryType;
    }

    public String getIndustryType() 
    {
        return industryType;
    }
    public void setEnrollBig(String enrollBig) 
    {
        this.enrollBig = enrollBig;
    }

    public String getEnrollBig() 
    {
        return enrollBig;
    }
    public void setEnrollSmall(String enrollSmall) 
    {
        this.enrollSmall = enrollSmall;
    }

    public String getEnrollSmall() 
    {
        return enrollSmall;
    }
    public void setTheirOffice(String theirOffice) 
    {
        this.theirOffice = theirOffice;
    }

    public String getTheirOffice() 
    {
        return theirOffice;
    }
    public void setLinkman(String linkman) 
    {
        this.linkman = linkman;
    }

    public String getLinkman() 
    {
        return linkman;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setSourceBig(String sourceBig) 
    {
        this.sourceBig = sourceBig;
    }

    public String getSourceBig() 
    {
        return sourceBig;
    }
    public void setSourceSmall(String sourceSmall) 
    {
        this.sourceSmall = sourceSmall;
    }

    public String getSourceSmall() 
    {
        return sourceSmall;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setOrgGuid(String orgGuid) 
    {
        this.orgGuid = orgGuid;
    }

    public String getOrgGuid() 
    {
        return orgGuid;
    }
    public void setOrgCode(String orgCode) 
    {
        this.orgCode = orgCode;
    }

    public String getOrgCode() 
    {
        return orgCode;
    }
    private ClientUser clientUser;
    private ClientInvoice clientInvoice;


    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("msgGuid", getMsgGuid())
            .append("msgCode", getMsgCode())
            .append("msgName", getMsgName())
            .append("startTime", getStartTime())
            .append("industryType", getIndustryType())
            .append("enrollBig", getEnrollBig())
            .append("enrollSmall", getEnrollSmall())
            .append("theirOffice", getTheirOffice())
            .append("linkman", getLinkman())
            .append("phone", getPhone())
            .append("email", getEmail())
            .append("address", getAddress())
            .append("sourceBig", getSourceBig())
            .append("sourceSmall", getSourceSmall())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("delFlag", getDelFlag())
            .append("status", getStatus())
            .append("orgGuid", getOrgGuid())
            .append("orgCode", getOrgCode())
            .toString();
    }
}
