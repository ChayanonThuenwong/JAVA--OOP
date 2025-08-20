class Aircraft{
    private String series,id,speed;

    public void setSeries(String series){
        this.series = series;
    }
    public void setID(String id){
        this.id = id;
    }
    public void setSpeed(String speed){
        this.speed = speed;
    }
    public void Display(){
        System.out.println("Aircraft : "+this.series+"\nID : "+this.id+", \nSpeed : "+this.speed+" km/hr\n");
    }

    // Default Constructor \\
    public Aircraft(){
        this.series = "Invalid";
        this.id = "Invalid";
        this.speed = "Invalid";
    }
}