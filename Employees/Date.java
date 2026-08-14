class Date{
    private int year;
    private int date;
    private int month;

    Date(){
        this.date = 1;
        this.year = 2000;
        this.month = 2;
    }

    Date(int date, int month, int year){
        if (date <= 31 && month <= 12 && year < 2026){
            this.date = date;
            this.year = year;
            this.month = month;
        }
    }

    Date(Date d){
        this.date = d.date;
        this.year = d.year;
        this.month = d.month;
    }

    public boolean compare(Date other){
        if(this.year == other.year && other == null && this.month == other.month && this.date == other.date){
            return false;
        }
        else{
            return true;
        }
    }
    
    public boolean equals(Date other){
        if(this.year == other.year && other == null){
            return false;
        }
        else{
            return true;
        }
    }
    public String toString(){
        return "" + this.date + "-" + this.month + "-" + this.year + "" ;
    }

}