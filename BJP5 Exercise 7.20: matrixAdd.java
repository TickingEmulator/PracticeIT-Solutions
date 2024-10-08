public int[][] matrixAdd(int[][] a, int[][] b) {
  if (a.length == 0 && b.length == 0) {
    return new int[][] {};
  }
  int[][] c = new int[a.length][a[0].length];
  for (int i = 0; i < a.length; i++) {
    for (int j = 0; j < a[0].length; j++) {
      c[i][j] = (a[i][j] + b[i][j]);
    }
  }
  return c;
}
