package com.company;

public class araba {
    private String model;
    private int yil,hiz,hizlan,yavasla;
    private static int i=0;

    public araba(String model,int yil){
        this.yil=yil;
        this.model=model;
        this.hiz=0;
        i=i+1;
    }
    public araba(String model,int yil,int hiz){
        this.model=model;
        this.hiz=hiz;
        this.yil=yil;
        this.hizlan=0;
        this.yavasla=0;
        i=i+1;
    }
    public int hizlan(){
        this.hizlan=this.hizlan+1;
        return this.hiz+5;
    }
    public int yavasla(){
        this.yavasla=this.yavasla+1;
        return this.hiz-5;
    }
    public void bilgi(){
        System.out.println("model:"+this.model+"\nyil:"+this.yil+"\nhiz:"
                +this.hiz+"\nyavaslama sayisi: "+this.yavasla+"\nhizlanma sayisi: "+this.hizlan+"\n");
    }
    public static int adet(){
        return i;
    }


}
