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
import com.ruoyi.system.domain.ClientUser;
import com.ruoyi.system.service.IClientUserService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 客户人员Controller
 * 
 * @author ruoyi
 * @date 2020-02-20
 */
@Controller
@RequestMapping("/system/clientUser")
public class ClientUserController extends BaseController
{
    private String prefix = "system/clientUser";

    @Autowired
    private IClientUserService clientUserService;

    @RequiresPermissions("system:clientUser:view")
    @GetMapping()
    public String clientUser()
    {
        return prefix + "/clientUser";
    }

    /**
     * 查询客户人员列表
     */
    @RequiresPermissions("system:clientUser:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ClientUser clientUser)
    {
        startPage();
        List<ClientUser> list = clientUserService.selectClientUserList(clientUser);
        return getDataTable(list);
    }

    /**
     * 导出客户人员列表
     */
    @RequiresPermissions("system:clientUser:export")
    @Log(title = "客户人员", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ClientUser clientUser)
    {
        List<ClientUser> list = clientUserService.selectClientUserList(clientUser);
        ExcelUtil<ClientUser> util = new ExcelUtil<ClientUser>(ClientUser.class);
        return util.exportExcel(list, "clientUser");
    }

    /**
     * 新增客户人员
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存客户人员
     */
    @RequiresPermissions("system:clientUser:add")
    @Log(title = "客户人员", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ClientUser clientUser)
    {
        return toAjax(clientUserService.insertClientUser(clientUser));
    }

    /**
     * 修改客户人员
     */
    @GetMapping("/edit/{clientUserId}")
    public String edit(@PathVariable("clientUserId") Long clientUserId, ModelMap mmap)
    {
        ClientUser clientUser = clientUserService.selectClientUserById(clientUserId);
        mmap.put("clientUser", clientUser);
        return prefix + "/edit";
    }

    /**
     * 修改保存客户人员
     */
    @RequiresPermissions("system:clientUser:edit")
    @Log(title = "客户人员", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ClientUser clientUser)
    {
        return toAjax(clientUserService.updateClientUser(clientUser));
    }

    /**
     * 删除客户人员
     */
    @RequiresPermissions("system:clientUser:remove")
    @Log(title = "客户人员", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(clientUserService.deleteClientUserByIds(ids));
    }
}
