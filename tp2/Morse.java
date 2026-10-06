/*class Morse {
	static void main(String[] args){
		var result = "";
		for (var s: args){
			result = result + s + " Stop. ";
		}
		IO.println(result);
	}
}
*/

class Morse {
	static void main(String[] args){
		var builder = new StringBuilder();
		var separator = " Stop. ";
		for (var s: args){
			builder.append(s).append(separator);
		}
		IO.println(builder);
	}
}