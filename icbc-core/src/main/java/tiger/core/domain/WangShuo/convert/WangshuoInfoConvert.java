package tiger.core.domain.WangShuo.convert;


import tiger.common.dal.persistence.icbc.Wangshuo_temp;
import tiger.core.domain.WangShuo.WangshuoInfoDomain;
import tiger.common.util.BeanUtil;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by archer on 2017/1/9.
 */
public class WangshuoInfoConvert {
    /**
     * List之间的转换
     *
     * @param source
     * @return
     */

    public static List<WangshuoInfoDomain> convert2Domains(List<Wangshuo_temp> source) {
        List<WangshuoInfoDomain> target = new ArrayList<>(source.size());

        if (source.isEmpty()) {
            return null;
        }

        source.forEach(wangshuoInfoDomain -> target.add(convert2Domain(wangshuoInfoDomain)));
        return target;
    }

    /**
     * 单个转换
     *
     * @param source
     * @return
     */
    public static WangshuoInfoDomain convert2Domain(Wangshuo_temp source) {
        if (null == source) {
            return null;
        }
        WangshuoInfoDomain target = new WangshuoInfoDomain();
        BeanUtil.copyPropertiesWithIgnores(source, target);

        return target;
    }

    /**
     * List之间的转换
     *
     * @param source
     * @return
     */
    public static List<Wangshuo_temp> convert2DOs(List<WangshuoInfoDomain> source) {
        List<Wangshuo_temp> target = new ArrayList<>(source.size());

        if (source.isEmpty()) {
            return null;
        }

        source.forEach(wangshuo_temp -> target.add(convert2DO(wangshuo_temp)));
        return target;
    }

    /**
     * 单个转换
     *
     * @param source
     * @return
     */
    public static Wangshuo_temp convert2DO(WangshuoInfoDomain source) {
        if (null == source) {
            return null;
        }
        Wangshuo_temp target = new Wangshuo_temp();
        BeanUtil.copyPropertiesWithIgnores(source, target);

        return target;
    }
}
