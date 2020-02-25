package com.ruoyi.system.service;

import com.ruoyi.system.domain.ClientInvoice;
import java.util.List;

/**
 * 发票信息Service接口
 * 
 * @author ruoyi
 * @date 2020-02-20
 */
public interface IClientInvoiceService 
{
    /**
     * 查询发票信息
     * 
     * @param invoiceId 发票信息ID
     * @return 发票信息
     */
    public ClientInvoice selectClientInvoiceById(Long invoiceId);

    /**
     * 查询发票信息列表
     * 
     * @param clientInvoice 发票信息
     * @return 发票信息集合
     */
    public List<ClientInvoice> selectClientInvoiceList(ClientInvoice clientInvoice);

    /**
     * 新增发票信息
     * 
     * @param clientInvoice 发票信息
     * @return 结果
     */
    public int insertClientInvoice(ClientInvoice clientInvoice);

    /**
     * 修改发票信息
     * 
     * @param clientInvoice 发票信息
     * @return 结果
     */
    public int updateClientInvoice(ClientInvoice clientInvoice);

    /**
     * 批量删除发票信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteClientInvoiceByIds(String ids);

    /**
     * 删除发票信息信息
     * 
     * @param invoiceId 发票信息ID
     * @return 结果
     */
    public int deleteClientInvoiceById(Long invoiceId);
}
