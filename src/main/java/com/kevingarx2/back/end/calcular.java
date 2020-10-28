/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kevingarx2.back.end;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Kevin
 */
public class calcular {
    //calcula la antigüedad
    public  int antiguedad(int dia, int mes, int año){
       int resultado;
        long edad;
 // String  fechaNAc = dia+mes+año;
    LocalDate fHoy= LocalDate.now();
    
            LocalDate cumple= LocalDate.of(año, Month.of(mes), dia);
            edad= ChronoUnit.YEARS.between(cumple, fHoy); 
            resultado=(int)edad;
      
return resultado;
}
    //CALCULA edad
    public int edad(int dia, int mes, int año){
    long edad;
        int resultado=0;
 // String  fechaNAc = dia+mes+año;
    LocalDate fHoy= LocalDate.now();
    switch(mes){
        case 1:
            LocalDate cumple= LocalDate.of(año, Month.JANUARY, dia);
            edad= ChronoUnit.YEARS.between(cumple, fHoy); 
            resultado=(int)edad;
     break;
        case 2:
            LocalDate cumple2= LocalDate.of(año, Month.FEBRUARY, dia);
            edad= ChronoUnit.YEARS.between(cumple2, fHoy); 
            resultado=(int)edad;  
       break;
        case 3:
            LocalDate cumple3= LocalDate.of(año, Month.MARCH, dia);
            edad= ChronoUnit.YEARS.between(cumple3, fHoy); 
            resultado=(int)edad;  
       break;
        case 4:
            LocalDate cumple4= LocalDate.of(año, Month.APRIL, dia);
            edad= ChronoUnit.YEARS.between(cumple4, fHoy); 
            resultado=(int)edad;  
            break;
            
        case 5:
            LocalDate cumple5= LocalDate.of(año, Month.MAY, dia);
            edad= ChronoUnit.YEARS.between(cumple5, fHoy); 
            resultado=(int)edad;
            break;
            
        case 6:
            
            LocalDate cumple6= LocalDate.of(año, Month.JUNE, dia);
            edad= ChronoUnit.YEARS.between(cumple6, fHoy); 
            resultado=(int)edad;
            break;
        case 7:
            LocalDate cumple7= LocalDate.of(año, Month.JULY, dia);
            edad= ChronoUnit.YEARS.between(cumple7, fHoy); 
            resultado=(int)edad;
     break;
        case 8:
            LocalDate cumple8= LocalDate.of(año, Month.AUGUST, dia);
            edad= ChronoUnit.YEARS.between(cumple8, fHoy); 
            resultado=(int)edad;  
       break;
        case 9:
            LocalDate cumple9= LocalDate.of(año, Month.SEPTEMBER, dia);
            edad= ChronoUnit.YEARS.between(cumple9, fHoy); 
            resultado=(int)edad;  
       break;
        case 10:
            LocalDate cumple10= LocalDate.of(año, Month.OCTOBER, dia);
            edad= ChronoUnit.YEARS.between(cumple10, fHoy); 
            resultado=(int)edad;  
            break;
            
        case 11:
            LocalDate cumple11= LocalDate.of(año, Month.NOVEMBER, dia);
            edad= ChronoUnit.YEARS.between(cumple11, fHoy); 
            resultado=(int)edad;
            break;
            
        case 12:
            
            LocalDate cumple12= LocalDate.of(año, Month.DECEMBER, dia);
            edad= ChronoUnit.YEARS.between(cumple12, fHoy); 
            resultado=(int)edad;
            break;
    }
    
    return resultado;
    }
    //calcula el porcentaje del aumento
    public int porcentaje(double sueldo_ant, int edad,int dia,int mes,int anio,int antigedad){
    int resultado;
    double incremento;
    
    int anti=antigedad;
    
        if (anti<5&&edad>=22&&edad<=25) {
            resultado=5;
        }else if (anti<=9&&anti>=5 && edad>=26&&edad<=30) {
          
            resultado=8; 
        }else if (anti>=10&&edad>30) {
            resultado=10;    
            
        }else{
            resultado=4;    
        
        }
        return resultado;
        }
    
    
    
    
    
    //aroja los resultados
    public double sueldos(double sueldo_ant, int edad,int dia,int mes,int anio,int antigedad){
    double resultado;
    double incremento;
    calcular xd=new calcular();
    int anti=antigedad;
    
        if (anti<5&&edad>=22&&edad<=25) {
            incremento=sueldo_ant*.05;
            resultado=sueldo_ant+incremento;
        }else if (anti<=9&&anti>=5 && edad>=26&&edad<=30) {
            incremento=sueldo_ant*.08;
            resultado=sueldo_ant+incremento;   
        }else if (anti>=10&&edad>30) {
         incremento=sueldo_ant*.10;
            resultado=sueldo_ant+incremento;    
            
        }else{
        incremento=sueldo_ant*.04;
            resultado=sueldo_ant+incremento;    
        
        }
        if (resultado<10000) {
            double dif=resultado-10000;
            if (dif<0) {
            dif=dif*(-1);    
            }
            
            resultado=resultado+dif;
            
        }
        
    return resultado;
    }
    //calcula el bono
    public double bono(double sueldo_ant, int edad,int dia,int mes,int anio,int antigedad){
    double resultado=0;
    double incremento;
//    calcular xd=new calcular();
    int anti=antigedad;
    double temp;
        if (anti<5&&edad>=22&&edad<=25) {
           
            incremento=sueldo_ant*.05;
            temp=sueldo_ant+incremento;
            //xd
              if (temp<10000) {
            double dif=temp-10000;
            if (dif<0) {
            dif=dif*(-1);    
            }else{
            
            dif=0;
            
            }
            
            resultado=dif;
            
        }
        }else if (anti<=9&&anti>=5 && edad>=26&&edad<=30) {
            incremento=sueldo_ant*.08;
            temp=sueldo_ant+incremento; 
            //xd
              if (temp<10000) {
            double dif=temp-10000;
            if (dif<0) {
            dif=dif*(-1);    
            }else{
            
            dif=0;
            
            }
            
            resultado=dif;
            
        }
        }else if (anti>=10&&edad>30) {
         incremento=sueldo_ant*.10;
            temp=sueldo_ant+incremento;    
            //xd
              if (temp<10000) {
            double dif=temp-10000;
            if (dif<0) {
            dif=dif*(-1);    
            }else{
            
            dif=0;
            
            }
            
            resultado=dif;
            
        }
        }else{
        incremento=sueldo_ant*.04;
            temp=sueldo_ant+incremento;   
            //xd
        if (temp<10000) {
            double dif=temp-10000;
            if (dif<0) {
            dif=dif*(-1);    
            }else{
            
            dif=0;
            
            }
            
            resultado=dif;
            
        }
        }
      
        
    return resultado;
    }
    
}
