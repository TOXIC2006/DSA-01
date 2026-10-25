class CustomStack {
     int arr[];
      int r;
      int Size;

   public CustomStack(int maxSize) {
    arr = new int[maxSize];
    Size = maxSize;
    r = 0;
   }

   public void push(int x) {
    if (r < Size) {
        arr[r] = x;
        r++;
    }
   }

   public int pop() {
    if (r == 0) {
        return -1;
    }
    return arr[--r];
   }

  public void increment(int k, int val) {
    int l = 0;

    if (r < k) {
        for (int i = l; i < r; i++) {
            arr[i] = arr[i] + val;
        }
    } else {
        for (int i = l; i < k; i++) {
            arr[i] = arr[i] + val;
        }
    }
}
}


/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */