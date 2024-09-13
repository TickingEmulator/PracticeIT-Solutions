public boolean isUnique(int[] a) {
  if (a.length <= 1) {
    return true;
  }
  for (int i = 0; i < a.length; i++) {
    int c = -1;
    for (int i2 = 0; i2 < a.length; i2++) {
      if (a[i] == a[i2]) {
        c++;
      }
      if (c > 0) {
        return false;
      }
    }
  }
  return true;
}
