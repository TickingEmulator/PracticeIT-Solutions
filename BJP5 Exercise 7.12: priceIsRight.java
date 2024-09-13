public int priceIsRight(int[] a, int p) {
  if (a.length == 1 && a[0] == p) {
    return p;
  } else if (a.length == 1 && a[0] != p) {
    return -1;
  }
  int d = 10000, v = -1;
  for (int i = 0; i < a.length; i++) {
    if (p == a[i]) {
      return p;
    } else if (p - a[i] < d && a[i] < p) {
      d = p - a[i];
      v = a[i];
    }
  }
  return v;
}
