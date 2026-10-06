static void main() {
  IO.println("Entrez deux entiers.");

  var scanner = new Scanner(System.in);
  var value1 = scanner.nextInt();
  var value2 = scanner.nextInt();

  var sum = value1 + value2;
  var difference = value1 - value2;
  var product = value1 * value2;
  var quotient = value1 / value2;
  var remainder = value1 % value2;

  IO.println("Voici leur somme " + sum + " difference " + difference + " produit " + product + " quotient " + quotient + " reste " + remainder);
}