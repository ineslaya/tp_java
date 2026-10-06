record Point(int x, int y){
	double distance(){
		return Math.sqrt(x * x + y * y);
	}

	static void main(String[] args){
	var x = Integer.parseInt(args[0]);
	var y = Integer.parseInt(args[1]);
  var p = new Point(x, y);

  var origine = new Point(0, 0);

  IO.println(origine.distance(p));
	}
}

/*static void main(){
		var x = 0;
		var y = 5;
    var p = new Point(x, y);
    IO.println(p);
	}
}
*/
/* static void main(String[] args){
	var x = Integer.parseInt(args[0]);
	var y = Integer.parseInt(args[1]);
  var p = new Point(x, y);
  IO.println(p);
	}
*/
