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
import com.ruoyi.system.domain.ClientMsg;
import com.ruoyi.system.service.IClientMsgService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 客户信息Controller
 * 
 * @author ruoyi
 * @date 2020-02-03
 */
@Controller
@RequestMapping("/system/msg")
public class ClientMsgController extends BaseController
{
    private String prefix = "system/msg";

    @Autowired
    private IClientMsgService clientMsgService;

    @RequiresPermissions("system:msg:view")
    @GetMapping()
    public String msg()
    {
        return prefix + "/msg";
    }

    /**
     * 查询客户信息列表
     */
    @RequiresPermissions("system:msg:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ClientMsg clientMsg)
    {
        startPage();
        List<ClientMsg> list = clientMsgService.selectClientMsgList(clientMsg);
        return getDataTable(list);
    }

    /**
     * 导出客户信息列表
     */
    @RequiresPermissions("system:msg:export")
    @Log(title = "客户信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ClientMsg clientMsg)
    {
        List<ClientMsg> list = clientMsgService.selectClientMsgList(clientMsg);
        ExcelUtil<ClientMsg> util = new ExcelUtil<ClientMsg>(ClientMsg.class);
        return util.exportExcel(list, "msg");
    }

    /**
     * 新增客户信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存客户信息
     */
    @RequiresPermissions("system:msg:add")
    @Log(title = "客户信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ClientMsg clientMsg)
    {
        return toAjax(clientMsgService.insertClientMsg(clientMsg));
    }

    /**
     * 修改客户信息
     */
    @GetMapping("/edit/{msgGuid}")
    public String edit(@PathVariable("msgGuid") Long msgGuid, ModelMap mmap)
    {
        ClientMsg clientMsg = clientMsgService.selectClientMsgById(msgGuid);
        mmap.put("clientMsg", clientMsg);
        return prefix + "/edit";
    }

    /**
     * 修改保存客户信息
     */
    @RequiresPermissions("system:msg:edit")
    @Log(title = "客户信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ClientMsg clientMsg)
    {
        return toAjax(clientMsgService.updateClientMsg(clientMsg));
    }

    /**
     * 删除客户信息
     */
    @RequiresPermissions("system:msg:remove")
    @Log(title = "客户信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(clientMsgService.deleteClientMsgByIds(ids));
    }
    /**
     * 机构回传父窗体
     */
    @GetMapping("/selectOrg")
    public String orgParent()
    {
        return  "system/select/selectOrg";
    }
    /**
     * 客户人员回传父窗体
     */
    @GetMapping("/selectUser")
    public String userParent(String roleKey,ModelMap mmap)
    {
        mmap.put("roleKey",roleKey);
        return  "system/select/selectUser";
    }
}
