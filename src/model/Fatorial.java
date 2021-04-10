package model;

public class Fatorial extends absProperties implements intMethods {
    
    public Fatorial(Integer num) {
        super(num);
        this.execute();
    }

    @Override
    public void execute() {
        int base = this.num;
        
        for (int i = 1; i < base; i++) {
            num *= i;
        }
    }
    
}
