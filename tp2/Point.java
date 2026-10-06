record Point(double x, double y){
	static Point milieu(Point p1, Point p2){
		var x = (p1.x + p2.x)/2;
		var y = (p1.y + p2.y)/2;
	}
}