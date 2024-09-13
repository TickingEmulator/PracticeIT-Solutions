public static boolean equals(String[] i, String[] v) {
  boolean b = false;
  if (i.length != v.length) {
    return false;
  }
  for (int i2 = 0; i2 < i.length; i2++) {
    if (i[i2] == v[i2]) {
      b = true;
    } else {
      return false;
    }
  }
  return b;
}
