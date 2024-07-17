public class MyHashMap {

    private const int Capacity = 10000;
    private LinkedList<(int key, int value)>[] map;

    public MyHashMap() {
        map = new LinkedList<(int key, int value)>[Capacity];

    }
      private int Hash(int key)
    {
        return key % Capacity;
    }

    public void Put(int key, int value) {
        int hash = Hash(key);

        if (map[hash] == null)
            map[hash] = new LinkedList<(int key, int value)>();

        var bucket = map[hash];

        var existingNode = bucket.FirstOrDefault(n => n.key == key);
        if (existingNode != default)
            bucket.Remove(existingNode);

        bucket.AddLast((key, value));
    }
    
    public int Get(int key) {
        int hash = Hash(key);

        if (map[hash] != null)
        {
            var bucket = map[hash];

            var node = bucket.FirstOrDefault(n => n.key == key);
            if (node != default)
                return node.value;
        }

        return -1;
    }
    
    public void Remove(int key) {
        int hash = Hash(key);

        if (map[hash] != null)
        {
            var bucket = map[hash];

            var node = bucket.FirstOrDefault(n => n.key == key);
            if (node != default)
                bucket.Remove(node);
        }
    }
}
