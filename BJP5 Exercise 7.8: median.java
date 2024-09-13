public int median(int[] a) {
  for (int i = 0; i < a.length; i++) {
    for (int i2 = 0; i2 < a.length; i2++) {
      if (a[i] < a[i2]) {
        int c = a[i], b = a[i2];
        a[i] = b;
        a[i2] = c;
      }
    }
  }
  return (a[(int)(a.length / 2)]);
}
