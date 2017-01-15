package tiger.web.api.form.BehaviourCertification;

import tiger.common.util.BeanUtil;
import tiger.core.domain.BehaviourCertification.Simulation_source_tableDomain;
import tiger.core.domain.WangShuo.WangshuoInfoDomain;
import tiger.web.api.form.BaseForm;
import tiger.web.api.form.FormInterface;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by 王硕买个大葱头 on 2017/1/13.
 */
public class Simulation_source_tableForm implements FormInterface {

   @NotNull(message = "名字不能为空")
    private String tranOutCardNum;
    private String timeStamp;
    private Integer user;
    @NotNull(message = "金额不能为空")
    private float txAmt;
    private String tranInAcctNum;
    private String jnlSeqNum;
    private Date eventDt;
    private Boolean lable;
    private String zoneNum;
    private Boolean predicationResult;

    public String getTranOutCardNum() {
        return tranOutCardNum;
    }

    public void setTranOutCardNum(String tranOutCardNum) {
        this.tranOutCardNum = tranOutCardNum;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public float getTxAmt() {
        return txAmt;
    }

    public void setTxAmt(float txAmt) {
        this.txAmt = txAmt;
    }

    public String getTranInAcctNum() {
        return tranInAcctNum;
    }

    public void setTranInAcctNum(String tranInAcctNum) {
        this.tranInAcctNum = tranInAcctNum;
    }

    public String getJnlSeqNum() {
        return jnlSeqNum;
    }

    public void setJnlSeqNum(String jnlSeqNum) {
        this.jnlSeqNum = jnlSeqNum;
    }

    public Date getEventDt() {
        return eventDt;
    }

    public void setEventDt(Date eventDt) {
        this.eventDt = eventDt;
    }

    public Boolean getLable() {
        return lable;
    }

    public void setLable(Boolean lable) {
        this.lable = lable;
    }

    public String getZoneNum() {
        return zoneNum;
    }

    public void setZoneNum(String zoneNum) {
        this.zoneNum = zoneNum;
    }

    public Boolean getPredicationResult() {
        return predicationResult;
    }

    public void setPredicationResult(Boolean predicationResult) {
        this.predicationResult = predicationResult;
    }


    @Override
        public Simulation_source_tableDomain convert2Domain() {

        Simulation_source_tableDomain target = new Simulation_source_tableDomain();
            BeanUtil.copyPropertiesWithIgnores(this, target);

            return target;
        }

}
