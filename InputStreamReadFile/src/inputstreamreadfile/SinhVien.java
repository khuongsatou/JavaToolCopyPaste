/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputstreamreadfile;

import java.io.Serializable;

/**
 *
 * @author Yui
 */
public class SinhVien implements Serializable{
    private  int tuoi;
    private  String ten,diaChi;
    private double diemTB;

    
    
    public SinhVien(int tuoi, String ten, String diaChi, double diemTB) {
        this.tuoi = tuoi;
        this.ten = ten;
        this.diaChi = diaChi;
        this.diemTB = diemTB;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
    
    
        
    
}
