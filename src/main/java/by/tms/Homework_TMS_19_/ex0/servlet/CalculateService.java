package by.tms.Homework_TMS_19_.ex0.servlet;

public class CalculateService {
    public double typeOperation(double A, double B,String type){
        switch (type){
            case"sum":
                return sum(A,B);
            case "sub":
                return sub(A,B);
            case "mul":
                return mul(A,B);
            case "div":
                return div(A,B);
        }
    return 0;
    }
    private double sum(double A,double B){
        return A+B;
    }
    private double sub(double A,double B){
        return A-B;
    }
    private double mul(double A,double B){
        return A*B;
    }
    private double div(double A,double B){
        return A/B;
    }
}
