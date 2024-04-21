class HashTable {
    private int M; 
    private String[] keys; 
    private String[] values; 
    private int size; 

    public HashTable(int size) {
        M = size;
        keys = new String[M];
        values = new String[M];
        this.size = 0;
    }

    private int hash(String key) {
        char firstChar = Character.toUpperCase(key.charAt(0));
        int k = firstChar - 'A' + 1; 
        return (11 * k) % M; 
    }

    private int hash2(String key) {
        char firstChar = Character.toUpperCase(key.charAt(0)); 
        int k = firstChar - 'A' + 1; 
        return (k % 3) + 1; 
    }

    public void put(String key, String value) {
        if (size == M) {
            System.out.println("Tabel hash penuh.");
            return;
        }

        int index = hash(key); 
        int offset = hash2(key); 

        while (keys[index] != null) { 
            index = (index + offset) % M;
        }
        keys[index] = key; 
        values[index] = value; 
        size++; 
    }

    public void printHashTable() {
        for (int i = 0; i < M; i++) {
            if (keys[i] != null) {
                System.out.println("Index " + i + ": " + keys[i] + " -> " + values[i]);
            } else {
                System.out.println("Index " + i + ": null");
            }
        }
    }
}

public class soal3 {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(16); 

        hashTable.put("ANOTHERXMPL", "Value");

        hashTable.printHashTable();
    }
}
//soal3
