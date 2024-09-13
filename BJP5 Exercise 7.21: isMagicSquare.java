public boolean isMagicSquare(int[][] a) {
  boolean b = false;
  if (a.length == 0 || a.length == 1 && a[0].length == 1) {
    return true;
  }
  for (int i4 = 0; i4 < a.length; i4++) {
    if (a[i4].length != a.length) {
      return false;
    }
  }
  if (a.length == 1 && a[0].length == 1) {
    return true;
  }
  for (int i = 0; i < a.length; i++) {
    int sr = 0, sc = 0, rsd = 0, lsd = 0;
    for (int j = 0; j < a[0].length; j++) {
      sr += a[i][j];
      sc += a[j][i];
      rsd += a[j][j];
      lsd += a[j][(a.length - 1 - j)];
    }
    if (sr == sc && sc == rsd && lsd == rsd) {
      b = true;
    } else {
      return false;
    }
  }
  return b;
}
