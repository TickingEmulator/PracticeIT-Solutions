public int lastIndexOf(int[] array, int a) {
  int idx = -1;
  for (int i = 0; i < array.length; i++) {
    if (array[i] == a) {
      idx = i;
    }
  }
  return idx;
}
