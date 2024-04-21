import java.util.LinkedList;

class HashTable {
    private int M; 
    private LinkedList<String>[] table;

    public HashTable(int size) {
        M = size;
        table = new LinkedList[M];
        for (int i = 0; i < M; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(String key) {
        char firstChar = Character.toUpperCase(key.charAt(0));
        int k = firstChar - 'A' + 1; 
        return (11 * k) % M;
    }

    public void put(String key, String value) {
        int index = hash(key); 
        table[index].add(value); 
    }

    public void printHashTable() {
        for (int i = 0; i < M; i++) {
            System.out.print("Index " + i + ": ");
            for (String item : table[i]) {
                System.out.print(item + " -> ");
            }
            System.out.println("null");
        }
    }
}

public class soal1 {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(5); 

        hashTable.put("INDONESIA", "Jakarta");
        hashTable.put("ITALIA", "Roma");
        hashTable.put("ISLANDIA", "Reykjavik");
        hashTable.put("IRLANDIA", "Dublin");
        
        hashTable.printHashTable();
    }
}
