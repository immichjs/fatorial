package model;

public class Control extends absProperties implements intMethods {
    
    public Control (String number) {
        super(number);
        this.execute();
    }
    
    @Override
    public void execute() {
        Validation validation = new Validation(this.number);
        
        if (Statics.message.equals("")) {
            Fatorial fatorial = new Fatorial(validation.getNum());
            this.num = fatorial.num;
        }
    }
    
}
