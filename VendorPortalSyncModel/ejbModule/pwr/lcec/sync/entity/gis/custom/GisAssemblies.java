package pwr.lcec.sync.entity.gis.custom;

import java.io.Serializable;
import java.sql.Timestamp;

public class GisAssemblies implements Serializable {
	private static final long serialVersionUID = 1L;
	private String gsGuid;
	private String stWoNumber;
	private String stStatusRefGuid;
	private String stStatusDescription;
	private String stWoDescription;
	private String stWoTypeCode;
	private String stServiceAddr1;
	private String stServiceAddrCity;
	private String stServiceAddrPhone;
	private String stServiceAddrZip;
	private String stServiceName;
	private String stJobProjectNum;
	private String stIvueSeqNum;
	private String stAccountingCode;
	private String stBiCustId;
	private int objectid;
	private String gsStationName;
	private Timestamp gsDateCreated;
	private Timestamp gsDateModified;
	private String stAttachedAssemblyGuid;
	private String gsAssemblyGuid;
	private String gsAssemblyDescription;
	private String stAssemblyActionCode;
	private String stAssemblyEstimateCode;
	private int gsAssemblyQuantity;
	private Timestamp gsAssemblyDateCreated;
	private Timestamp gsAssemblyDateInstalled;
	private Timestamp gsAssemblyDateModified;
	private String gsAssemblyComments;
	private String gsAsmbLastModifiedUser;
	private String gsIsNeutral;

	public GisAssemblies(String gsGuid, String stWoNumber, String stStatusRefGuid, String stStatusDescription,
			String stWoDescription, String stWoTypeCode, String stServiceAddr1, String stServiceAddrCity,
			String stServiceAddrPhone, String stServiceAddrZip, String stServiceName, String stJobProjectNum,
			String stIvueSeqNum, String stAccountingCode, String stBiCustId, int objectid, String gsStationName,
			Timestamp gsDateCreated, Timestamp gsDateModified, String stAttachedAssemblyGuid, String gsAssemblyGuid,
			String gsAssemblyDescription, String stAssemblyActionCode, String stAssemblyEstimateCode,
			int gsAssemblyQuantity, Timestamp gsAssemblyDateCreated, Timestamp gsAssemblyDateInstalled,
			Timestamp gsAssemblyDateModified, String gsAssemblyComments, String gsAsmbLastModifiedUser,
			String gsIsNeutral) {
		this.gsGuid = gsGuid;
		this.stWoNumber = stWoNumber;
		this.stStatusRefGuid = stStatusRefGuid;
		this.stStatusDescription = stStatusDescription;
		this.stWoDescription = stWoDescription;
		this.stWoTypeCode = stWoTypeCode;
		this.stServiceAddr1 = stServiceAddr1;
		this.stServiceAddrCity = stServiceAddrCity;
		this.stServiceAddrPhone = stServiceAddrPhone;
		this.stServiceAddrZip = stServiceAddrZip;
		this.stServiceName = stServiceName;
		this.stJobProjectNum = stJobProjectNum;
		this.stIvueSeqNum = stIvueSeqNum;
		this.stAccountingCode = stAccountingCode;
		this.stBiCustId = stBiCustId;
		this.objectid = objectid;
		this.gsStationName = gsStationName;
		this.gsDateCreated = gsDateCreated;
		this.gsDateModified = gsDateModified;
		this.stAttachedAssemblyGuid = stAttachedAssemblyGuid;
		this.gsAssemblyGuid = gsAssemblyGuid;
		this.gsAssemblyDescription = gsAssemblyDescription;
		this.stAssemblyActionCode = stAssemblyActionCode;
		this.stAssemblyEstimateCode = stAssemblyEstimateCode;
		this.gsAssemblyQuantity = gsAssemblyQuantity;
		this.gsAssemblyDateCreated = gsAssemblyDateCreated;
		this.gsAssemblyDateInstalled = gsAssemblyDateInstalled;
		this.gsAssemblyDateModified = gsAssemblyDateModified;
		this.gsAssemblyComments = gsAssemblyComments;
		this.gsAsmbLastModifiedUser = gsAsmbLastModifiedUser;
		this.gsIsNeutral = gsIsNeutral;
	}

	public String getGsGuid() {
		return this.gsGuid;
	}

	public void setGsGuid(String gsGuid) {
		this.gsGuid = gsGuid;
	}

	public String getStWoNumber() {
		return this.stWoNumber;
	}

	public void setStWoNumber(String stWoNumber) {
		this.stWoNumber = stWoNumber;
	}

	public String getStStatusRefGuid() {
		return this.stStatusRefGuid;
	}

	public void setStStatusRefGuid(String stStatusRefGuid) {
		this.stStatusRefGuid = stStatusRefGuid;
	}

	public String getStStatusDescription() {
		return this.stStatusDescription;
	}

	public void setStStatusDescription(String stStatusDescription) {
		this.stStatusDescription = stStatusDescription;
	}

	public String getStWoDescription() {
		return this.stWoDescription;
	}

	public void setStWoDescription(String stWoDescription) {
		this.stWoDescription = stWoDescription;
	}

	public String getStWoTypeCode() {
		return this.stWoTypeCode;
	}

	public void setStWoTypeCode(String stWoTypeCode) {
		this.stWoTypeCode = stWoTypeCode;
	}

	public String getStServiceAddr1() {
		return this.stServiceAddr1;
	}

	public void setStServiceAddr1(String stServiceAddr1) {
		this.stServiceAddr1 = stServiceAddr1;
	}

	public String getStServiceAddrCity() {
		return this.stServiceAddrCity;
	}

	public void setStServiceAddrCity(String stServiceAddrCity) {
		this.stServiceAddrCity = stServiceAddrCity;
	}

	public String getStServiceAddrPhone() {
		return this.stServiceAddrPhone;
	}

	public void setStServiceAddrPhone(String stServiceAddrPhone) {
		this.stServiceAddrPhone = stServiceAddrPhone;
	}

	public String getStServiceAddrZip() {
		return this.stServiceAddrZip;
	}

	public void setStServiceAddrZip(String stServiceAddrZip) {
		this.stServiceAddrZip = stServiceAddrZip;
	}

	public String getStServiceName() {
		return this.stServiceName;
	}

	public void setStServiceName(String stServiceName) {
		this.stServiceName = stServiceName;
	}

	public String getStJobProjectNum() {
		return this.stJobProjectNum;
	}

	public void setStJobProjectNum(String stJobProjectNum) {
		this.stJobProjectNum = stJobProjectNum;
	}

	public String getStIvueSeqNum() {
		return this.stIvueSeqNum;
	}

	public void setStIvueSeqNum(String stIvueSeqNum) {
		this.stIvueSeqNum = stIvueSeqNum;
	}

	public String getStAccountingCode() {
		return this.stAccountingCode;
	}

	public void setStAccountingCode(String stAccountingCode) {
		this.stAccountingCode = stAccountingCode;
	}

	public String getStBiCustId() {
		return this.stBiCustId;
	}

	public void setStBiCustId(String stBiCustId) {
		this.stBiCustId = stBiCustId;
	}

	public int getObjectid() {
		return this.objectid;
	}

	public void setObjectid(int objectid) {
		this.objectid = objectid;
	}

	public String getGsStationName() {
		return this.gsStationName;
	}

	public void setGsStationName(String gsStationName) {
		this.gsStationName = gsStationName;
	}

	public Timestamp getGsDateCreated() {
		return this.gsDateCreated;
	}

	public void setGsDateCreated(Timestamp gsDateCreated) {
		this.gsDateCreated = gsDateCreated;
	}

	public Timestamp getGsDateModified() {
		return this.gsDateModified;
	}

	public void setGsDateModified(Timestamp gsDateModified) {
		this.gsDateModified = gsDateModified;
	}

	public String getStAttachedAssemblyGuid() {
		return this.stAttachedAssemblyGuid;
	}

	public void setStAttachedAssemblyGuid(String stAttachedAssemblyGuid) {
		this.stAttachedAssemblyGuid = stAttachedAssemblyGuid;
	}

	public String getGsAssemblyGuid() {
		return this.gsAssemblyGuid;
	}

	public void setGsAssemblyGuid(String gsAssemblyGuid) {
		this.gsAssemblyGuid = gsAssemblyGuid;
	}

	public String getGsAssemblyDescription() {
		return this.gsAssemblyDescription;
	}

	public void setGsAssemblyDescription(String gsAssemblyDescription) {
		this.gsAssemblyDescription = gsAssemblyDescription;
	}

	public String getStAssemblyActionCode() {
		return this.stAssemblyActionCode;
	}

	public void setStAssemblyActionCode(String stAssemblyActionCode) {
		this.stAssemblyActionCode = stAssemblyActionCode;
	}

	public String getStAssemblyEstimateCode() {
		return this.stAssemblyEstimateCode;
	}

	public void setStAssemblyEstimateCode(String stAssemblyEstimateCode) {
		this.stAssemblyEstimateCode = stAssemblyEstimateCode;
	}

	public int getGsAssemblyQuantity() {
		return this.gsAssemblyQuantity;
	}

	public void setGsAssemblyQuantity(int gsAssemblyQuantity) {
		this.gsAssemblyQuantity = gsAssemblyQuantity;
	}

	public Timestamp getGsAssemblyDateCreated() {
		return this.gsAssemblyDateCreated;
	}

	public void setGsAssemblyDateCreated(Timestamp gsAssemblyDateCreated) {
		this.gsAssemblyDateCreated = gsAssemblyDateCreated;
	}

	public Timestamp getGsAssemblyDateInstalled() {
		return this.gsAssemblyDateInstalled;
	}

	public void setGsAssemblyDateInstalled(Timestamp gsAssemblyDateInstalled) {
		this.gsAssemblyDateInstalled = gsAssemblyDateInstalled;
	}

	public Timestamp getGsAssemblyDateModified() {
		return this.gsAssemblyDateModified;
	}

	public void setGsAssemblyDateModified(Timestamp gsAssemblyDateModified) {
		this.gsAssemblyDateModified = gsAssemblyDateModified;
	}

	public String getGsAssemblyComments() {
		return this.gsAssemblyComments;
	}

	public void setGsAssemblyComments(String gsAssemblyComments) {
		this.gsAssemblyComments = gsAssemblyComments;
	}

	public String getGsAsmbLastModifiedUser() {
		return this.gsAsmbLastModifiedUser;
	}

	public void setGsAsmbLastModifiedUser(String gsAsmbLastModifiedUser) {
		this.gsAsmbLastModifiedUser = gsAsmbLastModifiedUser;
	}

	public String getGsIsNeutral() {
		return this.gsIsNeutral;
	}

	public void setGsIsNeutral(String gsIsNeutral) {
		this.gsIsNeutral = gsIsNeutral;
	}
}
