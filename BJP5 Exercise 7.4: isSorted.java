public static boolean isSorted(double[] array) {
  boolean c = false;
  if (array.length == 1) {
    return true;
  }
  for (int i = 0; i < array.length - 1; i++) {
    if (array[i] < array[i + 1]) {
      c = true;
    } else {
      return false;
    }
  }
  return c;
}
