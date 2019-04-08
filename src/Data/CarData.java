/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author Jason
 */

import Domain.Cars;
import java.util.LinkedList;
import java.util.List;
public class CarData {
    
     private static List<Cars> vlist;
     
      public CarData() {
        vlist = new LinkedList<>();
    }
      public boolean addBus(Cars vehicle) {
        if (!existCar(vehicle)) {
            vlist.add(vehicle);
            System.out.println(vlist.toString());
            return true;
        } else {
            return false;
        }
    }
      public LinkedList<Cars> getAll(){
        return (LinkedList<Cars>) vlist;
    }
       private boolean existCar(Cars vehicle) {
        for (Cars car1 : vlist) {
            if (car1.getPlate()== vehicle.getPlate()) {
                return true;
            }
        }
        return false;
    }
       
        public boolean deleteBus(Cars car) {
        if (existCar(car)) {
            vlist.remove(car);
            return true;
        }
        return false;
    }
        
}
