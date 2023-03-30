package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Type1 drug1 = new Type1("Acetaminofen", 1000.0, 2, "ND4798B", "Procaps SA", LocalDate.of(2023, 3, 30), LocalDate.of(2023, 6, 30));

        System.out.println("-------------------------------------" + " \nNombre: " + drug1.getName() + " \n Precio unitario: " + drug1.getUnitaryPrice() + " Cantidad: " + drug1.getQuantity() + " \n Neto: " + drug1.getNet() + " \n IVA: " + drug1.getIvaPrice() + " \n Descuento: " + drug1.getDiscountPrice() + " \n Total: " + drug1.getTotal());

        Type5 drug5 = new Type5("Acetaminofen", 1000.0, 2, "ND4798B", "Procaps SA", LocalDate.of(2023, 3, 30), LocalDate.of(2023, 6, 30));

        System.out.println("-------------------------------------" + " \n Nombre: " + drug5.getName() + " \n Precio unitario: " + drug5.getUnitaryPrice() + " Cantidad: " + drug5.getQuantity() + " \n Neto: " + drug5.getNet() + " \n IVA: " + drug5.getIvaPrice() + " \n Descuento: " + drug5.getDiscountPrice() + " \n Total: " + drug5.getTotal());
    }
}