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
import com.ruoyi.system.domain.OrgOrgan;
import com.ruoyi.system.service.IOrgOrganService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 机构管理Controller
 * 
 * @author ruoyi
 * @date 2020-02-01
 */
@Controller
@RequestMapping("/system/organ")
public class OrgOrganController extends BaseController
{
    private String prefix = "system/organ";

    @Autowired
    private IOrgOrganService orgOrganService;

    @RequiresPermissions("system:organ:view")
    @GetMapping()
    public String organ()
    {
        return prefix + "/organ";
    }

    /**
     * 查询机构管理列表
     */
    @RequiresPermissions("system:organ:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(OrgOrgan orgOrgan)
    {
        startPage();
        List<OrgOrgan> list = orgOrganService.selectOrgOrganList(orgOrgan);
        return getDataTable(list);
    }

    /**
     * 导出机构管理列表
     */
    @RequiresPermissions("system:organ:export")
    @Log(title = "机构管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(OrgOrgan orgOrgan)
    {
        List<OrgOrgan> list = orgOrganService.selectOrgOrganList(orgOrgan);
        ExcelUtil<OrgOrgan> util = new ExcelUtil<OrgOrgan>(OrgOrgan.class);
        return util.exportExcel(list, "organ");
    }

    /**
     * 新增机构管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存机构管理
     */
    @RequiresPermissions("system:organ:add")
    @Log(title = "机构管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(OrgOrgan orgOrgan)
    {
        return toAjax(orgOrganService.insertOrgOrgan(orgOrgan));
    }

    /**
     * 修改机构管理
     */
    @GetMapping("/edit/{orgGuid}")
    public String edit(@PathVariable("orgGuid") Long orgGuid, ModelMap mmap)
    {
        OrgOrgan orgOrgan = orgOrganService.selectOrgOrganById(orgGuid);
        mmap.put("orgOrgan", orgOrgan);
        return prefix + "/edit";
    }

    /**
     * 修改保存机构管理
     */
    @RequiresPermissions("system:organ:edit")
    @Log(title = "机构管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(OrgOrgan orgOrgan)
    {
        return toAjax(orgOrganService.updateOrgOrgan(orgOrgan));
    }

    /**
     * 删除机构管理
     */
    @RequiresPermissions("system:organ:remove")
    @Log(title = "机构管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(orgOrganService.deleteOrgOrganByIds(ids));
    }
}
