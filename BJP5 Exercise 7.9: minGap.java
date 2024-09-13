public int minGap(int[] a) {
  if (a.length <= 2) {
    return 0;
  }
  int s = (a[1] - a[0]);
  for (int i = 1; i < a.length - 1; i++) {
    if ((a[i + 1] - a[i]) < s) {
      s = (a[i + 1] - a[i]);
    }
  }
  return (s);
}
