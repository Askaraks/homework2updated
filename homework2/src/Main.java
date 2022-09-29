public class Main {
    public static void main(String[] args) {
        int age = 23;
        int temperature = 26;
        if (age > 20 && age < 45 && temperature < 30 && temperature > -20) {
            System.out.println("Можно идти гулять");
        }else if(age < 20 && temperature > 0 && temperature < 25){
            System.out.println("Можно идти гулять");
        }
        else if(age > 45 && temperature> -10 && temperature < 25){
            System.out.println("Можно идти гулять");



        }



    }
}