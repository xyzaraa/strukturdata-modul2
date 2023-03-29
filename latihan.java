//latihan praktikum

public class latihan {
    public static void main(String[] args) {
        java.util.LinkedList<String> animals = new java.util.LinkedList<>();

        animals.add("Domba");
        animals.add("Sapi");
        animals.add("Babi");
        animals.add("Babi");
        animals.add("Kucing");


        System.out.println("Data Hewan : " + animals);
        System.out.println("\nData Hewan yang Dihapus: " + animals.remove(2) + " " + animals.remove(2));
        System.out.println("Output Hewan: " + animals);

    }
}
