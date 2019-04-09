/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Files;

import Domain.Cars;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jason
 */
public class VehicleFile {
    
    
    //atributes
    public RandomAccessFile randomAccessFile;
    private int regsQuantity;//me indica la cantidad de registros
    private int regSize;
    private String myFilePath;
    
    //constructor
    /**
     * 
     * @param file
     * @throws IOException
     */
    public VehicleFile(File file) throws IOException{
        start(file);
    }
    
    
   
    private void start(File file) throws IOException{
        //storage path
        myFilePath = file.getPath();
        
        
        this.regSize = 140;
        
        //validation
        if(file.exists() && !file.isFile()){
            throw new IOException(file.getName() 
                    + " is an invalid file");
        }
        else{
            //new randomAccessFile intance
            randomAccessFile = new RandomAccessFile(file, "rw");
            
            //how many regs the file has
            this.regsQuantity = (int)Math.ceil((double)randomAccessFile.length() / (double)regSize);
        }
    }
    
    
    public void close() throws IOException{
        randomAccessFile.close();
    }
   
    public int fileSize(){
        return regsQuantity;
    }
    
 
    public boolean putValue(int position, Cars car) throws IOException{
        //validation
        if(position >= 0 && position <= regsQuantity){
            if(car.size() > regSize){
                System.err.print("7001 record size is out of bounds");
                return false;
            }
            else{
                //escribimos en archivo
                randomAccessFile.seek(position * regSize);
                randomAccessFile.writeUTF(car.getBrand());
                randomAccessFile.writeUTF(car.getModel());
                randomAccessFile.writeUTF(car.getYear());
                randomAccessFile.writeUTF(car.getPlate());
                return true;
            }
        }
        else{
            System.err.print("901 position is "
                    + "out of bounds of this file");
                return false;
        }
        
    }
    
   
    public boolean addEndRecord(Cars car) throws IOException{
        //set file final
        boolean success = putValue(regsQuantity, car);
        
        if(success){
            ++regsQuantity;
        }
        return success;
    }
    
    
    
    public Cars getCar(int position) throws IOException{
        //position validation
        if(position >= 0 && position <= regsQuantity){
            //pointer position
            randomAccessFile.seek(position * regSize);
            
            //car instacne
            Cars myCar = new Cars();
            
            //readers
            myCar.setBrand(randomAccessFile.readUTF());
            myCar.setModel(randomAccessFile.readUTF());
            myCar.setYear(randomAccessFile.readUTF());
            myCar.setPlate(randomAccessFile.readUTF());
            
            
            if(myCar.getBrand().equalsIgnoreCase("delete")){
                return null;
            }
            else{
                return myCar;
            }
            
        }
        else{
            System.err.println("901 position is out of bounds");
            return null;
        }
    }
    
    
    public List<Cars> getAllCars() throws IOException{
        
        
        List<Cars> cars = new ArrayList<>();
        
        
        for(int i = 0; i < regsQuantity; i++){
            Cars carTemp = this.getCar(i);
            
            if(carTemp != null){
                cars.add(carTemp);
            }
        }
        
        return cars;
    }
    
    
    public boolean deleteRecord(String name) throws IOException{
        Cars myCar;
        
      
        for(int i = 0; i < regsQuantity; i++){
            
            
            myCar = this.getCar(i);
                
            
            if(myCar.getName().equalsIgnoreCase(name)){

               
                myCar.setName("deleted");

                return this.putValue(i, myCar);
            }
        }
        
    
        return false;
    }
    
    
}


