class calculator{
    private double num1;
    private double num2;
    private double result;
    private double ans;

    //null constructor
    calculator(){
        this.num1 = 0;
        this.num2 = 0;
        this.result = 0;
    }
    //parameterized constructor
    calculator(double num1, double num2, double result){
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
    }
    //main operations
    public double sol( double num1, double num2, char op){
        this.num1 = num1;
        this.num2 = num2;

        //addition
        if(op == '+'){
            this.result = this.num1 + this.num2;
            this.ans = this.result;
            return this.result;

        //subtraction
        }else if(op == '-'){
            this.result = this.num1 - this.num2;
            this.ans = this.result;
            return this.result;

        //multiplication
        }else if(op == '*'){
            this.result = this.num1 * this.num2;
            this.ans = this.result;
            return this.result;

        //division
        }else if(op == '/'){
            if(this.num2 == 0){
                System.out.println("undefined");
        }else{
            this.result = this.num1 / this.num2;
            this.ans = this.result;
            return this.result;
        }

        }else{
            System.out.println("Invalid Operator!");

        }
    return this.result = 0;

    }
    //continue operation
    public void contSol(double num2, char op){
        sol(ans,num2,op);
    }

    //Display
    public void display(){
        System.out.println("Your Answer: " + this.result);
    }
}