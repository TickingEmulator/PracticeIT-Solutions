public static boolean allLess(int[] array1, int[] array2) {
  boolean b = false;
  if (array1.length != array2.length) {
    return false;
  }
  for (int i = 0; i < array1.length; i++) {
    if (array1[i] < array2[i]) {
      b = true;
    } else {
      return false;
    }
  }
  return b;
}
