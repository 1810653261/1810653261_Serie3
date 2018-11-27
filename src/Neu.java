public class Neu {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i += 2) { // mit i+=2 wird die Zahl mit 2 erhöht
            printName();
        }
        printAge(20);

        for (int j=1; j<11;j+=2){
            printName();
            printAge(j + 20);
        }

    }
    public static void printName()
    {
        String name="Alex Joachimstaller";
        System.out.println(name);
    }

    static void printAge(int age)
    {
        System.out.println(age);
    }



}
