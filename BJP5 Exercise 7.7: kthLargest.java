public int kthLargest(int k, int[] a) {
  for (int i = 0; i < a.length; i++) {
    for (int i2 = 0; i2 < a.length; i2++) {
      if (a[i] > a[i2]) {
        int v1 = a[i], v2 = a[i2];
        a[i] = v2;
        a[i2] = v1;
      }
    }
  }
  return a[k];
}
