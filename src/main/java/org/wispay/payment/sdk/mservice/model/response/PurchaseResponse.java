package org.wispay.payment.sdk.mservice.model.response;

import java.util.Map;

public class PurchaseResponse {
    //Bill's id
    private Long id;
    private String requestId;
    private String sessionId;
    // Merchant billId
    private String billId;
    private Double amount;
    private String currency;
    private Long transId;
    private String payURL;
    private String shortenPayUrl;
    private Long expiryAt;
    private Map<String, String> extraData;
    private Map<String, String> payOptions;

    private String qrCode;
    private Long initialPayUrlId;
    private Long curPayUrlId;
    private Long[] subPayUrlIds;

    public PurchaseResponse() {
        super();
    }

    public PurchaseResponse(String requestId, String sessionId, String billId, Double amount, String currency, String payURL, Long expiryAt) {
        this.requestId = requestId;
        this.sessionId = sessionId;
        this.billId = billId;
        this.amount = amount;
        this.currency = currency;
        this.payURL = payURL;
        this.expiryAt = expiryAt;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Long getTransId() {
        return transId;
    }

    public void setTransId(Long transId) {
        this.transId = transId;
    }

    public String getPayURL() {
        return payURL;
    }

    public void setPayURL(String payURL) {
        this.payURL = payURL;
    }

    public Long getExpiryAt() {
        return expiryAt;
    }

    public void setExpiryAt(Long expiryAt) {
        this.expiryAt = expiryAt;
    }

    public Map<String, String> getExtraData() {
        return extraData;
    }

    public void setExtraData(Map<String, String> extraData) {
        this.extraData = extraData;
    }

    public Map<String, String> getPayOptions() {
        return payOptions;
    }

    public void setPayOptions(Map<String, String> payOptions) {
        this.payOptions = payOptions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShortenPayUrl() {
        return shortenPayUrl;
    }

    public void setShortenPayUrl(String shortenPayUrl) {
        this.shortenPayUrl = shortenPayUrl;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public Long getInitialPayUrlId() {
        return initialPayUrlId;
    }

    public void setInitialPayUrlId(Long initialPayUrlId) {
        this.initialPayUrlId = initialPayUrlId;
    }

    public Long getCurPayUrlId() {
        return curPayUrlId;
    }

    public void setCurPayUrlId(Long curPayUrlId) {
        this.curPayUrlId = curPayUrlId;
    }

    public Long[] getSubPayUrlIds() {
        return subPayUrlIds;
    }

    public void setSubPayUrlIds(Long[] subPayUrlIds) {
        this.subPayUrlIds = subPayUrlIds;
    }
}
