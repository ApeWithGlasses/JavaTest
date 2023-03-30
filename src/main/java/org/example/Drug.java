package org.example;

import java.time.LocalDate;

public abstract class Drug {
    private String name;
    private Double unitaryPrice;
    private Integer quantity;
    private String invimaRegister;
    private String manufacter;
    private LocalDate dueDate;
    private LocalDate manufacturingDate;
    protected final Double iva = 0.19;

    public Drug() {
    }

    public Drug(String name, Double unitaryPrice, Integer quantity, String invimaRegister, String manufacter, LocalDate dueDate, LocalDate manufacturingDate) {
        this.name = name;
        this.unitaryPrice = unitaryPrice;
        this.quantity = quantity;
        this.invimaRegister = invimaRegister;
        this.manufacter = manufacter;
        this.dueDate = dueDate;
        this.manufacturingDate = manufacturingDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getUnitaryPrice() {
        return unitaryPrice;
    }

    public void setUnitaryPrice(Double unitaryPrice) {
        this.unitaryPrice = unitaryPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getInvimaRegister() {
        return invimaRegister;
    }

    public void setInvimaRegister(String invimaRegister) {
        this.invimaRegister = invimaRegister;
    }

    public String getManufacter() {
        return manufacter;
    }

    public void setManufacter(String manufacter) {
        this.manufacter = manufacter;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public Double getIva() {
        return iva;
    }

    public abstract Double calculateNet();
    public abstract Double calculatePriceIva();
    public abstract Double calculateDiscount();

    public abstract Double calculateTotal();
}
