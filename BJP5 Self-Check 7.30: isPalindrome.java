public boolean isPalindrome(String[] array) {
  boolean c = false;
  if (array.length == 0 || array.length == 1) {
    return true;
  }
  for (int i = 0; i < array.length; i++) {
    if (array[i] == array[(array.length - 1) - i]) {
      c = true;
    } else {
      return false;
    }
  }
  return c;
}
