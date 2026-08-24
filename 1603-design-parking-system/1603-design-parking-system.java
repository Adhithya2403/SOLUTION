class ParkingSystem {
int parking[];
    public ParkingSystem(int big, int medium, int small) {
        parking = new int[]{0,big,medium,small};
    }
    
    public boolean addCar(int carType) {
        if(parking[carType]>0)
        {
            parking[carType]--;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */