package com.psi.application.data.entity;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Salary extends AbstractEntity {

    private LocalDate data;

    private int totalOre;

    private int salariuBrut;

    private int totalCotizatii;

    private int salariuNet;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getTotalOre() {
        return totalOre;
    }

    public void setTotalOre(int totalOre) {
        this.totalOre = totalOre;
    }

    public int getSalariuBrut() {
        return salariuBrut;
    }

    public void setSalariuBrut(int salariuBrut) {
        this.salariuBrut = salariuBrut;
    }

    public int getTotalCotizatii() {
        return totalCotizatii;
    }

    public void setTotalCotizatii(int totalCotizatii) {
        this.totalCotizatii = totalCotizatii;
    }

    public int getSalariuNet() {
        return salariuNet;
    }

    public void setSalariuNet(int salariuNet) {
        this.salariuNet = salariuNet;
    }
}
