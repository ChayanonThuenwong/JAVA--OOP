class Plane extends Aircraft{
    public int attendant;
    public void setAttendant(int attendant){
        this.attendant = attendant;
    }
    public Plane() {
        System.out.println("If not boeing, we're not going");
    }
    public void PlaneDisplay(){
        System.out.println("Flight Attendant is "+this.attendant);
    }
}