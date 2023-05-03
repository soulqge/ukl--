package pbo_PkSon;

import java.util.ArrayList;

public class Client implements aL {
      
    private ArrayList <String> namaC = new ArrayList <String>();
    private ArrayList <String> alamat = new ArrayList <String>();
    private ArrayList <String> telp = new ArrayList <String>();
    private ArrayList <Integer> saldo = new ArrayList <Integer>();
    
    //======================================
    
    public Client(){
        this.namaC.add("Al");
        this.alamat.add("Sawojajar");
        this.telp.add("085785546217");
        this.saldo.add(150_000);
        
        this.namaC.add("Fatra");
        this.alamat.add("Pakis");
        this.telp.add("081334235014");
        this.saldo.add(125_000);
    }
    
    //======================================
    
    @Override
    public void setNama(String namaC){
        this.namaC.add(namaC);
    }
    @Override
    public void setAlamat(String alamat){
        this.alamat.add(alamat);
    }
    @Override
    public void setTelp(String telp){
        this.telp.add(telp);
    }
    public void setSaldo(int saldo){
        this.saldo.add(saldo);
    }
    
    //======================================
    
    public int getSaldo(int id){
        return this.saldo.get(id);
    }
     public void editSaldo(int Id, int saldo){
        this.saldo.set(saldo, Id);
    }
     public int jmlC(){
         return this.saldo.size();
     }
     
     //======================================
     
    @Override
     public String getNama(int id){
         return this.namaC.get(id);
     }
    @Override
     public String getAlamat(int id){
         return this.alamat.get(id);
     }
    @Override
     public String getTelp(int id){
         return this.telp.get(id);
     }

    String getNama(ArrayList<Integer> idClient) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
