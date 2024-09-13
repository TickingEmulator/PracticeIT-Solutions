public static int[] append(int[] a1, int[] a2) {
  if (a1.length == 1 && a2.length == 1) {
    return new int[] {
      a1[0], a2[0]
    };
  }
  int[] af = new int[(a1.length + a2.length)];
  for (int i = 0; i < a1.length; i++) {
    af[i] = a1[i];
  }
  for (int i2 = 0; i2 < a2.length; i2++) {
    af[(a1.length + i2)] = a2[i2];
  }
  return af;
}
