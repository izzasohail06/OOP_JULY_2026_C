class Employee{
    private String name;
    private Date dob;
    private Date doh;
    Employee(){
        this.name = "unknown";
        this.dob = new Date();
        this.doh = new Date();
    }
    Employee(String name, Date dob, Date doh){
        this.name = name;
        this.dob = new Date(dob);
        this.doh = new Date(doh);
    }
    public String toString(){
        return "name : " + this.name + " dob: "+ this.dob +" doh: " + this.doh ;
    }
}