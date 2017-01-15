package tiger.web.api.form.wangshuo_temp;

import tiger.common.util.BeanUtil;
import tiger.core.domain.WangShuo.WangshuoInfoDomain;

import tiger.web.api.form.FormInterface;

import javax.validation.constraints.NotNull;

/**
 * Created by 王硕买个大葱头 on 2017/1/13.
 */
public class Wangshuo_tempForm implements FormInterface{


        @NotNull(message = "名字不能为空")
        private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override

        public WangshuoInfoDomain convert2Domain() {
            WangshuoInfoDomain target = new WangshuoInfoDomain();
            BeanUtil.copyPropertiesWithIgnores(this, target);

            return target;
        }
    }


