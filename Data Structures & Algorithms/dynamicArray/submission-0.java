class DynamicArray {

    // 🔹 Step 1: Internal data members
    private int[] data;      // backing array
    private int size;        // number of elements currently stored
    private int capacity;    // total available slots in the array

    // 🔹 Step 2: Constructor
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.data = new int[capacity];
        this.size = 0; // starts empty
    }

    // 🔹 Step 3: Get element at index i
    public int get(int i) {
        return data[i]; // assume valid index
    }

    // 🔹 Step 4: Set element at index i to n
    public void set(int i, int n) {
        data[i] = n; // assume valid index
    }

    // 🔹 Step 5: Add element at the end
    public void pushback(int n) {
        if (size == capacity) {
            resize(); // double the capacity when full
        }
        data[size++] = n;
    }

    // 🔹 Step 6: Remove and return last element
    public int popback() {
        return data[--size]; // assume non-empty
    }

    // 🔹 Step 7: Resize backing array
    private void resize() {
        capacity *= 2;
        int[] newData = new int[capacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i]; // copy old elements
        }
        data = newData;
    }

    // 🔹 Step 8: Get current number of elements
    public int getSize() {
        return size;
    }

    // 🔹 Step 9: Get current capacity
    public int getCapacity() {
        return capacity;
    }
}
