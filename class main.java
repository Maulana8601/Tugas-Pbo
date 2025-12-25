package com.mycompany.tugas_tugas;


public class main {
    public static void main(String[]args){
        
    InputPenumpang ip = new InputPenumpang();
    Penumpang p = ip.inputData();
    
        System.out.println("\n===Data Penumpang===");
        
        if (p instanceof PenumpangVIP){
            p.tampilkanData("VIP");
        } else{
            p.tampilkanData("Reguler");
        }
    }
}

