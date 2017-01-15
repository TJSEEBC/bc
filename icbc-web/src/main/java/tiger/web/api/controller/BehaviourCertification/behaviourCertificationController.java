package tiger.web.api.controller.BehaviourCertification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import tiger.biz.BehaviourCertification.support.BehaviorCertificateManager;
import tiger.biz.BehaviourCertification.support.Simulation_source_tableManager;
import tiger.biz.BehaviourCertification.support.impl.BehaviorCertificateManagerImpl;
import tiger.common.dal.persistence.behaviour_authen.Simulation_source_table;
import tiger.core.basic.BaseResult;
import tiger.core.domain.BehaviourCertification.Simulation_source_tableDomain;
import tiger.core.domain.BehaviourCertification.convert.Simulation_source_tableConvert;
import tiger.web.api.constants.APIConstants;
import tiger.web.api.controller.BaseController;
import tiger.web.api.form.BehaviourCertification.Simulation_source_tableForm;

import javax.validation.Valid;
import java.io.IOException;

/**
 * Created by 王硕买个大葱头 on 2017/1/12.
 */
@RestController
@ResponseBody
@RequestMapping(APIConstants.BASE_API_URL + "/BehaviourCertification")
/**
 *
 * 很有问题， APIConstants在哪里？
*/
public class behaviourCertificationController extends BaseController {
    @Autowired
    Simulation_source_tableManager simulationsourcetableManager;
@Autowired
    BehaviorCertificateManager behaviorCertificateManager;
    @RequestMapping(value = "/judge", method = RequestMethod.POST)
    @ResponseBody
    public BaseResult<Boolean> insertNames(@RequestBody @Valid Simulation_source_tableForm simulationsourcetableForm, BindingResult bindingResult) {
            //给张裕威的接口
        Simulation_source_table simulation_source_table;
        Boolean judge_result = null;

        Simulation_source_tableDomain simulation_source_tableDomain = simulationsourcetableForm.convert2Domain();
        simulation_source_table = Simulation_source_tableConvert.convert2DO(simulation_source_tableDomain);
        System.out.print("我是分隔符----------\n");
        System.out.print(simulationsourcetableForm.getTxAmt());
        System.out.print("我是分隔符----------\n");
        System.out.print(simulation_source_table.getTxAmt());

        simulationsourcetableManager.insert(simulation_source_tableDomain);

        try{
            judge_result  = behaviorCertificateManager.behaviorCertificate(simulation_source_table);
        }
        catch (IOException e){
            e.printStackTrace();
        }

        return new BaseResult<>(judge_result);


        }

    }



