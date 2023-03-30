package org.example;

import java.time.LocalDate;

public class Type4 extends Drug{
    private Double discount = 0.10;
    protected Double net = calculateNet();
    protected Double ivaPrice = calculatePriceIva();
    protected Double discountPrice = calculateDiscount();
    protected Double total = calculateTotal();

    public Type4() {
    }

    public Type4(String name, Double unitaryPrice, Integer quantity, String invimaRegister, String manufacter, LocalDate dueDate, LocalDate manufacturingDate) {
        super(name, unitaryPrice, quantity, invimaRegister, manufacter, dueDate, manufacturingDate);
    }

    @Override
    public Double calculateNet() {
        this.net = (Double) (this.getUnitaryPrice() * this.getQuantity());
        return net;
    }

    @Override
    public Double calculatePriceIva() {
        this.ivaPrice = this.net * this.getIva();
        return ivaPrice;
    }

    @Override
    public Double calculateDiscount() {
        this.discountPrice = net * this.discount;
        return discountPrice;
    }

    @Override
    public Double calculateTotal() {
        this.total = net + ivaPrice - discountPrice;
        return total;
    }

    public Double getNet() {
        return net;
    }

    public void setNet(Double net) {
        this.net = net;
    }

    public Double getIvaPrice() {
        return ivaPrice;
    }

    public void setIvaPrice(Double ivaPrice) {
        this.ivaPrice = ivaPrice;
    }

    public Double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Double discountPrice) {
        this.discountPrice = discountPrice;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
