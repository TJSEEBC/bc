package tiger.core.basic;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import tiger.common.util.Paginator;
import tiger.core.basic.enums.ErrorCodeEnum;

/**
 * Created by 王硕买个大葱头 on 2017/1/12.
 */
public class WangShuoPageResult<T> extends BaseResult<T> {

    /**  */
    private static final long serialVersionUID = 8338499249946679769L;

    private Paginator paginator;

    /**
     *
     */
    public WangShuoPageResult() {
        super();
    }
    // ~ getter & setter -----------------------------------------------

    /**
     *
     */
    public WangShuoPageResult(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum);
    }

    /**
     * @param data
     */
    public WangShuoPageResult(T data) {
        super(data);
    }

    /**
     *
     */
    public WangShuoPageResult(String code, String message) {
        super(code, message);
    }

    /**
     * @param errorCodeEnum
     * @param paginator
     */
    public WangShuoPageResult(ErrorCodeEnum errorCodeEnum, Paginator paginator) {
        super(errorCodeEnum);
        this.paginator = paginator;
    }

    /**
     * @param errorCodeEnum
     * @param data
     * @param paginator
     */
    public WangShuoPageResult(ErrorCodeEnum errorCodeEnum, T data, Paginator paginator) {
        super(errorCodeEnum, data);
        this.paginator = paginator;
    }

    /**
     * @return
     */
    public Paginator getPaginator() {
        return paginator;
    }

    /**
     * @param paginator
     */
    public void setPaginator(Paginator paginator) {
        this.paginator = paginator;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}

