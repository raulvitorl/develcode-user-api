package br.com.develcode.user.api.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

@Entity
public class Usuario {
	
	@Id
	@Column(name = "UUID")
	private String uuid;
	
	@Column(name = "TOTAL_PLAN_VALUE")
	private BigDecimal totalPlanValue;
	
	@Column(name = "TOTAL_ADM_FEE_PERCENTAGE")
	private BigDecimal totalAdmFeePercentage;
	
	@Column(name = "SHARE_VERSION")
	private Long shareVersion;
	
	@Column(name = "SHARE_SITUATION")
	private Long shareSituation;
	
	@Column(name = "SHARE_NUMBER")
	private Long shareNumber;
	
	@Column(name = "RESERVE_FUND_VALUE")
	private BigDecimal reserveFundValue;
	
	@Column(name = "RESERVE_FUND_PERCENTAGE")
	private BigDecimal reserveFundPercentage;
	
	@Column(name = "REMAINING_PAYMENTS")
	private Long remainingPayments;
	
	@Column(name = "QTDLANCESMAXIMOS_3")
	private BigDecimal qtdLancesMaximos3;
	
	@Column(name = "QTDLANCESMAXIMOS_2")
	private BigDecimal qtdLancesMaximos2;
	
	@Column(name = "QTDLANCESMAXIMOS_1")
	private BigDecimal qtdLancesMaximos1;	
	
	@Column(name = "QTDLANCESCONTEMPLADOS_3")
	private BigDecimal qtdLancesContemplados3;
	
	@Column(name = "QTDLANCESCONTEMPLADOS_2")
	private BigDecimal qtdLancesContemplados2;
	 
	@Column(name = "QTDLANCESCONTEMPLADOS_1")
	private BigDecimal qtdLancesContemplados1;
	
	@Column(name = "PCTLANCESCONTEMPLADOS_1_9")
	private BigDecimal pctLancesContemplados_1_9;
	
	@Column(name = "PCTLANCESCONTEMPLADOS_1_8")
	private BigDecimal pctLancesContemplados_1_8;
	
	@Column(name = "PCTLANCESCONTEMPLADOS_1_7")
	private BigDecimal pctLancesContemplados_1_7;
	
	@Column(name = "PCTLANCESCONTEMPLADOS_1_6")
	private BigDecimal pctLancesContemplados_1_6;
	
	@Column(name = "PCTLANCESCONTEMPLADOS_1_5")
	private BigDecimal pctLancesContemplados_1_5;
	
	@Column(name = "PCTLANCESCONTEMPLADOS_1_4")
	private BigDecimal pctLancesContemplados_1_4;
	
	@Column(name = "PCTLANCESCONTEMPLADOS_1_3")
	private BigDecimal pctLancesContemplados_1_3;
	
	@Column(name = "PCTLANCESCONTEMPLADOS_1_2")
	private BigDecimal pctLancesContemplados_1_2;
	
	@Column(name = "PCTLANCESCONTEMPLADOS_1_10")
	private BigDecimal pctLancesContemplados_1_10;
	
	@Column(name = "PCTLANCESCONTEMPLADOS_1_1")
	private BigDecimal pctLancesContemplados_1_1;
	
	@Column(name = "PAYED_ADM_FEE_PERCENTAGE")
	private BigDecimal payedAdmFeePercentage;
	
	@Column(name = "LATE_AMOUNT")
	private BigDecimal lateAmount;
	
	@Column(name = "INSURANCE_MONTHLY_COST")
	private BigDecimal insuranceMonthlyCost;

	@Column(name = "GRUPO")
	private String grupo;
	
	@Column(name = "GROUP_VARIANCES")
	private Long groupVariances;
	
	@Column(name = "GOOD_VALUE")
	private BigDecimal goodValue;
	
	@Column(name = "GOOD_TYPE")
	private Long goodType;
	
	@Column(name = "END_OF_SHARE_MONTHS")
	private Long endOfShareMonths;
	
	@Column(name = "END_OF_GROUP_MONTHS")
	private Long endOfGroupMonths;
	
	@Column(name = "END_GROUP_VALUE")
	private BigDecimal endGroupValue;
	
	@Column(name = "END_GROUP_DATE")
	private String endGroupDate;
	
	@Column(name = "EMBEDDED_BID")
	private BigDecimal embeddedBid;
	
	@Column(name = "DATETIMENOW", columnDefinition = "datetime")
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    @UpdateTimestamp
	private Date dateTimeNow;
	
	@Column(name = "CURRENT_PAYMENT_VALUE")
	private BigDecimal currentPaymentValue;
	
	@Column(name = "CONTRACT_CREATION_DATE")
	private String contractCreatuinDate;
	
	@Column(name = "COMMON_FUND_VALUE")
	private BigDecimal commonFundValue;
	
	@Column(name = "COMMON_FUND_PERCENTAGE")
	private BigDecimal commonFundPercentage;
	
	@Column(name = "CAN_REMOVE_INSURANCE")
	private String canRemoveInsurance;
	
	@Column(name = "AVAILABLE_CREDIT_IN_GROUP_9")
	private BigDecimal availableCrediteInGroup_9;
	
	@Column(name = "AVAILABLE_CREDIT_IN_GROUP_8")
	private BigDecimal availableCrediteInGroup_8;
	
	@Column(name = "AVAILABLE_CREDIT_IN_GROUP_7")
	private BigDecimal availableCrediteInGroup_7;	
	
	@Column(name = "AVAILABLE_CREDIT_IN_GROUP_6")
	private BigDecimal availableCrediteInGroup_6;
	
	@Column(name = "AVAILABLE_CREDIT_IN_GROUP_5")
	private BigDecimal availableCrediteInGroup_5;
	
	@Column(name = "AVAILABLE_CREDIT_IN_GROUP_4")
	private BigDecimal availableCrediteInGroup_4;
	
	@Column(name = "AVAILABLE_CREDIT_IN_GROUP_3")
	private BigDecimal availableCrediteInGroup_3;
	
	@Column(name = "AVAILABLE_CREDIT_IN_GROUP_2")
	private BigDecimal availableCrediteInGroup_2;
	
	@Column(name = "AVAILABLE_CREDIT_IN_GROUP_1")
	private BigDecimal availableCrediteInGroup_1;
	
	@Column(name = "AVAILABLE_CREDIT_IN_GROUP_0")
	private BigDecimal availableCrediteInGroup_0;
	
	@Column(name = "AMOUNT_OWED")
	private BigDecimal amountOwned;
	
	@Column(name = "PRECIFICADO")
	private Long precificado;

	public Usuario() {
		super();
	}

	public Usuario(String uuid, BigDecimal totalPlanValue, BigDecimal totalAdmFeePercentage, Long shareVersion,
			Long shareSituation, Long shareNumber, BigDecimal reserveFundValue, BigDecimal reserveFundPercentage,
			Long remainingPayments, BigDecimal qtdLancesMaximos3, BigDecimal qtdLancesMaximos2,
			BigDecimal qtdLancesMaximos1, BigDecimal qtdLancesContemplados3, BigDecimal qtdLancesContemplados2,
			BigDecimal qtdLancesContemplados1, BigDecimal pctLancesContemplados_1_9,
			BigDecimal pctLancesContemplados_1_8, BigDecimal pctLancesContemplados_1_7,
			BigDecimal pctLancesContemplados_1_6, BigDecimal pctLancesContemplados_1_5,
			BigDecimal pctLancesContemplados_1_4, BigDecimal pctLancesContemplados_1_3,
			BigDecimal pctLancesContemplados_1_2, BigDecimal pctLancesContemplados_1_10,
			BigDecimal pctLancesContemplados_1_1, BigDecimal payedAdmFeePercentage, BigDecimal lateAmount,
			BigDecimal insuranceMonthlyCost, String grupo, Long groupVariances, BigDecimal goodValue, Long goodType,
			Long endOfShareMonths, Long endOfGroupMonths, BigDecimal endGroupValue, String endGroupDate,
			BigDecimal embeddedBid, Date dateTimeNow, BigDecimal currentPaymentValue, String contractCreatuinDate,
			BigDecimal commonFundValue, BigDecimal commonFundPercentage, String canRemoveInsurance,
			BigDecimal availableCrediteInGroup_9, BigDecimal availableCrediteInGroup_8,
			BigDecimal availableCrediteInGroup_7, BigDecimal availableCrediteInGroup_6,
			BigDecimal availableCrediteInGroup_5, BigDecimal availableCrediteInGroup_4,
			BigDecimal availableCrediteInGroup_3, BigDecimal availableCrediteInGroup_2,
			BigDecimal availableCrediteInGroup_1, BigDecimal availableCrediteInGroup_0, BigDecimal amountOwned,
			Long precificado) {
		super();
		this.uuid = uuid;
		this.totalPlanValue = totalPlanValue;
		this.totalAdmFeePercentage = totalAdmFeePercentage;
		this.shareVersion = shareVersion;
		this.shareSituation = shareSituation;
		this.shareNumber = shareNumber;
		this.reserveFundValue = reserveFundValue;
		this.reserveFundPercentage = reserveFundPercentage;
		this.remainingPayments = remainingPayments;
		this.qtdLancesMaximos3 = qtdLancesMaximos3;
		this.qtdLancesMaximos2 = qtdLancesMaximos2;
		this.qtdLancesMaximos1 = qtdLancesMaximos1;
		this.qtdLancesContemplados3 = qtdLancesContemplados3;
		this.qtdLancesContemplados2 = qtdLancesContemplados2;
		this.qtdLancesContemplados1 = qtdLancesContemplados1;
		this.pctLancesContemplados_1_9 = pctLancesContemplados_1_9;
		this.pctLancesContemplados_1_8 = pctLancesContemplados_1_8;
		this.pctLancesContemplados_1_7 = pctLancesContemplados_1_7;
		this.pctLancesContemplados_1_6 = pctLancesContemplados_1_6;
		this.pctLancesContemplados_1_5 = pctLancesContemplados_1_5;
		this.pctLancesContemplados_1_4 = pctLancesContemplados_1_4;
		this.pctLancesContemplados_1_3 = pctLancesContemplados_1_3;
		this.pctLancesContemplados_1_2 = pctLancesContemplados_1_2;
		this.pctLancesContemplados_1_10 = pctLancesContemplados_1_10;
		this.pctLancesContemplados_1_1 = pctLancesContemplados_1_1;
		this.payedAdmFeePercentage = payedAdmFeePercentage;
		this.lateAmount = lateAmount;
		this.insuranceMonthlyCost = insuranceMonthlyCost;
		this.grupo = grupo;
		this.groupVariances = groupVariances;
		this.goodValue = goodValue;
		this.goodType = goodType;
		this.endOfShareMonths = endOfShareMonths;
		this.endOfGroupMonths = endOfGroupMonths;
		this.endGroupValue = endGroupValue;
		this.endGroupDate = endGroupDate;
		this.embeddedBid = embeddedBid;
		this.dateTimeNow = dateTimeNow;
		this.currentPaymentValue = currentPaymentValue;
		this.contractCreatuinDate = contractCreatuinDate;
		this.commonFundValue = commonFundValue;
		this.commonFundPercentage = commonFundPercentage;
		this.canRemoveInsurance = canRemoveInsurance;
		this.availableCrediteInGroup_9 = availableCrediteInGroup_9;
		this.availableCrediteInGroup_8 = availableCrediteInGroup_8;
		this.availableCrediteInGroup_7 = availableCrediteInGroup_7;
		this.availableCrediteInGroup_6 = availableCrediteInGroup_6;
		this.availableCrediteInGroup_5 = availableCrediteInGroup_5;
		this.availableCrediteInGroup_4 = availableCrediteInGroup_4;
		this.availableCrediteInGroup_3 = availableCrediteInGroup_3;
		this.availableCrediteInGroup_2 = availableCrediteInGroup_2;
		this.availableCrediteInGroup_1 = availableCrediteInGroup_1;
		this.availableCrediteInGroup_0 = availableCrediteInGroup_0;
		this.amountOwned = amountOwned;
		this.precificado = precificado;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public BigDecimal getTotalPlanValue() {
		return totalPlanValue;
	}

	public void setTotalPlanValue(BigDecimal totalPlanValue) {
		this.totalPlanValue = totalPlanValue;
	}

	public BigDecimal getTotalAdmFeePercentage() {
		return totalAdmFeePercentage;
	}

	public void setTotalAdmFeePercentage(BigDecimal totalAdmFeePercentage) {
		this.totalAdmFeePercentage = totalAdmFeePercentage;
	}

	public Long getShareVersion() {
		return shareVersion;
	}

	public void setShareVersion(Long shareVersion) {
		this.shareVersion = shareVersion;
	}

	public Long getShareSituation() {
		return shareSituation;
	}

	public void setShareSituation(Long shareSituation) {
		this.shareSituation = shareSituation;
	}

	public Long getShareNumber() {
		return shareNumber;
	}

	public void setShareNumber(Long shareNumber) {
		this.shareNumber = shareNumber;
	}

	public BigDecimal getReserveFundValue() {
		return reserveFundValue;
	}

	public void setReserveFundValue(BigDecimal reserveFundValue) {
		this.reserveFundValue = reserveFundValue;
	}

	public BigDecimal getReserveFundPercentage() {
		return reserveFundPercentage;
	}

	public void setReserveFundPercentage(BigDecimal reserveFundPercentage) {
		this.reserveFundPercentage = reserveFundPercentage;
	}

	public Long getRemainingPayments() {
		return remainingPayments;
	}

	public void setRemainingPayments(Long remainingPayments) {
		this.remainingPayments = remainingPayments;
	}

	public BigDecimal getQtdLancesMaximos3() {
		return qtdLancesMaximos3;
	}

	public void setQtdLancesMaximos3(BigDecimal qtdLancesMaximos3) {
		this.qtdLancesMaximos3 = qtdLancesMaximos3;
	}

	public BigDecimal getQtdLancesMaximos2() {
		return qtdLancesMaximos2;
	}

	public void setQtdLancesMaximos2(BigDecimal qtdLancesMaximos2) {
		this.qtdLancesMaximos2 = qtdLancesMaximos2;
	}

	public BigDecimal getQtdLancesMaximos1() {
		return qtdLancesMaximos1;
	}

	public void setQtdLancesMaximos1(BigDecimal qtdLancesMaximos1) {
		this.qtdLancesMaximos1 = qtdLancesMaximos1;
	}

	public BigDecimal getQtdLancesContemplados3() {
		return qtdLancesContemplados3;
	}

	public void setQtdLancesContemplados3(BigDecimal qtdLancesContemplados3) {
		this.qtdLancesContemplados3 = qtdLancesContemplados3;
	}

	public BigDecimal getQtdLancesContemplados2() {
		return qtdLancesContemplados2;
	}

	public void setQtdLancesContemplados2(BigDecimal qtdLancesContemplados2) {
		this.qtdLancesContemplados2 = qtdLancesContemplados2;
	}

	public BigDecimal getQtdLancesContemplados1() {
		return qtdLancesContemplados1;
	}

	public void setQtdLancesContemplados1(BigDecimal qtdLancesContemplados1) {
		this.qtdLancesContemplados1 = qtdLancesContemplados1;
	}

	public BigDecimal getPctLancesContemplados_1_9() {
		return pctLancesContemplados_1_9;
	}

	public void setPctLancesContemplados_1_9(BigDecimal pctLancesContemplados_1_9) {
		this.pctLancesContemplados_1_9 = pctLancesContemplados_1_9;
	}

	public BigDecimal getPctLancesContemplados_1_8() {
		return pctLancesContemplados_1_8;
	}

	public void setPctLancesContemplados_1_8(BigDecimal pctLancesContemplados_1_8) {
		this.pctLancesContemplados_1_8 = pctLancesContemplados_1_8;
	}

	public BigDecimal getPctLancesContemplados_1_7() {
		return pctLancesContemplados_1_7;
	}

	public void setPctLancesContemplados_1_7(BigDecimal pctLancesContemplados_1_7) {
		this.pctLancesContemplados_1_7 = pctLancesContemplados_1_7;
	}

	public BigDecimal getPctLancesContemplados_1_6() {
		return pctLancesContemplados_1_6;
	}

	public void setPctLancesContemplados_1_6(BigDecimal pctLancesContemplados_1_6) {
		this.pctLancesContemplados_1_6 = pctLancesContemplados_1_6;
	}

	public BigDecimal getPctLancesContemplados_1_5() {
		return pctLancesContemplados_1_5;
	}

	public void setPctLancesContemplados_1_5(BigDecimal pctLancesContemplados_1_5) {
		this.pctLancesContemplados_1_5 = pctLancesContemplados_1_5;
	}

	public BigDecimal getPctLancesContemplados_1_4() {
		return pctLancesContemplados_1_4;
	}

	public void setPctLancesContemplados_1_4(BigDecimal pctLancesContemplados_1_4) {
		this.pctLancesContemplados_1_4 = pctLancesContemplados_1_4;
	}

	public BigDecimal getPctLancesContemplados_1_3() {
		return pctLancesContemplados_1_3;
	}

	public void setPctLancesContemplados_1_3(BigDecimal pctLancesContemplados_1_3) {
		this.pctLancesContemplados_1_3 = pctLancesContemplados_1_3;
	}

	public BigDecimal getPctLancesContemplados_1_2() {
		return pctLancesContemplados_1_2;
	}

	public void setPctLancesContemplados_1_2(BigDecimal pctLancesContemplados_1_2) {
		this.pctLancesContemplados_1_2 = pctLancesContemplados_1_2;
	}

	public BigDecimal getPctLancesContemplados_1_10() {
		return pctLancesContemplados_1_10;
	}

	public void setPctLancesContemplados_1_10(BigDecimal pctLancesContemplados_1_10) {
		this.pctLancesContemplados_1_10 = pctLancesContemplados_1_10;
	}

	public BigDecimal getPctLancesContemplados_1_1() {
		return pctLancesContemplados_1_1;
	}

	public void setPctLancesContemplados_1_1(BigDecimal pctLancesContemplados_1_1) {
		this.pctLancesContemplados_1_1 = pctLancesContemplados_1_1;
	}

	public BigDecimal getPayedAdmFeePercentage() {
		return payedAdmFeePercentage;
	}

	public void setPayedAdmFeePercentage(BigDecimal payedAdmFeePercentage) {
		this.payedAdmFeePercentage = payedAdmFeePercentage;
	}

	public BigDecimal getLateAmount() {
		return lateAmount;
	}

	public void setLateAmount(BigDecimal lateAmount) {
		this.lateAmount = lateAmount;
	}

	public BigDecimal getInsuranceMonthlyCost() {
		return insuranceMonthlyCost;
	}

	public void setInsuranceMonthlyCost(BigDecimal insuranceMonthlyCost) {
		this.insuranceMonthlyCost = insuranceMonthlyCost;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public Long getGroupVariances() {
		return groupVariances;
	}

	public void setGroupVariances(Long groupVariances) {
		this.groupVariances = groupVariances;
	}

	public BigDecimal getGoodValue() {
		return goodValue;
	}

	public void setGoodValue(BigDecimal goodValue) {
		this.goodValue = goodValue;
	}

	public Long getGoodType() {
		return goodType;
	}

	public void setGoodType(Long goodType) {
		this.goodType = goodType;
	}

	public Long getEndOfShareMonths() {
		return endOfShareMonths;
	}

	public void setEndOfShareMonths(Long endOfShareMonths) {
		this.endOfShareMonths = endOfShareMonths;
	}

	public Long getEndOfGroupMonths() {
		return endOfGroupMonths;
	}

	public void setEndOfGroupMonths(Long endOfGroupMonths) {
		this.endOfGroupMonths = endOfGroupMonths;
	}

	public BigDecimal getEndGroupValue() {
		return endGroupValue;
	}

	public void setEndGroupValue(BigDecimal endGroupValue) {
		this.endGroupValue = endGroupValue;
	}

	public String getEndGroupDate() {
		return endGroupDate;
	}

	public void setEndGroupDate(String endGroupDate) {
		this.endGroupDate = endGroupDate;
	}

	public BigDecimal getEmbeddedBid() {
		return embeddedBid;
	}

	public void setEmbeddedBid(BigDecimal embeddedBid) {
		this.embeddedBid = embeddedBid;
	}

	public Date getDateTimeNow() {
		return dateTimeNow;
	}

	public void setDateTimeNow(Date dateTimeNow) {
		this.dateTimeNow = dateTimeNow;
	}

	public BigDecimal getCurrentPaymentValue() {
		return currentPaymentValue;
	}

	public void setCurrentPaymentValue(BigDecimal currentPaymentValue) {
		this.currentPaymentValue = currentPaymentValue;
	}

	public String getContractCreatuinDate() {
		return contractCreatuinDate;
	}

	public void setContractCreatuinDate(String contractCreatuinDate) {
		this.contractCreatuinDate = contractCreatuinDate;
	}

	public BigDecimal getCommonFundValue() {
		return commonFundValue;
	}

	public void setCommonFundValue(BigDecimal commonFundValue) {
		this.commonFundValue = commonFundValue;
	}

	public BigDecimal getCommonFundPercentage() {
		return commonFundPercentage;
	}

	public void setCommonFundPercentage(BigDecimal commonFundPercentage) {
		this.commonFundPercentage = commonFundPercentage;
	}

	public String getCanRemoveInsurance() {
		return canRemoveInsurance;
	}

	public void setCanRemoveInsurance(String canRemoveInsurance) {
		this.canRemoveInsurance = canRemoveInsurance;
	}

	public BigDecimal getAvailableCrediteInGroup_9() {
		return availableCrediteInGroup_9;
	}

	public void setAvailableCrediteInGroup_9(BigDecimal availableCrediteInGroup_9) {
		this.availableCrediteInGroup_9 = availableCrediteInGroup_9;
	}

	public BigDecimal getAvailableCrediteInGroup_8() {
		return availableCrediteInGroup_8;
	}

	public void setAvailableCrediteInGroup_8(BigDecimal availableCrediteInGroup_8) {
		this.availableCrediteInGroup_8 = availableCrediteInGroup_8;
	}

	public BigDecimal getAvailableCrediteInGroup_7() {
		return availableCrediteInGroup_7;
	}

	public void setAvailableCrediteInGroup_7(BigDecimal availableCrediteInGroup_7) {
		this.availableCrediteInGroup_7 = availableCrediteInGroup_7;
	}

	public BigDecimal getAvailableCrediteInGroup_6() {
		return availableCrediteInGroup_6;
	}

	public void setAvailableCrediteInGroup_6(BigDecimal availableCrediteInGroup_6) {
		this.availableCrediteInGroup_6 = availableCrediteInGroup_6;
	}

	public BigDecimal getAvailableCrediteInGroup_5() {
		return availableCrediteInGroup_5;
	}

	public void setAvailableCrediteInGroup_5(BigDecimal availableCrediteInGroup_5) {
		this.availableCrediteInGroup_5 = availableCrediteInGroup_5;
	}

	public BigDecimal getAvailableCrediteInGroup_4() {
		return availableCrediteInGroup_4;
	}

	public void setAvailableCrediteInGroup_4(BigDecimal availableCrediteInGroup_4) {
		this.availableCrediteInGroup_4 = availableCrediteInGroup_4;
	}

	public BigDecimal getAvailableCrediteInGroup_3() {
		return availableCrediteInGroup_3;
	}

	public void setAvailableCrediteInGroup_3(BigDecimal availableCrediteInGroup_3) {
		this.availableCrediteInGroup_3 = availableCrediteInGroup_3;
	}

	public BigDecimal getAvailableCrediteInGroup_2() {
		return availableCrediteInGroup_2;
	}

	public void setAvailableCrediteInGroup_2(BigDecimal availableCrediteInGroup_2) {
		this.availableCrediteInGroup_2 = availableCrediteInGroup_2;
	}

	public BigDecimal getAvailableCrediteInGroup_1() {
		return availableCrediteInGroup_1;
	}

	public void setAvailableCrediteInGroup_1(BigDecimal availableCrediteInGroup_1) {
		this.availableCrediteInGroup_1 = availableCrediteInGroup_1;
	}

	public BigDecimal getAvailableCrediteInGroup_0() {
		return availableCrediteInGroup_0;
	}

	public void setAvailableCrediteInGroup_0(BigDecimal availableCrediteInGroup_0) {
		this.availableCrediteInGroup_0 = availableCrediteInGroup_0;
	}

	public BigDecimal getAmountOwned() {
		return amountOwned;
	}

	public void setAmountOwned(BigDecimal amountOwned) {
		this.amountOwned = amountOwned;
	}

	public Long getPrecificado() {
		return precificado;
	}

	public void setPrecificado(Long precificado) {
		this.precificado = precificado;
	}
		
	
}
