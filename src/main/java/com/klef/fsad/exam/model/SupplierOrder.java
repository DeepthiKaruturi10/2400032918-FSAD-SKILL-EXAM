package com.klef.fsad.exam.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "supplier_order")
public class SupplierOrder {

    @Id
    private Integer supplierOrderId;   // Manual ID, must not be null

    private String name;
    private LocalDate date;
    private String status;
    private String productName;
    private Integer quantity;
    private Double totalAmount;

    public SupplierOrder() {
    }

    public SupplierOrder(Integer supplierOrderId, String name, LocalDate date, String status,
                         String productName, Integer quantity, Double totalAmount) {
        this.supplierOrderId = supplierOrderId;
        this.name = name;
        this.date = date;
        this.status = status;
        this.productName = productName;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
    }

    public Integer getSupplierOrderId() {
        return supplierOrderId;
    }

    public void setSupplierOrderId(Integer supplierOrderId) {
        this.supplierOrderId = supplierOrderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
