public int mode(int[] array) {
  int lc = 0, v1 = 0, v2 = 0;
  for (int i = 0; i < array.length; i++) {
    int cc = 0;
    for (int i2 = 0; i2 < array.length; i2++) {
      if (array[i] == array[i2]) {
        cc++;
      }
    }
    if (cc > lc) {
      lc = cc;
      v1 = array[i];
    } else if (cc == lc) {
      if (v1 > array[i]) {
        v1 = array[i];
      }
    }
  }
  return v1;
}
