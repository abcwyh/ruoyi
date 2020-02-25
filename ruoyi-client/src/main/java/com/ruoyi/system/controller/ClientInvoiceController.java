package com.ruoyi.system.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.ClientInvoice;
import com.ruoyi.system.service.IClientInvoiceService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 发票信息Controller
 * 
 * @author ruoyi
 * @date 2020-02-20
 */
@Controller
@RequestMapping("/system/invoice")
public class ClientInvoiceController extends BaseController
{
    private String prefix = "system/invoice";

    @Autowired
    private IClientInvoiceService clientInvoiceService;

    @RequiresPermissions("system:invoice:view")
    @GetMapping()
    public String invoice()
    {
        return prefix + "/invoice";
    }

    /**
     * 查询发票信息列表
     */
    @RequiresPermissions("system:invoice:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ClientInvoice clientInvoice)
    {
        startPage();
        List<ClientInvoice> list = clientInvoiceService.selectClientInvoiceList(clientInvoice);
        return getDataTable(list);
    }

    /**
     * 导出发票信息列表
     */
    @RequiresPermissions("system:invoice:export")
    @Log(title = "发票信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ClientInvoice clientInvoice)
    {
        List<ClientInvoice> list = clientInvoiceService.selectClientInvoiceList(clientInvoice);
        ExcelUtil<ClientInvoice> util = new ExcelUtil<ClientInvoice>(ClientInvoice.class);
        return util.exportExcel(list, "invoice");
    }

    /**
     * 新增发票信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存发票信息
     */
    @RequiresPermissions("system:invoice:add")
    @Log(title = "发票信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ClientInvoice clientInvoice)
    {
        return toAjax(clientInvoiceService.insertClientInvoice(clientInvoice));
    }

    /**
     * 修改发票信息
     */
    @GetMapping("/edit/{invoiceId}")
    public String edit(@PathVariable("invoiceId") Long invoiceId, ModelMap mmap)
    {
        ClientInvoice clientInvoice = clientInvoiceService.selectClientInvoiceById(invoiceId);
        mmap.put("clientInvoice", clientInvoice);
        return prefix + "/edit";
    }

    /**
     * 修改保存发票信息
     */
    @RequiresPermissions("system:invoice:edit")
    @Log(title = "发票信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ClientInvoice clientInvoice)
    {
        return toAjax(clientInvoiceService.updateClientInvoice(clientInvoice));
    }

    /**
     * 删除发票信息
     */
    @RequiresPermissions("system:invoice:remove")
    @Log(title = "发票信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(clientInvoiceService.deleteClientInvoiceByIds(ids));
    }
}
