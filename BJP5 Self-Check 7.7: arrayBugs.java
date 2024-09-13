int[] first = new int[2];
boolean equals = false;
first[0] = 3;
first[1] = 7;
int[] second = new int[2];
second[0] = 3;
second[1] = 7;
System.out.println("first  = [" + first[0] + ", " + first[1] + "]");
System.out.println("second = [" + second[0] + ", " + second[1] + "]");
for (int i = 0; i < first.length; i++) {
  if (first[i] == second[i]) {
    equals = true;
  } else {
    equals = false;
  }
}
if (equals) {
  System.out.println("They contain the same elements.");
} else {
  System.out.println("The elements are different.");
}
