class Employee{
    private String name;
    private double salary;
    private String designation;
    private Date dob;
    private Date doh;
    private Boolean inc;
    //null constructor
    Employee(){
        this.name = "unknown";
        this.salary = 0;
        this.designation = "unknown";
        this.dob = new Date();
        this.doh = new Date();
    }

    //parameterized constructor
    Employee(String name, Date dob, Date doh){
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.dob = new Date(dob);
        this.doh = new Date(doh);
    }
    
    //setter
    public void set(String name, double salary, String designation, Date dob, Date doh){
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.dob = new Date(dob);
        this.doh = new Date(doh);
    }

    //getter
    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }
    public String getDesignantion(){
        return this.designation;
    }
    public Date getDob(){
        return new Date(dob);
    }
    public Date getDoh(){
        return new Date(doh);
    }
    public void checkDate(Date doh , Employee other){
        if(this.doh.getYear() > other.doh.getYear()){
             this.inc = true;
             other.inc = false;
        }
        else if(this.doh.getMonth() > other.doh.getMonth()){
              this.inc = true;
             other.inc = false;

            }
        else if(this.doh.getDate()> other.doh.getDate()){
            this.inc = true;
             other.inc = false;

            }
        else{
             other.inc = true;
             this.inc = false;

        }
    }
     //Eligibilty for Increment
    public void increment(Employee other){
        if(other != null){
            checkDate(doh, other);
        }
        if(this.doh.getYear() == other.doh.getYear() && this.doh.getMonth() == other.doh.getMonth() && this.doh.getDate() == other.doh.getDate() ){
            checkDate(dob, other);
        }
        // if(this.dob.getYear() )

    }
    //tostring
    public String toString(){
        return "\nName : " + this.name + "\nDate Of Birth: "+ this.dob +"\nDate Of Hiring: " + this.doh + "\nIncrement employee : " + this.inc ;
    }

    //display
    public void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Designation: "+ this.designation);
        System.out.println("Date Of Hiring: "+ this.doh);
        System.out.println("Date Of Birth: "+ this.dob);
        System.out.println("Increment Of Employee: "+this.inc);
    }

}