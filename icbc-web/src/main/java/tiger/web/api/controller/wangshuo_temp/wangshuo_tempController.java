/*
package tiger.web.api.controller.wangshuo_temp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import tiger.biz.wangshuo.support.WangShuoManager;
import tiger.core.basic.BaseResult;
import tiger.core.domain.WangShuo.WangshuoInfoDomain;
import tiger.web.api.constants.APIConstants;
import tiger.web.api.controller.BaseController;
import tiger.web.api.form.wangshuo_temp.Wangshuo_tempForm;

import javax.validation.Valid;
import java.util.List;

*/
/**
 * Created by 王硕买个大葱头 on 2017/1/12.
 *//*

@RestController
@ResponseBody
@RequestMapping(APIConstants.BASE_API_URL + "/wangshuo_temp")
*/
/**
 *
 * 很有问题， APIConstants在哪里？
*//*

public class wangshuo_tempController extends BaseController {
   */
/* @Autowired*//*


   */
/* WangShuoManager wangShuoManager;*//*


    */
/**
     * 获取王硕姓名
     *
     * @return
     *//*

  */
/*  @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public BaseResult<List<WangshuoInfoDomain>> getAll() {

        return new BaseResult<>(wangShuoManager.getAll());
    }

    *//*
*/
/**
     * 新增名字
     *//*
*/
/*
    @RequestMapping(value = "/insertName", method = RequestMethod.POST)
    @ResponseBody
 //   public BaseResult<List<WangshuoInfoDomain>> insertNames(@RequestBody @Valid Wangshuo_tempForm wangshuo_tempForm, BindingResult bindingResult) {
    public BaseResult<Boolean> insertNames(@RequestBody @Valid Wangshuo_tempForm wangshuo_tempForm, BindingResult bindingResult) {

        WangshuoInfoDomain wangshuoInfoDomain = wangshuo_tempForm.convert2Domain();
        return  new BaseResult<>(wangShuoManager.insert(wangshuoInfoDomain));
    }
*//*



}


*/
