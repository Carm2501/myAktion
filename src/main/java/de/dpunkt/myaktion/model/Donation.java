package de.dpunkt.myaktion.model;

public class Donation {
private Double amount;
private String donorName;
private Boolean receiptRequested;
private Status status;
private Account account;

public enum Status {
TRANSFERRED, IN_PROCESS;
}

public Donation() {
this.account = new Account();
}

public Double getAmount() {
    return amount;
}

public void setAmount(final Double amount) {
    this.amount = amount;
    }

public String getDonorName() {
    return donorName;
    }

    public void setDonorName(final String donorName) {
    this.donorName = donorName;
    }
    public Boolean getReceiptRequested() {
    return receiptRequested;
    }
    public void setReceiptRequested(final Boolean receiptRequested) {
    this.receiptRequested = receiptRequested;
    }
    public Status getStatus() {
    return status;
    }
    public void setStatus(final Status status) {
    this.status = status;
    }
    public Account getAccount() {
    return account;
    }
    public void setAccount(final Account account) {
    this.account = account;
    }
    }