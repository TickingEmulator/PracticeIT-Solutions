public static int range(int[] array) {
  if (array.length == 1) {
    return 1;
  }
  int l = array[0];
  int s = array[0];
  for (int i = 0; i < array.length; i++) {
    if (array[i] > l) {
      l = array[i];
    }
    if (array[i] < s) {
      s = array[i];
    }
  }
  return (l - s) + 1;
}
