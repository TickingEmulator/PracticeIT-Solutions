public static int longestSortedSequence(int[] a) {
  int lc = 0, cc = 1;
  if (a.length == 1) {
    return 1;
  } else if (a.length == 0) {
    return 0;
  }
  for (int i = 0; i < a.length - 1; i++) {
    if (a[i] <= a[i + 1]) {
      cc++;
    } else {
      cc = 1;
    }
    if (cc > lc) {
      lc = cc;
    }
  }
  return lc;
}
