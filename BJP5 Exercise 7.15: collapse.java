public int[] collapse(int[] a) {
  int d = a.length / 2;
  int[] nA = new int[d];
  if (a.length % 2 != 0) {
    d = (a.length / 2) + 1;
    nA = new int[d];
    nA[d - 1] = a[a.length - 1];
  }
  int j = 0;
  for (int i = 0; i < a.length - 1; i++) {
    nA[j] = a[i] + a[i + 1];
    j++;
    i++;
  }
  return nA;
}
