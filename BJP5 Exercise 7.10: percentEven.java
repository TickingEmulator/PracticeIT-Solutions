public double percentEven(int[] a) {
  if (a.length == 0) {
    return 0.0;
  }
  double v = 0;
  for (int i = 0; i < a.length; i++) {
    if (a[i] % 2 == 0) {
      v++;
    }
  }
  return (v / a.length) * 100;
}
