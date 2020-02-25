package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ClientInvoiceMapper;
import com.ruoyi.system.domain.ClientInvoice;
import com.ruoyi.system.service.IClientInvoiceService;
import com.ruoyi.common.core.text.Convert;

/**
 * 发票信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-20
 */
@Service
public class ClientInvoiceServiceImpl implements IClientInvoiceService 
{
    @Autowired
    private ClientInvoiceMapper clientInvoiceMapper;

    /**
     * 查询发票信息
     * 
     * @param invoiceId 发票信息ID
     * @return 发票信息
     */
    @Override
    public ClientInvoice selectClientInvoiceById(Long invoiceId)
    {
        return clientInvoiceMapper.selectClientInvoiceById(invoiceId);
    }

    /**
     * 查询发票信息列表
     * 
     * @param clientInvoice 发票信息
     * @return 发票信息
     */
    @Override
    public List<ClientInvoice> selectClientInvoiceList(ClientInvoice clientInvoice)
    {
        return clientInvoiceMapper.selectClientInvoiceList(clientInvoice);
    }

    /**
     * 新增发票信息
     * 
     * @param clientInvoice 发票信息
     * @return 结果
     */
    @Override
    public int insertClientInvoice(ClientInvoice clientInvoice)
    {
        clientInvoice.setCreateTime(DateUtils.getNowDate());
        return clientInvoiceMapper.insertClientInvoice(clientInvoice);
    }

    /**
     * 修改发票信息
     * 
     * @param clientInvoice 发票信息
     * @return 结果
     */
    @Override
    public int updateClientInvoice(ClientInvoice clientInvoice)
    {
        clientInvoice.setUpdateTime(DateUtils.getNowDate());
        return clientInvoiceMapper.updateClientInvoice(clientInvoice);
    }

    /**
     * 删除发票信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteClientInvoiceByIds(String ids)
    {
        return clientInvoiceMapper.deleteClientInvoiceByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除发票信息信息
     * 
     * @param invoiceId 发票信息ID
     * @return 结果
     */
    @Override
    public int deleteClientInvoiceById(Long invoiceId)
    {
        return clientInvoiceMapper.deleteClientInvoiceById(invoiceId);
    }
}
