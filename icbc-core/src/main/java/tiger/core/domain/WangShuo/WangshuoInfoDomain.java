package tiger.core.domain.WangShuo;

import tiger.core.domain.BaseDomain;
import tiger.common.dal.enums.AccountSocialTypeEnum;
import tiger.common.dal.persistence.mapper.*;

/**
 * Created by archer on 2017/1/9.
 */
public class WangshuoInfoDomain extends BaseDomain {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
