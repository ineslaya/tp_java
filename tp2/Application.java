class Application {
  static void main() {
  var p1 = new Point(0.0, 0.0);
  var p2 = new Point(1.0, 1.0);
  var p3 = // appel de la méthode statique
  IO.println("Milieu avec la méthode statique: " + p3);
  var p4 = // appel de la méthode d'instance
  IO.println("Milieu avec la méthode d'instance: " + p4);
  }
}