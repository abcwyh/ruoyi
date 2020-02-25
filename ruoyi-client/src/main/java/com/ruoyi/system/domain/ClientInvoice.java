package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 发票信息对象 client_invoice
 * 
 * @author ruoyi
 * @date 2020-02-20
 */
public class ClientInvoice extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 发票id */
    private Long invoiceId;

    /** 纳税登记号 */
    @Excel(name = "纳税登记号")
    private String invoiceRegister;

    /** 客户信息id */
    @Excel(name = "客户信息id")
    private String msgGuid;

    /** 开户银行 */
    @Excel(name = "开户银行")
    private String openingBank;

    /** 开户银行号 */
    @Excel(name = "开户银行号")
    private String bankNumber;

    /** 营业地址 */
    @Excel(name = "营业地址")
    private String address;

    /** 电话 */
    @Excel(name = "电话")
    private String phone;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setInvoiceId(Long invoiceId) 
    {
        this.invoiceId = invoiceId;
    }

    public Long getInvoiceId() 
    {
        return invoiceId;
    }
    public void setInvoiceRegister(String invoiceRegister) 
    {
        this.invoiceRegister = invoiceRegister;
    }

    public String getInvoiceRegister() 
    {
        return invoiceRegister;
    }
    public void setMsgGuid(String msgGuid) 
    {
        this.msgGuid = msgGuid;
    }

    public String getMsgGuid() 
    {
        return msgGuid;
    }
    public void setOpeningBank(String openingBank) 
    {
        this.openingBank = openingBank;
    }

    public String getOpeningBank() 
    {
        return openingBank;
    }
    public void setBankNumber(String bankNumber) 
    {
        this.bankNumber = bankNumber;
    }

    public String getBankNumber() 
    {
        return bankNumber;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
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
            .append("invoiceId", getInvoiceId())
            .append("invoiceRegister", getInvoiceRegister())
            .append("msgGuid", getMsgGuid())
            .append("openingBank", getOpeningBank())
            .append("bankNumber", getBankNumber())
            .append("address", getAddress())
            .append("phone", getPhone())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
