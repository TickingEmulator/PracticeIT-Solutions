public void evenBeforeOdd(int[] a) {
  for (int i = 0; i < a.length; i++) {
    for (int i2 = 0; i2 < a.length; i2++) {
      if (a[i] % 2 == 0 && a[i2] % 2 != 0) {
        int j = a[i], b = a[i2];
        a[i2] = j;
        a[i] = b;
      }
    }
  }
}
