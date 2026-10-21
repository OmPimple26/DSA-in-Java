public class DynamicStack extends CustomStack{

    public DynamicStack() {
        super(); // It will call CustomStack()
    }

    public DynamicStack(int size) {
        super(size); // It will call CustomStack(int size)
    }

    @Override
    public boolean push(int item) {
        // This takes care of it being full
        if (this.isFull()) {
            // Double the array size
            int[] temp = new int[data.length * 2];

            // Copy all previous items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        // At this point we know that array is not full
        // Hence, now insert item
        return super.push(item);
    }
}
