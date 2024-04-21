import java.util.HashMap;

public class soal4 {

    public static void main(String[] args) {
        int[] input = {4322, 1334, 1471, 9679, 1989, 6171, 6173, 4199};

        HashMap<Integer, Integer> hashTable = new HashMap<>();
        for (int num : input) {
            int hash = num % 10;
            if (!hashTable.containsKey(hash)) {
                hashTable.put(hash, num);
            } else {
                System.out.println("Deteksi tumbukan: " + num + " dan " + hashTable.get(hash) + " memiliki nilai hash yang sama");
            }
        }

        boolean pernyataan1 = hashTable.get(9679 % 10) == hashTable.get(1989 % 10) &&
                hashTable.get(1989 % 10) == hashTable.get(4199 % 10);
        boolean pernyataan2 = hashTable.get(1471 % 10) == hashTable.get(6171 % 10);

        System.out.println("i. 9679, 1989, 4199 memiliki nilai hash yang sama: " + pernyataan1);
        System.out.println("ii. 1471, 6171 memiliki nilai hash yang sama: " + pernyataan2);

        if (pernyataan1 && !pernyataan2) {
            System.out.println("Jawaban yang benar adalah (C) i dan ii saja");
        } else if (pernyataan2 && !pernyataan1) {
            System.out.println("Jawaban yang benar adalah (B) ii saja");
        } else if (pernyataan1 && pernyataan2) {
            System.out.println("Jawaban yang benar adalah (C) i dan ii saja");
        } else {
            System.out.println("Jawaban yang benar adalah (D) iii atau iv");
        }
    }
}
//soal4
