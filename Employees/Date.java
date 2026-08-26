class Date{
    private int year;
    private int date;
    private int month;

    //null constructor
    Date(){
        this.date = 1;
        this.year = 2000;
        this.month = 2;
    }

    //parameterized constructor
    Date(int date, int month, int year){
        if (date <= 31 && month <= 12 && year < 2026){
            this.date = date;
            this.year = year;
            this.month = month;
        }
    }

    //copy constructor
    Date(Date d){
        this.date = d.date;
        this.year = d.year;
        this.month = d.month;
    }

    //Setters
    public void set(int date, int month, int year){
        this.date = date;
        this.year = year;
        this.month = month;
    }

    //Getters
    public int getDate(){
        return this.date;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }

    //Date Validation
    public boolean isValidDate(int date, int month, int year) {
        if (this.year < 1 || this.month < 1 || this.month > 12 || this.date < 1) {
            return false;
        }
        return this.date;
    }

    //Days in Month
    public int daysInMonth(int date, int month, int year){
        if(this.month == 2){
            if(this.year % 4 ==0){
                return 29;
            }else{
                return 28;
            }
        }
        if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11){
            return 30;
        }else{
            return 31;
        }
    }
    //comparing dates
    public boolean compare(Date other){
        if(this.year == other.year && other == null && this.month == other.month && this.date == other.date){
            return false;
        }
        else{
            return true;
        }
    }
    
    //equal
    public boolean equals(Date other){
        if(this.year == other.year && other == null){
            return false;
        }
        else{
            return true;
        }
    }

    //tostring
    public String toString(){
        return "" + this.date + "-" + this.month + "-" + this.year + "" ;
    }

}