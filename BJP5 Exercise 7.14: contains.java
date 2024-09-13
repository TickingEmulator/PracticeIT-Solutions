public static boolean contains(int[] a1, int[] a2) {
  if (a1.length == 1 && a2.length == 1 && a1[0] == a2[0]) {
    return true;
  } else if (a1.length < a2.length) {
    return false;
  }
  int j = 0;
  boolean c = false;
  for (int i = 0; i < a1.length; i++) {
    if (a1[i] == a2[j]) {
      c = true;
      j++;
      if (j == a2.length) {
        return true;
      }
    } else if (a1[i] == a2[0]) {
      j = 1;
      c = true;
    } else {
      j = 0;
      c = false;
    }
  }
  if (j < a2.length) {
    return false;
  }
  return c;
}
