package io.renren.modules.demo.controller;

import io.renren.common.annotation.LogOperation;
import io.renren.common.constant.Constant;
import io.renren.common.page.PageData;
import io.renren.common.utils.ExcelUtils;
import io.renren.common.utils.Result;
import io.renren.common.validator.AssertUtils;
import io.renren.common.validator.ValidatorUtils;
import io.renren.common.validator.group.AddGroup;
import io.renren.common.validator.group.DefaultGroup;
import io.renren.common.validator.group.UpdateGroup;
import io.renren.modules.demo.dto.StudentDTO;
import io.renren.modules.demo.excel.StudentExcel;
import io.renren.modules.demo.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;


/**
 * 
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2024-04-11
 */
@RestController
@RequestMapping("demo/student")
@Api(tags="")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String")
    })
    @RequiresPermissions("demo:student:page")
    public Result<PageData<StudentDTO>> page(@ApiIgnore @RequestParam Map<String, Object> params){
        PageData<StudentDTO> page = studentService.page(params);

        return new Result<PageData<StudentDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @ApiOperation("信息")
    @RequiresPermissions("demo:student:info")
    public Result<StudentDTO> get(@PathVariable("id") Long id){
        StudentDTO data = studentService.get(id);

        return new Result<StudentDTO>().ok(data);
    }

    @PostMapping
    @ApiOperation("保存")
    @LogOperation("保存")
    @RequiresPermissions("demo:student:save")
    public Result save(@RequestBody StudentDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        studentService.save(dto);

        return new Result();
    }

    @PutMapping
    @ApiOperation("修改")
    @LogOperation("修改")
    @RequiresPermissions("demo:student:update")
    public Result update(@RequestBody StudentDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        studentService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @ApiOperation("删除")
    @LogOperation("删除")
    @RequiresPermissions("demo:student:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        studentService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @ApiOperation("导出")
    @LogOperation("导出")
    @RequiresPermissions("demo:student:export")
    public void export(@ApiIgnore @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<StudentDTO> list = studentService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, "", list, StudentExcel.class);
    }

}