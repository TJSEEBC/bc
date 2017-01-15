/*
package tiger.biz.wangshuo.support.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.biz.device.support.DeviceManager;
import tiger.biz.wangshuo.support.WangShuoManager;
import tiger.core.basic.PageResult;
import tiger.core.basic.WangShuoPageResult;
import tiger.core.domain.WangShuo.WangshuoInfoDomain;
import tiger.core.domain.WangShuo.convert.WangshuoInfoConvert;
import tiger.core.domain.materials.MaterialsDomain;
import tiger.core.domain.materials.convert.MaterialsConvert;
import tiger.core.service.WangShuo.WangShuoService;
import tiger.core.service.device.DeviceService;

import java.util.List;

*/
/**
 * Created by archer on 2017/1/10.
 *//*

@Service
public class WangShuoManagerImpl implements WangShuoManager{
    @Autowired
    WangShuoService wangShuoService;

    @Override
    public List<WangshuoInfoDomain> getAll() {

        return  wangShuoService.getAll();
    }
    public Boolean insert(WangshuoInfoDomain wangshuoInfoDomain) {

      //  boolean mark = true;
        */
/*for (int i = 1; i < names.length; i++) {
            WangshuoInfoDomain temp = new WangshuoInfoDomain();

            mark = mark &&  wangShuoService.insert(WangshuoInfoConvert.convert2DO(temp));
        }*//*

        return wangShuoService.insert(WangshuoInfoConvert.convert2DO(wangshuoInfoDomain));
    }
}
*/
