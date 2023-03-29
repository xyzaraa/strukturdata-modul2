/**
 * Kiara Azzahra
 * 202110370311426
 */

package praktikumModul2.kegiatan1;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> stringArrayList = new java.util.ArrayList<>();

        // menambahkan data
        stringArrayList.add("Angsa");
        stringArrayList.add("Bebek");
        stringArrayList.add("Cicak");
        stringArrayList.add("Domba");
        stringArrayList.add("Elang");
        stringArrayList.add("Gajah");
        stringArrayList.add("Badak");
        stringArrayList.add("Bebek");

        // perulangan menggunakan panjang array untuk mencari equals to bebek
        int jumlahBebek = 0;
        for (String s : stringArrayList) {
            if (s.equals("Bebek")) {
                jumlahBebek++;
            }
        }

        // Menampilkan posisi indeks
        System.out.println("Bebek berada pada posisi indeks ke: " + stringArrayList.indexOf("Bebek") + "," + stringArrayList.lastIndexOf("Bebek"));
        System.out.println("Bebek : " + jumlahBebek);

        //menghapus bebek pertama menggunakan index
        stringArrayList.remove(1);
        System.out.println("Data setelah dihapus: " + stringArrayList);

        //menampilkan elemen index ke 0 dan 2
        System.out.println("\nIndex ke-0 : " + stringArrayList.get(0));
        System.out.println("Index ke-2 : " + stringArrayList.get(2));

        //menghapus index ke-0
        stringArrayList.remove(0);
        System.out.println("Data setelah index ke-0 dihapus: " + stringArrayList);

        //mengubah index ke-0 dan ke-2
        stringArrayList.set(0, "Ular");
        System.out.println("\nData setelah diubah : " + stringArrayList);

        ///menambahkan itik pada index ke-2
        stringArrayList.add(2, "Itik");
        System.out.println("Data setelah ditambahkan itik: " + stringArrayList);

        //menghapus elemen diantara index ke-1 dan 5 dari index terakhir
        stringArrayList.remove(4);
        stringArrayList.remove(3);
        stringArrayList.remove(2);
        System.out.println("Data setelah dihapus index 2,3,4: " + stringArrayList);

        //menampilkan elemen di index pertama dan terakhir
        System.out.println("\nElemen pertama: " + stringArrayList.get(0));
        System.out.println("Elemen terakhir: " + stringArrayList.get(3));

        //menampilkan jumlah elemen
        System.out.println("Jumlah elemen: " + stringArrayList.size());

        //mencari posisi index badak
        System.out.println("Posisi index badak: " + stringArrayList.indexOf("Badak"));
    }
}



