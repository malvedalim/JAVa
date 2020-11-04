public class sumCalculator {
    private int x;
    private int y;
    private int sum;

    public void setSum (int xA , int yA){
        if((xA < 0) && (yA < 0)){
            System.out.println("Invalid Numbers");
        }else{
            this.x = xA;
            this.y = yA;
        }


    }
    public void getSum(){
        if (this.x == 0 && this.y == 0){
            System.out.println("The sum of two numbers is null");
        }else{
            this.sum = this.x + this.y;
            System.out.println("The sum of two numbers is equals to" + this.sum );
        }

    }


}
