package properties.polymorphism;

public class Numbers {
    int sum(int a, int b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    double sum(double a, int b){
        return a+b;
    }

//    double sum(int a, int b){
//        return a+b;
//    }

    public static void main(String[] args){
        Numbers obj = new Numbers();
        obj.sum(2,3);
        obj.sum(1,3,7);
        obj.sum(4.33,6);
    }
}
