package model;

public class Validation extends absProperties implements intMethods {

    public Validation(String number) {
        super(number);
        this.execute();
    }

    @Override
    public void execute() {
        Statics.message = "";
        try {
            this.num = Integer.parseInt(this.number);
        } catch (Exception e) {
            Statics.message = "Erro de conversão";
        }
    }
    
}
