package model;

public abstract class absProperties {
    
    protected String number;
    protected Integer num;

    public absProperties(String number) {
        this.number = number;
    }

    public absProperties(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    
    
    
    
}
