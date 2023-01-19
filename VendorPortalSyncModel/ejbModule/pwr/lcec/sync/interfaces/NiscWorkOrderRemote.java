package pwr.lcec.sync.interfaces;

import java.util.List;
import javax.ejb.Remote;
import pwr.lcec.sync.entity.nisc.ApBatchTran;
import pwr.lcec.sync.entity.nisc.ApBatchTranDist;
import pwr.lcec.sync.entity.nisc.ApInvAct;
import pwr.lcec.sync.entity.nisc.BiResourceRef;
import pwr.lcec.sync.entity.nisc.BiResourceWorkgrp;
import pwr.lcec.sync.entity.nisc.BiSoDet;
import pwr.lcec.sync.entity.nisc.BiSoMaster;
import pwr.lcec.sync.entity.nisc.BiSoTypeFunctionRef;
import pwr.lcec.sync.entity.nisc.BiSoTypeFunctionRefPK;
import pwr.lcec.sync.entity.nisc.BiSrvLoc;
import pwr.lcec.sync.entity.nisc.BiTaskRef;
import pwr.lcec.sync.entity.nisc.BiWorkEventCdRef;
import pwr.lcec.sync.entity.nisc.BiWrkflw;
import pwr.lcec.sync.entity.nisc.BiWrkflwTask;
import pwr.lcec.sync.entity.nisc.GlAcctMstr;
import pwr.lcec.sync.entity.nisc.WoCauRefRate;
import pwr.lcec.sync.entity.nisc.WoMstr;
import pwr.lcec.sync.entity.nisc.WoRateGrpRef;
import pwr.lcec.sync.entity.nisc.WoTranInqView;
import pwr.lcec.sync.entity.nisc.custom.NiscRateRef;
import pwr.lcec.sync.entity.nisc.custom.NiscWoTransActualsGroupbyVw;
import pwr.lcec.sync.entity.nisc.custom.NiscWorkOrderSync;

@Remote
public interface NiscWorkOrderRemote {
	
	public BiWrkflw findWorkFlowById(Integer workflow);

	public List<BiWrkflwTask> findWorkFlowTaskByWorkOrder(String workOrderId);

	public BiResourceRef findResourceByUserId(int syUserId);

	public BiSoDet findSoDetByWfId(int wrkFlowId);

	public WoMstr findWorkOrderMasterById(String woId);

	public BiSoTypeFunctionRef findTypeFunctionById(BiSoTypeFunctionRefPK id);

	public BiSrvLoc findLocationById(int biSrvLocNbr);

	public List<WoRateGrpRef> findRateGroups();

	public List<NiscRateRef> findRatesByGrp(String rateGrp);

	public WoCauRefRate findRatePriceByCauGrp(String woCauId, String woRateGrpCd);

	public BiSoMaster findSoMaster(String biSoNbr);

	public List<NiscWorkOrderSync> findWorkFlowTaskSync();

	public BiSoDet findSoDetSyncByWfId(int wrkFlowId);

	public List<BiWrkflwTask> findWorkFlowTaskByWorkFlow(Integer biWrkflwKey);

	public List<BiWorkEventCdRef> findWorkEventCd();

	public List<GlAcctMstr> findGLAccounts();

	public List<BiResourceRef> findResourcesRef();

	public List<BiResourceWorkgrp> findResourceWorkGroupByResourceId(long resourceId);

	public ApBatchTran findApBatchTranByInvId(String apInvId);

	public ApBatchTranDist findBatchDistByInvId(long apBatchTranKey);

	public List<ApInvAct> findInvActByInvId(String apInvId);

	public BiWrkflwTask findTaskByTaskKey(int biWrkflwTasksKey);

	public BiWrkflwTask mergeWorkFlowTask(BiWrkflwTask task);

	public BiTaskRef findBiTaskRef(String biTaskCd);
	
	public NiscWorkOrderSync findWorkFlowTaskSync(String woid);

	public List<WoMstr> findWorkFlowByProjectId(String projectId);

	public List<NiscWoTransActualsGroupbyVw> findWoTransActualsByWoId(String woProjId, String woId);

	public List<WoTranInqView> findWorkOrderTransByWoId(String woProjId, String woId);
}
